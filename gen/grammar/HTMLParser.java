// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/HTML.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, HTML_COMMENT=2, TH_TEXT=3, TH_EACH=4, TH_IF=5, TH_UNLESS=6, 
		TH_HREF=7, TH_SRC=8, TH_ACTION=9, TH_OBJECT=10, TH_FIELD=11, TH_VALUE=12, 
		TH_CLASSAPPEND=13, THYMELEAF_EXPRESSION=14, VOID_TAG=15, LT=16, GT=17, 
		SLASH=18, EQUALS=19, STRING=20, ENTITY=21, NUMBER=22, ID=23, TEXT=24, 
		WS=25;
	public static final int
		RULE_htmlDocument = 0, RULE_node = 1, RULE_element = 2, RULE_normalElement = 3, 
		RULE_selfClosingElement = 4, RULE_voidElement = 5, RULE_tagName = 6, RULE_attribute = 7, 
		RULE_thymeleafAttribute = 8, RULE_attributeValue = 9, RULE_textNode = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "node", "element", "normalElement", "selfClosingElement", 
			"voidElement", "tagName", "attribute", "thymeleafAttribute", "attributeValue", 
			"textNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'th:text'", "'th:each'", "'th:if'", "'th:unless'", 
			"'th:href'", "'th:src'", "'th:action'", "'th:object'", "'th:field'", 
			"'th:value'", "'th:classappend'", null, null, "'<'", "'>'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "HTML_COMMENT", "TH_TEXT", "TH_EACH", "TH_IF", "TH_UNLESS", 
			"TH_HREF", "TH_SRC", "TH_ACTION", "TH_OBJECT", "TH_FIELD", "TH_VALUE", 
			"TH_CLASSAPPEND", "THYMELEAF_EXPRESSION", "VOID_TAG", "LT", "GT", "SLASH", 
			"EQUALS", "STRING", "ENTITY", "NUMBER", "ID", "TEXT", "WS"
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

	@Override
	public String getGrammarFileName() { return "HTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public TerminalNode DOCTYPE() { return getToken(HTMLParser.DOCTYPE, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOCTYPE) {
				{
				setState(22);
				match(DOCTYPE);
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32604160L) != 0)) {
				{
				{
				setState(25);
				node();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NodeContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				element();
				}
				break;
			case VOID_TAG:
			case STRING:
			case ENTITY:
			case NUMBER:
			case ID:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				textNode();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
		}
		public VoidElementContext voidElement() {
			return getRuleContext(VoidElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				normalElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				selfClosingElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				voidElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(HTMLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HTMLParser.LT, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(HTMLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HTMLParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LT);
			setState(43);
			tagName();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8404984L) != 0)) {
				{
				{
				setState(44);
				attribute();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(GT);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					node();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(57);
			match(LT);
			setState(58);
			match(SLASH);
			setState(59);
			tagName();
			setState(60);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HTMLParser.LT, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(HTMLParser.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LT);
			setState(63);
			tagName();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8404984L) != 0)) {
				{
				{
				setState(64);
				attribute();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(SLASH);
			setState(71);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(HTMLParser.LT, 0); }
		public TerminalNode VOID_TAG() { return getToken(HTMLParser.VOID_TAG, 0); }
		public TerminalNode GT() { return getToken(HTMLParser.GT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VoidElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterVoidElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitVoidElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitVoidElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidElementContext voidElement() throws RecognitionException {
		VoidElementContext _localctx = new VoidElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voidElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LT);
			setState(74);
			match(VOID_TAG);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8404984L) != 0)) {
				{
				{
				setState(75);
				attribute();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode VOID_TAG() { return getToken(HTMLParser.VOID_TAG, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==VOID_TAG || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public ThymeleafAttributeContext thymeleafAttribute() {
			return getRuleContext(ThymeleafAttributeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TH_TEXT:
			case TH_EACH:
			case TH_IF:
			case TH_UNLESS:
			case TH_HREF:
			case TH_SRC:
			case TH_ACTION:
			case TH_OBJECT:
			case TH_FIELD:
			case TH_VALUE:
			case TH_CLASSAPPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				thymeleafAttribute();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(ID);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(87);
					match(EQUALS);
					setState(88);
					attributeValue();
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThymeleafAttributeContext extends ParserRuleContext {
		public TerminalNode TH_TEXT() { return getToken(HTMLParser.TH_TEXT, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public TerminalNode TH_EACH() { return getToken(HTMLParser.TH_EACH, 0); }
		public TerminalNode TH_IF() { return getToken(HTMLParser.TH_IF, 0); }
		public TerminalNode TH_UNLESS() { return getToken(HTMLParser.TH_UNLESS, 0); }
		public TerminalNode TH_HREF() { return getToken(HTMLParser.TH_HREF, 0); }
		public TerminalNode TH_SRC() { return getToken(HTMLParser.TH_SRC, 0); }
		public TerminalNode TH_ACTION() { return getToken(HTMLParser.TH_ACTION, 0); }
		public TerminalNode TH_OBJECT() { return getToken(HTMLParser.TH_OBJECT, 0); }
		public TerminalNode TH_FIELD() { return getToken(HTMLParser.TH_FIELD, 0); }
		public TerminalNode TH_VALUE() { return getToken(HTMLParser.TH_VALUE, 0); }
		public TerminalNode TH_CLASSAPPEND() { return getToken(HTMLParser.TH_CLASSAPPEND, 0); }
		public ThymeleafAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thymeleafAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterThymeleafAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitThymeleafAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitThymeleafAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThymeleafAttributeContext thymeleafAttribute() throws RecognitionException {
		ThymeleafAttributeContext _localctx = new ThymeleafAttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thymeleafAttribute);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TH_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(TH_TEXT);
				setState(94);
				match(EQUALS);
				setState(95);
				attributeValue();
				}
				break;
			case TH_EACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(TH_EACH);
				setState(97);
				match(EQUALS);
				setState(98);
				attributeValue();
				}
				break;
			case TH_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(TH_IF);
				setState(100);
				match(EQUALS);
				setState(101);
				attributeValue();
				}
				break;
			case TH_UNLESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(TH_UNLESS);
				setState(103);
				match(EQUALS);
				setState(104);
				attributeValue();
				}
				break;
			case TH_HREF:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(TH_HREF);
				setState(106);
				match(EQUALS);
				setState(107);
				attributeValue();
				}
				break;
			case TH_SRC:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				match(TH_SRC);
				setState(109);
				match(EQUALS);
				setState(110);
				attributeValue();
				}
				break;
			case TH_ACTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(TH_ACTION);
				setState(112);
				match(EQUALS);
				setState(113);
				attributeValue();
				}
				break;
			case TH_OBJECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(TH_OBJECT);
				setState(115);
				match(EQUALS);
				setState(116);
				attributeValue();
				}
				break;
			case TH_FIELD:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				match(TH_FIELD);
				setState(118);
				match(EQUALS);
				setState(119);
				attributeValue();
				}
				break;
			case TH_VALUE:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				match(TH_VALUE);
				setState(121);
				match(EQUALS);
				setState(122);
				attributeValue();
				}
				break;
			case TH_CLASSAPPEND:
				enterOuterAlt(_localctx, 11);
				{
				setState(123);
				match(TH_CLASSAPPEND);
				setState(124);
				match(EQUALS);
				setState(125);
				attributeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode THYMELEAF_EXPRESSION() { return getToken(HTMLParser.THYMELEAF_EXPRESSION, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13647872L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HTMLParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(HTMLParser.STRING, 0); }
		public TerminalNode ENTITY() { return getToken(HTMLParser.ENTITY, 0); }
		public TerminalNode TEXT() { return getToken(HTMLParser.TEXT, 0); }
		public TerminalNode VOID_TAG() { return getToken(HTMLParser.VOID_TAG, 0); }
		public TextNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLListener ) ((HTMLListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLVisitor ) return ((HTMLVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32538624L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0003\u0000"+
		"\u0018\b\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001$"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00035\b\u0003\n\u0003\f\u00038\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007Z\b\u0007\u0003\u0007\\\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0003\u0002\u0000\u000f\u000f\u0017\u0017\u0003\u0000"+
		"\u000e\u000e\u0014\u0014\u0016\u0017\u0002\u0000\u000f\u000f\u0014\u0018"+
		"\u008e\u0000\u0017\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000"+
		"\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000"+
		"\u000e[\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0080"+
		"\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0005\u0001\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0003\u0002\u0001\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e"+
		"\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"+
		"\u0000\u0000!$\u0003\u0004\u0002\u0000\"$\u0003\u0014\n\u0000#!\u0001"+
		"\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000"+
		"\u0000%)\u0003\u0006\u0003\u0000&)\u0003\b\u0004\u0000\')\u0003\n\u0005"+
		"\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0010\u0000\u0000"+
		"+/\u0003\f\u0006\u0000,.\u0003\u000e\u0007\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000026\u0005\u0011"+
		"\u0000\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0010\u0000"+
		"\u0000:;\u0005\u0012\u0000\u0000;<\u0003\f\u0006\u0000<=\u0005\u0011\u0000"+
		"\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0010\u0000\u0000?C\u0003"+
		"\f\u0006\u0000@B\u0003\u000e\u0007\u0000A@\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0012\u0000"+
		"\u0000GH\u0005\u0011\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\u0010"+
		"\u0000\u0000JN\u0005\u000f\u0000\u0000KM\u0003\u000e\u0007\u0000LK\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0011\u0000\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0000\u0000\u0000T\r\u0001\u0000\u0000\u0000U\\\u0003\u0010\b\u0000V"+
		"Y\u0005\u0017\u0000\u0000WX\u0005\u0013\u0000\u0000XZ\u0003\u0012\t\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[U\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000\\\u000f\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0005\u0013\u0000\u0000"+
		"_\u007f\u0003\u0012\t\u0000`a\u0005\u0004\u0000\u0000ab\u0005\u0013\u0000"+
		"\u0000b\u007f\u0003\u0012\t\u0000cd\u0005\u0005\u0000\u0000de\u0005\u0013"+
		"\u0000\u0000e\u007f\u0003\u0012\t\u0000fg\u0005\u0006\u0000\u0000gh\u0005"+
		"\u0013\u0000\u0000h\u007f\u0003\u0012\t\u0000ij\u0005\u0007\u0000\u0000"+
		"jk\u0005\u0013\u0000\u0000k\u007f\u0003\u0012\t\u0000lm\u0005\b\u0000"+
		"\u0000mn\u0005\u0013\u0000\u0000n\u007f\u0003\u0012\t\u0000op\u0005\t"+
		"\u0000\u0000pq\u0005\u0013\u0000\u0000q\u007f\u0003\u0012\t\u0000rs\u0005"+
		"\n\u0000\u0000st\u0005\u0013\u0000\u0000t\u007f\u0003\u0012\t\u0000uv"+
		"\u0005\u000b\u0000\u0000vw\u0005\u0013\u0000\u0000w\u007f\u0003\u0012"+
		"\t\u0000xy\u0005\f\u0000\u0000yz\u0005\u0013\u0000\u0000z\u007f\u0003"+
		"\u0012\t\u0000{|\u0005\r\u0000\u0000|}\u0005\u0013\u0000\u0000}\u007f"+
		"\u0003\u0012\t\u0000~]\u0001\u0000\u0000\u0000~`\u0001\u0000\u0000\u0000"+
		"~c\u0001\u0000\u0000\u0000~f\u0001\u0000\u0000\u0000~i\u0001\u0000\u0000"+
		"\u0000~l\u0001\u0000\u0000\u0000~o\u0001\u0000\u0000\u0000~r\u0001\u0000"+
		"\u0000\u0000~u\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000~{\u0001"+
		"\u0000\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0007"+
		"\u0001\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0007"+
		"\u0002\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u000b\u0017\u001c"+
		"#(/6CNY[~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}