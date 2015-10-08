// Generated from C:\Users\Marcus\Downloads\comp2\T1\src\t1\LA.g4 by ANTLR 4.2.2
package t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "'tipo'", 
		"':'", "'['", "']'", "','", "'^'", "'.'", "'literal'", "'inteiro'", "'real'", 
		"'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'fim_procedimento'", "'('", "')'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'senao'", 
		"'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", 
		"'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'*'", 
		"'<='", "'/'", "'>='", "'%'", "'<'", "'>'", "'='", "'<>'", "'ou'", "'e'", 
		"'nao'", "'+'", "'-'", "'&'", "CADEIA", "IDENT", "NUM_INT", "NUM_REAL", 
		"WS", "COMENTARIO"
	};
	public static final String[] ruleNames = {
		"ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "TIPO", "DOISPONTOS", 
		"ABRECOLCHETES", "FECHACOLCHETES", "VIRGULA", "EXPOENTE", "PONTO", "LITERAL", 
		"INTEIRO", "REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
		"PROCEDIMENTO", "FIM_PROCEDIMENTO", "ABREPARENTESE", "FECHAPARENTESE", 
		"FUNCAO", "FIM_FUNCAO", "VAR", "LEIA", "ESCREVA", "SE", "ENTAO", "FIM_SE", 
		"SENAO", "CASO", "SEJA", "FIM_CASO", "PARA", "ATRIBUICAO", "ATE", "FACA", 
		"FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", "RETORNE", "PONTOPONTO", "MULTIPLICACAO", 
		"MENORIGUAL", "DIVISAO", "MAIORIGUAL", "PORCENTAGEM", "MENOR", "MAIOR", 
		"IGUAL", "DIFERENTE", "OU", "E", "NAO", "SOMA", "SUBTRACAO", "OPERADOR_E", 
		"CADEIA", "IDENT", "NUM_INT", "NUM_REAL", "WS", "COMENTARIO"
	};


	   public static String grupo="<<551740>>";
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   TabelaDeSimbolos TabelaDeTipos = new TabelaDeSimbolos("tipos");
	   PilhaDeTabelas TabelasDeRegistros = new PilhaDeTabelas();
	   String error="";
	   
	/*
	A variável pilhaDeTabelas armazena todas as pilhas utilizadas na análise sintática da linguagem
	A variável TabelaDeTipos é utilizada para armazenar todos os tipos na linguagem ( tipos default e novos tipos declarados ao longo do programa em LA).
	A variável TabelasDeRegistros armazena todos os registros declarados em um programa LA.
	A variável error é utilizada para indicar se houve erro durante a análise semântica.
	*/


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 63: WS_action((RuleContext)_localctx, actionIndex); break;

		case 64: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u0213\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\7=\u01d3\n=\f=\16=\u01d6\13=\3=\3=\3=\7=\u01db"+
		"\n=\f=\16=\u01de\13=\3=\5=\u01e1\n=\3>\3>\7>\u01e5\n>\f>\16>\u01e8\13"+
		">\3?\6?\u01eb\n?\r?\16?\u01ec\3@\6@\u01f0\n@\r@\16@\u01f1\3@\3@\6@\u01f6"+
		"\n@\r@\16@\u01f7\3A\3A\3A\3B\3B\7B\u01ff\nB\fB\16B\u0202\13B\3B\5B\u0205"+
		"\nB\3B\5B\u0208\nB\3B\3B\3B\7B\u020d\nB\fB\16B\u0210\13B\3B\3B\2\2C\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\b\5\2\f\f\17\17))\5\2\f\f\17\17"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\13\f\17\17\u021d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085"+
		"\3\2\2\2\5\u008f\3\2\2\2\7\u009d\3\2\2\2\t\u00a5\3\2\2\2\13\u00af\3\2"+
		"\2\2\r\u00b4\3\2\2\2\17\u00b6\3\2\2\2\21\u00b8\3\2\2\2\23\u00ba\3\2\2"+
		"\2\25\u00bc\3\2\2\2\27\u00be\3\2\2\2\31\u00c0\3\2\2\2\33\u00c8\3\2\2\2"+
		"\35\u00d0\3\2\2\2\37\u00d5\3\2\2\2!\u00dc\3\2\2\2#\u00e7\3\2\2\2%\u00ed"+
		"\3\2\2\2\'\u00f6\3\2\2\2)\u0103\3\2\2\2+\u0110\3\2\2\2-\u0121\3\2\2\2"+
		"/\u0123\3\2\2\2\61\u0125\3\2\2\2\63\u012c\3\2\2\2\65\u0137\3\2\2\2\67"+
		"\u013b\3\2\2\29\u0140\3\2\2\2;\u0148\3\2\2\2=\u014b\3\2\2\2?\u0151\3\2"+
		"\2\2A\u0158\3\2\2\2C\u015e\3\2\2\2E\u0163\3\2\2\2G\u0168\3\2\2\2I\u0171"+
		"\3\2\2\2K\u0176\3\2\2\2M\u0179\3\2\2\2O\u017d\3\2\2\2Q\u0182\3\2\2\2S"+
		"\u018b\3\2\2\2U\u0194\3\2\2\2W\u01a1\3\2\2\2Y\u01a9\3\2\2\2[\u01ac\3\2"+
		"\2\2]\u01ae\3\2\2\2_\u01b1\3\2\2\2a\u01b3\3\2\2\2c\u01b6\3\2\2\2e\u01b8"+
		"\3\2\2\2g\u01ba\3\2\2\2i\u01bc\3\2\2\2k\u01be\3\2\2\2m\u01c1\3\2\2\2o"+
		"\u01c4\3\2\2\2q\u01c6\3\2\2\2s\u01ca\3\2\2\2u\u01cc\3\2\2\2w\u01ce\3\2"+
		"\2\2y\u01e0\3\2\2\2{\u01e2\3\2\2\2}\u01ea\3\2\2\2\177\u01ef\3\2\2\2\u0081"+
		"\u01f9\3\2\2\2\u0083\u01fc\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2"+
		"\2\u0087\u0088\7i\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7o\2\2\u008d\u008e\7q\2\2\u008e"+
		"\4\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7a\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7i\2\2"+
		"\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7o\2\2\u009b\u009c\7q\2\2\u009c\6\3\2\2\2\u009d\u009e"+
		"\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7n\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\b\3\2\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7u\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7q\2\2\u00b3\f\3\2\2\2\u00b4\u00b5"+
		"\7<\2\2\u00b5\16\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7\20\3\2\2\2\u00b8\u00b9"+
		"\7_\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\24\3\2\2\2\u00bc\u00bd"+
		"\7`\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf\30\3\2\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\32\3\2\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7q\2\2\u00cf\34\3\2"+
		"\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4"+
		"\7n\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7i\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7q\2\2\u00db"+
		" \3\2\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7f\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\u00e4\7k\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6\"\3\2"+
		"\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7u\2\2\u00eb\u00ec\7q\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7q\2\2\u00f5&\3\2\2\2\u00f6"+
		"\u00f7\7h\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa\7a\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7i\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7t\2\2\u0101"+
		"\u0102\7q\2\2\u0102(\3\2\2\2\u0103\u0104\7r\2\2\u0104\u0105\7t\2\2\u0105"+
		"\u0106\7q\2\2\u0106\u0107\7e\2\2\u0107\u0108\7g\2\2\u0108\u0109\7f\2\2"+
		"\u0109\u010a\7k\2\2\u010a\u010b\7o\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7p\2\2\u010d\u010e\7v\2\2\u010e\u010f\7q\2\2\u010f*\3\2\2\2\u0110\u0111"+
		"\7h\2\2\u0111\u0112\7k\2\2\u0112\u0113\7o\2\2\u0113\u0114\7a\2\2\u0114"+
		"\u0115\7r\2\2\u0115\u0116\7t\2\2\u0116\u0117\7q\2\2\u0117\u0118\7e\2\2"+
		"\u0118\u0119\7g\2\2\u0119\u011a\7f\2\2\u011a\u011b\7k\2\2\u011b\u011c"+
		"\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2\2\u011f"+
		"\u0120\7q\2\2\u0120,\3\2\2\2\u0121\u0122\7*\2\2\u0122.\3\2\2\2\u0123\u0124"+
		"\7+\2\2\u0124\60\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127\7w\2\2\u0127\u0128"+
		"\7p\2\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7q\2\2\u012b"+
		"\62\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7k\2\2\u012e\u012f\7o\2\2\u012f"+
		"\u0130\7a\2\2\u0130\u0131\7h\2\2\u0131\u0132\7w\2\2\u0132\u0133\7p\2\2"+
		"\u0133\u0134\7e\2\2\u0134\u0135\7c\2\2\u0135\u0136\7q\2\2\u0136\64\3\2"+
		"\2\2\u0137\u0138\7x\2\2\u0138\u0139\7c\2\2\u0139\u013a\7t\2\2\u013a\66"+
		"\3\2\2\2\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7c\2\2\u013f8\3\2\2\2\u0140\u0141\7g\2\2\u0141\u0142\7u\2\2\u0142"+
		"\u0143\7e\2\2\u0143\u0144\7t\2\2\u0144\u0145\7g\2\2\u0145\u0146\7x\2\2"+
		"\u0146\u0147\7c\2\2\u0147:\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7g\2"+
		"\2\u014a<\3\2\2\2\u014b\u014c\7g\2\2\u014c\u014d\7p\2\2\u014d\u014e\7"+
		"v\2\2\u014e\u014f\7c\2\2\u014f\u0150\7q\2\2\u0150>\3\2\2\2\u0151\u0152"+
		"\7h\2\2\u0152\u0153\7k\2\2\u0153\u0154\7o\2\2\u0154\u0155\7a\2\2\u0155"+
		"\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157@\3\2\2\2\u0158\u0159\7u\2\2\u0159"+
		"\u015a\7g\2\2\u015a\u015b\7p\2\2\u015b\u015c\7c\2\2\u015c\u015d\7q\2\2"+
		"\u015dB\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160\7c\2\2\u0160\u0161\7u\2"+
		"\2\u0161\u0162\7q\2\2\u0162D\3\2\2\2\u0163\u0164\7u\2\2\u0164\u0165\7"+
		"g\2\2\u0165\u0166\7l\2\2\u0166\u0167\7c\2\2\u0167F\3\2\2\2\u0168\u0169"+
		"\7h\2\2\u0169\u016a\7k\2\2\u016a\u016b\7o\2\2\u016b\u016c\7a\2\2\u016c"+
		"\u016d\7e\2\2\u016d\u016e\7c\2\2\u016e\u016f\7u\2\2\u016f\u0170\7q\2\2"+
		"\u0170H\3\2\2\2\u0171\u0172\7r\2\2\u0172\u0173\7c\2\2\u0173\u0174\7t\2"+
		"\2\u0174\u0175\7c\2\2\u0175J\3\2\2\2\u0176\u0177\7>\2\2\u0177\u0178\7"+
		"/\2\2\u0178L\3\2\2\2\u0179\u017a\7c\2\2\u017a\u017b\7v\2\2\u017b\u017c"+
		"\7g\2\2\u017cN\3\2\2\2\u017d\u017e\7h\2\2\u017e\u017f\7c\2\2\u017f\u0180"+
		"\7e\2\2\u0180\u0181\7c\2\2\u0181P\3\2\2\2\u0182\u0183\7h\2\2\u0183\u0184"+
		"\7k\2\2\u0184\u0185\7o\2\2\u0185\u0186\7a\2\2\u0186\u0187\7r\2\2\u0187"+
		"\u0188\7c\2\2\u0188\u0189\7t\2\2\u0189\u018a\7c\2\2\u018aR\3\2\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7p\2\2\u018d\u018e\7s\2\2\u018e\u018f\7w\2\2"+
		"\u018f\u0190\7c\2\2\u0190\u0191\7p\2\2\u0191\u0192\7v\2\2\u0192\u0193"+
		"\7q\2\2\u0193T\3\2\2\2\u0194\u0195\7h\2\2\u0195\u0196\7k\2\2\u0196\u0197"+
		"\7o\2\2\u0197\u0198\7a\2\2\u0198\u0199\7g\2\2\u0199\u019a\7p\2\2\u019a"+
		"\u019b\7s\2\2\u019b\u019c\7w\2\2\u019c\u019d\7c\2\2\u019d\u019e\7p\2\2"+
		"\u019e\u019f\7v\2\2\u019f\u01a0\7q\2\2\u01a0V\3\2\2\2\u01a1\u01a2\7t\2"+
		"\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6"+
		"\7t\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7g\2\2\u01a8X\3\2\2\2\u01a9\u01aa"+
		"\7\60\2\2\u01aa\u01ab\7\60\2\2\u01abZ\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad"+
		"\\\3\2\2\2\u01ae\u01af\7>\2\2\u01af\u01b0\7?\2\2\u01b0^\3\2\2\2\u01b1"+
		"\u01b2\7\61\2\2\u01b2`\3\2\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5\7?\2\2\u01b5"+
		"b\3\2\2\2\u01b6\u01b7\7\'\2\2\u01b7d\3\2\2\2\u01b8\u01b9\7>\2\2\u01b9"+
		"f\3\2\2\2\u01ba\u01bb\7@\2\2\u01bbh\3\2\2\2\u01bc\u01bd\7?\2\2\u01bdj"+
		"\3\2\2\2\u01be\u01bf\7>\2\2\u01bf\u01c0\7@\2\2\u01c0l\3\2\2\2\u01c1\u01c2"+
		"\7q\2\2\u01c2\u01c3\7w\2\2\u01c3n\3\2\2\2\u01c4\u01c5\7g\2\2\u01c5p\3"+
		"\2\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7q\2\2\u01c9"+
		"r\3\2\2\2\u01ca\u01cb\7-\2\2\u01cbt\3\2\2\2\u01cc\u01cd\7/\2\2\u01cdv"+
		"\3\2\2\2\u01ce\u01cf\7(\2\2\u01cfx\3\2\2\2\u01d0\u01d4\7)\2\2\u01d1\u01d3"+
		"\n\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01e1\7)"+
		"\2\2\u01d8\u01dc\7$\2\2\u01d9\u01db\n\3\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\7$\2\2\u01e0\u01d0\3\2\2\2\u01e0"+
		"\u01d8\3\2\2\2\u01e1z\3\2\2\2\u01e2\u01e6\t\4\2\2\u01e3\u01e5\t\5\2\2"+
		"\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7|\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01eb\4\62;\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed~\3\2\2\2\u01ee\u01f0\4\62;\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\7\60\2\2\u01f4\u01f6\4\62;\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0080\3\2\2\2\u01f9"+
		"\u01fa\t\6\2\2\u01fa\u01fb\bA\2\2\u01fb\u0082\3\2\2\2\u01fc\u0200\7}\2"+
		"\2\u01fd\u01ff\n\7\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0205\7\17\2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3"+
		"\2\2\2\u0206\u0208\7\f\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020e\7\177\2\2\u020a\u020b\7\f\2\2\u020b\u020d\4"+
		"\13\f\2\u020c\u020a\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\bB"+
		"\3\2\u0212\u0084\3\2\2\2\16\2\u01d4\u01dc\u01e0\u01e6\u01ec\u01f1\u01f7"+
		"\u0200\u0204\u0207\u020e\4\3A\2\3B\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}