// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/CSS.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CSSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, IMPORTANT=2, LBRACE=3, RBRACE=4, COLON=5, SEMI=6, COMMA=7, 
		DOT=8, STAR=9, SLASH=10, LPAREN=11, RPAREN=12, HASH=13, DIMENSION=14, 
		NUMBER=15, STRING=16, IDENT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "IMPORTANT", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", 
			"DOT", "STAR", "SLASH", "LPAREN", "RPAREN", "HASH", "DIMENSION", "NUMBER", 
			"STRING", "IDENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'!important'", "'{'", "'}'", "':'", "';'", "','", "'.'", 
			"'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "IMPORTANT", "LBRACE", "RBRACE", "COLON", "SEMI", "COMMA", 
			"DOT", "STAR", "SLASH", "LPAREN", "RPAREN", "HASH", "DIMENSION", "NUMBER", 
			"STRING", "IDENT", "WS"
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


	public CSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSS.g4"; }

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
		"\u0004\u0000\u0012\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000"+
		"\n\u0000\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0004\fU\b\f\u000b\f\f\fV\u0001\r\u0004\rZ\b\r\u000b"+
		"\r\f\r[\u0001\r\u0001\r\u0004\r`\b\r\u000b\r\f\ra\u0003\rd\b\r\u0001\r"+
		"\u0004\rg\b\r\u000b\r\f\rh\u0001\u000e\u0004\u000el\b\u000e\u000b\u000e"+
		"\f\u000em\u0001\u000e\u0001\u000e\u0004\u000er\b\u000e\u000b\u000e\f\u000e"+
		"s\u0003\u000ev\b\u000e\u0001\u000e\u0003\u000ey\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f}\b\u000f\n\u000f\f\u000f\u0080\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0085\b\u000f\n\u000f\f\u000f\u0088"+
		"\t\u000f\u0001\u000f\u0003\u000f\u008b\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u008f\b\u0010\n\u0010\f\u0010\u0092\t\u0010\u0001\u0011\u0004"+
		"\u0011\u0095\b\u0011\u000b\u0011\f\u0011\u0096\u0001\u0011\u0001\u0011"+
		"\u0001+\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000"+
		"\u0007\u0005\u0000--09AZ__az\u0001\u000009\u0002\u0000AZaz\u0003\u0000"+
		"\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0004\u0000--AZ__az\u0003\u0000\t"+
		"\n\r\r  \u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%"+
		"\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005>\u0001\u0000"+
		"\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000"+
		"\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001"+
		"\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000"+
		"\u0000\u0015N\u0001\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019"+
		"R\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001dk\u0001"+
		"\u0000\u0000\u0000\u001f\u008a\u0001\u0000\u0000\u0000!\u008c\u0001\u0000"+
		"\u0000\u0000#\u0094\u0001\u0000\u0000\u0000%&\u0005/\u0000\u0000&\'\u0005"+
		"*\u0000\u0000\'+\u0001\u0000\u0000\u0000(*\t\u0000\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000./\u0005*\u0000\u0000/0\u0005/\u0000\u000001\u0001\u0000\u0000\u0000"+
		"12\u0006\u0000\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005!\u0000"+
		"\u000045\u0005i\u0000\u000056\u0005m\u0000\u000067\u0005p\u0000\u0000"+
		"78\u0005o\u0000\u000089\u0005r\u0000\u00009:\u0005t\u0000\u0000:;\u0005"+
		"a\u0000\u0000;<\u0005n\u0000\u0000<=\u0005t\u0000\u0000=\u0004\u0001\u0000"+
		"\u0000\u0000>?\u0005{\u0000\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005"+
		"}\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005:\u0000\u0000C\n\u0001"+
		"\u0000\u0000\u0000DE\u0005;\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005"+
		",\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005.\u0000\u0000I\u0010"+
		"\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000K\u0012\u0001\u0000\u0000"+
		"\u0000LM\u0005/\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005(\u0000"+
		"\u0000O\u0016\u0001\u0000\u0000\u0000PQ\u0005)\u0000\u0000Q\u0018\u0001"+
		"\u0000\u0000\u0000RT\u0005#\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XZ\u0007\u0001"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\c\u0001\u0000\u0000\u0000"+
		"]_\u0005.\u0000\u0000^`\u0007\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0007\u0002\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u001c\u0001\u0000\u0000\u0000jl\u0007\u0001"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nu\u0001\u0000\u0000\u0000"+
		"oq\u0005.\u0000\u0000pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0005%\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u001e\u0001\u0000\u0000\u0000"+
		"z~\u0005\"\u0000\u0000{}\b\u0003\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0081\u008b\u0005\"\u0000\u0000\u0082\u0086\u0005\'\u0000"+
		"\u0000\u0083\u0085\b\u0004\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0005\'\u0000\u0000\u008a"+
		"z\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008b \u0001"+
		"\u0000\u0000\u0000\u008c\u0090\u0007\u0005\u0000\u0000\u008d\u008f\u0007"+
		"\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0007\u0006\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0006\u0011\u0000\u0000\u0099$\u0001\u0000\u0000"+
		"\u0000\u0010\u0000+V[achmsux~\u0086\u008a\u0090\u0096\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}