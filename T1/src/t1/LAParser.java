// Generated from C:\Users\Marcus\Downloads\comp2\T1\src\t1\LA.g4 by ANTLR 4.2.2
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, TIPO=5, DOISPONTOS=6, 
		ABRECOLCHETES=7, FECHACOLCHETES=8, VIRGULA=9, EXPOENTE=10, PONTO=11, LITERAL=12, 
		INTEIRO=13, REAL=14, LOGICO=15, VERDADEIRO=16, FALSO=17, REGISTRO=18, 
		FIM_REGISTRO=19, PROCEDIMENTO=20, FIM_PROCEDIMENTO=21, ABREPARENTESE=22, 
		FECHAPARENTESE=23, FUNCAO=24, FIM_FUNCAO=25, VAR=26, LEIA=27, ESCREVA=28, 
		SE=29, ENTAO=30, FIM_SE=31, SENAO=32, CASO=33, SEJA=34, FIM_CASO=35, PARA=36, 
		ATRIBUICAO=37, ATE=38, FACA=39, FIM_PARA=40, ENQUANTO=41, FIM_ENQUANTO=42, 
		RETORNE=43, PONTOPONTO=44, MULTIPLICACAO=45, MENORIGUAL=46, DIVISAO=47, 
		MAIORIGUAL=48, PORCENTAGEM=49, MENOR=50, MAIOR=51, IGUAL=52, DIFERENTE=53, 
		OU=54, E=55, NAO=56, SOMA=57, SUBTRACAO=58, OPERADOR_E=59, CADEIA=60, 
		IDENT=61, NUM_INT=62, NUM_REAL=63, WS=64, COMENTARIO=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", 
		"'tipo'", "':'", "'['", "']'", "','", "'^'", "'.'", "'literal'", "'inteiro'", 
		"'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'fim_procedimento'", "'('", "')'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'senao'", 
		"'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", 
		"'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'*'", 
		"'<='", "'/'", "'>='", "'%'", "'<'", "'>'", "'='", "'<>'", "'ou'", "'e'", 
		"'nao'", "'+'", "'-'", "'&'", "CADEIA", "IDENT", "NUM_INT", "NUM_REAL", 
		"WS", "COMENTARIO"
	};
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_decl_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_exp_relacional = 50, 
		RULE_op_opcional = 51, RULE_op_relacional = 52, RULE_expressao = 53, RULE_op_nao = 54, 
		RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, RULE_outros_fatores_logicos = 57, 
		RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "decl_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="<<551740>>";
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   TabelaDeSimbolos TabelaDeTipos = new TabelaDeSimbolos("tipos");
	   PilhaDeTabelas TabelasDeRegistros = new PilhaDeTabelas();
	   String error="";

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LAParser.ALGORITMO, 0); }
		public TerminalNode FIM_ALGORITMO() { return getToken(LAParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			             pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
			             TabelaDeTipos.adicionarSimbolo("literal", "literal");
			             TabelaDeTipos.adicionarSimbolo("inteiro", "inteiro");
			             TabelaDeTipos.adicionarSimbolo("real", "real");
			             TabelaDeTipos.adicionarSimbolo("logico", "logico");
			          
			setState(121); declaracoes();
			setState(122); match(ALGORITMO);
			setState(123); corpo();
			setState(124); match(FIM_ALGORITMO);
			 
			              pilhaDeTabelas.desempilhar();
			              if(error!="")throw new RuntimeException(error);
			          
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); decl_local_global();
				setState(128); declaracoes();
				}
				break;
			case ALGORITMO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_localContext decl_local() {
			return getRuleContext(Decl_localContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); decl_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_localContext extends ParserRuleContext {
		public VariavelContext variavel;
		public Token v1;
		public Tipo_basicoContext v2;
		public TipoContext v3;
		public TerminalNode TIPO() { return getToken(LAParser.TIPO, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LAParser.CONSTANTE, 0); }
		public TerminalNode DECLARE() { return getToken(LAParser.DECLARE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAParser.DOISPONTOS, 0); }
		public Decl_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local(this);
		}
	}

	public final Decl_localContext decl_local() throws RecognitionException {
		Decl_localContext _localctx = new Decl_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_local);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(DECLARE);
				setState(138); ((Decl_localContext)_localctx).variavel = variavel();

							     for (String s : ((Decl_localContext)_localctx).variavel.nomes){
								     if(pilhaDeTabelas.topo().existeSimbolo(s))
									     error += "Linha " + ((Decl_localContext)_localctx).variavel.linha + ": identificador "+s+" ja declarado anteriormente\n" ;
										 //error+=pilhaDeTabelas.topo().getEscopo();
									 else{
									     if(TabelaDeTipos.existeSimbolo(((Decl_localContext)_localctx).variavel.tipoSimbolo)){
										     pilhaDeTabelas.topo().adicionarSimbolo(s, ((Decl_localContext)_localctx).variavel.tipoSimbolo);
											 if(TabelasDeRegistros.existeTabela(((Decl_localContext)_localctx).variavel.tipoSimbolo)!=null){
											     TabelaDeSimbolos tabela_registro = TabelasDeRegistros.existeTabela(((Decl_localContext)_localctx).variavel.tipoSimbolo);
												 for (EntradaTabelaDeSimbolos t : tabela_registro.getSimbolos2()){
												     pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
											     }
				                             }
				                         }
				                         else{
				                             error += "Linha " + ((Decl_localContext)_localctx).variavel.linha + ": tipo "+((Decl_localContext)_localctx).variavel.tipoSimbolo+" nao declarado\n" ;
				                             pilhaDeTabelas.topo().adicionarSimbolo(s, ((Decl_localContext)_localctx).variavel.tipoSimbolo);
				                         }
				                     }
				                 }
				              
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(CONSTANTE);
				setState(142); ((Decl_localContext)_localctx).v1 = match(IDENT);
				setState(143); match(DOISPONTOS);
				setState(144); ((Decl_localContext)_localctx).v2 = tipo_basico();
				setState(145); match(IGUAL);
				setState(146); valor_constante();

				              if(pilhaDeTabelas.topo().existeSimbolo(((Decl_localContext)_localctx).v1.getText()))
				                  error += "Linha " + ((Decl_localContext)_localctx).v1.getLine() + ": identificador "+((Decl_localContext)_localctx).v1.getText()+" ja declarado anteriormente\n" ;
				              else
				                  pilhaDeTabelas.topo().adicionarSimbolo(((Decl_localContext)_localctx).v1.getText(), ((Decl_localContext)_localctx).v2.tipoSimbolo);
				             
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(TIPO);
				setState(150); ((Decl_localContext)_localctx).v1 = match(IDENT);
				setState(151); match(DOISPONTOS);
				setState(152); ((Decl_localContext)_localctx).v3 = tipo(((Decl_localContext)_localctx).v1.getText());

				              if(pilhaDeTabelas.topo().existeSimbolo(((Decl_localContext)_localctx).v1.getText()))
				                  error += "Linha " + ((Decl_localContext)_localctx).v1.getLine() + ": identificador "+((Decl_localContext)_localctx).v1.getText()+" ja declarado anteriormente\n" ;
				              else{
				                  pilhaDeTabelas.topo().adicionarSimbolo(((Decl_localContext)_localctx).v1.getText(), ((Decl_localContext)_localctx).v3.tipoSimbolo);
				                  TabelaDeTipos.adicionarSimbolo(((Decl_localContext)_localctx).v1.getText(), ((Decl_localContext)_localctx).v3.tipoSimbolo);
				              }
				             
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<String> nomes;
		public String tipoSimbolo;
		public int linha;
		public Token v1;
		public Mais_varContext v2;
		public TipoContext m3;
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAParser.DOISPONTOS, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		 ((VariavelContext)_localctx).nomes =  new ArrayList<String>(); ((VariavelContext)_localctx).tipoSimbolo = ""; ((VariavelContext)_localctx).linha = -1; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); ((VariavelContext)_localctx).v1 = match(IDENT);
			setState(158); dimensao();
			setState(159); ((VariavelContext)_localctx).v2 = mais_var();
			setState(160); match(DOISPONTOS);
			setState(161); ((VariavelContext)_localctx).m3 = tipo(_localctx.tipoSimbolo);
			    
			           int i=0;
			           ((VariavelContext)_localctx).tipoSimbolo =  ((VariavelContext)_localctx).m3.tipoSimbolo;
			          // error+="Tipo da variável: " + ((VariavelContext)_localctx).m3.tipoSimbolo;
			           _localctx.nomes.add(((VariavelContext)_localctx).v1.getText());
			           _localctx.nomes.addAll(((VariavelContext)_localctx).v2.nomes);
			           if(((VariavelContext)_localctx).v2.linha==-1)
			               ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).v1.getLine();
			           else
			               ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).v2.linha;
			               
			           
			          
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_varContext extends ParserRuleContext {
		public List<String> nomes;
		public int linha;
		public Token v1;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		 ((Mais_varContext)_localctx).nomes =  new ArrayList<String>(); ((Mais_varContext)_localctx).linha = -1; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(164); match(VIRGULA);
				setState(165); ((Mais_varContext)_localctx).v1 = match(IDENT);

				         if(!pilhaDeTabelas.existeSimbolo(((Mais_varContext)_localctx).v1.getText())){
				            _localctx.nomes.add(((Mais_varContext)_localctx).v1.getText());
				            ((Mais_varContext)_localctx).linha =  ((Mais_varContext)_localctx).v1.getLine();
				         }
				         else{
				              error+="Linha " + ((Mais_varContext)_localctx).v1.getLine() + ": identificador " + ((Mais_varContext)_localctx).v1.getText() + " ja declarado anteriormente\n";
				         }
				        
				       
				setState(167); dimensao();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public Token v1;
		public Outros_identContext oi;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((IdentificadorContext)_localctx).txt =  ""; ((IdentificadorContext)_localctx).linha = -1;
			setState(174); ponteiros_opcionais();
			setState(175); ((IdentificadorContext)_localctx).v1 = match(IDENT);
			setState(176); dimensao();
			setState(177); ((IdentificadorContext)_localctx).oi = outros_ident();
			_localctx.txt += (((IdentificadorContext)_localctx).v1!=null?((IdentificadorContext)_localctx).v1.getText():null); ((IdentificadorContext)_localctx).linha =  ((IdentificadorContext)_localctx).v1.getLine(); 
			         _localctx.txt += ((IdentificadorContext)_localctx).oi.txt; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public TerminalNode EXPOENTE(int i) {
			return getToken(LAParser.EXPOENTE, i);
		}
		public List<TerminalNode> EXPOENTE() { return getTokens(LAParser.EXPOENTE); }
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPOENTE) {
				{
				{
				setState(180); match(EXPOENTE);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_identContext extends ParserRuleContext {
		public String txt;
		public IdentificadorContext id;
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(LAParser.PONTO, 0); }
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		((Outros_identContext)_localctx).txt = "";
		try {
			setState(191);
			switch (_input.LA(1)) {
			case PONTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(PONTO);
				setState(187); ((Outros_identContext)_localctx).id = identificador();
				 ((Outros_identContext)_localctx).txt =  "."+((Outros_identContext)_localctx).id.txt; 
				}
				break;
			case FIM_ALGORITMO:
			case DOISPONTOS:
			case ABRECOLCHETES:
			case FECHACOLCHETES:
			case VIRGULA:
			case EXPOENTE:
			case FIM_PROCEDIMENTO:
			case FECHAPARENTESE:
			case FIM_FUNCAO:
			case LEIA:
			case ESCREVA:
			case SE:
			case ENTAO:
			case FIM_SE:
			case SENAO:
			case CASO:
			case SEJA:
			case FIM_CASO:
			case PARA:
			case ATRIBUICAO:
			case ATE:
			case FACA:
			case FIM_PARA:
			case ENQUANTO:
			case FIM_ENQUANTO:
			case RETORNE:
			case MULTIPLICACAO:
			case MENORIGUAL:
			case DIVISAO:
			case MAIORIGUAL:
			case PORCENTAGEM:
			case MENOR:
			case MAIOR:
			case IGUAL:
			case DIFERENTE:
			case OU:
			case E:
			case SOMA:
			case SUBTRACAO:
			case IDENT:
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode FECHACOLCHETES(int i) {
			return getToken(LAParser.FECHACOLCHETES, i);
		}
		public List<TerminalNode> ABRECOLCHETES() { return getTokens(LAParser.ABRECOLCHETES); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public List<TerminalNode> FECHACOLCHETES() { return getTokens(LAParser.FECHACOLCHETES); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ABRECOLCHETES(int i) {
			return getToken(LAParser.ABRECOLCHETES, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193); match(ABRECOLCHETES);
					setState(194); exp_aritmetica();
					setState(195); match(FECHACOLCHETES);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public String tipo_registro;
		public String tipoSimbolo;
		public Tipo_estendidoContext tipo_estendido;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TipoContext(ParserRuleContext parent, int invokingState, String tipo_registro) {
			super(parent, invokingState);
			this.tipo_registro = tipo_registro;
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo(String tipo_registro) throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState(), tipo_registro);
		enterRule(_localctx, 20, RULE_tipo);
		((TipoContext)_localctx).tipoSimbolo = "";
		try {
			setState(208);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); registro(_localctx.tipo_registro);
				((TipoContext)_localctx).tipoSimbolo = "registro";
				}
				break;
			case EXPOENTE:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				 ((TipoContext)_localctx).tipoSimbolo =  ((TipoContext)_localctx).tipo_estendido.tipoSimbolo;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_identContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public IdentificadorContext v1;
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		((Mais_identContext)_localctx).txt = ""; ((Mais_identContext)_localctx).linha = -1;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(210); match(VIRGULA);
				setState(211); ((Mais_identContext)_localctx).v1 = identificador();
				((Mais_identContext)_localctx).txt = ((Mais_identContext)_localctx).v1.txt; ((Mais_identContext)_localctx).linha = ((Mais_identContext)_localctx).v1.linha;
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_variaveisContext extends ParserRuleContext {
		public List<String> nomes;
		public String tipoSimbolo;
		public int linha;
		public VariavelContext variavel;
		public Mais_variaveisContext f1;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		 ((Mais_variaveisContext)_localctx).nomes =  new ArrayList<String>(); ((Mais_variaveisContext)_localctx).tipoSimbolo = ""; ((Mais_variaveisContext)_localctx).linha = -1; 
		try {
			setState(224);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); ((Mais_variaveisContext)_localctx).variavel = variavel();
				setState(220); ((Mais_variaveisContext)_localctx).f1 = mais_variaveis();
				 _localctx.nomes.addAll(((Mais_variaveisContext)_localctx).variavel.nomes); ((Mais_variaveisContext)_localctx).tipoSimbolo = ((Mais_variaveisContext)_localctx).variavel.tipoSimbolo; ((Mais_variaveisContext)_localctx).linha = ((Mais_variaveisContext)_localctx).variavel.linha; _localctx.nomes.addAll(((Mais_variaveisContext)_localctx).f1.nomes); 
				}
				break;
			case FIM_REGISTRO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode LITERAL() { return getToken(LAParser.LITERAL, 0); }
		public TerminalNode LOGICO() { return getToken(LAParser.LOGICO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		((Tipo_basicoContext)_localctx).tipoSimbolo = "";
		try {
			setState(234);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); match(LITERAL);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "literal";
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); match(INTEIRO);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "inteiro";
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); match(REAL);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "real";
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); match(LOGICO);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "logico";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Tipo_basicoContext v1;
		public Token v2;
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		((Tipo_basico_identContext)_localctx).tipoSimbolo = "";
		try {
			setState(241);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); ((Tipo_basico_identContext)_localctx).v1 = tipo_basico();
				((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).v1.tipoSimbolo;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); ((Tipo_basico_identContext)_localctx).v2 = match(IDENT);
				((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).v2.getText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Tipo_basico_identContext v1;
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		((Tipo_estendidoContext)_localctx).tipoSimbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); ponteiros_opcionais();
			setState(244); ((Tipo_estendidoContext)_localctx).v1 = tipo_basico_ident();
			((Tipo_estendidoContext)_localctx).tipoSimbolo =  ((Tipo_estendidoContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public String nome_registro;
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis;
		public TerminalNode FIM_REGISTRO() { return getToken(LAParser.FIM_REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode REGISTRO() { return getToken(LAParser.REGISTRO, 0); }
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RegistroContext(ParserRuleContext parent, int invokingState, String nome_registro) {
			super(parent, invokingState);
			this.nome_registro = nome_registro;
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro(String nome_registro) throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState(), nome_registro);
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(REGISTRO);

			       pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
			       TabelasDeRegistros.empilhar(new TabelaDeSimbolos(_localctx.nome_registro));
			       
			      
			setState(251); ((RegistroContext)_localctx).variavel = variavel();
			setState(252); ((RegistroContext)_localctx).mais_variaveis = mais_variaveis();

			       for (String s : ((RegistroContext)_localctx).variavel.nomes){
			                   TabelasDeRegistros.topo().adicionarSimbolo(s, ((RegistroContext)_localctx).variavel.tipoSimbolo);
			       }
			    
			        for (String u : ((RegistroContext)_localctx).mais_variaveis.nomes){
			                   //error+=u+"\n";
			                   TabelasDeRegistros.topo().adicionarSimbolo(u, ((RegistroContext)_localctx).mais_variaveis.tipoSimbolo);
			        }
			       
			       
			       
			setState(254); match(FIM_REGISTRO);

			       pilhaDeTabelas.desempilhar();
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Token v1;
		public Tipo_estendidoContext g1;
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAParser.FIM_PROCEDIMENTO, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public TerminalNode PROCEDIMENTO() { return getToken(LAParser.PROCEDIMENTO, 0); }
		public TerminalNode FIM_FUNCAO() { return getToken(LAParser.FIM_FUNCAO, 0); }
		public TerminalNode ABREPARENTESE() { return getToken(LAParser.ABREPARENTESE, 0); }
		public TerminalNode FECHAPARENTESE() { return getToken(LAParser.FECHAPARENTESE, 0); }
		public TerminalNode FUNCAO() { return getToken(LAParser.FUNCAO, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAParser.DOISPONTOS, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); match(PROCEDIMENTO);
				setState(258); ((Declaracao_globalContext)_localctx).v1 = match(IDENT);

				                    if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).v1.getText()))
				                        error += "Linha " + ((Declaracao_globalContext)_localctx).v1.getLine() + ": identificador "+((Declaracao_globalContext)_localctx).v1.getText()+" ja declarado anteriormente\n" ;
				                    else{
				                         pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).v1.getText(), "procedimento");
				                         pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));

				                    }
				                    
				setState(260); match(ABREPARENTESE);
				setState(261); parametros_opcional();
				setState(262); match(FECHAPARENTESE);
				setState(263); declaracoes_locais();
				setState(264); comandos();
				setState(265); match(FIM_PROCEDIMENTO);
				pilhaDeTabelas.desempilhar();
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); match(FUNCAO);
				setState(269); ((Declaracao_globalContext)_localctx).v1 = match(IDENT);

				                    if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).v1.getText()))
				                        error += "Linha " + ((Declaracao_globalContext)_localctx).v1.getLine() + ": identificador "+((Declaracao_globalContext)_localctx).v1.getText()+" ja declarado anteriormente\n" ;
				                    else{
				                        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
				                        
				                    }
				                    
				setState(271); match(ABREPARENTESE);
				setState(272); parametros_opcional();
				setState(273); match(FECHAPARENTESE);
				setState(274); match(DOISPONTOS);
				setState(275); ((Declaracao_globalContext)_localctx).g1 = tipo_estendido();
				setState(276); declaracoes_locais();
				setState(277); comandos();
				setState(278); match(FIM_FUNCAO);
				pilhaDeTabelas.desempilhar();
				                     pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).v1.getText(), ((Declaracao_globalContext)_localctx).g1.tipoSimbolo);
				                    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case EXPOENTE:
			case VAR:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(283); parametro();
				}
				break;
			case FECHAPARENTESE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext v1;
		public Mais_identContext v3;
		public Tipo_estendidoContext v2;
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAParser.DOISPONTOS, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); var_opcional();
			setState(288); ((ParametroContext)_localctx).v1 = identificador();
			setState(289); ((ParametroContext)_localctx).v3 = mais_ident();
			setState(290); match(DOISPONTOS);
			setState(291); ((ParametroContext)_localctx).v2 = tipo_estendido();
			setState(292); mais_parametros();

			                    if(pilhaDeTabelas.topo().existeSimbolo(((ParametroContext)_localctx).v1.txt))
			                        error += "Linha " + ((ParametroContext)_localctx).v1.linha + ": identificador "+((ParametroContext)_localctx).v1.txt+" ja declarado anteriormente\n" ;
			                    else{
			                        pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).v1.txt, ((ParametroContext)_localctx).v2.tipoSimbolo);
			                       //error+=pilhaDeTabelas.topo().getEscopo();
			                        if(TabelasDeRegistros.existeTabela(((ParametroContext)_localctx).v2.tipoSimbolo)!=null)
			                            {
			                               TabelaDeSimbolos tabela_registro = TabelasDeRegistros.existeTabela(((ParametroContext)_localctx).v2.tipoSimbolo);
			                               for (String t : tabela_registro.getSimbolos())
			                               {
			                                pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).v1.txt+t, ((ParametroContext)_localctx).v2.tipoSimbolo);
			                               }
			                             }
			                        
			                    }                    
			             
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_opcionalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LAParser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(295); match(VAR);
				}
				break;
			case EXPOENTE:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); match(VIRGULA);
				setState(300); parametro();
				}
				break;
			case FECHAPARENTESE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public List<Decl_localContext> decl_local() {
			return getRuleContexts(Decl_localContext.class);
		}
		public Decl_localContext decl_local(int i) {
			return getRuleContext(Decl_localContext.class,i);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(304); decl_local();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); declaracoes_locais();
			setState(311); comandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPOENTE) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(313); cmd();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public String tipoCmd;
		public IdentificadorContext v10;
		public Mais_identContext v11;
		public Token v1;
		public Token v2;
		public Outros_identContext v5;
		public ExpressaoContext v6;
		public Token v3;
		public Token v4;
		public TerminalNode ABREPARENTESE() { return getToken(LAParser.ABREPARENTESE, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(LAParser.RETORNE, 0); }
		public TerminalNode ENQUANTO() { return getToken(LAParser.ENQUANTO, 0); }
		public TerminalNode FIM_SE() { return getToken(LAParser.FIM_SE, 0); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode CASO() { return getToken(LAParser.CASO, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode EXPOENTE() { return getToken(LAParser.EXPOENTE, 0); }
		public TerminalNode ESCREVA() { return getToken(LAParser.ESCREVA, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode LEIA() { return getToken(LAParser.LEIA, 0); }
		public TerminalNode FIM_CASO() { return getToken(LAParser.FIM_CASO, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTESE() { return getToken(LAParser.FECHAPARENTESE, 0); }
		public TerminalNode FACA() { return getToken(LAParser.FACA, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode FIM_ENQUANTO() { return getToken(LAParser.FIM_ENQUANTO, 0); }
		public TerminalNode SEJA() { return getToken(LAParser.SEJA, 0); }
		public TerminalNode ENTAO() { return getToken(LAParser.ENTAO, 0); }
		public TerminalNode SE() { return getToken(LAParser.SE, 0); }
		public TerminalNode ATE() { return getToken(LAParser.ATE, 0); }
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public TerminalNode FIM_PARA() { return getToken(LAParser.FIM_PARA, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode PARA() { return getToken(LAParser.PARA, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(387);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); match(LEIA);
				setState(320); match(ABREPARENTESE);
				setState(321); ((CmdContext)_localctx).v10 = identificador();
				if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).v10.txt))
				               error+="Linha " + ((CmdContext)_localctx).v10.linha + ": identificador " + ((CmdContext)_localctx).v10.txt + " nao declarado\n";
				setState(323); ((CmdContext)_localctx).v11 = mais_ident();

				                                                                                                                    if(!((CmdContext)_localctx).v11.txt.equals("")){
				                                                                                                                       if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).v11.txt))
				                                                                                                                            error+="Linha " + ((CmdContext)_localctx).v11.linha + ": identificador " + ((CmdContext)_localctx).v11.txt + " nao declarado\n";
				                                                                                                                    }
				                                                                                                                  
				                                                                                                                  
				                                                                                                                   
				setState(325); match(FECHAPARENTESE);
				 ((CmdContext)_localctx).tipoCmd =  "leia"; 
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); match(ESCREVA);
				setState(329); match(ABREPARENTESE);
				setState(330); expressao();
				setState(331); mais_expressao();
				setState(332); match(FECHAPARENTESE);
				 ((CmdContext)_localctx).tipoCmd =  "escreva"; 
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(335); match(SE);
				setState(336); expressao();
				setState(337); match(ENTAO);
				setState(338); comandos();
				setState(339); senao_opcional();
				setState(340); match(FIM_SE);
				 ((CmdContext)_localctx).tipoCmd =  "se"; 
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 4);
				{
				setState(343); match(CASO);
				setState(344); exp_aritmetica();
				setState(345); match(SEJA);
				setState(346); selecao();
				setState(347); senao_opcional();
				setState(348); match(FIM_CASO);
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(350); match(PARA);
				setState(351); ((CmdContext)_localctx).v1 = match(IDENT);
				setState(352); match(ATRIBUICAO);
				setState(353); exp_aritmetica();
				setState(354); match(ATE);
				setState(355); exp_aritmetica();
				setState(356); match(FACA);
				setState(357); comandos();
				setState(358); match(FIM_PARA);
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(360); match(ENQUANTO);
				setState(361); expressao();
				setState(362); match(FACA);
				setState(363); comandos();
				setState(364); match(FIM_ENQUANTO);
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				setState(366); match(FACA);
				setState(367); comandos();
				setState(368); match(ATE);
				setState(369); expressao();
				}
				break;
			case EXPOENTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(371); match(EXPOENTE);
				setState(372); ((CmdContext)_localctx).v2 = match(IDENT);
				setState(373); ((CmdContext)_localctx).v5 = outros_ident();
				setState(374); dimensao();
				setState(375); match(ATRIBUICAO);
				setState(376); ((CmdContext)_localctx).v6 = expressao();

				       String tipo_expressao = ((CmdContext)_localctx).v6.tipoSimbolo;
				       String tipo_ident = pilhaDeTabelas.topo().GetTipoSimbolo(((CmdContext)_localctx).v2.getText());
				       if(!tipo_expressao.equals(tipo_ident))
				           error+="Linha " + ((CmdContext)_localctx).v2.getLine() + ": atribuicao nao compativel para ^" + ((CmdContext)_localctx).v2.getText()+((CmdContext)_localctx).v5.txt + "\n";
				       
				      
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(379); ((CmdContext)_localctx).v3 = match(IDENT);
				setState(380); chamada_atribuicao((((CmdContext)_localctx).v3!=null?((CmdContext)_localctx).v3.getText():null));

				          if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).v3.getText()))
				              error+="Linha " + ((CmdContext)_localctx).v3.getLine() + ": identificador " + ((CmdContext)_localctx).v3.getText() + " nao declarado\n"; 

				      
				}
				break;
			case RETORNE:
				enterOuterAlt(_localctx, 10);
				{
				setState(383); ((CmdContext)_localctx).v4 = match(RETORNE);
				setState(384); expressao();

				        String escopoAtual=pilhaDeTabelas.topo().getEscopo();
				        if(escopoAtual.equals("funcao")==false){
				            error+="Linha " + ((CmdContext)_localctx).v4.getLine() + ": comando retorne nao permitido nesse escopo\n";
				        }
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_expressaoContext extends ParserRuleContext {
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(389); match(VIRGULA);
				setState(390); expressao();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(LAParser.SENAO, 0); }
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case SENAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); match(SENAO);
				setState(397); comandos();
				}
				break;
			case FIM_SE:
			case FIM_CASO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public String primeiroIdent;
		public Outros_identContext v1;
		public Token v2;
		public ExpressaoContext e1;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode ABREPARENTESE() { return getToken(LAParser.ABREPARENTESE, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode FECHAPARENTESE() { return getToken(LAParser.FECHAPARENTESE, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState, String primeiroIdent) {
			super(parent, invokingState);
			this.primeiroIdent = primeiroIdent;
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao(String primeiroIdent) throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState(), primeiroIdent);
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(411);
			switch (_input.LA(1)) {
			case ABREPARENTESE:
				enterOuterAlt(_localctx, 1);
				{
				setState(401); match(ABREPARENTESE);
				setState(402); argumentos_opcional();
				setState(403); match(FECHAPARENTESE);
				}
				break;
			case ABRECOLCHETES:
			case PONTO:
			case ATRIBUICAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(405); ((Chamada_atribuicaoContext)_localctx).v1 = outros_ident();
				setState(406); dimensao();
				setState(407); ((Chamada_atribuicaoContext)_localctx).v2 = match(ATRIBUICAO);
				setState(408); ((Chamada_atribuicaoContext)_localctx).e1 = expressao();

				                      String tipo1 = pilhaDeTabelas.topo().GetTipoSimbolo(_localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).v1.txt);
				                      String tipo2 = ((Chamada_atribuicaoContext)_localctx).e1.tipoSimbolo;
				                      if(tipo1.equals(tipo2) || tipo1.equals("inteiro") && tipo2.equals("real") || tipo1.equals("real") && tipo2.equals("inteiro"))
				                      {}
				                      else
				                          //error+="Linha " + ((Chamada_atribuicaoContext)_localctx).v2.getLine() + ": atribuicao nao compativel para " + _localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).v1.txt + "\n";
				                          error+="Linha " + ((Chamada_atribuicaoContext)_localctx).v2.getLine() + ": atribuicao nao compativel para " + _localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).v1.txt + "\n" + tipo1 +"\n" + tipo2 + "\n";

				                      //String tipoExp = VerificadorDeTipos.verificaTipo(((Chamada_atribuicaoContext)_localctx).e1); 
				                     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case EXPOENTE:
			case VERDADEIRO:
			case FALSO:
			case ABREPARENTESE:
			case NAO:
			case SUBTRACAO:
			case OPERADOR_E:
			case CADEIA:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); expressao();
				setState(414); mais_expressao();
				}
				break;
			case FECHAPARENTESE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAParser.DOISPONTOS, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); constantes();
			setState(420); match(DOISPONTOS);
			setState(421); comandos();
			setState(422); mais_selecao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		try {
			setState(426);
			switch (_input.LA(1)) {
			case SUBTRACAO:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); selecao();
				}
				break;
			case SENAO:
			case FIM_CASO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); numero_intervalo();
			setState(429); mais_constantes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_constantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(431); match(VIRGULA);
				setState(432); constantes();
				}
				break;
			case DOISPONTOS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); op_unario();
			setState(437); match(NUM_INT);
			setState(438); intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public TerminalNode PONTOPONTO() { return getToken(LAParser.PONTOPONTO, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		try {
			setState(445);
			switch (_input.LA(1)) {
			case PONTOPONTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); match(PONTOPONTO);
				setState(441); op_unario();
				setState(442); match(NUM_INT);
				}
				break;
			case DOISPONTOS:
			case VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); match(SUBTRACAO);
				}
				break;
			case EXPOENTE:
			case ABREPARENTESE:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TermoContext v1;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		((Exp_aritmeticaContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); ((Exp_aritmeticaContext)_localctx).v1 = termo();
			setState(452); outros_termos();
			((Exp_aritmeticaContext)_localctx).tipoSimbolo = ((Exp_aritmeticaContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode DIVISAO() { return getToken(LAParser.DIVISAO, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(LAParser.MULTIPLICACAO, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_adicaoContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LAParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public FatorContext v1;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		((TermoContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); ((TermoContext)_localctx).v1 = fator();
			setState(460); outros_fatores();
			((TermoContext)_localctx).tipoSimbolo = ((TermoContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_termosContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463); op_adicao();
					setState(464); termo();
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public String tipoSimbolo;
		public ParcelaContext v1;
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		((FatorContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); ((FatorContext)_localctx).v1 = parcela();
			setState(472); outras_parcelas();
			((FatorContext)_localctx).tipoSimbolo = ((FatorContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_fatoresContext extends ParserRuleContext {
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(475); op_multiplicacao();
				setState(476); fator();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Parcela_unarioContext v1;
		public Parcela_nao_unarioContext v2;
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		((ParcelaContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(490);
			switch (_input.LA(1)) {
			case EXPOENTE:
			case ABREPARENTESE:
			case SUBTRACAO:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); op_unario();
				setState(484); ((ParcelaContext)_localctx).v1 = parcela_unario();
				((ParcelaContext)_localctx).tipoSimbolo = ((ParcelaContext)_localctx).v1.tipoSimbolo;
				}
				break;
			case OPERADOR_E:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(487); ((ParcelaContext)_localctx).v2 = parcela_nao_unario();
				((ParcelaContext)_localctx).tipoSimbolo = ((ParcelaContext)_localctx).v2.tipoSimbolo;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public String tipoSimbolo;
		public Token v1;
		public Outros_identContext oi;
		public Token v2;
		public TerminalNode ABREPARENTESE() { return getToken(LAParser.ABREPARENTESE, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode EXPOENTE() { return getToken(LAParser.EXPOENTE, 0); }
		public TerminalNode FECHAPARENTESE() { return getToken(LAParser.FECHAPARENTESE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAParser.NUM_INT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(LAParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		((Parcela_unarioContext)_localctx).txt = ""; ((Parcela_unarioContext)_localctx).linha = -1; ((Parcela_unarioContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(509);
			switch (_input.LA(1)) {
			case EXPOENTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); match(EXPOENTE);
				setState(493); ((Parcela_unarioContext)_localctx).v1 = match(IDENT);
				setState(494); ((Parcela_unarioContext)_localctx).oi = outros_ident();
				setState(495); dimensao();
				 
				        _localctx.txt+=((Parcela_unarioContext)_localctx).v1.getText() + ((Parcela_unarioContext)_localctx).oi.txt;
				        ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).v1.getLine();
				       
				       if(!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).v1.getText()+((Parcela_unarioContext)_localctx).oi.txt))
				               error+="Linha " + ((Parcela_unarioContext)_localctx).v1.getLine() + ": identificador " + ((Parcela_unarioContext)_localctx).v1.getText()+((Parcela_unarioContext)_localctx).oi.txt + " nao declarado\n";
				       if(((Parcela_unarioContext)_localctx).oi.txt.equals("")) 
				           ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().GetTipoSimbolo(_localctx.txt);
				       else
				          ((Parcela_unarioContext)_localctx).tipoSimbolo =  TabelasDeRegistros.getTipoDoSimbolo(((Parcela_unarioContext)_localctx).oi.txt.substring(1));
				      
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); ((Parcela_unarioContext)_localctx).v2 = match(IDENT);

				                           _localctx.txt+=((Parcela_unarioContext)_localctx).v2.getText(); ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).v2.getLine();
				                           if(!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).v2.getText()))
				                              error+="Linha " + ((Parcela_unarioContext)_localctx).v2.getLine() + ": identificador " + ((Parcela_unarioContext)_localctx).v2.getText() + " nao declarado\n";
				                           else
				                               ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.getTipoDoSimbolo(_localctx.txt);
				                           
				                           
				setState(500); chamada_partes();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(501); match(NUM_INT);
				((Parcela_unarioContext)_localctx).tipoSimbolo =  "inteiro";
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(503); match(NUM_REAL);
				((Parcela_unarioContext)_localctx).tipoSimbolo =  "real";
				}
				break;
			case ABREPARENTESE:
				enterOuterAlt(_localctx, 5);
				{
				setState(505); match(ABREPARENTESE);
				setState(506); expressao();
				setState(507); match(FECHAPARENTESE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public String tipoSimbolo;
		public Token v1;
		public Outros_identContext v2;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode OPERADOR_E() { return getToken(LAParser.OPERADOR_E, 0); }
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		((Parcela_nao_unarioContext)_localctx).txt = ""; ((Parcela_nao_unarioContext)_localctx).linha = -1; ((Parcela_nao_unarioContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(520);
			switch (_input.LA(1)) {
			case OPERADOR_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(511); match(OPERADOR_E);
				setState(512); ((Parcela_nao_unarioContext)_localctx).v1 = match(IDENT);
				_localctx.txt+=((Parcela_nao_unarioContext)_localctx).v1.getText(); ((Parcela_nao_unarioContext)_localctx).linha =  ((Parcela_nao_unarioContext)_localctx).v1.getLine();
				setState(514); ((Parcela_nao_unarioContext)_localctx).v2 = outros_ident();
				_localctx.txt+= ((Parcela_nao_unarioContext)_localctx).v2.txt; ((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.getTipoDoSimbolo(_localctx.txt);
				setState(516); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(518); match(CADEIA);
				((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  "literal";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public TerminalNode PORCENTAGEM(int i) {
			return getToken(LAParser.PORCENTAGEM, i);
		}
		public List<TerminalNode> PORCENTAGEM() { return getTokens(LAParser.PORCENTAGEM); }
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORCENTAGEM) {
				{
				{
				setState(522); match(PORCENTAGEM);
				setState(523); parcela();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_partesContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode ABREPARENTESE() { return getToken(LAParser.ABREPARENTESE, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode FECHAPARENTESE() { return getToken(LAParser.FECHAPARENTESE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); match(ABREPARENTESE);
				setState(530); expressao();
				setState(531); mais_expressao();
				setState(532); match(FECHAPARENTESE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); outros_ident();
				setState(535); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Exp_aritmeticaContext v1;
		public Op_opcionalContext v2;
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		((Exp_relacionalContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); ((Exp_relacionalContext)_localctx).v1 = exp_aritmetica();
			setState(541); ((Exp_relacionalContext)_localctx).v2 = op_opcional();

			          if(((Exp_relacionalContext)_localctx).v2.tipoSimbolo.equals("SEM_TIPO"))
			              ((Exp_relacionalContext)_localctx).tipoSimbolo = ((Exp_relacionalContext)_localctx).v1.tipoSimbolo;
			          else
			              ((Exp_relacionalContext)_localctx).tipoSimbolo = ((Exp_relacionalContext)_localctx).v2.tipoSimbolo;
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_opcionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Op_relacionalContext v1;
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		((Op_opcionalContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(549);
			switch (_input.LA(1)) {
			case MENORIGUAL:
			case MAIORIGUAL:
			case MENOR:
			case MAIOR:
			case IGUAL:
			case DIFERENTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(544); ((Op_opcionalContext)_localctx).v1 = op_relacional();
				setState(545); exp_aritmetica();
				((Op_opcionalContext)_localctx).tipoSimbolo = ((Op_opcionalContext)_localctx).v1.tipoSimbolo;
				}
				break;
			case FIM_ALGORITMO:
			case VIRGULA:
			case EXPOENTE:
			case FIM_PROCEDIMENTO:
			case FECHAPARENTESE:
			case FIM_FUNCAO:
			case LEIA:
			case ESCREVA:
			case SE:
			case ENTAO:
			case FIM_SE:
			case SENAO:
			case CASO:
			case FIM_CASO:
			case PARA:
			case ATE:
			case FACA:
			case FIM_PARA:
			case ENQUANTO:
			case FIM_ENQUANTO:
			case RETORNE:
			case OU:
			case E:
			case SUBTRACAO:
			case IDENT:
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TerminalNode MAIORIGUAL() { return getToken(LAParser.MAIORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(LAParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(LAParser.MAIOR, 0); }
		public TerminalNode DIFERENTE() { return getToken(LAParser.DIFERENTE, 0); }
		public TerminalNode MENORIGUAL() { return getToken(LAParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		((Op_relacionalContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(563);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); match(IGUAL);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); match(DIFERENTE);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case MAIORIGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(555); match(MAIORIGUAL);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case MENORIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(557); match(MENORIGUAL);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(559); match(MAIOR);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(561); match(MENOR);
				((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Termo_logicoContext v1;
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		((ExpressaoContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); ((ExpressaoContext)_localctx).v1 = termo_logico();
			setState(566); outros_termos_logicos();
			((ExpressaoContext)_localctx).tipoSimbolo = ((ExpressaoContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_naoContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(LAParser.NAO, 0); }
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		try {
			setState(571);
			switch (_input.LA(1)) {
			case NAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(569); match(NAO);
				}
				break;
			case EXPOENTE:
			case VERDADEIRO:
			case FALSO:
			case ABREPARENTESE:
			case SUBTRACAO:
			case OPERADOR_E:
			case CADEIA:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Fator_logicoContext v1;
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		((Termo_logicoContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); ((Termo_logicoContext)_localctx).v1 = fator_logico();
			setState(574); outros_fatores_logicos();
			((Termo_logicoContext)_localctx).tipoSimbolo = ((Termo_logicoContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public List<TerminalNode> OU() { return getTokens(LAParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(LAParser.OU, i);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(577); match(OU);
				setState(578); termo_logico();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public TerminalNode E(int i) {
			return getToken(LAParser.E, i);
		}
		public List<TerminalNode> E() { return getTokens(LAParser.E); }
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(584); match(E);
				setState(585); fator_logico();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Parcela_logicaContext v1;
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		((Fator_logicoContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); op_nao();
			setState(592); ((Fator_logicoContext)_localctx).v1 = parcela_logica();
			((Fator_logicoContext)_localctx).tipoSimbolo = ((Fator_logicoContext)_localctx).v1.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Exp_relacionalContext v1;
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		((Parcela_logicaContext)_localctx).tipoSimbolo = "SEM_TIPO";
		try {
			setState(602);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(595); match(VERDADEIRO);
				((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(597); match(FALSO);
				((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
				}
				break;
			case EXPOENTE:
			case ABREPARENTESE:
			case SUBTRACAO:
			case OPERADOR_E:
			case CADEIA:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(599); ((Parcela_logicaContext)_localctx).v1 = exp_relacional();
				((Parcela_logicaContext)_localctx).tipoSimbolo = ((Parcela_logicaContext)_localctx).v1.tipoSimbolo;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u025f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0086\n\3\3\4\3\4\5\4"+
		"\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\7\t"+
		"\u00b8\n\t\f\t\16\t\u00bb\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13"+
		"\3\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00d3\n\f\3\r\3\r\3\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e3\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00f4\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25"+
		"\3\25\5\25\u0120\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\5\27\u012c\n\27\3\30\3\30\3\30\5\30\u0131\n\30\3\31\7\31\u0134\n\31\f"+
		"\31\16\31\u0137\13\31\3\32\3\32\3\32\3\33\7\33\u013d\n\33\f\33\16\33\u0140"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0186\n\34\3\35\3\35\7\35\u018a\n\35\f\35\16\35\u018d\13\35\3\36\3\36"+
		"\3\36\5\36\u0192\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u019e\n\37\3 \3 \3 \3 \5 \u01a4\n \3!\3!\3!\3!\3!\3\"\3\"\5\"\u01ad"+
		"\n\"\3#\3#\3#\3$\3$\3$\5$\u01b5\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\5&\u01c0"+
		"\n&\3\'\3\'\5\'\u01c4\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3"+
		",\7,\u01d5\n,\f,\16,\u01d8\13,\3-\3-\3-\3-\3.\3.\3.\7.\u01e1\n.\f.\16"+
		".\u01e4\13.\3/\3/\3/\3/\3/\3/\3/\5/\u01ed\n/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0200"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u020b\n\61\3\62"+
		"\3\62\7\62\u020f\n\62\f\62\16\62\u0212\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u021d\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u0228\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0236\n\66\3\67\3\67\3\67\3\67\38\38\58\u023e\n8"+
		"\39\39\39\39\3:\3:\7:\u0246\n:\f:\16:\u0249\13:\3;\3;\7;\u024d\n;\f;\16"+
		";\u0250\13;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u025d\n=\3=\2\2>\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvx\2\5\5\2\22\23>>@A\4\2//\61\61\3\2;<\u025e\2z\3\2\2"+
		"\2\4\u0085\3\2\2\2\6\u0089\3\2\2\2\b\u009d\3\2\2\2\n\u009f\3\2\2\2\f\u00ac"+
		"\3\2\2\2\16\u00af\3\2\2\2\20\u00b9\3\2\2\2\22\u00c1\3\2\2\2\24\u00c9\3"+
		"\2\2\2\26\u00d2\3\2\2\2\30\u00da\3\2\2\2\32\u00e2\3\2\2\2\34\u00ec\3\2"+
		"\2\2\36\u00f3\3\2\2\2 \u00f5\3\2\2\2\"\u00f9\3\2\2\2$\u00fb\3\2\2\2&\u011b"+
		"\3\2\2\2(\u011f\3\2\2\2*\u0121\3\2\2\2,\u012b\3\2\2\2.\u0130\3\2\2\2\60"+
		"\u0135\3\2\2\2\62\u0138\3\2\2\2\64\u013e\3\2\2\2\66\u0185\3\2\2\28\u018b"+
		"\3\2\2\2:\u0191\3\2\2\2<\u019d\3\2\2\2>\u01a3\3\2\2\2@\u01a5\3\2\2\2B"+
		"\u01ac\3\2\2\2D\u01ae\3\2\2\2F\u01b4\3\2\2\2H\u01b6\3\2\2\2J\u01bf\3\2"+
		"\2\2L\u01c3\3\2\2\2N\u01c5\3\2\2\2P\u01c9\3\2\2\2R\u01cb\3\2\2\2T\u01cd"+
		"\3\2\2\2V\u01d6\3\2\2\2X\u01d9\3\2\2\2Z\u01e2\3\2\2\2\\\u01ec\3\2\2\2"+
		"^\u01ff\3\2\2\2`\u020a\3\2\2\2b\u0210\3\2\2\2d\u021c\3\2\2\2f\u021e\3"+
		"\2\2\2h\u0227\3\2\2\2j\u0235\3\2\2\2l\u0237\3\2\2\2n\u023d\3\2\2\2p\u023f"+
		"\3\2\2\2r\u0247\3\2\2\2t\u024e\3\2\2\2v\u0251\3\2\2\2x\u025c\3\2\2\2z"+
		"{\b\2\1\2{|\5\4\3\2|}\7\3\2\2}~\5\62\32\2~\177\7\4\2\2\177\u0080\b\2\1"+
		"\2\u0080\3\3\2\2\2\u0081\u0082\5\6\4\2\u0082\u0083\5\4\3\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\5\3\2\2\2\u0087\u008a\5\b\5\2\u0088\u008a\5&\24\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\5"+
		"\n\6\2\u008d\u008e\b\5\1\2\u008e\u009e\3\2\2\2\u008f\u0090\7\6\2\2\u0090"+
		"\u0091\7?\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7"+
		"\66\2\2\u0094\u0095\5\"\22\2\u0095\u0096\b\5\1\2\u0096\u009e\3\2\2\2\u0097"+
		"\u0098\7\7\2\2\u0098\u0099\7?\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5\26"+
		"\f\2\u009b\u009c\b\5\1\2\u009c\u009e\3\2\2\2\u009d\u008b\3\2\2\2\u009d"+
		"\u008f\3\2\2\2\u009d\u0097\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\7?\2\2"+
		"\u00a0\u00a1\5\24\13\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4"+
		"\5\26\f\2\u00a4\u00a5\b\6\1\2\u00a5\13\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00ab\5\24\13\2\u00aa\u00a6\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\r\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\b\1\2\u00b0\u00b1\5\20\t"+
		"\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\5\22\n\2\u00b4"+
		"\u00b5\b\b\1\2\u00b5\17\3\2\2\2\u00b6\u00b8\7\f\2\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\21"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\r\2\2\u00bd\u00be\5\16\b\2"+
		"\u00be\u00bf\b\n\1\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bc"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4"+
		"\u00c5\5N(\2\u00c5\u00c6\7\n\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2"+
		"\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\25"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5$\23\2\u00cd\u00ce\b\f\1\2\u00ce"+
		"\u00d3\3\2\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\b\f\1\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\27\3\2\2\2\u00d4\u00d5"+
		"\7\13\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\b\r\1\2\u00d7\u00d9\3\2\2\2"+
		"\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\n\6\2\u00de"+
		"\u00df\5\32\16\2\u00df\u00e0\b\16\1\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\33\3\2\2\2\u00e4"+
		"\u00e5\7\16\2\2\u00e5\u00ed\b\17\1\2\u00e6\u00e7\7\17\2\2\u00e7\u00ed"+
		"\b\17\1\2\u00e8\u00e9\7\20\2\2\u00e9\u00ed\b\17\1\2\u00ea\u00eb\7\21\2"+
		"\2\u00eb\u00ed\b\17\1\2\u00ec\u00e4\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ef\5\34\17"+
		"\2\u00ef\u00f0\b\20\1\2\u00f0\u00f4\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f4"+
		"\b\20\1\2\u00f3\u00ee\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\37\3\2\2\2\u00f5"+
		"\u00f6\5\20\t\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\b\21\1\2\u00f8!\3\2"+
		"\2\2\u00f9\u00fa\t\2\2\2\u00fa#\3\2\2\2\u00fb\u00fc\7\24\2\2\u00fc\u00fd"+
		"\b\23\1\2\u00fd\u00fe\5\n\6\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\b\23\1"+
		"\2\u0100\u0101\7\25\2\2\u0101\u0102\b\23\1\2\u0102%\3\2\2\2\u0103\u0104"+
		"\7\26\2\2\u0104\u0105\7?\2\2\u0105\u0106\b\24\1\2\u0106\u0107\7\30\2\2"+
		"\u0107\u0108\5(\25\2\u0108\u0109\7\31\2\2\u0109\u010a\5\60\31\2\u010a"+
		"\u010b\5\64\33\2\u010b\u010c\7\27\2\2\u010c\u010d\b\24\1\2\u010d\u011c"+
		"\3\2\2\2\u010e\u010f\7\32\2\2\u010f\u0110\7?\2\2\u0110\u0111\b\24\1\2"+
		"\u0111\u0112\7\30\2\2\u0112\u0113\5(\25\2\u0113\u0114\7\31\2\2\u0114\u0115"+
		"\7\b\2\2\u0115\u0116\5 \21\2\u0116\u0117\5\60\31\2\u0117\u0118\5\64\33"+
		"\2\u0118\u0119\7\33\2\2\u0119\u011a\b\24\1\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0103\3\2\2\2\u011b\u010e\3\2\2\2\u011c\'\3\2\2\2\u011d\u0120\5*\26\2"+
		"\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120)\3"+
		"\2\2\2\u0121\u0122\5,\27\2\u0122\u0123\5\16\b\2\u0123\u0124\5\30\r\2\u0124"+
		"\u0125\7\b\2\2\u0125\u0126\5 \21\2\u0126\u0127\5.\30\2\u0127\u0128\b\26"+
		"\1\2\u0128+\3\2\2\2\u0129\u012c\7\34\2\2\u012a\u012c\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012c-\3\2\2\2\u012d\u012e\7\13\2\2\u012e"+
		"\u0131\5*\26\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012f\3\2"+
		"\2\2\u0131/\3\2\2\2\u0132\u0134\5\b\5\2\u0133\u0132\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\61\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\5\60\31\2\u0139\u013a\5\64\33\2\u013a\63\3"+
		"\2\2\2\u013b\u013d\5\66\34\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\65\3\2\2\2\u0140\u013e\3\2\2"+
		"\2\u0141\u0142\7\35\2\2\u0142\u0143\7\30\2\2\u0143\u0144\5\16\b\2\u0144"+
		"\u0145\b\34\1\2\u0145\u0146\5\30\r\2\u0146\u0147\b\34\1\2\u0147\u0148"+
		"\7\31\2\2\u0148\u0149\b\34\1\2\u0149\u0186\3\2\2\2\u014a\u014b\7\36\2"+
		"\2\u014b\u014c\7\30\2\2\u014c\u014d\5l\67\2\u014d\u014e\58\35\2\u014e"+
		"\u014f\7\31\2\2\u014f\u0150\b\34\1\2\u0150\u0186\3\2\2\2\u0151\u0152\7"+
		"\37\2\2\u0152\u0153\5l\67\2\u0153\u0154\7 \2\2\u0154\u0155\5\64\33\2\u0155"+
		"\u0156\5:\36\2\u0156\u0157\7!\2\2\u0157\u0158\b\34\1\2\u0158\u0186\3\2"+
		"\2\2\u0159\u015a\7#\2\2\u015a\u015b\5N(\2\u015b\u015c\7$\2\2\u015c\u015d"+
		"\5@!\2\u015d\u015e\5:\36\2\u015e\u015f\7%\2\2\u015f\u0186\3\2\2\2\u0160"+
		"\u0161\7&\2\2\u0161\u0162\7?\2\2\u0162\u0163\7\'\2\2\u0163\u0164\5N(\2"+
		"\u0164\u0165\7(\2\2\u0165\u0166\5N(\2\u0166\u0167\7)\2\2\u0167\u0168\5"+
		"\64\33\2\u0168\u0169\7*\2\2\u0169\u0186\3\2\2\2\u016a\u016b\7+\2\2\u016b"+
		"\u016c\5l\67\2\u016c\u016d\7)\2\2\u016d\u016e\5\64\33\2\u016e\u016f\7"+
		",\2\2\u016f\u0186\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0172\5\64\33\2\u0172"+
		"\u0173\7(\2\2\u0173\u0174\5l\67\2\u0174\u0186\3\2\2\2\u0175\u0176\7\f"+
		"\2\2\u0176\u0177\7?\2\2\u0177\u0178\5\22\n\2\u0178\u0179\5\24\13\2\u0179"+
		"\u017a\7\'\2\2\u017a\u017b\5l\67\2\u017b\u017c\b\34\1\2\u017c\u0186\3"+
		"\2\2\2\u017d\u017e\7?\2\2\u017e\u017f\5<\37\2\u017f\u0180\b\34\1\2\u0180"+
		"\u0186\3\2\2\2\u0181\u0182\7-\2\2\u0182\u0183\5l\67\2\u0183\u0184\b\34"+
		"\1\2\u0184\u0186\3\2\2\2\u0185\u0141\3\2\2\2\u0185\u014a\3\2\2\2\u0185"+
		"\u0151\3\2\2\2\u0185\u0159\3\2\2\2\u0185\u0160\3\2\2\2\u0185\u016a\3\2"+
		"\2\2\u0185\u0170\3\2\2\2\u0185\u0175\3\2\2\2\u0185\u017d\3\2\2\2\u0185"+
		"\u0181\3\2\2\2\u0186\67\3\2\2\2\u0187\u0188\7\13\2\2\u0188\u018a\5l\67"+
		"\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c9\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\"\2\2\u018f"+
		"\u0192\5\64\33\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u0190\3"+
		"\2\2\2\u0192;\3\2\2\2\u0193\u0194\7\30\2\2\u0194\u0195\5> \2\u0195\u0196"+
		"\7\31\2\2\u0196\u019e\3\2\2\2\u0197\u0198\5\22\n\2\u0198\u0199\5\24\13"+
		"\2\u0199\u019a\7\'\2\2\u019a\u019b\5l\67\2\u019b\u019c\b\37\1\2\u019c"+
		"\u019e\3\2\2\2\u019d\u0193\3\2\2\2\u019d\u0197\3\2\2\2\u019e=\3\2\2\2"+
		"\u019f\u01a0\5l\67\2\u01a0\u01a1\58\35\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4?\3\2\2\2\u01a5"+
		"\u01a6\5D#\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8\5\64\33\2\u01a8\u01a9\5B"+
		"\"\2\u01a9A\3\2\2\2\u01aa\u01ad\5@!\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa"+
		"\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adC\3\2\2\2\u01ae\u01af\5H%\2\u01af\u01b0"+
		"\5F$\2\u01b0E\3\2\2\2\u01b1\u01b2\7\13\2\2\u01b2\u01b5\5D#\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5G\3\2\2\2\u01b6"+
		"\u01b7\5L\'\2\u01b7\u01b8\7@\2\2\u01b8\u01b9\5J&\2\u01b9I\3\2\2\2\u01ba"+
		"\u01bb\7.\2\2\u01bb\u01bc\5L\'\2\u01bc\u01bd\7@\2\2\u01bd\u01c0\3\2\2"+
		"\2\u01be\u01c0\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0K"+
		"\3\2\2\2\u01c1\u01c4\7<\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4M\3\2\2\2\u01c5\u01c6\5T+\2\u01c6\u01c7\5V,\2\u01c7"+
		"\u01c8\b(\1\2\u01c8O\3\2\2\2\u01c9\u01ca\t\3\2\2\u01caQ\3\2\2\2\u01cb"+
		"\u01cc\t\4\2\2\u01ccS\3\2\2\2\u01cd\u01ce\5X-\2\u01ce\u01cf\5Z.\2\u01cf"+
		"\u01d0\b+\1\2\u01d0U\3\2\2\2\u01d1\u01d2\5R*\2\u01d2\u01d3\5T+\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7W\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\5\\/\2\u01da\u01db\5b\62\2\u01db\u01dc\b-\1\2\u01dcY\3\2\2\2\u01dd\u01de"+
		"\5P)\2\u01de\u01df\5X-\2\u01df\u01e1\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3[\3\2\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5L\'\2\u01e6\u01e7\5^\60\2\u01e7\u01e8"+
		"\b/\1\2\u01e8\u01ed\3\2\2\2\u01e9\u01ea\5`\61\2\u01ea\u01eb\b/\1\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed]\3\2\2\2"+
		"\u01ee\u01ef\7\f\2\2\u01ef\u01f0\7?\2\2\u01f0\u01f1\5\22\n\2\u01f1\u01f2"+
		"\5\24\13\2\u01f2\u01f3\b\60\1\2\u01f3\u0200\3\2\2\2\u01f4\u01f5\7?\2\2"+
		"\u01f5\u01f6\b\60\1\2\u01f6\u0200\5d\63\2\u01f7\u01f8\7@\2\2\u01f8\u0200"+
		"\b\60\1\2\u01f9\u01fa\7A\2\2\u01fa\u0200\b\60\1\2\u01fb\u01fc\7\30\2\2"+
		"\u01fc\u01fd\5l\67\2\u01fd\u01fe\7\31\2\2\u01fe\u0200\3\2\2\2\u01ff\u01ee"+
		"\3\2\2\2\u01ff\u01f4\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u0200_\3\2\2\2\u0201\u0202\7=\2\2\u0202\u0203\7?\2\2\u0203"+
		"\u0204\b\61\1\2\u0204\u0205\5\22\n\2\u0205\u0206\b\61\1\2\u0206\u0207"+
		"\5\24\13\2\u0207\u020b\3\2\2\2\u0208\u0209\7>\2\2\u0209\u020b\b\61\1\2"+
		"\u020a\u0201\3\2\2\2\u020a\u0208\3\2\2\2\u020ba\3\2\2\2\u020c\u020d\7"+
		"\63\2\2\u020d\u020f\5\\/\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211c\3\2\2\2\u0212\u0210\3\2\2\2"+
		"\u0213\u0214\7\30\2\2\u0214\u0215\5l\67\2\u0215\u0216\58\35\2\u0216\u0217"+
		"\7\31\2\2\u0217\u021d\3\2\2\2\u0218\u0219\5\22\n\2\u0219\u021a\5\24\13"+
		"\2\u021a\u021d\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0213\3\2\2\2\u021c\u0218"+
		"\3\2\2\2\u021c\u021b\3\2\2\2\u021de\3\2\2\2\u021e\u021f\5N(\2\u021f\u0220"+
		"\5h\65\2\u0220\u0221\b\64\1\2\u0221g\3\2\2\2\u0222\u0223\5j\66\2\u0223"+
		"\u0224\5N(\2\u0224\u0225\b\65\1\2\u0225\u0228\3\2\2\2\u0226\u0228\3\2"+
		"\2\2\u0227\u0222\3\2\2\2\u0227\u0226\3\2\2\2\u0228i\3\2\2\2\u0229\u022a"+
		"\7\66\2\2\u022a\u0236\b\66\1\2\u022b\u022c\7\67\2\2\u022c\u0236\b\66\1"+
		"\2\u022d\u022e\7\62\2\2\u022e\u0236\b\66\1\2\u022f\u0230\7\60\2\2\u0230"+
		"\u0236\b\66\1\2\u0231\u0232\7\65\2\2\u0232\u0236\b\66\1\2\u0233\u0234"+
		"\7\64\2\2\u0234\u0236\b\66\1\2\u0235\u0229\3\2\2\2\u0235\u022b\3\2\2\2"+
		"\u0235\u022d\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0231\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0236k\3\2\2\2\u0237\u0238\5p9\2\u0238\u0239\5r:\2\u0239\u023a"+
		"\b\67\1\2\u023am\3\2\2\2\u023b\u023e\7:\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023eo\3\2\2\2\u023f\u0240\5v<\2\u0240"+
		"\u0241\5t;\2\u0241\u0242\b9\1\2\u0242q\3\2\2\2\u0243\u0244\78\2\2\u0244"+
		"\u0246\5p9\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248s\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b"+
		"\79\2\2\u024b\u024d\5v<\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fu\3\2\2\2\u0250\u024e\3\2\2\2"+
		"\u0251\u0252\5n8\2\u0252\u0253\5x=\2\u0253\u0254\b<\1\2\u0254w\3\2\2\2"+
		"\u0255\u0256\7\22\2\2\u0256\u025d\b=\1\2\u0257\u0258\7\23\2\2\u0258\u025d"+
		"\b=\1\2\u0259\u025a\5f\64\2\u025a\u025b\b=\1\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0255\3\2\2\2\u025c\u0257\3\2\2\2\u025c\u0259\3\2\2\2\u025dy\3\2\2\2"+
		"*\u0085\u0089\u009d\u00ac\u00b9\u00c1\u00c9\u00d2\u00da\u00e2\u00ec\u00f3"+
		"\u011b\u011f\u012b\u0130\u0135\u013e\u0185\u018b\u0191\u019d\u01a3\u01ac"+
		"\u01b4\u01bf\u01c3\u01d6\u01e2\u01ec\u01ff\u020a\u0210\u021c\u0227\u0235"+
		"\u023d\u0247\u024e\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}