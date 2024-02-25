// Generated from org/dsl/geometry/grammar/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeometryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		EQUAL=10, PLUS=11, MINUS=12, MUL=13, DIV=14, POINT=15, LINE=16, SEGMENT=17, 
		TRIANGLE=18, EQUILATERAL_TRIANGLE=19, ISOSCELES_TRIANGLE=20, SQUARE=21, 
		RECTANGLE=22, PARALLELOGRAM=23, CIRCLE=24, ELLIPSE=25, RHOMBUS=26, NUM=27, 
		ID=28, WS=29, SEMICOLON=30, COMMA=31, LPAREN=32, RPAREN=33, TRUE=34, FALSE=35, 
		STRING=36, COMMENT=37, ML_COMMENT=38;
	public static final int
		RULE_functionCall = 0, RULE_areaFunction = 1, RULE_perimeterFunction = 2, 
		RULE_lengthFunction = 3, RULE_figureID = 4, RULE_program = 5, RULE_statement = 6, 
		RULE_figureDeclaration = 7, RULE_pointDeclaration = 8, RULE_lineDeclaration = 9, 
		RULE_segmentDeclaration = 10, RULE_triangleDeclaration = 11, RULE_squareDeclaration = 12, 
		RULE_rectangleDeclaration = 13, RULE_parallelogramDeclaration = 14, RULE_circleDeclaration = 15, 
		RULE_ellipseDeclaration = 16, RULE_rhombusDeclaration = 17, RULE_variableDeclaration = 18, 
		RULE_type = 19, RULE_expression = 20, RULE_point = 21, RULE_comment = 22;
	public static final String[] ruleNames = {
		"functionCall", "areaFunction", "perimeterFunction", "lengthFunction", 
		"figureID", "program", "statement", "figureDeclaration", "pointDeclaration", 
		"lineDeclaration", "segmentDeclaration", "triangleDeclaration", "squareDeclaration", 
		"rectangleDeclaration", "parallelogramDeclaration", "circleDeclaration", 
		"ellipseDeclaration", "rhombusDeclaration", "variableDeclaration", "type", 
		"expression", "point", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'area'", "'perimeter'", "'length'", "'side'", "'width'", "'height'", 
		"'num'", "'bool'", "'string'", "'='", "'+'", "'-'", "'*'", "'/'", "'Point'", 
		"'Line'", "'Segment'", "'Triangle'", "'EquilateralTriangle'", "'IsoscelesTriangle'", 
		"'Square'", "'Rectangle'", "'Parallelogram'", "'Circle'", "'Ellipse'", 
		"'Rhombus'", null, null, null, "';'", "','", "'('", "')'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "EQUAL", "PLUS", 
		"MINUS", "MUL", "DIV", "POINT", "LINE", "SEGMENT", "TRIANGLE", "EQUILATERAL_TRIANGLE", 
		"ISOSCELES_TRIANGLE", "SQUARE", "RECTANGLE", "PARALLELOGRAM", "CIRCLE", 
		"ELLIPSE", "RHOMBUS", "NUM", "ID", "WS", "SEMICOLON", "COMMA", "LPAREN", 
		"RPAREN", "TRUE", "FALSE", "STRING", "COMMENT", "ML_COMMENT"
	};
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
	public String getGrammarFileName() { return "Geometry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeometryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FunctionCallContext extends ParserRuleContext {
		public AreaFunctionContext areaFunction() {
			return getRuleContext(AreaFunctionContext.class,0);
		}
		public PerimeterFunctionContext perimeterFunction() {
			return getRuleContext(PerimeterFunctionContext.class,0);
		}
		public LengthFunctionContext lengthFunction() {
			return getRuleContext(LengthFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functionCall);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				areaFunction();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				perimeterFunction();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				lengthFunction();
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

	public static class AreaFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public FigureIDContext figureID() {
			return getRuleContext(FigureIDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public AreaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_areaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterAreaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitAreaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitAreaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AreaFunctionContext areaFunction() throws RecognitionException {
		AreaFunctionContext _localctx = new AreaFunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_areaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(LPAREN);
			setState(53);
			figureID();
			setState(54);
			match(RPAREN);
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

	public static class PerimeterFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public FigureIDContext figureID() {
			return getRuleContext(FigureIDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public PerimeterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perimeterFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterPerimeterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitPerimeterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitPerimeterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerimeterFunctionContext perimeterFunction() throws RecognitionException {
		PerimeterFunctionContext _localctx = new PerimeterFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_perimeterFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__1);
			setState(57);
			match(LPAREN);
			setState(58);
			figureID();
			setState(59);
			match(RPAREN);
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

	public static class LengthFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public FigureIDContext figureID() {
			return getRuleContext(FigureIDContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public LengthFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterLengthFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitLengthFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitLengthFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthFunctionContext lengthFunction() throws RecognitionException {
		LengthFunctionContext _localctx = new LengthFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lengthFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__2);
			setState(62);
			match(LPAREN);
			setState(63);
			figureID();
			setState(64);
			match(RPAREN);
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

	public static class FigureIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public FigureIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figureID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterFigureID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitFigureID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitFigureID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureIDContext figureID() throws RecognitionException {
		FigureIDContext _localctx = new FigureIDContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_figureID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << POINT) | (1L << LINE) | (1L << SEGMENT) | (1L << TRIANGLE) | (1L << EQUILATERAL_TRIANGLE) | (1L << ISOSCELES_TRIANGLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << PARALLELOGRAM) | (1L << CIRCLE) | (1L << ELLIPSE) | (1L << COMMENT) | (1L << ML_COMMENT))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public FigureDeclarationContext figureDeclaration() {
			return getRuleContext(FigureDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GeometryParser.SEMICOLON, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
			case LINE:
			case SEGMENT:
			case TRIANGLE:
			case EQUILATERAL_TRIANGLE:
			case ISOSCELES_TRIANGLE:
			case SQUARE:
			case RECTANGLE:
			case PARALLELOGRAM:
			case CIRCLE:
			case ELLIPSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				figureDeclaration();
				setState(74);
				match(SEMICOLON);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				variableDeclaration();
				setState(77);
				match(SEMICOLON);
				}
				break;
			case COMMENT:
			case ML_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				comment();
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

	public static class FigureDeclarationContext extends ParserRuleContext {
		public PointDeclarationContext pointDeclaration() {
			return getRuleContext(PointDeclarationContext.class,0);
		}
		public LineDeclarationContext lineDeclaration() {
			return getRuleContext(LineDeclarationContext.class,0);
		}
		public SegmentDeclarationContext segmentDeclaration() {
			return getRuleContext(SegmentDeclarationContext.class,0);
		}
		public TriangleDeclarationContext triangleDeclaration() {
			return getRuleContext(TriangleDeclarationContext.class,0);
		}
		public SquareDeclarationContext squareDeclaration() {
			return getRuleContext(SquareDeclarationContext.class,0);
		}
		public RectangleDeclarationContext rectangleDeclaration() {
			return getRuleContext(RectangleDeclarationContext.class,0);
		}
		public ParallelogramDeclarationContext parallelogramDeclaration() {
			return getRuleContext(ParallelogramDeclarationContext.class,0);
		}
		public CircleDeclarationContext circleDeclaration() {
			return getRuleContext(CircleDeclarationContext.class,0);
		}
		public EllipseDeclarationContext ellipseDeclaration() {
			return getRuleContext(EllipseDeclarationContext.class,0);
		}
		public FigureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterFigureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitFigureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitFigureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureDeclarationContext figureDeclaration() throws RecognitionException {
		FigureDeclarationContext _localctx = new FigureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_figureDeclaration);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				lineDeclaration();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				segmentDeclaration();
				}
				break;
			case TRIANGLE:
			case EQUILATERAL_TRIANGLE:
			case ISOSCELES_TRIANGLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				triangleDeclaration();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				squareDeclaration();
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				rectangleDeclaration();
				}
				break;
			case PARALLELOGRAM:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				parallelogramDeclaration();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				circleDeclaration();
				}
				break;
			case ELLIPSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				ellipseDeclaration();
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

	public static class PointDeclarationContext extends ParserRuleContext {
		public TerminalNode POINT() { return getToken(GeometryParser.POINT, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public PointDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterPointDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitPointDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitPointDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointDeclarationContext pointDeclaration() throws RecognitionException {
		PointDeclarationContext _localctx = new PointDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(POINT);
			setState(94);
			match(ID);
			setState(95);
			match(LPAREN);
			setState(96);
			match(NUM);
			setState(97);
			match(COMMA);
			setState(98);
			match(NUM);
			setState(99);
			match(RPAREN);
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

	public static class LineDeclarationContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(GeometryParser.LINE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public LineDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterLineDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitLineDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitLineDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineDeclarationContext lineDeclaration() throws RecognitionException {
		LineDeclarationContext _localctx = new LineDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LINE);
			setState(102);
			match(ID);
			setState(103);
			match(LPAREN);
			setState(104);
			point();
			setState(105);
			match(COMMA);
			setState(106);
			point();
			setState(107);
			match(RPAREN);
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

	public static class SegmentDeclarationContext extends ParserRuleContext {
		public TerminalNode SEGMENT() { return getToken(GeometryParser.SEGMENT, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public SegmentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterSegmentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitSegmentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitSegmentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentDeclarationContext segmentDeclaration() throws RecognitionException {
		SegmentDeclarationContext _localctx = new SegmentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_segmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SEGMENT);
			setState(110);
			match(ID);
			setState(111);
			match(LPAREN);
			setState(112);
			point();
			setState(113);
			match(COMMA);
			setState(114);
			point();
			setState(115);
			match(RPAREN);
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

	public static class TriangleDeclarationContext extends ParserRuleContext {
		public TerminalNode TRIANGLE() { return getToken(GeometryParser.TRIANGLE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GeometryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public TerminalNode EQUILATERAL_TRIANGLE() { return getToken(GeometryParser.EQUILATERAL_TRIANGLE, 0); }
		public TerminalNode ISOSCELES_TRIANGLE() { return getToken(GeometryParser.ISOSCELES_TRIANGLE, 0); }
		public TriangleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triangleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterTriangleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitTriangleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitTriangleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriangleDeclarationContext triangleDeclaration() throws RecognitionException {
		TriangleDeclarationContext _localctx = new TriangleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_triangleDeclaration);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(TRIANGLE);
				setState(118);
				match(ID);
				setState(119);
				match(LPAREN);
				setState(120);
				point();
				setState(121);
				match(COMMA);
				setState(122);
				point();
				setState(123);
				match(COMMA);
				setState(124);
				point();
				setState(125);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(TRIANGLE);
				setState(128);
				match(ID);
				setState(129);
				match(LPAREN);
				setState(130);
				match(NUM);
				setState(131);
				match(COMMA);
				setState(132);
				match(NUM);
				setState(133);
				match(COMMA);
				setState(134);
				match(NUM);
				setState(135);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(EQUILATERAL_TRIANGLE);
				setState(137);
				match(ID);
				setState(138);
				match(LPAREN);
				setState(139);
				match(NUM);
				setState(140);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(ISOSCELES_TRIANGLE);
				setState(142);
				match(ID);
				setState(143);
				match(LPAREN);
				setState(144);
				match(NUM);
				setState(145);
				match(COMMA);
				setState(146);
				match(NUM);
				setState(147);
				match(RPAREN);
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

	public static class SquareDeclarationContext extends ParserRuleContext {
		public TerminalNode SQUARE() { return getToken(GeometryParser.SQUARE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(GeometryParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(GeometryParser.SEMICOLON, 0); }
		public SquareDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterSquareDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitSquareDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitSquareDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareDeclarationContext squareDeclaration() throws RecognitionException {
		SquareDeclarationContext _localctx = new SquareDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_squareDeclaration);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(SQUARE);
				setState(151);
				match(ID);
				setState(152);
				match(LPAREN);
				setState(153);
				match(NUM);
				setState(154);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(SQUARE);
				setState(156);
				match(ID);
				setState(157);
				match(T__3);
				setState(158);
				match(EQUAL);
				setState(159);
				match(NUM);
				setState(160);
				match(SEMICOLON);
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

	public static class RectangleDeclarationContext extends ParserRuleContext {
		public TerminalNode RECTANGLE() { return getToken(GeometryParser.RECTANGLE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(GeometryParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(GeometryParser.EQUAL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GeometryParser.SEMICOLON, 0); }
		public RectangleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterRectangleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitRectangleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitRectangleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleDeclarationContext rectangleDeclaration() throws RecognitionException {
		RectangleDeclarationContext _localctx = new RectangleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rectangleDeclaration);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(RECTANGLE);
				setState(164);
				match(ID);
				setState(165);
				match(LPAREN);
				setState(166);
				match(NUM);
				setState(167);
				match(COMMA);
				setState(168);
				match(NUM);
				setState(169);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(RECTANGLE);
				setState(171);
				match(ID);
				setState(172);
				match(T__4);
				setState(173);
				match(EQUAL);
				setState(174);
				match(NUM);
				setState(175);
				match(COMMA);
				setState(176);
				match(T__5);
				setState(177);
				match(EQUAL);
				setState(178);
				match(NUM);
				setState(179);
				match(SEMICOLON);
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

	public static class ParallelogramDeclarationContext extends ParserRuleContext {
		public TerminalNode PARALLELOGRAM() { return getToken(GeometryParser.PARALLELOGRAM, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GeometryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GeometryParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public ParallelogramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelogramDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterParallelogramDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitParallelogramDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitParallelogramDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelogramDeclarationContext parallelogramDeclaration() throws RecognitionException {
		ParallelogramDeclarationContext _localctx = new ParallelogramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parallelogramDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(PARALLELOGRAM);
			setState(183);
			match(ID);
			setState(184);
			match(LPAREN);
			setState(185);
			match(NUM);
			setState(186);
			match(COMMA);
			setState(187);
			match(NUM);
			setState(188);
			match(COMMA);
			setState(189);
			match(NUM);
			setState(190);
			match(RPAREN);
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

	public static class CircleDeclarationContext extends ParserRuleContext {
		public TerminalNode CIRCLE() { return getToken(GeometryParser.CIRCLE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public CircleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterCircleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitCircleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitCircleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleDeclarationContext circleDeclaration() throws RecognitionException {
		CircleDeclarationContext _localctx = new CircleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_circleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CIRCLE);
			setState(193);
			match(ID);
			setState(194);
			match(LPAREN);
			setState(195);
			match(NUM);
			setState(196);
			match(RPAREN);
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

	public static class EllipseDeclarationContext extends ParserRuleContext {
		public TerminalNode ELLIPSE() { return getToken(GeometryParser.ELLIPSE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public EllipseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterEllipseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitEllipseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitEllipseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipseDeclarationContext ellipseDeclaration() throws RecognitionException {
		EllipseDeclarationContext _localctx = new EllipseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ellipseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ELLIPSE);
			setState(199);
			match(ID);
			setState(200);
			match(LPAREN);
			setState(201);
			match(NUM);
			setState(202);
			match(COMMA);
			setState(203);
			match(NUM);
			setState(204);
			match(RPAREN);
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

	public static class RhombusDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public RhombusDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhombusDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterRhombusDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitRhombusDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitRhombusDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhombusDeclarationContext rhombusDeclaration() throws RecognitionException {
		RhombusDeclarationContext _localctx = new RhombusDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rhombusDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(RHOMBUS);
			setState(207);
			match(ID);
			setState(208);
			match(LPAREN);
			setState(209);
			match(NUM);
			setState(210);
			match(RPAREN);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(GeometryParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			type();
			setState(213);
			match(ID);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(214);
				match(EQUAL);
				setState(215);
				expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode TRUE() { return getToken(GeometryParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GeometryParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(GeometryParser.STRING, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(GeometryParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GeometryParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(GeometryParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GeometryParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(221);
				match(NUM);
				}
				break;
			case TRUE:
				{
				setState(222);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(223);
				match(FALSE);
				}
				break;
			case STRING:
				{
				setState(224);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(225);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(226);
				match(LPAREN);
				setState(227);
				expression(0);
				setState(228);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(232);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(233);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(234);
					expression(3);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PointContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ID);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(GeometryParser.COMMENT, 0); }
		public TerminalNode ML_COMMENT() { return getToken(GeometryParser.ML_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==ML_COMMENT) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\5\2\64\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\6\7H\n\7\r\7\16\7I\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0097\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00db\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00e9\n\26\3\26\3\26\3\26\7\26\u00ee\n\26\f\26\16\26\u00f1"+
		"\13\26\3\27\3\27\3\30\3\30\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\5\3\2\t\13\3\2\r\20\3\2\'(\2\u00f8\2\63\3\2\2\2\4"+
		"\65\3\2\2\2\6:\3\2\2\2\b?\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16R\3\2\2\2\20"+
		"]\3\2\2\2\22_\3\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30\u0096\3\2\2\2\32\u00a3"+
		"\3\2\2\2\34\u00b6\3\2\2\2\36\u00b8\3\2\2\2 \u00c2\3\2\2\2\"\u00c8\3\2"+
		"\2\2$\u00d0\3\2\2\2&\u00d6\3\2\2\2(\u00dc\3\2\2\2*\u00e8\3\2\2\2,\u00f2"+
		"\3\2\2\2.\u00f4\3\2\2\2\60\64\5\4\3\2\61\64\5\6\4\2\62\64\5\b\5\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\3\3\2\2\2\65\66\7\3\2\2\66\67"+
		"\7\"\2\2\678\5\n\6\289\7#\2\29\5\3\2\2\2:;\7\4\2\2;<\7\"\2\2<=\5\n\6\2"+
		"=>\7#\2\2>\7\3\2\2\2?@\7\5\2\2@A\7\"\2\2AB\5\n\6\2BC\7#\2\2C\t\3\2\2\2"+
		"DE\7\36\2\2E\13\3\2\2\2FH\5\16\b\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\r\3\2\2\2KL\5\20\t\2LM\7 \2\2MS\3\2\2\2NO\5&\24\2OP\7 \2\2PS\3\2"+
		"\2\2QS\5.\30\2RK\3\2\2\2RN\3\2\2\2RQ\3\2\2\2S\17\3\2\2\2T^\5\22\n\2U^"+
		"\5\24\13\2V^\5\26\f\2W^\5\30\r\2X^\5\32\16\2Y^\5\34\17\2Z^\5\36\20\2["+
		"^\5 \21\2\\^\5\"\22\2]T\3\2\2\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2"+
		"\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\21\3\2\2\2_`\7\21\2\2`a\7"+
		"\36\2\2ab\7\"\2\2bc\7\35\2\2cd\7!\2\2de\7\35\2\2ef\7#\2\2f\23\3\2\2\2"+
		"gh\7\22\2\2hi\7\36\2\2ij\7\"\2\2jk\5,\27\2kl\7!\2\2lm\5,\27\2mn\7#\2\2"+
		"n\25\3\2\2\2op\7\23\2\2pq\7\36\2\2qr\7\"\2\2rs\5,\27\2st\7!\2\2tu\5,\27"+
		"\2uv\7#\2\2v\27\3\2\2\2wx\7\24\2\2xy\7\36\2\2yz\7\"\2\2z{\5,\27\2{|\7"+
		"!\2\2|}\5,\27\2}~\7!\2\2~\177\5,\27\2\177\u0080\7#\2\2\u0080\u0097\3\2"+
		"\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\"\2\2\u0084"+
		"\u0085\7\35\2\2\u0085\u0086\7!\2\2\u0086\u0087\7\35\2\2\u0087\u0088\7"+
		"!\2\2\u0088\u0089\7\35\2\2\u0089\u0097\7#\2\2\u008a\u008b\7\25\2\2\u008b"+
		"\u008c\7\36\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7\35\2\2\u008e\u0097\7"+
		"#\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\36\2\2\u0091\u0092\7\"\2\2\u0092"+
		"\u0093\7\35\2\2\u0093\u0094\7!\2\2\u0094\u0095\7\35\2\2\u0095\u0097\7"+
		"#\2\2\u0096w\3\2\2\2\u0096\u0081\3\2\2\2\u0096\u008a\3\2\2\2\u0096\u008f"+
		"\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\7\27\2\2\u0099\u009a\7\36\2\2\u009a"+
		"\u009b\7\"\2\2\u009b\u009c\7\35\2\2\u009c\u00a4\7#\2\2\u009d\u009e\7\27"+
		"\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\7\35\2\2\u00a2\u00a4\7 \2\2\u00a3\u0098\3\2\2\2\u00a3\u009d\3\2"+
		"\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\36\2\2\u00a7"+
		"\u00a8\7\"\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ab\7\35"+
		"\2\2\u00ab\u00b7\7#\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\7\36\2\2\u00ae"+
		"\u00af\7\7\2\2\u00af\u00b0\7\f\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b2\7"+
		"!\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7\35\2\2\u00b5"+
		"\u00b7\7 \2\2\u00b6\u00a5\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b7\35\3\2\2\2"+
		"\u00b8\u00b9\7\31\2\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc"+
		"\7\35\2\2\u00bc\u00bd\7!\2\2\u00bd\u00be\7\35\2\2\u00be\u00bf\7!\2\2\u00bf"+
		"\u00c0\7\35\2\2\u00c0\u00c1\7#\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\7\32\2"+
		"\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7\35\2\2\u00c6"+
		"\u00c7\7#\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\7\36\2\2"+
		"\u00ca\u00cb\7\"\2\2\u00cb\u00cc\7\35\2\2\u00cc\u00cd\7!\2\2\u00cd\u00ce"+
		"\7\35\2\2\u00ce\u00cf\7#\2\2\u00cf#\3\2\2\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\u00d2\7\36\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d5\7"+
		"#\2\2\u00d5%\3\2\2\2\u00d6\u00d7\5(\25\2\u00d7\u00da\7\36\2\2\u00d8\u00d9"+
		"\7\f\2\2\u00d9\u00db\5*\26\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\'\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd)\3\2\2\2\u00de\u00df\b\26\1\2\u00df"+
		"\u00e9\7\35\2\2\u00e0\u00e9\7$\2\2\u00e1\u00e9\7%\2\2\u00e2\u00e9\7&\2"+
		"\2\u00e3\u00e9\7\36\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\5*\26\2\u00e6"+
		"\u00e7\7#\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e0\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\f\4\2\2\u00eb\u00ec\t\3"+
		"\2\2\u00ec\u00ee\5*\26\5\u00ed\u00ea\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f2\u00f3\7\36\2\2\u00f3-\3\2\2\2\u00f4\u00f5\t\4\2\2\u00f5/\3\2\2"+
		"\2\f\63IR]\u0096\u00a3\u00b6\u00da\u00e8\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}