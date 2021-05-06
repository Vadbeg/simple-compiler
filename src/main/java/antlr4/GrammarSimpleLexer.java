// Generated from /home/vadbeg/Projects/University/compilers/simple-compiler/src/main/java/antlr4/GrammarSimple.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarSimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CompareOperator=9, 
		LessThan=10, LessOrEqual=11, GreaterThan=12, GreaterOrEqual=13, Equal=14, 
		NotEqual=15, And=16, Or=17, PackageName=18, EndOfLine=19, Integer=20, 
		Float=21, Return=22, ID=23, OpenBracket=24, CloseBracket=25, Plus=26, 
		PlusAss=27, Minus=28, MinusAss=29, Star=30, StarAss=31, Devide=32, DevideAss=33, 
		Comma=34, Pow=35, Sqrt=36, Assign=37, Number=38, Digit=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CompareOperator", 
			"LessThan", "LessOrEqual", "GreaterThan", "GreaterOrEqual", "Equal", 
			"NotEqual", "And", "Or", "PackageName", "EndOfLine", "Integer", "Float", 
			"Return", "ID", "OpenBracket", "CloseBracket", "Plus", "PlusAss", "Minus", 
			"MinusAss", "Star", "StarAss", "Devide", "DevideAss", "Comma", "Pow", 
			"Sqrt", "Assign", "Number", "Digit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'main'", "'if'", "'start'", "'finish'", "'then'", 
			"'else'", "'for'", null, "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'and'", "'or'", null, "';'", "'int'", "'float'", "'return'", null, "'('", 
			"')'", "'+'", "'+='", "'-'", "'-='", "'*'", "'*='", "'/'", "'/='", "','", 
			"'^'", "'~'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "CompareOperator", 
			"LessThan", "LessOrEqual", "GreaterThan", "GreaterOrEqual", "Equal", 
			"NotEqual", "And", "Or", "PackageName", "EndOfLine", "Integer", "Float", 
			"Return", "ID", "OpenBracket", "CloseBracket", "Plus", "PlusAss", "Minus", 
			"MinusAss", "Star", "StarAss", "Devide", "DevideAss", "Comma", "Pow", 
			"Sqrt", "Assign", "Number", "Digit", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GrammarSimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0085\n\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\6\23\u00a0\n\23\r\23\16\23\u00a1\3"+
		"\23\6\23\u00a5\n\23\r\23\16\23\u00a6\3\23\6\23\u00aa\n\23\r\23\16\23\u00ab"+
		"\6\23\u00ae\n\23\r\23\16\23\u00af\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7"+
		"\30\u00c7\n\30\f\30\16\30\u00ca\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u00ed\n\'\3\'\6\'\u00f0\n\'\r\'"+
		"\16\'\u00f1\3(\3(\3(\3(\3)\3)\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\7"+
		"\3\2C\\\3\2c|\3\2\62;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0108\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5[\3\2\2"+
		"\2\7`\3\2\2\2\tc\3\2\2\2\13i\3\2\2\2\rp\3\2\2\2\17u\3\2\2\2\21z\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u008b\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u0090\3\2\2\2\37\u0093\3\2\2\2!\u0096\3\2\2\2#\u009a"+
		"\3\2\2\2%\u009d\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b7\3\2\2\2"+
		"-\u00bd\3\2\2\2/\u00c4\3\2\2\2\61\u00cb\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf"+
		"\3\2\2\2\67\u00d1\3\2\2\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=\u00d9\3\2\2\2"+
		"?\u00db\3\2\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E\u00e3\3\2\2\2G\u00e5\3"+
		"\2\2\2I\u00e7\3\2\2\2K\u00e9\3\2\2\2M\u00ec\3\2\2\2O\u00f3\3\2\2\2Q\u00f7"+
		"\3\2\2\2ST\7r\2\2TU\7c\2\2UV\7e\2\2VW\7m\2\2WX\7c\2\2XY\7i\2\2YZ\7g\2"+
		"\2Z\4\3\2\2\2[\\\7o\2\2\\]\7c\2\2]^\7k\2\2^_\7p\2\2_\6\3\2\2\2`a\7k\2"+
		"\2ab\7h\2\2b\b\3\2\2\2cd\7u\2\2de\7v\2\2ef\7c\2\2fg\7t\2\2gh\7v\2\2h\n"+
		"\3\2\2\2ij\7h\2\2jk\7k\2\2kl\7p\2\2lm\7k\2\2mn\7u\2\2no\7j\2\2o\f\3\2"+
		"\2\2pq\7v\2\2qr\7j\2\2rs\7g\2\2st\7p\2\2t\16\3\2\2\2uv\7g\2\2vw\7n\2\2"+
		"wx\7u\2\2xy\7g\2\2y\20\3\2\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2}\22\3\2\2\2"+
		"~\u0085\5\25\13\2\177\u0085\5\27\f\2\u0080\u0085\5\31\r\2\u0081\u0085"+
		"\5\33\16\2\u0082\u0085\5\35\17\2\u0083\u0085\5\37\20\2\u0084~\3\2\2\2"+
		"\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\24\3\2\2\2\u0086\u0087\7>\2\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008c\7@\2\2\u008c\32\3\2\2\2\u008d\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f"+
		"\34\3\2\2\2\u0090\u0091\7?\2\2\u0091\u0092\7?\2\2\u0092\36\3\2\2\2\u0093"+
		"\u0094\7#\2\2\u0094\u0095\7?\2\2\u0095 \3\2\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7f\2\2\u0099\"\3\2\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7t\2\2\u009c$\3\2\2\2\u009d\u00ad\t\2\2\2\u009e\u00a0\t\3\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00ae\3\2\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ae\3\2"+
		"\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009f\3\2"+
		"\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2"+
		"(\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"*\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc,\3\2\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7p\2\2\u00c3.\3\2\2\2\u00c4\u00c8\t\3\2\2\u00c5\u00c7\t\5"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\60\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7*\2\2"+
		"\u00cc\62\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7-\2"+
		"\2\u00d0\66\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d3\7?\2\2\u00d38\3\2\2"+
		"\2\u00d4\u00d5\7/\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\7"+
		"?\2\2\u00d8<\3\2\2\2\u00d9\u00da\7,\2\2\u00da>\3\2\2\2\u00db\u00dc\7,"+
		"\2\2\u00dc\u00dd\7?\2\2\u00dd@\3\2\2\2\u00de\u00df\7\61\2\2\u00dfB\3\2"+
		"\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7?\2\2\u00e2D\3\2\2\2\u00e3\u00e4"+
		"\7.\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7`\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7"+
		"\u0080\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7?\2\2\u00eaL\3\2\2\2\u00eb\u00ed"+
		"\59\35\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2N\3\2\2\2\u00f3\u00f4\5M\'\2\u00f4\u00f5"+
		"\7\60\2\2\u00f5\u00f6\5M\'\2\u00f6P\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\b)\2\2\u00faR\3\2\2\2\r\2\u0084\u00a1\u00a6"+
		"\u00ab\u00ad\u00af\u00c6\u00c8\u00ec\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}