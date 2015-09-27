package t1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
// Descomente as linhas abaixo para testar o analisador gerado.
// Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
// Modifique-a para testar os demais exemplos
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        LALexer lexer = new LALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LAParser parser = new LAParser(tokens);
        
        //lexer.addErrorListener(new T1ErrorListenerLexer(out));
        //parser.addErrorListener(new T1ErrorListener(out));
       // parser.programa();
        
        try {
                GeradorDeCodigo gdc = new GeradorDeCodigo();
            
                // Adição dos listeners no LEXER e no PARSER
                lexer.addErrorListener(new T1ErrorListenerLexer(out));
                parser.addErrorListener(new T1ErrorListener(out));
                
                // Inicio 
                LAParser.ProgramaContext raiz = parser.programa();
                ParseTreeWalker ptw = new ParseTreeWalker();
                ptw.walk(gdc, raiz);
             } 
            catch (RuntimeException e) {
                // Pega as mensagens de erro semanticas
                 if(e.getMessage()!= null)
                    out.println(e.getMessage()+"Fim da compilacao");
             }
        
        if (!out.isModificado()) {
            out.println("Fim da analise. Sem erros sintaticos.");
           // out.println("Tabela de simbolos:");

           // TabelaDeSimbolos.imprimirTabela(out);
            System.out.print(out);
        } 
        
        PrintWriter pw = new PrintWriter(new File(args[1]));
        pw.print(out.toString());
        pw.flush();
        pw.close();
    }
}