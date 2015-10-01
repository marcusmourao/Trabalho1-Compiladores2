
grammar LA;

@members {
   public static String grupo="<<551740>>";
   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
   TabelaDeSimbolos TabelaDeTipos = new TabelaDeSimbolos("tipos");
   PilhaDeTabelas TabelasDeRegistros = new PilhaDeTabelas();
   String error="";
}

ALGORITMO: 'algoritmo';

FIM_ALGORITMO :'fim_algoritmo';
	
DECLARE : 'declare';

CONSTANTE : 'constante';

TIPO : 'tipo';

DOISPONTOS : ':';	

ABRECOLCHETES :	'[';

FECHACOLCHETES : ']';

VIRGULA	: ',';

EXPOENTE : '^';
	
PONTO :	'.';
	
LITERAL : 'literal';

INTEIRO	: 'inteiro';

REAL : 'real';	

LOGICO: 'logico';

VERDADEIRO : 'verdadeiro';

FALSO : 'falso';

REGISTRO : 'registro';

FIM_REGISTRO : 'fim_registro';

PROCEDIMENTO : 'procedimento';

FIM_PROCEDIMENTO : 'fim_procedimento';

ABREPARENTESE : '(';

FECHAPARENTESE : ')';

FUNCAO : 'funcao';

FIM_FUNCAO : 'fim_funcao';

VAR : 'var';

LEIA : 'leia';

ESCREVA : 'escreva';

SE : 'se';

ENTAO : 'entao';

FIM_SE : 'fim_se';

SENAO : 'senao';	

CASO : 'caso';

SEJA : 'seja';	

FIM_CASO : 'fim_caso';

PARA : 'para';

ATRIBUICAO : '<-';

ATE : 'ate';

FACA : 'faca';

FIM_PARA : 'fim_para';

ENQUANTO : 'enquanto';

FIM_ENQUANTO : 'fim_enquanto';

RETORNE : 'retorne';	

PONTOPONTO : '..';

MULTIPLICACAO : '*';

MENORIGUAL : '<=';

DIVISAO : '/' ;

MAIORIGUAL : '>=';

PORCENTAGEM : '%';

MENOR : '<';

MAIOR : '>';

IGUAL : '=';

DIFERENTE : '<>';

OU : 'ou';

E : 'e';

NAO : 'nao';

SOMA: '+';

SUBTRACAO : '-';

OPERADOR_E : '&';

// Sequencia de caracteres entre aspas dupla de apenas uma linha
CADEIA : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';

