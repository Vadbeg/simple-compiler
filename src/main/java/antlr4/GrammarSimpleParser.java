// Generated from /home/vadbeg/Projects/University/compilers/simple-compiler/src/main/java/antlr4/GrammarSimple.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarSimpleParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_moduleName = 1, RULE_function = 2, RULE_type = 3, 
		RULE_attributs = 4, RULE_callAttributs = 5, RULE_main = 6, RULE_callFunction = 7, 
		RULE_ifFunc = 8, RULE_bodyFunc = 9, RULE_thenFunc = 10, RULE_elseFunc = 11, 
		RULE_forFunc = 12, RULE_functionReturn = 13, RULE_callProcedure = 14, 
		RULE_bodyProc = 15, RULE_ifProc = 16, RULE_thenProc = 17, RULE_elseProc = 18, 
		RULE_forProc = 19, RULE_condition = 20, RULE_conditionFor = 21, RULE_math = 22, 
		RULE_operation = 23, RULE_ass = 24, RULE_summOperation = 25, RULE_diffOperation = 26, 
		RULE_multOperation = 27, RULE_divOperation = 28, RULE_inPowOperation = 29, 
		RULE_summ = 30, RULE_diff = 31, RULE_mult = 32, RULE_div = 33, RULE_inPow = 34, 
		RULE_inSqrt = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "moduleName", "function", "type", "attributs", "callAttributs", 
			"main", "callFunction", "ifFunc", "bodyFunc", "thenFunc", "elseFunc", 
			"forFunc", "functionReturn", "callProcedure", "bodyProc", "ifProc", "thenProc", 
			"elseProc", "forProc", "condition", "conditionFor", "math", "operation", 
			"ass", "summOperation", "diffOperation", "multOperation", "divOperation", 
			"inPowOperation", "summ", "diff", "mult", "div", "inPow", "inSqrt"
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

	@Override
	public String getGrammarFileName() { return "GrammarSimple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarSimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			moduleName();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Integer || _la==Float) {
				{
				{
				setState(73);
				function();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			main();
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

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode PackageName() { return getToken(GrammarSimpleParser.PackageName, 0); }
		public TerminalNode EndOfLine() { return getToken(GrammarSimpleParser.EndOfLine, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			match(PackageName);
			setState(83);
			match(EndOfLine);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarSimpleParser.ID, 0); }
		public AttributsContext attributs() {
			return getRuleContext(AttributsContext.class,0);
		}
		public BodyFuncContext bodyFunc() {
			return getRuleContext(BodyFuncContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(86);
			match(ID);
			setState(87);
			attributs();
			setState(88);
			bodyFunc();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(GrammarSimpleParser.Integer, 0); }
		public TerminalNode Float() { return getToken(GrammarSimpleParser.Float, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Float) ) {
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

	public static class AttributsContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(GrammarSimpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GrammarSimpleParser.Comma, i);
		}
		public AttributsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterAttributs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitAttributs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitAttributs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributsContext attributs() throws RecognitionException {
		AttributsContext _localctx = new AttributsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OpenBracket);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer || _la==Float) {
				{
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(95);
					match(Comma);
					setState(96);
					type();
					setState(97);
					match(ID);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
			match(CloseBracket);
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

	public static class CallAttributsContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<CallFunctionContext> callFunction() {
			return getRuleContexts(CallFunctionContext.class);
		}
		public CallFunctionContext callFunction(int i) {
			return getRuleContext(CallFunctionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GrammarSimpleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GrammarSimpleParser.Comma, i);
		}
		public CallAttributsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAttributs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterCallAttributs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitCallAttributs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitCallAttributs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAttributsContext callAttributs() throws RecognitionException {
		CallAttributsContext _localctx = new CallAttributsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callAttributs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OpenBracket);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Number) | (1L << Digit))) != 0)) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(109);
					match(ID);
					}
					break;
				case 2:
					{
					setState(110);
					match(Number);
					}
					break;
				case 3:
					{
					setState(111);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(112);
					callFunction();
					}
					break;
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(115);
					match(Comma);
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(116);
						match(ID);
						}
						break;
					case 2:
						{
						setState(117);
						match(Number);
						}
						break;
					case 3:
						{
						setState(118);
						match(Digit);
						}
						break;
					case 4:
						{
						setState(119);
						callFunction();
						}
						break;
					}
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(129);
			match(CloseBracket);
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

	public static class MainContext extends ParserRuleContext {
		public BodyProcContext bodyProc() {
			return getRuleContext(BodyProcContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__1);
			setState(132);
			bodyProc();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarSimpleParser.ID, 0); }
		public CallAttributsContext callAttributs() {
			return getRuleContext(CallAttributsContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			callAttributs();
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

	public static class IfFuncContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public ThenFuncContext thenFunc() {
			return getRuleContext(ThenFuncContext.class,0);
		}
		public ElseFuncContext elseFunc() {
			return getRuleContext(ElseFuncContext.class,0);
		}
		public IfFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterIfFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitIfFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitIfFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfFuncContext ifFunc() throws RecognitionException {
		IfFuncContext _localctx = new IfFuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__2);
			setState(138);
			match(OpenBracket);
			setState(139);
			condition();
			setState(140);
			match(CloseBracket);
			setState(141);
			thenFunc();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(142);
				elseFunc();
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

	public static class BodyFuncContext extends ParserRuleContext {
		public List<IfFuncContext> ifFunc() {
			return getRuleContexts(IfFuncContext.class);
		}
		public IfFuncContext ifFunc(int i) {
			return getRuleContext(IfFuncContext.class,i);
		}
		public List<ForFuncContext> forFunc() {
			return getRuleContexts(ForFuncContext.class);
		}
		public ForFuncContext forFunc(int i) {
			return getRuleContext(ForFuncContext.class,i);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public List<TerminalNode> EndOfLine() { return getTokens(GrammarSimpleParser.EndOfLine); }
		public TerminalNode EndOfLine(int i) {
			return getToken(GrammarSimpleParser.EndOfLine, i);
		}
		public BodyFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterBodyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitBodyFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitBodyFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyFuncContext bodyFunc() throws RecognitionException {
		BodyFuncContext _localctx = new BodyFuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bodyFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__3);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					{
					setState(146);
					math();
					setState(147);
					match(EndOfLine);
					}
					}
					break;
				case T__2:
					{
					setState(149);
					ifFunc();
					}
					break;
				case T__7:
					{
					setState(150);
					forFunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(156);
				functionReturn();
				}
			}

			setState(159);
			match(T__4);
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

	public static class ThenFuncContext extends ParserRuleContext {
		public BodyFuncContext bodyFunc() {
			return getRuleContext(BodyFuncContext.class,0);
		}
		public ThenFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterThenFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitThenFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitThenFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenFuncContext thenFunc() throws RecognitionException {
		ThenFuncContext _localctx = new ThenFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_thenFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__5);
			setState(162);
			bodyFunc();
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

	public static class ElseFuncContext extends ParserRuleContext {
		public BodyFuncContext bodyFunc() {
			return getRuleContext(BodyFuncContext.class,0);
		}
		public ElseFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterElseFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitElseFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitElseFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseFuncContext elseFunc() throws RecognitionException {
		ElseFuncContext _localctx = new ElseFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__6);
			setState(165);
			bodyFunc();
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

	public static class ForFuncContext extends ParserRuleContext {
		public ConditionForContext conditionFor() {
			return getRuleContext(ConditionForContext.class,0);
		}
		public BodyFuncContext bodyFunc() {
			return getRuleContext(BodyFuncContext.class,0);
		}
		public ForFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterForFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitForFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitForFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForFuncContext forFunc() throws RecognitionException {
		ForFuncContext _localctx = new ForFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__7);
			setState(168);
			conditionFor();
			setState(169);
			bodyFunc();
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

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(GrammarSimpleParser.Return, 0); }
		public TerminalNode EndOfLine() { return getToken(GrammarSimpleParser.EndOfLine, 0); }
		public TerminalNode ID() { return getToken(GrammarSimpleParser.ID, 0); }
		public TerminalNode Number() { return getToken(GrammarSimpleParser.Number, 0); }
		public TerminalNode Digit() { return getToken(GrammarSimpleParser.Digit, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Return);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(172);
				match(ID);
				}
				break;
			case 2:
				{
				setState(173);
				match(Number);
				}
				break;
			case 3:
				{
				setState(174);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(175);
				operation();
				}
				break;
			case 5:
				{
				setState(176);
				callFunction();
				}
				break;
			}
			setState(179);
			match(EndOfLine);
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

	public static class CallProcedureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarSimpleParser.ID, 0); }
		public CallAttributsContext callAttributs() {
			return getRuleContext(CallAttributsContext.class,0);
		}
		public CallProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterCallProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitCallProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitCallProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallProcedureContext callProcedure() throws RecognitionException {
		CallProcedureContext _localctx = new CallProcedureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ID);
			setState(182);
			callAttributs();
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

	public static class BodyProcContext extends ParserRuleContext {
		public List<IfProcContext> ifProc() {
			return getRuleContexts(IfProcContext.class);
		}
		public IfProcContext ifProc(int i) {
			return getRuleContext(IfProcContext.class,i);
		}
		public List<ForProcContext> forProc() {
			return getRuleContexts(ForProcContext.class);
		}
		public ForProcContext forProc(int i) {
			return getRuleContext(ForProcContext.class,i);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public List<TerminalNode> EndOfLine() { return getTokens(GrammarSimpleParser.EndOfLine); }
		public TerminalNode EndOfLine(int i) {
			return getToken(GrammarSimpleParser.EndOfLine, i);
		}
		public BodyProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterBodyProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitBodyProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitBodyProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyProcContext bodyProc() throws RecognitionException {
		BodyProcContext _localctx = new BodyProcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bodyProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__3);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					{
					setState(185);
					math();
					setState(186);
					match(EndOfLine);
					}
					}
					break;
				case T__2:
					{
					setState(188);
					ifProc();
					}
					break;
				case T__7:
					{
					setState(189);
					forProc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__4);
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

	public static class IfProcContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public ThenProcContext thenProc() {
			return getRuleContext(ThenProcContext.class,0);
		}
		public ElseProcContext elseProc() {
			return getRuleContext(ElseProcContext.class,0);
		}
		public IfProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterIfProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitIfProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitIfProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfProcContext ifProc() throws RecognitionException {
		IfProcContext _localctx = new IfProcContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__2);
			setState(198);
			match(OpenBracket);
			setState(199);
			condition();
			setState(200);
			match(CloseBracket);
			setState(201);
			thenProc();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(202);
				elseProc();
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

	public static class ThenProcContext extends ParserRuleContext {
		public BodyProcContext bodyProc() {
			return getRuleContext(BodyProcContext.class,0);
		}
		public ThenProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterThenProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitThenProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitThenProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenProcContext thenProc() throws RecognitionException {
		ThenProcContext _localctx = new ThenProcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_thenProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__5);
			setState(206);
			bodyProc();
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

	public static class ElseProcContext extends ParserRuleContext {
		public BodyProcContext bodyProc() {
			return getRuleContext(BodyProcContext.class,0);
		}
		public ElseProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterElseProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitElseProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitElseProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseProcContext elseProc() throws RecognitionException {
		ElseProcContext _localctx = new ElseProcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__6);
			setState(209);
			bodyProc();
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

	public static class ForProcContext extends ParserRuleContext {
		public ConditionForContext conditionFor() {
			return getRuleContext(ConditionForContext.class,0);
		}
		public BodyProcContext bodyProc() {
			return getRuleContext(BodyProcContext.class,0);
		}
		public ForProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterForProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitForProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitForProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForProcContext forProc() throws RecognitionException {
		ForProcContext _localctx = new ForProcContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__7);
			setState(212);
			conditionFor();
			setState(213);
			bodyProc();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CompareOperator() { return getToken(GrammarSimpleParser.CompareOperator, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode And() { return getToken(GrammarSimpleParser.And, 0); }
		public TerminalNode Or() { return getToken(GrammarSimpleParser.Or, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Number) | (1L << Digit))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(216);
			match(CompareOperator);
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Number) | (1L << Digit))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And || _la==Or) {
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==And || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				condition();
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

	public static class ConditionForContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public List<TerminalNode> EndOfLine() { return getTokens(GrammarSimpleParser.EndOfLine); }
		public TerminalNode EndOfLine(int i) {
			return getToken(GrammarSimpleParser.EndOfLine, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public TerminalNode Number() { return getToken(GrammarSimpleParser.Number, 0); }
		public TerminalNode Digit() { return getToken(GrammarSimpleParser.Digit, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ConditionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterConditionFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitConditionFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitConditionFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionForContext conditionFor() throws RecognitionException {
		ConditionForContext _localctx = new ConditionForContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OpenBracket);
			setState(223);
			match(ID);
			setState(224);
			match(Assign);
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Number) | (1L << Digit))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226);
			match(EndOfLine);
			setState(227);
			condition();
			setState(228);
			match(EndOfLine);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(229);
				math();
				}
				break;
			case 2:
				{
				setState(230);
				operation();
				}
				break;
			}
			setState(233);
			match(CloseBracket);
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

	public static class MathContext extends ParserRuleContext {
		public SummOperationContext summOperation() {
			return getRuleContext(SummOperationContext.class,0);
		}
		public DiffOperationContext diffOperation() {
			return getRuleContext(DiffOperationContext.class,0);
		}
		public MultOperationContext multOperation() {
			return getRuleContext(MultOperationContext.class,0);
		}
		public DivOperationContext divOperation() {
			return getRuleContext(DivOperationContext.class,0);
		}
		public InPowOperationContext inPowOperation() {
			return getRuleContext(InPowOperationContext.class,0);
		}
		public AssContext ass() {
			return getRuleContext(AssContext.class,0);
		}
		public CallProcedureContext callProcedure() {
			return getRuleContext(CallProcedureContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(235);
				summOperation();
				}
				break;
			case 2:
				{
				setState(236);
				diffOperation();
				}
				break;
			case 3:
				{
				setState(237);
				multOperation();
				}
				break;
			case 4:
				{
				setState(238);
				divOperation();
				}
				break;
			case 5:
				{
				setState(239);
				diffOperation();
				}
				break;
			case 6:
				{
				setState(240);
				inPowOperation();
				}
				break;
			case 7:
				{
				setState(241);
				ass();
				}
				break;
			case 8:
				{
				setState(242);
				callProcedure();
				}
				break;
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

	public static class OperationContext extends ParserRuleContext {
		public SummContext summ() {
			return getRuleContext(SummContext.class,0);
		}
		public DiffContext diff() {
			return getRuleContext(DiffContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public InPowContext inPow() {
			return getRuleContext(InPowContext.class,0);
		}
		public InSqrtContext inSqrt() {
			return getRuleContext(InSqrtContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operation);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				summ();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				diff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				mult();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				div();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				inPow();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				inSqrt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				callFunction();
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

	public static class AssContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Number() { return getToken(GrammarSimpleParser.Number, 0); }
		public TerminalNode Digit() { return getToken(GrammarSimpleParser.Digit, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public AssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterAss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitAss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitAss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssContext ass() throws RecognitionException {
		AssContext _localctx = new AssContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(Assign);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(256);
				match(OpenBracket);
				setState(257);
				type();
				setState(258);
				match(CloseBracket);
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(262);
				match(ID);
				}
				break;
			case 2:
				{
				setState(263);
				match(Number);
				}
				break;
			case 3:
				{
				setState(264);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(265);
				operation();
				}
				break;
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

	public static class SummOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Plus() { return getToken(GrammarSimpleParser.Plus, 0); }
		public TerminalNode PlusAss() { return getToken(GrammarSimpleParser.PlusAss, 0); }
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public SummOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterSummOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitSummOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitSummOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummOperationContext summOperation() throws RecognitionException {
		SummOperationContext _localctx = new SummOperationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_summOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(268);
				match(ID);
				setState(269);
				match(Assign);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(270);
					match(OpenBracket);
					setState(271);
					type();
					setState(272);
					match(CloseBracket);
					}
					break;
				}
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(276);
					match(ID);
					}
					break;
				case 2:
					{
					setState(277);
					match(Number);
					}
					break;
				case 3:
					{
					setState(278);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(279);
					operation();
					}
					break;
				}
				setState(282);
				match(Plus);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(283);
					match(ID);
					}
					break;
				case 2:
					{
					setState(284);
					match(Number);
					}
					break;
				case 3:
					{
					setState(285);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(286);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(289);
				match(ID);
				setState(290);
				match(PlusAss);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(291);
					match(OpenBracket);
					setState(292);
					type();
					setState(293);
					match(CloseBracket);
					}
					break;
				}
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(297);
					match(ID);
					}
					break;
				case 2:
					{
					setState(298);
					match(Number);
					}
					break;
				case 3:
					{
					setState(299);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(300);
					operation();
					}
					break;
				}
				}
				break;
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

	public static class DiffOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Minus() { return getToken(GrammarSimpleParser.Minus, 0); }
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public TerminalNode MinusAss() { return getToken(GrammarSimpleParser.MinusAss, 0); }
		public DiffOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterDiffOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitDiffOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitDiffOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffOperationContext diffOperation() throws RecognitionException {
		DiffOperationContext _localctx = new DiffOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_diffOperation);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(ID);
				setState(306);
				match(Assign);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(307);
					match(OpenBracket);
					setState(308);
					type();
					setState(309);
					match(CloseBracket);
					}
					break;
				}
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(313);
					match(ID);
					}
					break;
				case 2:
					{
					setState(314);
					match(Number);
					}
					break;
				case 3:
					{
					setState(315);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(316);
					operation();
					}
					break;
				}
				setState(319);
				match(Minus);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(320);
					match(ID);
					}
					break;
				case 2:
					{
					setState(321);
					match(Number);
					}
					break;
				case 3:
					{
					setState(322);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(323);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(ID);
				setState(327);
				match(MinusAss);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(328);
					match(OpenBracket);
					setState(329);
					type();
					setState(330);
					match(CloseBracket);
					}
					break;
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(334);
					match(ID);
					}
					break;
				case 2:
					{
					setState(335);
					match(Number);
					}
					break;
				case 3:
					{
					setState(336);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(337);
					operation();
					}
					break;
				}
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

	public static class MultOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Star() { return getToken(GrammarSimpleParser.Star, 0); }
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public TerminalNode StarAss() { return getToken(GrammarSimpleParser.StarAss, 0); }
		public MultOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterMultOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitMultOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitMultOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOperationContext multOperation() throws RecognitionException {
		MultOperationContext _localctx = new MultOperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multOperation);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(ID);
				setState(343);
				match(Assign);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(344);
					match(OpenBracket);
					setState(345);
					type();
					setState(346);
					match(CloseBracket);
					}
					break;
				}
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(350);
					match(ID);
					}
					break;
				case 2:
					{
					setState(351);
					match(Number);
					}
					break;
				case 3:
					{
					setState(352);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(353);
					operation();
					}
					break;
				}
				setState(356);
				match(Star);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(357);
					match(ID);
					}
					break;
				case 2:
					{
					setState(358);
					match(Number);
					}
					break;
				case 3:
					{
					setState(359);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(360);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(ID);
				setState(364);
				match(StarAss);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(365);
					match(OpenBracket);
					setState(366);
					type();
					setState(367);
					match(CloseBracket);
					}
					break;
				}
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(371);
					match(ID);
					}
					break;
				case 2:
					{
					setState(372);
					match(Number);
					}
					break;
				case 3:
					{
					setState(373);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(374);
					operation();
					}
					break;
				}
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

	public static class DivOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Devide() { return getToken(GrammarSimpleParser.Devide, 0); }
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public TerminalNode DevideAss() { return getToken(GrammarSimpleParser.DevideAss, 0); }
		public DivOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterDivOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitDivOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitDivOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivOperationContext divOperation() throws RecognitionException {
		DivOperationContext _localctx = new DivOperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_divOperation);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(ID);
				setState(380);
				match(Assign);
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(381);
					match(OpenBracket);
					setState(382);
					type();
					setState(383);
					match(CloseBracket);
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(387);
					match(ID);
					}
					break;
				case 2:
					{
					setState(388);
					match(Number);
					}
					break;
				case 3:
					{
					setState(389);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(390);
					operation();
					}
					break;
				}
				setState(393);
				match(Devide);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(394);
					match(ID);
					}
					break;
				case 2:
					{
					setState(395);
					match(Number);
					}
					break;
				case 3:
					{
					setState(396);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(397);
					operation();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(ID);
				setState(401);
				match(DevideAss);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(402);
					match(OpenBracket);
					setState(403);
					type();
					setState(404);
					match(CloseBracket);
					}
					break;
				}
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(408);
					match(ID);
					}
					break;
				case 2:
					{
					setState(409);
					match(Number);
					}
					break;
				case 3:
					{
					setState(410);
					match(Digit);
					}
					break;
				case 4:
					{
					setState(411);
					operation();
					}
					break;
				}
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

	public static class InPowOperationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Pow() { return getToken(GrammarSimpleParser.Pow, 0); }
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public InPowOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPowOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterInPowOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitInPowOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitInPowOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPowOperationContext inPowOperation() throws RecognitionException {
		InPowOperationContext _localctx = new InPowOperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inPowOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ID);
			setState(417);
			match(Assign);
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(418);
				match(OpenBracket);
				setState(419);
				type();
				setState(420);
				match(CloseBracket);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(424);
				match(ID);
				}
				break;
			case 2:
				{
				setState(425);
				match(Number);
				}
				break;
			case 3:
				{
				setState(426);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(427);
				operation();
				}
				break;
			}
			setState(430);
			match(Pow);
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(431);
				match(ID);
				}
				break;
			case 2:
				{
				setState(432);
				match(Number);
				}
				break;
			case 3:
				{
				setState(433);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(434);
				operation();
				}
				break;
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

	public static class SummContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode Plus() { return getToken(GrammarSimpleParser.Plus, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public SummContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterSumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitSumm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitSumm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SummContext summ() throws RecognitionException {
		SummContext _localctx = new SummContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_summ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(OpenBracket);
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(438);
				match(ID);
				}
				break;
			case 2:
				{
				setState(439);
				match(Number);
				}
				break;
			case 3:
				{
				setState(440);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(441);
				operation();
				}
				break;
			}
			setState(444);
			match(Plus);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(445);
				match(ID);
				}
				break;
			case 2:
				{
				setState(446);
				match(Number);
				}
				break;
			case 3:
				{
				setState(447);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(448);
				operation();
				}
				break;
			}
			setState(451);
			match(CloseBracket);
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

	public static class DiffContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode Minus() { return getToken(GrammarSimpleParser.Minus, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DiffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitDiff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffContext diff() throws RecognitionException {
		DiffContext _localctx = new DiffContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_diff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(OpenBracket);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(454);
				match(ID);
				}
				break;
			case 2:
				{
				setState(455);
				match(Number);
				}
				break;
			case 3:
				{
				setState(456);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(457);
				operation();
				}
				break;
			}
			setState(460);
			match(Minus);
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(461);
				match(ID);
				}
				break;
			case 2:
				{
				setState(462);
				match(Number);
				}
				break;
			case 3:
				{
				setState(463);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(464);
				operation();
				}
				break;
			}
			setState(467);
			match(CloseBracket);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode Star() { return getToken(GrammarSimpleParser.Star, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OpenBracket);
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(470);
				match(ID);
				}
				break;
			case 2:
				{
				setState(471);
				match(Number);
				}
				break;
			case 3:
				{
				setState(472);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(473);
				operation();
				}
				break;
			}
			setState(476);
			match(Star);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(477);
				match(ID);
				}
				break;
			case 2:
				{
				setState(478);
				match(Number);
				}
				break;
			case 3:
				{
				setState(479);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(480);
				operation();
				}
				break;
			}
			setState(483);
			match(CloseBracket);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode Devide() { return getToken(GrammarSimpleParser.Devide, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(OpenBracket);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(486);
				match(ID);
				}
				break;
			case 2:
				{
				setState(487);
				match(Number);
				}
				break;
			case 3:
				{
				setState(488);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(489);
				operation();
				}
				break;
			}
			setState(492);
			match(Devide);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(493);
				match(ID);
				}
				break;
			case 2:
				{
				setState(494);
				match(Number);
				}
				break;
			case 3:
				{
				setState(495);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(496);
				operation();
				}
				break;
			}
			setState(499);
			match(CloseBracket);
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

	public static class InPowContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TerminalNode Pow() { return getToken(GrammarSimpleParser.Pow, 0); }
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public List<TerminalNode> Number() { return getTokens(GrammarSimpleParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(GrammarSimpleParser.Number, i);
		}
		public List<TerminalNode> Digit() { return getTokens(GrammarSimpleParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(GrammarSimpleParser.Digit, i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public InPowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterInPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitInPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitInPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InPowContext inPow() throws RecognitionException {
		InPowContext _localctx = new InPowContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inPow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(OpenBracket);
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(502);
				match(ID);
				}
				break;
			case 2:
				{
				setState(503);
				match(Number);
				}
				break;
			case 3:
				{
				setState(504);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(505);
				operation();
				}
				break;
			}
			setState(508);
			match(Pow);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(509);
				match(ID);
				}
				break;
			case 2:
				{
				setState(510);
				match(Number);
				}
				break;
			case 3:
				{
				setState(511);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(512);
				operation();
				}
				break;
			}
			setState(515);
			match(CloseBracket);
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

	public static class InSqrtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarSimpleParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarSimpleParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GrammarSimpleParser.Assign, 0); }
		public TerminalNode Sqrt() { return getToken(GrammarSimpleParser.Sqrt, 0); }
		public TerminalNode Number() { return getToken(GrammarSimpleParser.Number, 0); }
		public TerminalNode Digit() { return getToken(GrammarSimpleParser.Digit, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(GrammarSimpleParser.OpenBracket, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(GrammarSimpleParser.CloseBracket, 0); }
		public InSqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inSqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).enterInSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarSimpleListener ) ((GrammarSimpleListener)listener).exitInSqrt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarSimpleVisitor ) return ((GrammarSimpleVisitor<? extends T>)visitor).visitInSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InSqrtContext inSqrt() throws RecognitionException {
		InSqrtContext _localctx = new InSqrtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inSqrt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(ID);
			setState(518);
			match(Assign);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket) {
				{
				setState(519);
				match(OpenBracket);
				setState(520);
				type();
				setState(521);
				match(CloseBracket);
				}
			}

			setState(525);
			match(Sqrt);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(526);
				match(ID);
				}
				break;
			case 2:
				{
				setState(527);
				match(Number);
				}
				break;
			case 3:
				{
				setState(528);
				match(Digit);
				}
				break;
			case 4:
				{
				setState(529);
				operation();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0217\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6f\n\6\f\6\16\6i\13\6\5\6k\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7t\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\7\7}\n\7\f\7\16\7\u0080\13\7\5\7\u0082"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d\13"+
		"\13\3\13\5\13\u00a0\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00c1\n\21\f\21\16\21\u00c4"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ce\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00df\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ea"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f6\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0107\n\32\3\32\3\32\3\32\3\32\5\32\u010d\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0115\n\33\3\33\3\33\3\33\3\33\5\33\u011b"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0122\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u012a\n\33\3\33\3\33\3\33\3\33\5\33\u0130\n\33\5\33\u0132\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u013a\n\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0140\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0147\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u014f\n\34\3\34\3\34\3\34\3\34\5\34\u0155\n\34"+
		"\5\34\u0157\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015f\n\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0165\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u016c\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0174\n\35\3\35\3\35\3\35\3\35\5\35"+
		"\u017a\n\35\5\35\u017c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0184\n"+
		"\36\3\36\3\36\3\36\3\36\5\36\u018a\n\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0191\n\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0199\n\36\3\36\3\36\3"+
		"\36\3\36\5\36\u019f\n\36\5\36\u01a1\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u01a9\n\37\3\37\3\37\3\37\3\37\5\37\u01af\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\5\37\u01b6\n\37\3 \3 \3 \3 \3 \5 \u01bd\n \3 \3 \3 \3 \3 \5 "+
		"\u01c4\n \3 \3 \3!\3!\3!\3!\3!\5!\u01cd\n!\3!\3!\3!\3!\3!\5!\u01d4\n!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u01dd\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e4"+
		"\n\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u01ed\n#\3#\3#\3#\3#\3#\5#\u01f4\n#\3#"+
		"\3#\3$\3$\3$\3$\3$\5$\u01fd\n$\3$\3$\3$\3$\3$\5$\u0204\n$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\5%\u020e\n%\3%\3%\3%\3%\3%\5%\u0215\n%\3%\2\2&\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\5\3\2\26"+
		"\27\4\2\31\31()\3\2\22\23\2\u0276\2J\3\2\2\2\4S\3\2\2\2\6W\3\2\2\2\b\\"+
		"\3\2\2\2\n^\3\2\2\2\fn\3\2\2\2\16\u0085\3\2\2\2\20\u0088\3\2\2\2\22\u008b"+
		"\3\2\2\2\24\u0093\3\2\2\2\26\u00a3\3\2\2\2\30\u00a6\3\2\2\2\32\u00a9\3"+
		"\2\2\2\34\u00ad\3\2\2\2\36\u00b7\3\2\2\2 \u00ba\3\2\2\2\"\u00c7\3\2\2"+
		"\2$\u00cf\3\2\2\2&\u00d2\3\2\2\2(\u00d5\3\2\2\2*\u00d9\3\2\2\2,\u00e0"+
		"\3\2\2\2.\u00f5\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0131\3\2"+
		"\2\2\66\u0156\3\2\2\28\u017b\3\2\2\2:\u01a0\3\2\2\2<\u01a2\3\2\2\2>\u01b7"+
		"\3\2\2\2@\u01c7\3\2\2\2B\u01d7\3\2\2\2D\u01e7\3\2\2\2F\u01f7\3\2\2\2H"+
		"\u0207\3\2\2\2JN\5\4\3\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\16\b\2R\3\3\2\2\2ST\7\3\2\2TU\7\24\2\2UV"+
		"\7\25\2\2V\5\3\2\2\2WX\5\b\5\2XY\7\31\2\2YZ\5\n\6\2Z[\5\24\13\2[\7\3\2"+
		"\2\2\\]\t\2\2\2]\t\3\2\2\2^j\7\32\2\2_`\5\b\5\2`g\7\31\2\2ab\7$\2\2bc"+
		"\5\b\5\2cd\7\31\2\2df\3\2\2\2ea\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2j_\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\33\2\2m\13\3\2"+
		"\2\2n\u0081\7\32\2\2ot\7\31\2\2pt\7(\2\2qt\7)\2\2rt\5\20\t\2so\3\2\2\2"+
		"sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t~\3\2\2\2uz\7$\2\2v{\7\31\2\2w{\7(\2\2"+
		"x{\7)\2\2y{\5\20\t\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{}\3\2\2\2"+
		"|u\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081s\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\7\33\2\2\u0084\r\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5 \21"+
		"\2\u0087\17\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008a\5\f\7\2\u008a\21"+
		"\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7\32\2\2\u008d\u008e\5*\26\2"+
		"\u008e\u008f\7\33\2\2\u008f\u0091\5\26\f\2\u0090\u0092\5\30\r\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\23\3\2\2\2\u0093\u009b\7\6\2"+
		"\2\u0094\u0095\5.\30\2\u0095\u0096\7\25\2\2\u0096\u009a\3\2\2\2\u0097"+
		"\u009a\5\22\n\2\u0098\u009a\5\32\16\2\u0099\u0094\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\34"+
		"\17\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7\7\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\5\24\13"+
		"\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5\24\13\2\u00a8\31"+
		"\3\2\2\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\5,\27\2\u00ab\u00ac\5\24\13\2"+
		"\u00ac\33\3\2\2\2\u00ad\u00b3\7\30\2\2\u00ae\u00b4\7\31\2\2\u00af\u00b4"+
		"\7(\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b4\5\60\31\2\u00b2\u00b4\5\20\t\2"+
		"\u00b3\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\25\2\2"+
		"\u00b6\35\3\2\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\5\f\7\2\u00b9\37\3"+
		"\2\2\2\u00ba\u00c2\7\6\2\2\u00bb\u00bc\5.\30\2\u00bc\u00bd\7\25\2\2\u00bd"+
		"\u00c1\3\2\2\2\u00be\u00c1\5\"\22\2\u00bf\u00c1\5(\25\2\u00c0\u00bb\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7\7\2\2\u00c6!\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9"+
		"\7\32\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cb\7\33\2\2\u00cb\u00cd\5$\23\2"+
		"\u00cc\u00ce\5&\24\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce#\3"+
		"\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\5 \21\2\u00d1%\3\2\2\2\u00d2\u00d3"+
		"\7\t\2\2\u00d3\u00d4\5 \21\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\n\2\2\u00d6"+
		"\u00d7\5,\27\2\u00d7\u00d8\5 \21\2\u00d8)\3\2\2\2\u00d9\u00da\t\3\2\2"+
		"\u00da\u00db\7\13\2\2\u00db\u00de\t\3\2\2\u00dc\u00dd\t\4\2\2\u00dd\u00df"+
		"\5*\26\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df+\3\2\2\2\u00e0"+
		"\u00e1\7\32\2\2\u00e1\u00e2\7\31\2\2\u00e2\u00e3\7\'\2\2\u00e3\u00e4\t"+
		"\3\2\2\u00e4\u00e5\7\25\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e9\7\25\2\2\u00e7"+
		"\u00ea\5.\30\2\u00e8\u00ea\5\60\31\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\33\2\2\u00ec-\3\2\2\2\u00ed\u00f6"+
		"\5\64\33\2\u00ee\u00f6\5\66\34\2\u00ef\u00f6\58\35\2\u00f0\u00f6\5:\36"+
		"\2\u00f1\u00f6\5\66\34\2\u00f2\u00f6\5<\37\2\u00f3\u00f6\5\62\32\2\u00f4"+
		"\u00f6\5\36\20\2\u00f5\u00ed\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef\3"+
		"\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6/\3\2\2\2\u00f7\u00ff\5> \2\u00f8"+
		"\u00ff\5@!\2\u00f9\u00ff\5B\"\2\u00fa\u00ff\5D#\2\u00fb\u00ff\5F$\2\u00fc"+
		"\u00ff\5H%\2\u00fd\u00ff\5\20\t\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2"+
		"\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\61\3\2\2\2\u0100\u0101\7\31\2"+
		"\2\u0101\u0106\7\'\2\2\u0102\u0103\7\32\2\2\u0103\u0104\5\b\5\2\u0104"+
		"\u0105\7\33\2\2\u0105\u0107\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u010c\3\2\2\2\u0108\u010d\7\31\2\2\u0109\u010d\7(\2\2\u010a"+
		"\u010d\7)\2\2\u010b\u010d\5\60\31\2\u010c\u0108\3\2\2\2\u010c\u0109\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\63\3\2\2\2\u010e"+
		"\u010f\7\31\2\2\u010f\u0114\7\'\2\2\u0110\u0111\7\32\2\2\u0111\u0112\5"+
		"\b\5\2\u0112\u0113\7\33\2\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u011a\3\2\2\2\u0116\u011b\7\31\2\2\u0117\u011b\7"+
		"(\2\2\u0118\u011b\7)\2\2\u0119\u011b\5\60\31\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0121\7\34\2\2\u011d\u0122\7\31\2\2\u011e\u0122\7(\2\2\u011f"+
		"\u0122\7)\2\2\u0120\u0122\5\60\31\2\u0121\u011d\3\2\2\2\u0121\u011e\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0132\3\2\2\2\u0123"+
		"\u0124\7\31\2\2\u0124\u0129\7\35\2\2\u0125\u0126\7\32\2\2\u0126\u0127"+
		"\5\b\5\2\u0127\u0128\7\33\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012f\3\2\2\2\u012b\u0130\7\31\2\2\u012c\u0130"+
		"\7(\2\2\u012d\u0130\7)\2\2\u012e\u0130\5\60\31\2\u012f\u012b\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u010e\3\2\2\2\u0131\u0123\3\2\2\2\u0132\65\3\2\2\2\u0133\u0134"+
		"\7\31\2\2\u0134\u0139\7\'\2\2\u0135\u0136\7\32\2\2\u0136\u0137\5\b\5\2"+
		"\u0137\u0138\7\33\2\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013f\3\2\2\2\u013b\u0140\7\31\2\2\u013c\u0140\7(\2\2\u013d"+
		"\u0140\7)\2\2\u013e\u0140\5\60\31\2\u013f\u013b\3\2\2\2\u013f\u013c\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0146\7\36\2\2\u0142\u0147\7\31\2\2\u0143\u0147\7(\2\2\u0144\u0147\7"+
		")\2\2\u0145\u0147\5\60\31\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0157\3\2\2\2\u0148\u0149\7\31"+
		"\2\2\u0149\u014e\7\37\2\2\u014a\u014b\7\32\2\2\u014b\u014c\5\b\5\2\u014c"+
		"\u014d\7\33\2\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f\u0154\3\2\2\2\u0150\u0155\7\31\2\2\u0151\u0155\7(\2\2\u0152"+
		"\u0155\7)\2\2\u0153\u0155\5\60\31\2\u0154\u0150\3\2\2\2\u0154\u0151\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0133\3\2\2\2\u0156\u0148\3\2\2\2\u0157\67\3\2\2\2\u0158\u0159\7\31\2"+
		"\2\u0159\u015e\7\'\2\2\u015a\u015b\7\32\2\2\u015b\u015c\5\b\5\2\u015c"+
		"\u015d\7\33\2\2\u015d\u015f\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u0164\3\2\2\2\u0160\u0165\7\31\2\2\u0161\u0165\7(\2\2\u0162"+
		"\u0165\7)\2\2\u0163\u0165\5\60\31\2\u0164\u0160\3\2\2\2\u0164\u0161\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u016b\7 \2\2\u0167\u016c\7\31\2\2\u0168\u016c\7(\2\2\u0169\u016c\7)\2"+
		"\2\u016a\u016c\5\60\31\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u017c\3\2\2\2\u016d\u016e\7\31"+
		"\2\2\u016e\u0173\7!\2\2\u016f\u0170\7\32\2\2\u0170\u0171\5\b\5\2\u0171"+
		"\u0172\7\33\2\2\u0172\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0174\3"+
		"\2\2\2\u0174\u0179\3\2\2\2\u0175\u017a\7\31\2\2\u0176\u017a\7(\2\2\u0177"+
		"\u017a\7)\2\2\u0178\u017a\5\60\31\2\u0179\u0175\3\2\2\2\u0179\u0176\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0158\3\2\2\2\u017b\u016d\3\2\2\2\u017c9\3\2\2\2\u017d\u017e\7\31\2\2"+
		"\u017e\u0183\7\'\2\2\u017f\u0180\7\32\2\2\u0180\u0181\5\b\5\2\u0181\u0182"+
		"\7\33\2\2\u0182\u0184\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0189\3\2\2\2\u0185\u018a\7\31\2\2\u0186\u018a\7(\2\2\u0187\u018a"+
		"\7)\2\2\u0188\u018a\5\60\31\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0190"+
		"\7\"\2\2\u018c\u0191\7\31\2\2\u018d\u0191\7(\2\2\u018e\u0191\7)\2\2\u018f"+
		"\u0191\5\60\31\2\u0190\u018c\3\2\2\2\u0190\u018d\3\2\2\2\u0190\u018e\3"+
		"\2\2\2\u0190\u018f\3\2\2\2\u0191\u01a1\3\2\2\2\u0192\u0193\7\31\2\2\u0193"+
		"\u0198\7#\2\2\u0194\u0195\7\32\2\2\u0195\u0196\5\b\5\2\u0196\u0197\7\33"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0194\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019e\3\2\2\2\u019a\u019f\7\31\2\2\u019b\u019f\7(\2\2\u019c\u019f\7)"+
		"\2\2\u019d\u019f\5\60\31\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u017d\3\2"+
		"\2\2\u01a0\u0192\3\2\2\2\u01a1;\3\2\2\2\u01a2\u01a3\7\31\2\2\u01a3\u01a8"+
		"\7\'\2\2\u01a4\u01a5\7\32\2\2\u01a5\u01a6\5\b\5\2\u01a6\u01a7\7\33\2\2"+
		"\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ae"+
		"\3\2\2\2\u01aa\u01af\7\31\2\2\u01ab\u01af\7(\2\2\u01ac\u01af\7)\2\2\u01ad"+
		"\u01af\5\60\31\2\u01ae\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ac\3"+
		"\2\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b5\7%\2\2\u01b1"+
		"\u01b6\7\31\2\2\u01b2\u01b6\7(\2\2\u01b3\u01b6\7)\2\2\u01b4\u01b6\5\60"+
		"\31\2\u01b5\u01b1\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6=\3\2\2\2\u01b7\u01bc\7\32\2\2\u01b8\u01bd\7\31\2"+
		"\2\u01b9\u01bd\7(\2\2\u01ba\u01bd\7)\2\2\u01bb\u01bd\5\60\31\2\u01bc\u01b8"+
		"\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c3\7\34\2\2\u01bf\u01c4\7\31\2\2\u01c0\u01c4\7"+
		"(\2\2\u01c1\u01c4\7)\2\2\u01c2\u01c4\5\60\31\2\u01c3\u01bf\3\2\2\2\u01c3"+
		"\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\7\33\2\2\u01c6?\3\2\2\2\u01c7\u01cc\7\32\2\2\u01c8\u01cd"+
		"\7\31\2\2\u01c9\u01cd\7(\2\2\u01ca\u01cd\7)\2\2\u01cb\u01cd\5\60\31\2"+
		"\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d3\7\36\2\2\u01cf\u01d4\7\31\2\2"+
		"\u01d0\u01d4\7(\2\2\u01d1\u01d4\7)\2\2\u01d2\u01d4\5\60\31\2\u01d3\u01cf"+
		"\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\7\33\2\2\u01d6A\3\2\2\2\u01d7\u01dc\7\32\2"+
		"\2\u01d8\u01dd\7\31\2\2\u01d9\u01dd\7(\2\2\u01da\u01dd\7)\2\2\u01db\u01dd"+
		"\5\60\31\2\u01dc\u01d8\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e3\7 \2\2\u01df\u01e4"+
		"\7\31\2\2\u01e0\u01e4\7(\2\2\u01e1\u01e4\7)\2\2\u01e2\u01e4\5\60\31\2"+
		"\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\33\2\2\u01e6C\3\2\2\2\u01e7"+
		"\u01ec\7\32\2\2\u01e8\u01ed\7\31\2\2\u01e9\u01ed\7(\2\2\u01ea\u01ed\7"+
		")\2\2\u01eb\u01ed\5\60\31\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f3\7\""+
		"\2\2\u01ef\u01f4\7\31\2\2\u01f0\u01f4\7(\2\2\u01f1\u01f4\7)\2\2\u01f2"+
		"\u01f4\5\60\31\2\u01f3\u01ef\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f3\u01f1\3"+
		"\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\33\2\2\u01f6"+
		"E\3\2\2\2\u01f7\u01fc\7\32\2\2\u01f8\u01fd\7\31\2\2\u01f9\u01fd\7(\2\2"+
		"\u01fa\u01fd\7)\2\2\u01fb\u01fd\5\60\31\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0203\7%\2\2\u01ff\u0204\7\31\2\2\u0200\u0204\7(\2\2\u0201\u0204\7)\2"+
		"\2\u0202\u0204\5\60\31\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\33"+
		"\2\2\u0206G\3\2\2\2\u0207\u0208\7\31\2\2\u0208\u020d\7\'\2\2\u0209\u020a"+
		"\7\32\2\2\u020a\u020b\5\b\5\2\u020b\u020c\7\33\2\2\u020c\u020e\3\2\2\2"+
		"\u020d\u0209\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0214"+
		"\7&\2\2\u0210\u0215\7\31\2\2\u0211\u0215\7(\2\2\u0212\u0215\7)\2\2\u0213"+
		"\u0215\5\60\31\2\u0214\u0210\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3"+
		"\2\2\2\u0214\u0213\3\2\2\2\u0215I\3\2\2\2>Ngjsz~\u0081\u0091\u0099\u009b"+
		"\u009f\u00b3\u00c0\u00c2\u00cd\u00de\u00e9\u00f5\u00fe\u0106\u010c\u0114"+
		"\u011a\u0121\u0129\u012f\u0131\u0139\u013f\u0146\u014e\u0154\u0156\u015e"+
		"\u0164\u016b\u0173\u0179\u017b\u0183\u0189\u0190\u0198\u019e\u01a0\u01a8"+
		"\u01ae\u01b5\u01bc\u01c3\u01cc\u01d3\u01dc\u01e3\u01ec\u01f3\u01fc\u0203"+
		"\u020d\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}