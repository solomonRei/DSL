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
		T__9=10, EQUAL=11, PLUS=12, MINUS=13, MUL=14, DIV=15, ARROW=16, POINT=17, 
		LINE=18, SEGMENT=19, TRIANGLE=20, HEIGHT=21, EQUILATERAL_TRIANGLE=22, 
		ISOSCELES_TRIANGLE=23, SQUARE=24, RECTANGLE=25, PARALLELOGRAM=26, CIRCLE=27, 
		ELLIPSE=28, RHOMBUS=29, BISECTOR=30, ANGLE=31, VERTEX=32, NUM=33, ID=34, 
		ALIAS=35, WS=36, SEMICOLON=37, COMMA=38, LPAREN=39, RPAREN=40, TRUE=41, 
		FALSE=42, STRING=43, COMMENT=44, ML_COMMENT=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_functionCallStatement = 2, 
		RULE_commentStatement = 3, RULE_functionCall = 4, RULE_functionDeclaration = 5, 
		RULE_figureDeclaration = 6, RULE_areaCall = 7, RULE_perimeterCall = 8, 
		RULE_diagonalCall = 9, RULE_pointDeclaration = 10, RULE_lineDeclaration = 11, 
		RULE_segmentDeclaration = 12, RULE_triangleDeclaration = 13, RULE_aliasVertex = 14, 
		RULE_triangleProperty = 15, RULE_bisectorDeclaration = 16, RULE_angleDeclaration = 17, 
		RULE_heightDeclaration = 18, RULE_squareDeclaration = 19, RULE_rectangleDeclaration = 20, 
		RULE_parallelogramDeclaration = 21, RULE_circleDeclaration = 22, RULE_ellipseDeclaration = 23, 
		RULE_rhombusDeclaration = 24, RULE_variableDeclaration = 25, RULE_type = 26, 
		RULE_expression = 27, RULE_point = 28, RULE_comment = 29;
	public static final String[] ruleNames = {
		"program", "statement", "functionCallStatement", "commentStatement", "functionCall", 
		"functionDeclaration", "figureDeclaration", "areaCall", "perimeterCall", 
		"diagonalCall", "pointDeclaration", "lineDeclaration", "segmentDeclaration", 
		"triangleDeclaration", "aliasVertex", "triangleProperty", "bisectorDeclaration", 
		"angleDeclaration", "heightDeclaration", "squareDeclaration", "rectangleDeclaration", 
		"parallelogramDeclaration", "circleDeclaration", "ellipseDeclaration", 
		"rhombusDeclaration", "variableDeclaration", "type", "expression", "point", 
		"comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'area'", "'perimeter'", "'diagonal'", "':'", "'side'", "'width'", 
		"'height'", "'num'", "'bool'", "'string'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'->'", "'Point'", "'Line'", "'Segment'", "'Triangle'", "'Height'", 
		"'EquilateralTriangle'", "'IsoscelesTriangle'", "'Square'", "'Rectangle'", 
		"'Parallelogram'", "'Circle'", "'Ellipse'", "'Rhombus'", "'bisector'", 
		"'Angle'", "'Vertex'", null, null, null, null, "';'", "','", "'('", "')'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "EQUAL", 
		"PLUS", "MINUS", "MUL", "DIV", "ARROW", "POINT", "LINE", "SEGMENT", "TRIANGLE", 
		"HEIGHT", "EQUILATERAL_TRIANGLE", "ISOSCELES_TRIANGLE", "SQUARE", "RECTANGLE", 
		"PARALLELOGRAM", "CIRCLE", "ELLIPSE", "RHOMBUS", "BISECTOR", "ANGLE", 
		"VERTEX", "NUM", "ID", "ALIAS", "WS", "SEMICOLON", "COMMA", "LPAREN", 
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
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentStatementContext> commentStatement() {
			return getRuleContexts(CommentStatementContext.class);
		}
		public CommentStatementContext commentStatement(int i) {
			return getRuleContext(CommentStatementContext.class,i);
		}
		public List<FunctionCallStatementContext> functionCallStatement() {
			return getRuleContexts(FunctionCallStatementContext.class);
		}
		public FunctionCallStatementContext functionCallStatement(int i) {
			return getRuleContext(FunctionCallStatementContext.class,i);
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
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					statement();
					}
					break;
				case 2:
					{
					setState(61);
					commentStatement();
					}
					break;
				case 3:
					{
					setState(62);
					functionCallStatement();
					}
					break;
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << POINT) | (1L << LINE) | (1L << SEGMENT) | (1L << TRIANGLE) | (1L << EQUILATERAL_TRIANGLE) | (1L << ISOSCELES_TRIANGLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << PARALLELOGRAM) | (1L << CIRCLE) | (1L << ELLIPSE) | (1L << ID) | (1L << COMMENT) | (1L << ML_COMMENT))) != 0) );
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(74);
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
				setState(67);
				figureDeclaration();
				setState(68);
				match(SEMICOLON);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				variableDeclaration();
				setState(71);
				match(SEMICOLON);
				}
				break;
			case COMMENT:
			case ML_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GeometryParser.SEMICOLON, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			functionCall();
			setState(77);
			match(SEMICOLON);
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

	public static class CommentStatementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(GeometryParser.COMMENT, 0); }
		public CommentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitCommentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitCommentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentStatementContext commentStatement() throws RecognitionException {
		CommentStatementContext _localctx = new CommentStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(COMMENT);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(GeometryParser.ARROW, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(ARROW);
			setState(83);
			functionDeclaration();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public AreaCallContext areaCall() {
			return getRuleContext(AreaCallContext.class,0);
		}
		public PerimeterCallContext perimeterCall() {
			return getRuleContext(PerimeterCallContext.class,0);
		}
		public DiagonalCallContext diagonalCall() {
			return getRuleContext(DiagonalCallContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				areaCall();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				perimeterCall();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				diagonalCall();
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
		enterRule(_localctx, 12, RULE_figureDeclaration);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				lineDeclaration();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				segmentDeclaration();
				}
				break;
			case TRIANGLE:
			case EQUILATERAL_TRIANGLE:
			case ISOSCELES_TRIANGLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				triangleDeclaration();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				squareDeclaration();
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				rectangleDeclaration();
				}
				break;
			case PARALLELOGRAM:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				parallelogramDeclaration();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				circleDeclaration();
				}
				break;
			case ELLIPSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
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

	public static class AreaCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public AreaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_areaCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterAreaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitAreaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitAreaCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AreaCallContext areaCall() throws RecognitionException {
		AreaCallContext _localctx = new AreaCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_areaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			match(LPAREN);
			setState(103);
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

	public static class PerimeterCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public PerimeterCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perimeterCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterPerimeterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitPerimeterCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitPerimeterCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerimeterCallContext perimeterCall() throws RecognitionException {
		PerimeterCallContext _localctx = new PerimeterCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_perimeterCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__1);
			setState(106);
			match(LPAREN);
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

	public static class DiagonalCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public DiagonalCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagonalCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterDiagonalCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitDiagonalCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitDiagonalCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagonalCallContext diagonalCall() throws RecognitionException {
		DiagonalCallContext _localctx = new DiagonalCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_diagonalCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			match(LPAREN);
			setState(111);
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
		enterRule(_localctx, 20, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(POINT);
			setState(114);
			match(ID);
			setState(115);
			match(LPAREN);
			setState(116);
			match(NUM);
			setState(117);
			match(COMMA);
			setState(118);
			match(NUM);
			setState(119);
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
		enterRule(_localctx, 22, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LINE);
			setState(122);
			match(ID);
			setState(123);
			match(LPAREN);
			setState(124);
			point();
			setState(125);
			match(COMMA);
			setState(126);
			point();
			setState(127);
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
		enterRule(_localctx, 24, RULE_segmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SEGMENT);
			setState(130);
			match(ID);
			setState(131);
			match(LPAREN);
			setState(132);
			point();
			setState(133);
			match(COMMA);
			setState(134);
			point();
			setState(135);
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
		public List<TerminalNode> ARROW() { return getTokens(GeometryParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(GeometryParser.ARROW, i);
		}
		public List<TrianglePropertyContext> triangleProperty() {
			return getRuleContexts(TrianglePropertyContext.class);
		}
		public TrianglePropertyContext triangleProperty(int i) {
			return getRuleContext(TrianglePropertyContext.class,i);
		}
		public List<AliasVertexContext> aliasVertex() {
			return getRuleContexts(AliasVertexContext.class);
		}
		public AliasVertexContext aliasVertex(int i) {
			return getRuleContext(AliasVertexContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_triangleDeclaration);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(TRIANGLE);
				setState(138);
				match(ID);
				setState(139);
				match(LPAREN);
				setState(140);
				point();
				setState(141);
				match(COMMA);
				setState(142);
				point();
				setState(143);
				match(COMMA);
				setState(144);
				point();
				setState(145);
				match(RPAREN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(146);
					match(ARROW);
					setState(147);
					triangleProperty();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(TRIANGLE);
				setState(154);
				match(ID);
				setState(155);
				match(LPAREN);
				setState(156);
				aliasVertex();
				setState(157);
				match(COMMA);
				setState(158);
				aliasVertex();
				setState(159);
				match(COMMA);
				setState(160);
				aliasVertex();
				setState(161);
				match(RPAREN);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(162);
					match(ARROW);
					setState(163);
					triangleProperty();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(TRIANGLE);
				setState(170);
				match(ID);
				setState(171);
				match(LPAREN);
				setState(172);
				match(NUM);
				setState(173);
				match(COMMA);
				setState(174);
				match(NUM);
				setState(175);
				match(COMMA);
				setState(176);
				match(NUM);
				setState(177);
				match(RPAREN);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(178);
					match(ARROW);
					setState(179);
					triangleProperty();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(EQUILATERAL_TRIANGLE);
				setState(186);
				match(ID);
				setState(187);
				match(LPAREN);
				setState(188);
				match(NUM);
				setState(189);
				match(RPAREN);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(190);
					match(ARROW);
					setState(191);
					triangleProperty();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(ISOSCELES_TRIANGLE);
				setState(198);
				match(ID);
				setState(199);
				match(LPAREN);
				setState(200);
				match(NUM);
				setState(201);
				match(COMMA);
				setState(202);
				match(NUM);
				setState(203);
				match(RPAREN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(204);
					match(ARROW);
					setState(205);
					triangleProperty();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class AliasVertexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public AliasVertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasVertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterAliasVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitAliasVertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitAliasVertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasVertexContext aliasVertex() throws RecognitionException {
		AliasVertexContext _localctx = new AliasVertexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aliasVertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			setState(214);
			match(T__3);
			setState(215);
			match(NUM);
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

	public static class TrianglePropertyContext extends ParserRuleContext {
		public BisectorDeclarationContext bisectorDeclaration() {
			return getRuleContext(BisectorDeclarationContext.class,0);
		}
		public AngleDeclarationContext angleDeclaration() {
			return getRuleContext(AngleDeclarationContext.class,0);
		}
		public HeightDeclarationContext heightDeclaration() {
			return getRuleContext(HeightDeclarationContext.class,0);
		}
		public TrianglePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triangleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterTriangleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitTriangleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitTriangleProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrianglePropertyContext triangleProperty() throws RecognitionException {
		TrianglePropertyContext _localctx = new TrianglePropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_triangleProperty);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BISECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				bisectorDeclaration();
				}
				break;
			case ANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				angleDeclaration();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				heightDeclaration();
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

	public static class BisectorDeclarationContext extends ParserRuleContext {
		public TerminalNode BISECTOR() { return getToken(GeometryParser.BISECTOR, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public BisectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bisectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterBisectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitBisectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitBisectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BisectorDeclarationContext bisectorDeclaration() throws RecognitionException {
		BisectorDeclarationContext _localctx = new BisectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bisectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(BISECTOR);
			setState(223);
			match(LPAREN);
			setState(224);
			match(ID);
			setState(225);
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

	public static class AngleDeclarationContext extends ParserRuleContext {
		public TerminalNode ANGLE() { return getToken(GeometryParser.ANGLE, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public AngleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterAngleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitAngleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitAngleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngleDeclarationContext angleDeclaration() throws RecognitionException {
		AngleDeclarationContext _localctx = new AngleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_angleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ANGLE);
			setState(228);
			match(LPAREN);
			setState(229);
			match(ID);
			setState(230);
			match(COMMA);
			setState(231);
			match(NUM);
			setState(232);
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

	public static class HeightDeclarationContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(GeometryParser.HEIGHT, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public HeightDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterHeightDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitHeightDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitHeightDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightDeclarationContext heightDeclaration() throws RecognitionException {
		HeightDeclarationContext _localctx = new HeightDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_heightDeclaration);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(HEIGHT);
				setState(235);
				match(LPAREN);
				setState(236);
				match(ID);
				setState(237);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(HEIGHT);
				setState(239);
				match(LPAREN);
				setState(240);
				match(ID);
				setState(241);
				match(COMMA);
				setState(242);
				match(NUM);
				setState(243);
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
		enterRule(_localctx, 38, RULE_squareDeclaration);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(SQUARE);
				setState(247);
				match(ID);
				setState(248);
				match(LPAREN);
				setState(249);
				match(NUM);
				setState(250);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(SQUARE);
				setState(252);
				match(ID);
				setState(253);
				match(T__4);
				setState(254);
				match(EQUAL);
				setState(255);
				match(NUM);
				setState(256);
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
		enterRule(_localctx, 40, RULE_rectangleDeclaration);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(RECTANGLE);
				setState(260);
				match(ID);
				setState(261);
				match(LPAREN);
				setState(262);
				match(NUM);
				setState(263);
				match(COMMA);
				setState(264);
				match(NUM);
				setState(265);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(RECTANGLE);
				setState(267);
				match(ID);
				setState(268);
				match(T__5);
				setState(269);
				match(EQUAL);
				setState(270);
				match(NUM);
				setState(271);
				match(COMMA);
				setState(272);
				match(T__6);
				setState(273);
				match(EQUAL);
				setState(274);
				match(NUM);
				setState(275);
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
		enterRule(_localctx, 42, RULE_parallelogramDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(PARALLELOGRAM);
			setState(279);
			match(ID);
			setState(280);
			match(LPAREN);
			setState(281);
			match(NUM);
			setState(282);
			match(COMMA);
			setState(283);
			match(NUM);
			setState(284);
			match(COMMA);
			setState(285);
			match(NUM);
			setState(286);
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
		enterRule(_localctx, 44, RULE_circleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(CIRCLE);
			setState(289);
			match(ID);
			setState(290);
			match(LPAREN);
			setState(291);
			match(NUM);
			setState(292);
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
		enterRule(_localctx, 46, RULE_ellipseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELLIPSE);
			setState(295);
			match(ID);
			setState(296);
			match(LPAREN);
			setState(297);
			match(NUM);
			setState(298);
			match(COMMA);
			setState(299);
			match(NUM);
			setState(300);
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
		enterRule(_localctx, 48, RULE_rhombusDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(RHOMBUS);
			setState(303);
			match(ID);
			setState(304);
			match(LPAREN);
			setState(305);
			match(NUM);
			setState(306);
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
		enterRule(_localctx, 50, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			type();
			setState(309);
			match(ID);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(310);
				match(EQUAL);
				setState(311);
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
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(317);
				match(NUM);
				}
				break;
			case TRUE:
				{
				setState(318);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(319);
				match(FALSE);
				}
				break;
			case STRING:
				{
				setState(320);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(321);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(322);
				match(LPAREN);
				setState(323);
				expression(0);
				setState(324);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(328);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(329);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(330);
					expression(3);
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 56, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		enterRule(_localctx, 58, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0157\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\6\2B\n\2\r\2\16\2C\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a\13\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17"+
		"\16\17\u00aa\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u00c3\n\17\f\17\16\17\u00c6\13\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00d1\n\17\f\17\16\17\u00d4\13\17\5\17\u00d6"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0104\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0117\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u013b\n\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0149\n\35\3\35\3\35\3\35\7\35"+
		"\u014e\n\35\f\35\16\35\u0151\13\35\3\36\3\36\3\37\3\37\3\37\2\38 \2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\3\2\n"+
		"\f\3\2\16\21\3\2./\2\u015c\2A\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\bQ\3\2\2\2"+
		"\nS\3\2\2\2\fZ\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22k\3\2\2\2\24o\3\2\2\2"+
		"\26s\3\2\2\2\30{\3\2\2\2\32\u0083\3\2\2\2\34\u00d5\3\2\2\2\36\u00d7\3"+
		"\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e5\3\2\2\2&\u00f6\3\2\2\2(\u0103"+
		"\3\2\2\2*\u0116\3\2\2\2,\u0118\3\2\2\2.\u0122\3\2\2\2\60\u0128\3\2\2\2"+
		"\62\u0130\3\2\2\2\64\u0136\3\2\2\2\66\u013c\3\2\2\28\u0148\3\2\2\2:\u0152"+
		"\3\2\2\2<\u0154\3\2\2\2>B\5\4\3\2?B\5\b\5\2@B\5\6\4\2A>\3\2\2\2A?\3\2"+
		"\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EF\5\16\b\2FG\7"+
		"\'\2\2GM\3\2\2\2HI\5\64\33\2IJ\7\'\2\2JM\3\2\2\2KM\5<\37\2LE\3\2\2\2L"+
		"H\3\2\2\2LK\3\2\2\2M\5\3\2\2\2NO\5\n\6\2OP\7\'\2\2P\7\3\2\2\2QR\7.\2\2"+
		"R\t\3\2\2\2ST\7$\2\2TU\7\22\2\2UV\5\f\7\2V\13\3\2\2\2W[\5\20\t\2X[\5\22"+
		"\n\2Y[\5\24\13\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\f\5\26\f\2"+
		"]f\5\30\r\2^f\5\32\16\2_f\5\34\17\2`f\5(\25\2af\5*\26\2bf\5,\27\2cf\5"+
		".\30\2df\5\60\31\2e\\\3\2\2\2e]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2"+
		"ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\7\3\2\2hi\7)\2"+
		"\2ij\7*\2\2j\21\3\2\2\2kl\7\4\2\2lm\7)\2\2mn\7*\2\2n\23\3\2\2\2op\7\5"+
		"\2\2pq\7)\2\2qr\7*\2\2r\25\3\2\2\2st\7\23\2\2tu\7$\2\2uv\7)\2\2vw\7#\2"+
		"\2wx\7(\2\2xy\7#\2\2yz\7*\2\2z\27\3\2\2\2{|\7\24\2\2|}\7$\2\2}~\7)\2\2"+
		"~\177\5:\36\2\177\u0080\7(\2\2\u0080\u0081\5:\36\2\u0081\u0082\7*\2\2"+
		"\u0082\31\3\2\2\2\u0083\u0084\7\25\2\2\u0084\u0085\7$\2\2\u0085\u0086"+
		"\7)\2\2\u0086\u0087\5:\36\2\u0087\u0088\7(\2\2\u0088\u0089\5:\36\2\u0089"+
		"\u008a\7*\2\2\u008a\33\3\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d\7$\2\2"+
		"\u008d\u008e\7)\2\2\u008e\u008f\5:\36\2\u008f\u0090\7(\2\2\u0090\u0091"+
		"\5:\36\2\u0091\u0092\7(\2\2\u0092\u0093\5:\36\2\u0093\u0098\7*\2\2\u0094"+
		"\u0095\7\22\2\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0097\u009a\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00d6\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\7\26\2\2\u009c\u009d\7$\2\2\u009d\u009e\7)"+
		"\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7(\2\2\u00a0\u00a1\5\36\20\2\u00a1"+
		"\u00a2\7(\2\2\u00a2\u00a3\5\36\20\2\u00a3\u00a8\7*\2\2\u00a4\u00a5\7\22"+
		"\2\2\u00a5\u00a7\5 \21\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00d6\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\7)\2\2\u00ae"+
		"\u00af\7#\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7(\2\2"+
		"\u00b2\u00b3\7#\2\2\u00b3\u00b8\7*\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b7"+
		"\5 \21\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00d6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\30"+
		"\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\7#\2\2\u00bf\u00c4"+
		"\7*\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c3\5 \21\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d6\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		"\u00ca\7)\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7#\2\2"+
		"\u00cd\u00d2\7*\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d1\5 \21\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u008b\3\2\2\2\u00d5\u009b\3\2"+
		"\2\2\u00d5\u00ab\3\2\2\2\u00d5\u00bb\3\2\2\2\u00d5\u00c7\3\2\2\2\u00d6"+
		"\35\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\7\6\2\2\u00d9\u00da\7#\2\2"+
		"\u00da\37\3\2\2\2\u00db\u00df\5\"\22\2\u00dc\u00df\5$\23\2\u00dd\u00df"+
		"\5&\24\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"!\3\2\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\7)\2\2\u00e2\u00e3\7$\2\2\u00e3"+
		"\u00e4\7*\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7!\2\2\u00e6\u00e7\7)\2\2\u00e7"+
		"\u00e8\7$\2\2\u00e8\u00e9\7(\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7*\2\2"+
		"\u00eb%\3\2\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\7)\2\2\u00ee\u00ef\7"+
		"$\2\2\u00ef\u00f7\7*\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7)\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f7\7*\2\2"+
		"\u00f6\u00ec\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\7"+
		"\32\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc\7#\2\2\u00fc"+
		"\u0104\7*\2\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100\7\7"+
		"\2\2\u0100\u0101\7\r\2\2\u0101\u0102\7#\2\2\u0102\u0104\7\'\2\2\u0103"+
		"\u00f8\3\2\2\2\u0103\u00fd\3\2\2\2\u0104)\3\2\2\2\u0105\u0106\7\33\2\2"+
		"\u0106\u0107\7$\2\2\u0107\u0108\7)\2\2\u0108\u0109\7#\2\2\u0109\u010a"+
		"\7(\2\2\u010a\u010b\7#\2\2\u010b\u0117\7*\2\2\u010c\u010d\7\33\2\2\u010d"+
		"\u010e\7$\2\2\u010e\u010f\7\b\2\2\u010f\u0110\7\r\2\2\u0110\u0111\7#\2"+
		"\2\u0111\u0112\7(\2\2\u0112\u0113\7\t\2\2\u0113\u0114\7\r\2\2\u0114\u0115"+
		"\7#\2\2\u0115\u0117\7\'\2\2\u0116\u0105\3\2\2\2\u0116\u010c\3\2\2\2\u0117"+
		"+\3\2\2\2\u0118\u0119\7\34\2\2\u0119\u011a\7$\2\2\u011a\u011b\7)\2\2\u011b"+
		"\u011c\7#\2\2\u011c\u011d\7(\2\2\u011d\u011e\7#\2\2\u011e\u011f\7(\2\2"+
		"\u011f\u0120\7#\2\2\u0120\u0121\7*\2\2\u0121-\3\2\2\2\u0122\u0123\7\35"+
		"\2\2\u0123\u0124\7$\2\2\u0124\u0125\7)\2\2\u0125\u0126\7#\2\2\u0126\u0127"+
		"\7*\2\2\u0127/\3\2\2\2\u0128\u0129\7\36\2\2\u0129\u012a\7$\2\2\u012a\u012b"+
		"\7)\2\2\u012b\u012c\7#\2\2\u012c\u012d\7(\2\2\u012d\u012e\7#\2\2\u012e"+
		"\u012f\7*\2\2\u012f\61\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0132\7$\2\2"+
		"\u0132\u0133\7)\2\2\u0133\u0134\7#\2\2\u0134\u0135\7*\2\2\u0135\63\3\2"+
		"\2\2\u0136\u0137\5\66\34\2\u0137\u013a\7$\2\2\u0138\u0139\7\r\2\2\u0139"+
		"\u013b\58\35\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\65\3\2\2"+
		"\2\u013c\u013d\t\2\2\2\u013d\67\3\2\2\2\u013e\u013f\b\35\1\2\u013f\u0149"+
		"\7#\2\2\u0140\u0149\7+\2\2\u0141\u0149\7,\2\2\u0142\u0149\7-\2\2\u0143"+
		"\u0149\7$\2\2\u0144\u0145\7)\2\2\u0145\u0146\58\35\2\u0146\u0147\7*\2"+
		"\2\u0147\u0149\3\2\2\2\u0148\u013e\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0141"+
		"\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0149"+
		"\u014f\3\2\2\2\u014a\u014b\f\4\2\2\u014b\u014c\t\3\2\2\u014c\u014e\58"+
		"\35\5\u014d\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u01509\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7$\2\2\u0153"+
		";\3\2\2\2\u0154\u0155\t\4\2\2\u0155=\3\2\2\2\24ACLZe\u0098\u00a8\u00b8"+
		"\u00c4\u00d2\u00d5\u00de\u00f6\u0103\u0116\u013a\u0148\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}