// Sequencia de letras, dígitos e underscore, começando por letra ou underscore
IDENT : ('_'|'a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// Sequencia de diígitos
NUM_INT : ('0'..'9')+;

// Pelo menos um dígito seguido de um ponto decimal e de uma sequência de um ou mais dígitos
NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+;

//Espa�os em branco IGNORADOS pelo analisador l�xico.
WS : ( ' ' |'\t' | '\r' | '\n') {skip();}; 

//coment�rios curtos IGNORADOS pelo analisador l�xico.
COMENTARIO : '{' ~('\n'|'\r'|'\t')* '\r'? '\n'? '}'('\n'('\n'|'\t'))* {skip();};

// Analisador Sintático

programa : 
         { 
             pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
             TabelaDeTipos.adicionarSimbolo("literal", "literal");
             TabelaDeTipos.adicionarSimbolo("inteiro", "inteiro");
             TabelaDeTipos.adicionarSimbolo("real", "real");
             TabelaDeTipos.adicionarSimbolo("logico", "logico");
          }
          declaracoes ALGORITMO corpo FIM_ALGORITMO
          { 
              pilhaDeTabelas.desempilhar();
              if(error!="")throw new RuntimeException(error);
          }
         ;

declaracoes : decl_local_global declaracoes 
            |
            ;

decl_local_global : decl_local
                  | declaracao_global
                  ;

decl_local 
    : DECLARE variavel
    {
        for (String s : $variavel.nomes)
        {
            if(pilhaDeTabelas.topo().existeSimbolo(s))
                error += "Linha " + $variavel.linha + ": identificador "+s+" ja declarado anteriormente\n" ;
		//error+=pilhaDeTabelas.topo().getEscopo();
            else{
	        if(TabelaDeTipos.existeSimbolo($variavel.tipoSimbolo))
                {
                    pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                    if(TabelasDeRegistros.existeTabela($variavel.tipoSimbolo)!=null)
                    {
                        TabelaDeSimbolos tabela_registro = TabelasDeRegistros.existeTabela($variavel.tipoSimbolo);
                        for (EntradaTabelaDeSimbolos t : tabela_registro.getSimbolos2())
                        {
                            pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
                        }
                    }
                    else
                    {
                        if(TabelasDeRegistros.existeTabela("registro")!=null)
                        {
                            TabelaDeSimbolos tabela_registro = TabelasDeRegistros.existeTabela("registro");
                            for (EntradaTabelaDeSimbolos t : tabela_registro.getSimbolos2())
                            {
                                pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
                            }
                         }
                    }   
                }
                else
                {
                    error += "Linha " + $variavel.linha + ": tipo "+$variavel.tipoSimbolo+" nao declarado\n" ;
                    pilhaDeTabelas.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
                }
            }
        }
    }
    | CONSTANTE v1=IDENT DOISPONTOS v2=tipo_basico IGUAL valor_constante
    {
        if(pilhaDeTabelas.topo().existeSimbolo($v1.getText()))
            error += "Linha " + $v1.getLine() + ": identificador "+$v1.getText()+" ja declarado anteriormente\n" ;
        else
            pilhaDeTabelas.topo().adicionarSimbolo($v1.getText(), $v2.tipoSimbolo);
    }
    | TIPO v1=IDENT DOISPONTOS v3=tipo[$v1.getText()]
    {
        if(pilhaDeTabelas.topo().existeSimbolo($v1.getText()))
            error += "Linha " + $v1.getLine() + ": identificador "+$v1.getText()+" ja declarado anteriormente\n" ;
        else
        {
            pilhaDeTabelas.topo().adicionarSimbolo($v1.getText(), $v3.tipoSimbolo);
            TabelaDeTipos.adicionarSimbolo($v1.getText(), $v3.tipoSimbolo);
        }
    }
    ;

variavel returns[List<String> nomes, String tipoSimbolo, int linha]
@init {$nomes = new ArrayList<String>(); $tipoSimbolo=""; $linha=-1;}
    : v1=IDENT dimensao v2=mais_var DOISPONTOS m3=tipo[$tipoSimbolo] 
    {    
        int i=0;
        $tipoSimbolo = $m3.tipoSimbolo;
        // error+="Tipo da variável: " + $m3.tipoSimbolo;
        $nomes.add($v1.getText());
        $nomes.addAll($v2.nomes);
        if($v2.linha==-1)
            $linha = $v1.getLine();
        else
            $linha = $v2.linha;
    }
    ;

mais_var returns[ List<String> nomes, int linha ]
@init { $nomes = new ArrayList<String>(); $linha=-1; }
    : (VIRGULA v1=IDENT
    {
        if(!pilhaDeTabelas.existeSimbolo($v1.getText()))
        {
            $nomes.add($v1.getText());
            $linha = $v1.getLine();
        }
        else
        {
            error+="Linha " + $v1.getLine() + ": identificador " + $v1.getText() + " ja declarado anteriormente\n";
        }
     }
    dimensao)*
    ;

identificador returns [ String txt, int linha ] 
@init { $txt = ""; $linha=-1;}
    : ponteiros_opcionais v1=IDENT dimensao v2=outros_ident 
    {
        $txt += $v1.text+$v2.txt;
        $linha = $v1.getLine(); 
    }
    ;

ponteiros_opcionais 
    : EXPOENTE*
    ;

outros_ident returns [ String txt ]
@init {$txt="";}
    : PONTO id=identificador { $txt = "."+$id.txt; }
    |
    ;
	
dimensao returns [String txt]
@init {$txt="";}
    : ABRECOLCHETES v1=exp_aritmetica FECHACOLCHETES dimensao {$txt= "[" + $v1.txt + "]";}
    |
    ;

tipo[String tipo_registro] returns [String tipoSimbolo, List<String> nomes ]
@init {$tipoSimbolo=""; $nomes = new ArrayList<String>();}
    : v1=registro[$tipo_registro] {$tipoSimbolo=$v1.typeRegistro; $nomes.addAll($registro.nomes);}
    | tipo_estendido {$tipoSimbolo = $tipo_estendido.tipoSimbolo;}
    ;

mais_ident returns [List<String> nomes, int linha]
@init {$nomes = new ArrayList<String>(); $linha=-1;}
    : VIRGULA v1=identificador v2=mais_ident 
      {
       $nomes.add($v1.txt);
       $nomes.addAll($v2.nomes);
       $linha=$v1.linha;
      }
    |
    ;
	
mais_variaveis returns[ List<String> nomes, String tipoSimbolo, int linha ]
@init {$nomes = new ArrayList<String>(); $tipoSimbolo=""; $linha=-1;}
    : variavel f1=mais_variaveis 
    { 
         $nomes.addAll($variavel.nomes); 
         $tipoSimbolo=$variavel.tipoSimbolo; 
         $linha=$variavel.linha; 
         $nomes.addAll($f1.nomes);
    } 
    | 
    ;
      

tipo_basico returns [String tipoSimbolo]
@init {$tipoSimbolo="";}
    : LITERAL {$tipoSimbolo = "literal";}
    | INTEIRO {$tipoSimbolo = "inteiro";}
    | REAL    {$tipoSimbolo = "real";}
    | LOGICO  {$tipoSimbolo = "logico";}
    ;

tipo_basico_ident returns [String tipoSimbolo]
@init {$tipoSimbolo="";}
    : v1=tipo_basico {$tipoSimbolo = $v1.tipoSimbolo;}
    | v2=IDENT       {$tipoSimbolo = $v2.getText();}
    ;

tipo_estendido returns [String tipoSimbolo]
@init {$tipoSimbolo="";}
    : ponteiros_opcionais v1=tipo_basico_ident {$tipoSimbolo = $v1.tipoSimbolo;}
    ;

valor_constante 
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | VERDADEIRO
    | FALSO
    ;

registro [String nome_registro] returns[String typeRegistro, List<String> nomes]
@init {$nomes = new ArrayList<String>();}
    : REGISTRO 
    {
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
        if(!$nome_registro.equals(""))
            TabelasDeRegistros.empilhar(new TabelaDeSimbolos($nome_registro));
        else
            TabelasDeRegistros.empilhar(new TabelaDeSimbolos("registro"));
    }
      
    variavel mais_variaveis
    {
        for (String s : $variavel.nomes)
        {
            TabelasDeRegistros.topo().adicionarSimbolo(s, $variavel.tipoSimbolo);
            $nomes.add(s);
        }
        for (String u : $mais_variaveis.nomes)
        {
            //error+=u+"\n";
            TabelasDeRegistros.topo().adicionarSimbolo(u, $mais_variaveis.tipoSimbolo);
            $nomes.add(u);
        }
        
        $typeRegistro=$variavel.tipoSimbolo;
    }
      
    FIM_REGISTRO
    {
        pilhaDeTabelas.desempilhar();
    }
    ;

declaracao_global 
    : PROCEDIMENTO v1=IDENT
    {
        if(pilhaDeTabelas.topo().existeSimbolo($v1.getText()))
            error += "Linha " + $v1.getLine() + ": identificador "+$v1.getText()+" ja declarado anteriormente\n" ;
        else
        {
            pilhaDeTabelas.topo().adicionarSimbolo($v1.getText(), "procedimento");
            pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
        }
    }
    ABREPARENTESE parametros_opcional FECHAPARENTESE declaracoes_locais comandos FIM_PROCEDIMENTO 
    {    
        pilhaDeTabelas.desempilhar();
    }
    | FUNCAO v1=IDENT 
    {
        if(pilhaDeTabelas.topo().existeSimbolo($v1.getText()))
            error += "Linha " + $v1.getLine() + ": identificador "+$v1.getText()+" ja declarado anteriormente\n" ;
        else
        {
            pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
        }
    }
                    
    ABREPARENTESE parametros_opcional FECHAPARENTESE DOISPONTOS g1=tipo_estendido declaracoes_locais comandos FIM_FUNCAO
    {
        pilhaDeTabelas.desempilhar();
        pilhaDeTabelas.topo().adicionarSimbolo($v1.getText(), $g1.tipoSimbolo);
    }
    ;

parametros_opcional 
    : parametro
    |
    ;

parametro
    : var_opcional v1=identificador v3=mais_ident DOISPONTOS v2=tipo_estendido mais_parametros
    {
        if(pilhaDeTabelas.topo().existeSimbolo($v1.txt))
            error += "Linha " + $v1.linha + ": identificador "+$v1.txt+" ja declarado anteriormente\n" ;
        else
        {
             pilhaDeTabelas.topo().adicionarSimbolo($v1.txt, $v2.tipoSimbolo);
             //error+=pilhaDeTabelas.topo().getEscopo();
             if(TabelasDeRegistros.existeTabela($v2.tipoSimbolo)!=null)
             {
                 TabelaDeSimbolos tabela_registro = TabelasDeRegistros.existeTabela($v2.tipoSimbolo);
                 for (String t : tabela_registro.getSimbolos())
                 {
                     pilhaDeTabelas.topo().adicionarSimbolo($v1.txt+t, $v2.tipoSimbolo);
                 }
             }
         }
        
     }
     ;

var_opcional 
    : VAR
    |
    ;

mais_parametros
    : VIRGULA v1=parametro
    | 
    ;

declaracoes_locais
    : decl_local*
    ;

corpo : declaracoes_locais comandos
      ;

comandos 
    : cmd*
    ;

cmd returns [ String tipoCmd ]
    : LEIA ABREPARENTESE v10=identificador v11=mais_ident 
    {    
         if(!pilhaDeTabelas.existeSimbolo($v10.txt))
             error+="Linha " + $v10.linha + ": identificador " + $v10.txt + " nao declarado\n";
         for (String s : $v11.nomes)
         {
             if(!pilhaDeTabelas.existeSimbolo(s))
                 error+="Linha " + $v10.linha + ": identificador " + s + " nao declarado\n";
         }    
    }
    FECHAPARENTESE { $tipoCmd = "leia"; }
    | ESCREVA ABREPARENTESE expressao mais_expressao FECHAPARENTESE { $tipoCmd = "escreva"; }
    | SE expressao ENTAO comandos senao_opcional FIM_SE { $tipoCmd = "se"; }
    | CASO exp_aritmetica SEJA selecao senao_opcional FIM_CASO
    | PARA v1=IDENT ATRIBUICAO exp_aritmetica ATE exp_aritmetica FACA comandos FIM_PARA
    /*{
        if(!pilhaDeTabelas.existeSimbolo($v1.getText()))
            error+="Linha " + $v1.getLine() + ": identificador " + $v1.getText() + " nao declarado";
    }*/
    | ENQUANTO expressao FACA comandos FIM_ENQUANTO
    | FACA comandos ATE expressao
    | EXPOENTE v2=IDENT v5=outros_ident dimensao ATRIBUICAO v6=expressao 
    {
        String tipo_expressao = $v6.tipoSimbolo;
        String tipo_ident = pilhaDeTabelas.topo().GetTipoSimbolo($v2.getText());
        if(!tipo_expressao.equals(tipo_ident))
            error+="Linha " + $v2.getLine() + ": atribuicao nao compativel para ^" + $v2.getText()+$v5.txt + "\n";
       
    } /*{
          if(!pilhaDeTabelas.existeSimbolo($v2.getText()+$v5.txt))
                error+="Linha " + $v2.getLine() + ": identificador " + $v2.getText()+$v5.txt + " nao declarado";
          if(!pilhaDeTabelas.getTipoDoSimbolo($v2.getText()+$v5.txt).equals($v6.tipoSimbolo))
               error+="Linha " + $v2.getLine() + ": atribuicao nao compativel para ^" + $v2.getText()+$v5.txt + "\n";
      }*/
    | v3=IDENT chamada_atribuicao[$v3.text]
      {
          if(!pilhaDeTabelas.existeSimbolo($v3.getText()))
              error+="Linha " + $v3.getLine() + ": identificador " + $v3.getText() + " nao declarado\n"; 

      }
    | v4=RETORNE expressao
      {
        String escopoAtual=pilhaDeTabelas.topo().getEscopo();
        if(escopoAtual.equals("funcao")==false){
            error+="Linha " + $v4.getLine() + ": comando retorne nao permitido nesse escopo\n";
        }
      }
    ;

mais_expressao returns[String tipoSimbolo]
@init {$tipoSimbolo="SEM_TIPO";}
    : VIRGULA v1=expressao v2=mais_expressao
    {
     if($v2.tipoSimbolo.equals("SEM_TIPO"))
        $tipoSimbolo=$v1.tipoSimbolo;
     else
     {
      if($v1.tipoSimbolo.equals($v2.tipoSimbolo) || $v1.tipoSimbolo.equals("inteiro") && $v2.tipoSimbolo.equals("real") || $v1.tipoSimbolo.equals("real") && $v2.tipoSimbolo.equals("inteiro"))
          $tipoSimbolo=$v1.tipoSimbolo;
      else
          $tipoSimbolo="incompativel";
     }
    }
    |
    ;

senao_opcional 
    : SENAO comandos
    |
    ;

chamada_atribuicao[String primeiroIdent]
    : ABREPARENTESE argumentos_opcional FECHAPARENTESE
    | v1=outros_ident d1=dimensao v2=ATRIBUICAO e1=expressao 
    {
        if(pilhaDeTabelas.existeSimbolo($primeiroIdent+$v1.txt))
        {
            String tipo1 = pilhaDeTabelas.topo().GetTipoSimbolo($primeiroIdent+$v1.txt);
            String tipo2 = $e1.tipoSimbolo;
            if(tipo1.equals(tipo2) || tipo1.equals("inteiro") && tipo2.equals("real") || tipo1.equals("real") && tipo2.equals("inteiro"))
            {
            }
            else
                error+="Linha " + $v2.getLine() + ": atribuicao nao compativel para " + $primeiroIdent+$v1.txt+$d1.txt +"\n";
                      //error+="Linha " + $v2.getLine() + ": atribuicao nao compativel para " + $primeiroIdent+$v1.txt + "\n" + tipo1 +"\n" + tipo2 + "\n";
                      //String tipoExp = VerificadorDeTipos.verificaTipo($e1.ctx); 
        }
    }
    ;

argumentos_opcional 
    : expressao mais_expressao
    |
    ;

selecao 
    : constantes DOISPONTOS comandos mais_selecao
    ;

mais_selecao 
    : selecao
    |
    ;

constantes 
    : numero_intervalo mais_constantes
    ;

mais_constantes 
    : VIRGULA constantes
    |
    ;

numero_intervalo 
    : op_unario NUM_INT intervalo_opcional
    ;

intervalo_opcional 
    : PONTOPONTO op_unario NUM_INT
    |
    ;

op_unario 
    : SUBTRACAO
    |
    ;

exp_aritmetica returns [String tipoSimbolo, String txt]
@init{$tipoSimbolo="SEM_TIPO"; $txt="";}
    : v1=termo v2=outros_termos 
    {
        $txt=$v1.txt;
        if($v2.tipoSimbolo.equals("SEM_TIPO"))
            $tipoSimbolo=$v1.tipoSimbolo;
        else
        {
            if($v1.tipoSimbolo.equals($v2.tipoSimbolo) || $v1.tipoSimbolo.equals("inteiro") && $v2.tipoSimbolo.equals("real") || $v1.tipoSimbolo.equals("real") && $v2.tipoSimbolo.equals("inteiro"))
                $tipoSimbolo=$v1.tipoSimbolo;
            else
                $tipoSimbolo="incompativel";
        }   
    }
    ;

op_multiplicacao 
    : MULTIPLICACAO
    | DIVISAO
    ;

op_adicao 
    : SOMA
    | SUBTRACAO
    ;

termo returns [String tipoSimbolo, String txt]
@init{$tipoSimbolo="SEM_TIPO"; $txt="";}
    :	v1=fator outros_fatores 
    { 
        $tipoSimbolo=$v1.tipoSimbolo; 
        $txt=$v1.txt;
    }
    ;

outros_termos returns[String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : op_adicao v1=termo v2=outros_termos
    {
        if($v2.tipoSimbolo.equals("SEM_TIPO"))
            $tipoSimbolo=$v1.tipoSimbolo;
        else
        {
            if($v1.tipoSimbolo.equals($v2.tipoSimbolo) || $v1.tipoSimbolo.equals("inteiro") && $v2.tipoSimbolo.equals("real") || $v1.tipoSimbolo.equals("real") && $v2.tipoSimbolo.equals("inteiro"))
                $tipoSimbolo=$v1.tipoSimbolo;
            else
                $tipoSimbolo="incompativel";
        }
    }
    |
    ;

fator returns [String tipoSimbolo, String txt]
@init{$tipoSimbolo="SEM_TIPO"; $txt="";}
    : v1=parcela outras_parcelas 
    {
        $tipoSimbolo=$v1.tipoSimbolo; 
        $txt=$v1.txt;
    }
    ;

outros_fatores 
    : (op_multiplicacao fator)*
    ;

parcela returns [String tipoSimbolo, String txt]
@init{$tipoSimbolo="SEM_TIPO"; $txt="";}
    : op_unario v1=parcela_unario 
    {
        $tipoSimbolo=$v1.tipoSimbolo; 
        $txt=$v1.txt;
    }
    | v2=parcela_nao_unario 
    {
        $tipoSimbolo=$v2.tipoSimbolo; 
        $txt=$v2.txt;
    }
    ;

parcela_unario returns [String txt, int linha, String tipoSimbolo] 
@init {$txt=""; $linha=-1; $tipoSimbolo="SEM_TIPO";}
    : EXPOENTE v1=IDENT v2=outros_ident dimensao
    { 
        $txt+=$v1.getText()+$v2.txt;
        $linha = $v1.getLine();
       
        if(!pilhaDeTabelas.existeSimbolo($v1.getText()+$v2.txt))
            error+="Linha " + $v1.getLine() + ": identificador " + $v1.getText()+$v2.txt + " nao declarado\n blablabla \n";
        if($v2.txt.equals("")) 
            $tipoSimbolo = pilhaDeTabelas.topo().GetTipoSimbolo($txt);
        else
            $tipoSimbolo = TabelasDeRegistros.getTipoDoSimbolo($v2.txt.substring(1));
    }
                
    | v3=IDENT v4=chamada_partes[$v3.getText()]
    {
        $txt+=$v3.getText()+$v4.outrosIdent;
        $linha = $v3.getLine();
        if(!pilhaDeTabelas.existeSimbolo($txt))
            error+="Linha " + $v3.getLine() + ": identificador " + $txt + " nao declarado\n";
        else
        {
            if($v4.tipoSimbolo.equals("SEM_TIPO"))
                $tipoSimbolo = pilhaDeTabelas.topo().GetTipoSimbolo($txt);
            else
                $tipoSimbolo = $v4.tipoSimbolo;
        }
    }
                 
    | NUM_INT  
    {
        $tipoSimbolo = "inteiro"; 
        $txt=$NUM_INT.getText();
    }
    | NUM_REAL 
    {  
        $tipoSimbolo = "real"; 
        $txt=$NUM_REAL.getText();
    }
    | ABREPARENTESE v7=expressao FECHAPARENTESE 
    {
        $tipoSimbolo=$v7.tipoSimbolo;
    }
    ;

parcela_nao_unario returns [String txt, int linha, String tipoSimbolo]
@init {$txt=""; $linha=-1; $tipoSimbolo="SEM_TIPO";}
    : OPERADOR_E v1=IDENT v2=outros_ident 
    {
        $txt+=$v1.getText(); 
        $linha = $v1.getLine();
        $txt+= $v2.txt; $tipoSimbolo = pilhaDeTabelas.getTipoDoSimbolo($txt);
    }
    dimensao
    | CADEIA 
    {
        $tipoSimbolo = "literal"; 
        $txt=$CADEIA.getText();
    }
    ;

outras_parcelas 
    : (PORCENTAGEM parcela)*
    ;

chamada_partes[String primeiroIdent] returns[String tipoSimbolo, String outrosIdent]
@init {$tipoSimbolo="SEM_TIPO"; $outrosIdent="";}
    : ABREPARENTESE v1=expressao v2=mais_expressao FECHAPARENTESE
    /*{
        if($v2.tipoSimbolo.equals("SEM_TIPO"))
            $tipoSimbolo=$v1.tipoSimbolo;
        else
        {
            if($v1.tipoSimbolo.equals($v2.tipoSimbolo) || $v1.tipoSimbolo.equals("inteiro") && $v2.tipoSimbolo.equals("real") || $v1.tipoSimbolo.equals("real") && $v2.tipoSimbolo.equals("inteiro"))
                $tipoSimbolo=$v1.tipoSimbolo;
            else
                $tipoSimbolo="incompativel";
        }
       
    }*/
    | v3=outros_ident dimensao
    {
        $outrosIdent = $v3.txt;
        $tipoSimbolo = pilhaDeTabelas.topo().GetTipoSimbolo($primeiroIdent+$v3.txt);
    }
    |
    ;

exp_relacional returns [String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : v1=exp_aritmetica v2=op_opcional 
    {
        if($v2.tipoSimbolo.equals("SEM_TIPO"))
            $tipoSimbolo=$v1.tipoSimbolo;
        else
            $tipoSimbolo=$v2.tipoSimbolo;
    }
    ;

op_opcional returns[String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";} 
    : v1=op_relacional exp_aritmetica 
    {
        $tipoSimbolo=$v1.tipoSimbolo;
    }
    |
    ;

op_relacional returns[String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : IGUAL {$tipoSimbolo="logico";}
    | DIFERENTE {$tipoSimbolo="logico";}
    | MAIORIGUAL {$tipoSimbolo="logico";}
    | MENORIGUAL {$tipoSimbolo="logico";}
    | MAIOR {$tipoSimbolo="logico";}
    | MENOR {$tipoSimbolo="logico";}
    ;

expressao  returns [String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";} 
    : v1=termo_logico outros_termos_logicos {$tipoSimbolo=$v1.tipoSimbolo;}
    ;

op_nao : NAO
       |
       ;

termo_logico returns [String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : v1=fator_logico outros_fatores_logicos {$tipoSimbolo=$v1.tipoSimbolo;}
    ;

outros_termos_logicos 
    : (OU termo_logico)*
    ;

outros_fatores_logicos 
    : (E fator_logico)*
    ;

fator_logico returns [String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : op_nao v1=parcela_logica {$tipoSimbolo=$v1.tipoSimbolo;}
    ;

parcela_logica returns [String tipoSimbolo]
@init{$tipoSimbolo="SEM_TIPO";}
    : VERDADEIRO {$tipoSimbolo = "logico";}
    | FALSO {$tipoSimbolo = "logico";}
    | v1=exp_relacional {$tipoSimbolo=$v1.tipoSimbolo;}
    ;