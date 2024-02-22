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
		T__0=1, T__1=2, T__2=3, POINT=4, LINE=5, SEGMENT=6, TRIANGLE=7, SQUARE=8, 
		RECTANGLE=9, PARALLELOGRAM=10, CIRCLE=11, ELLIPSE=12, NUM=13, ID=14, WS=15, 
		SEMICOLON=16, COMMA=17, LPAREN=18, RPAREN=19, TRUE=20, FALSE=21, STRING=22, 
		COMMENT=23, ML_COMMENT=24, EQUAL=25, PLUS=26, MINUS=27, MUL=28, DIV=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_figureDeclaration = 2, RULE_pointDeclaration = 3, 
		RULE_lineDeclaration = 4, RULE_segmentDeclaration = 5, RULE_triangleDeclaration = 6, 
		RULE_squareDeclaration = 7, RULE_rectangleDeclaration = 8, RULE_parallelogramDeclaration = 9, 
		RULE_circleDeclaration = 10, RULE_ellipseDeclaration = 11, RULE_variableDeclaration = 12, 
		RULE_type = 13, RULE_expression = 14, RULE_point = 15, RULE_comment = 16;
	public static final String[] ruleNames = {
		"program", "statement", "figureDeclaration", "pointDeclaration", "lineDeclaration", 
		"segmentDeclaration", "triangleDeclaration", "squareDeclaration", "rectangleDeclaration", 
		"parallelogramDeclaration", "circleDeclaration", "ellipseDeclaration", 
		"variableDeclaration", "type", "expression", "point", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'num'", "'bool'", "'string'", "'Point'", "'Line'", "'Segment'", 
		"'Triangle'", "'Square'", "'Rectangle'", "'Parallelogram'", "'Circle'", 
		"'Ellipse'", null, null, null, "';'", "','", "'('", "')'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POINT", "LINE", "SEGMENT", "TRIANGLE", "SQUARE", 
		"RECTANGLE", "PARALLELOGRAM", "CIRCLE", "ELLIPSE", "NUM", "ID", "WS", 
		"SEMICOLON", "COMMA", "LPAREN", "RPAREN", "TRUE", "FALSE", "STRING", "COMMENT", 
		"ML_COMMENT", "EQUAL", "PLUS", "MINUS", "MUL", "DIV"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << POINT) | (1L << LINE) | (1L << SEGMENT) | (1L << TRIANGLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << PARALLELOGRAM) | (1L << CIRCLE) | (1L << ELLIPSE) | (1L << COMMENT) | (1L << ML_COMMENT))) != 0) );
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
			case LINE:
			case SEGMENT:
			case TRIANGLE:
			case SQUARE:
			case RECTANGLE:
			case PARALLELOGRAM:
			case CIRCLE:
			case ELLIPSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				figureDeclaration();
				setState(40);
				match(SEMICOLON);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				variableDeclaration();
				setState(43);
				match(SEMICOLON);
				}
				break;
			case COMMENT:
			case ML_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
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
		enterRule(_localctx, 4, RULE_figureDeclaration);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				lineDeclaration();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				segmentDeclaration();
				}
				break;
			case TRIANGLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				triangleDeclaration();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				squareDeclaration();
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				rectangleDeclaration();
				}
				break;
			case PARALLELOGRAM:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				parallelogramDeclaration();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				circleDeclaration();
				}
				break;
			case ELLIPSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(56);
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
		enterRule(_localctx, 6, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(POINT);
			setState(60);
			match(ID);
			setState(61);
			match(LPAREN);
			setState(62);
			match(NUM);
			setState(63);
			match(COMMA);
			setState(64);
			match(NUM);
			setState(65);
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
		enterRule(_localctx, 8, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LINE);
			setState(68);
			match(ID);
			setState(69);
			match(LPAREN);
			setState(70);
			point();
			setState(71);
			match(COMMA);
			setState(72);
			point();
			setState(73);
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
		enterRule(_localctx, 10, RULE_segmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(SEGMENT);
			setState(76);
			match(ID);
			setState(77);
			match(LPAREN);
			setState(78);
			point();
			setState(79);
			match(COMMA);
			setState(80);
			point();
			setState(81);
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
		enterRule(_localctx, 12, RULE_triangleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TRIANGLE);
			setState(84);
			match(ID);
			setState(85);
			match(LPAREN);
			setState(86);
			point();
			setState(87);
			match(COMMA);
			setState(88);
			point();
			setState(89);
			match(COMMA);
			setState(90);
			point();
			setState(91);
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

	public static class SquareDeclarationContext extends ParserRuleContext {
		public TerminalNode SQUARE() { return getToken(GeometryParser.SQUARE, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(GeometryParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
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
		enterRule(_localctx, 14, RULE_squareDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SQUARE);
			setState(94);
			match(ID);
			setState(95);
			match(LPAREN);
			setState(96);
			match(NUM);
			setState(97);
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
		enterRule(_localctx, 16, RULE_rectangleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(RECTANGLE);
			setState(100);
			match(ID);
			setState(101);
			match(LPAREN);
			setState(102);
			match(NUM);
			setState(103);
			match(COMMA);
			setState(104);
			match(NUM);
			setState(105);
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

	public static class ParallelogramDeclarationContext extends ParserRuleContext {
		public TerminalNode PARALLELOGRAM() { return getToken(GeometryParser.PARALLELOGRAM, 0); }
		public TerminalNode ID() { return getToken(GeometryParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
		public TerminalNode COMMA() { return getToken(GeometryParser.COMMA, 0); }
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
		enterRule(_localctx, 18, RULE_parallelogramDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PARALLELOGRAM);
			setState(108);
			match(ID);
			setState(109);
			match(LPAREN);
			setState(110);
			match(NUM);
			setState(111);
			match(COMMA);
			setState(112);
			match(NUM);
			setState(113);
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
		enterRule(_localctx, 20, RULE_circleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CIRCLE);
			setState(116);
			match(ID);
			setState(117);
			match(LPAREN);
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
		enterRule(_localctx, 22, RULE_ellipseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ELLIPSE);
			setState(122);
			match(ID);
			setState(123);
			match(LPAREN);
			setState(124);
			match(NUM);
			setState(125);
			match(COMMA);
			setState(126);
			match(NUM);
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
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			type();
			setState(130);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(131);
				match(EQUAL);
				setState(132);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(138);
				match(NUM);
				}
				break;
			case TRUE:
				{
				setState(139);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(140);
				match(FALSE);
				}
				break;
			case STRING:
				{
				setState(141);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(142);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(143);
				match(LPAREN);
				setState(144);
				expression(0);
				setState(145);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(149);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(150);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(151);
					expression(3);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 30, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 32, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5"+
		"\16\u0088\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0096\n\20\3\20\3\20\3\20\7\20\u009b\n\20\f\20\16\20\u009e"+
		"\13\20\3\21\3\21\3\22\3\22\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"\2\5\3\2\3\5\3\2\34\37\3\2\31\32\2\u00a4\2%\3\2\2\2\4\60\3"+
		"\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fM\3\2\2\2\16U\3\2\2\2\20_\3\2"+
		"\2\2\22e\3\2\2\2\24m\3\2\2\2\26u\3\2\2\2\30{\3\2\2\2\32\u0083\3\2\2\2"+
		"\34\u0089\3\2\2\2\36\u0095\3\2\2\2 \u009f\3\2\2\2\"\u00a1\3\2\2\2$&\5"+
		"\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\5\6\4\2"+
		"*+\7\22\2\2+\61\3\2\2\2,-\5\32\16\2-.\7\22\2\2.\61\3\2\2\2/\61\5\"\22"+
		"\2\60)\3\2\2\2\60,\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62<\5\b\5\2\63<\5"+
		"\n\6\2\64<\5\f\7\2\65<\5\16\b\2\66<\5\20\t\2\67<\5\22\n\28<\5\24\13\2"+
		"9<\5\26\f\2:<\5\30\r\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2"+
		";\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7"+
		"\6\2\2>?\7\20\2\2?@\7\24\2\2@A\7\17\2\2AB\7\23\2\2BC\7\17\2\2CD\7\25\2"+
		"\2D\t\3\2\2\2EF\7\7\2\2FG\7\20\2\2GH\7\24\2\2HI\5 \21\2IJ\7\23\2\2JK\5"+
		" \21\2KL\7\25\2\2L\13\3\2\2\2MN\7\b\2\2NO\7\20\2\2OP\7\24\2\2PQ\5 \21"+
		"\2QR\7\23\2\2RS\5 \21\2ST\7\25\2\2T\r\3\2\2\2UV\7\t\2\2VW\7\20\2\2WX\7"+
		"\24\2\2XY\5 \21\2YZ\7\23\2\2Z[\5 \21\2[\\\7\23\2\2\\]\5 \21\2]^\7\25\2"+
		"\2^\17\3\2\2\2_`\7\n\2\2`a\7\20\2\2ab\7\24\2\2bc\7\17\2\2cd\7\25\2\2d"+
		"\21\3\2\2\2ef\7\13\2\2fg\7\20\2\2gh\7\24\2\2hi\7\17\2\2ij\7\23\2\2jk\7"+
		"\17\2\2kl\7\25\2\2l\23\3\2\2\2mn\7\f\2\2no\7\20\2\2op\7\24\2\2pq\7\17"+
		"\2\2qr\7\23\2\2rs\7\17\2\2st\7\25\2\2t\25\3\2\2\2uv\7\r\2\2vw\7\20\2\2"+
		"wx\7\24\2\2xy\7\17\2\2yz\7\25\2\2z\27\3\2\2\2{|\7\16\2\2|}\7\20\2\2}~"+
		"\7\24\2\2~\177\7\17\2\2\177\u0080\7\23\2\2\u0080\u0081\7\17\2\2\u0081"+
		"\u0082\7\25\2\2\u0082\31\3\2\2\2\u0083\u0084\5\34\17\2\u0084\u0087\7\20"+
		"\2\2\u0085\u0086\7\33\2\2\u0086\u0088\5\36\20\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\t\2\2\2\u008a\35\3\2\2\2\u008b"+
		"\u008c\b\20\1\2\u008c\u0096\7\17\2\2\u008d\u0096\7\26\2\2\u008e\u0096"+
		"\7\27\2\2\u008f\u0096\7\30\2\2\u0090\u0096\7\20\2\2\u0091\u0092\7\24\2"+
		"\2\u0092\u0093\5\36\20\2\u0093\u0094\7\25\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u008b\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u009c\3\2\2\2\u0097"+
		"\u0098\f\4\2\2\u0098\u0099\t\3\2\2\u0099\u009b\5\36\20\5\u009a\u0097\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\37\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0!\3\2\2\2\u00a1"+
		"\u00a2\t\4\2\2\u00a2#\3\2\2\2\b\'\60;\u0087\u0095\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}