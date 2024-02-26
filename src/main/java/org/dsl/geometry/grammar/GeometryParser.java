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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, EQUAL=8, PLUS=9, 
		MINUS=10, MUL=11, DIV=12, ARROW=13, POINT=14, LINE=15, SEGMENT=16, TRIANGLE=17, 
		EQUILATERAL_TRIANGLE=18, ISOSCELES_TRIANGLE=19, SQUARE=20, RECTANGLE=21, 
		PARALLELOGRAM=22, CIRCLE=23, ELLIPSE=24, RHOMBUS=25, BISECTOR=26, ANGLE=27, 
		VERTEX=28, NUM=29, ID=30, ALIAS=31, WS=32, SEMICOLON=33, COMMA=34, LPAREN=35, 
		RPAREN=36, TRUE=37, FALSE=38, STRING=39, COMMENT=40, ML_COMMENT=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_commentStatement = 2, RULE_figureDeclaration = 3, 
		RULE_pointDeclaration = 4, RULE_lineDeclaration = 5, RULE_segmentDeclaration = 6, 
		RULE_triangleDeclaration = 7, RULE_aliasVertex = 8, RULE_triangleProperty = 9, 
		RULE_bisectorDeclaration = 10, RULE_angleDeclaration = 11, RULE_squareDeclaration = 12, 
		RULE_rectangleDeclaration = 13, RULE_parallelogramDeclaration = 14, RULE_circleDeclaration = 15, 
		RULE_ellipseDeclaration = 16, RULE_rhombusDeclaration = 17, RULE_variableDeclaration = 18, 
		RULE_type = 19, RULE_expression = 20, RULE_point = 21, RULE_comment = 22;
	public static final String[] ruleNames = {
		"program", "statement", "commentStatement", "figureDeclaration", "pointDeclaration", 
		"lineDeclaration", "segmentDeclaration", "triangleDeclaration", "aliasVertex", 
		"triangleProperty", "bisectorDeclaration", "angleDeclaration", "squareDeclaration", 
		"rectangleDeclaration", "parallelogramDeclaration", "circleDeclaration", 
		"ellipseDeclaration", "rhombusDeclaration", "variableDeclaration", "type", 
		"expression", "point", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'side'", "'width'", "'height'", "'num'", "'bool'", "'string'", 
		"'='", "'+'", "'-'", "'*'", "'/'", "'->'", "'Point'", "'Line'", "'Segment'", 
		"'Triangle'", "'EquilateralTriangle'", "'IsoscelesTriangle'", "'Square'", 
		"'Rectangle'", "'Parallelogram'", "'Circle'", "'Ellipse'", "'Rhombus'", 
		"'bisector'", "'Angle'", "'Vertex'", null, null, null, null, "';'", "','", 
		"'('", "')'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "EQUAL", "PLUS", "MINUS", 
		"MUL", "DIV", "ARROW", "POINT", "LINE", "SEGMENT", "TRIANGLE", "EQUILATERAL_TRIANGLE", 
		"ISOSCELES_TRIANGLE", "SQUARE", "RECTANGLE", "PARALLELOGRAM", "CIRCLE", 
		"ELLIPSE", "RHOMBUS", "BISECTOR", "ANGLE", "VERTEX", "NUM", "ID", "ALIAS", 
		"WS", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "TRUE", "FALSE", "STRING", 
		"COMMENT", "ML_COMMENT"
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
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					statement();
					}
					break;
				case 2:
					{
					setState(47);
					commentStatement();
					}
					break;
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << POINT) | (1L << LINE) | (1L << SEGMENT) | (1L << TRIANGLE) | (1L << EQUILATERAL_TRIANGLE) | (1L << ISOSCELES_TRIANGLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << PARALLELOGRAM) | (1L << CIRCLE) | (1L << ELLIPSE) | (1L << COMMENT) | (1L << ML_COMMENT))) != 0) );
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
			setState(59);
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
				setState(52);
				figureDeclaration();
				setState(53);
				match(SEMICOLON);
				}
				break;
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				variableDeclaration();
				setState(56);
				match(SEMICOLON);
				}
				break;
			case COMMENT:
			case ML_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
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
		enterRule(_localctx, 4, RULE_commentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 6, RULE_figureDeclaration);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				lineDeclaration();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				segmentDeclaration();
				}
				break;
			case TRIANGLE:
			case EQUILATERAL_TRIANGLE:
			case ISOSCELES_TRIANGLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				triangleDeclaration();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				squareDeclaration();
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				rectangleDeclaration();
				}
				break;
			case PARALLELOGRAM:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				parallelogramDeclaration();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				circleDeclaration();
				}
				break;
			case ELLIPSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
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
		enterRule(_localctx, 8, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(POINT);
			setState(75);
			match(ID);
			setState(76);
			match(LPAREN);
			setState(77);
			match(NUM);
			setState(78);
			match(COMMA);
			setState(79);
			match(NUM);
			setState(80);
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
		enterRule(_localctx, 10, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LINE);
			setState(83);
			match(ID);
			setState(84);
			match(LPAREN);
			setState(85);
			point();
			setState(86);
			match(COMMA);
			setState(87);
			point();
			setState(88);
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
		enterRule(_localctx, 12, RULE_segmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SEGMENT);
			setState(91);
			match(ID);
			setState(92);
			match(LPAREN);
			setState(93);
			point();
			setState(94);
			match(COMMA);
			setState(95);
			point();
			setState(96);
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
		enterRule(_localctx, 14, RULE_triangleDeclaration);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(TRIANGLE);
				setState(99);
				match(ID);
				setState(100);
				match(LPAREN);
				setState(101);
				point();
				setState(102);
				match(COMMA);
				setState(103);
				point();
				setState(104);
				match(COMMA);
				setState(105);
				point();
				setState(106);
				match(RPAREN);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(107);
					match(ARROW);
					setState(108);
					triangleProperty();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(TRIANGLE);
				setState(115);
				match(ID);
				setState(116);
				match(LPAREN);
				setState(117);
				aliasVertex();
				setState(118);
				match(COMMA);
				setState(119);
				aliasVertex();
				setState(120);
				match(COMMA);
				setState(121);
				aliasVertex();
				setState(122);
				match(RPAREN);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(123);
					match(ARROW);
					setState(124);
					triangleProperty();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(TRIANGLE);
				setState(131);
				match(ID);
				setState(132);
				match(LPAREN);
				setState(133);
				match(NUM);
				setState(134);
				match(COMMA);
				setState(135);
				match(NUM);
				setState(136);
				match(COMMA);
				setState(137);
				match(NUM);
				setState(138);
				match(RPAREN);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(139);
					match(ARROW);
					setState(140);
					triangleProperty();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(EQUILATERAL_TRIANGLE);
				setState(147);
				match(ID);
				setState(148);
				match(LPAREN);
				setState(149);
				match(NUM);
				setState(150);
				match(RPAREN);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(151);
					match(ARROW);
					setState(152);
					triangleProperty();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(ISOSCELES_TRIANGLE);
				setState(159);
				match(ID);
				setState(160);
				match(LPAREN);
				setState(161);
				match(NUM);
				setState(162);
				match(COMMA);
				setState(163);
				match(NUM);
				setState(164);
				match(RPAREN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(165);
					match(ARROW);
					setState(166);
					triangleProperty();
					}
					}
					setState(171);
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
		enterRule(_localctx, 16, RULE_aliasVertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(175);
			match(T__0);
			setState(176);
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
		enterRule(_localctx, 18, RULE_triangleProperty);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BISECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				bisectorDeclaration();
				}
				break;
			case ANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				angleDeclaration();
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
		enterRule(_localctx, 20, RULE_bisectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(BISECTOR);
			setState(183);
			match(LPAREN);
			setState(184);
			match(ID);
			setState(185);
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
		enterRule(_localctx, 22, RULE_angleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ANGLE);
			setState(188);
			match(LPAREN);
			setState(189);
			match(ID);
			setState(190);
			match(COMMA);
			setState(191);
			match(NUM);
			setState(192);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(SQUARE);
				setState(195);
				match(ID);
				setState(196);
				match(LPAREN);
				setState(197);
				match(NUM);
				setState(198);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(SQUARE);
				setState(200);
				match(ID);
				setState(201);
				match(T__1);
				setState(202);
				match(EQUAL);
				setState(203);
				match(NUM);
				setState(204);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(RECTANGLE);
				setState(208);
				match(ID);
				setState(209);
				match(LPAREN);
				setState(210);
				match(NUM);
				setState(211);
				match(COMMA);
				setState(212);
				match(NUM);
				setState(213);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(RECTANGLE);
				setState(215);
				match(ID);
				setState(216);
				match(T__2);
				setState(217);
				match(EQUAL);
				setState(218);
				match(NUM);
				setState(219);
				match(COMMA);
				setState(220);
				match(T__3);
				setState(221);
				match(EQUAL);
				setState(222);
				match(NUM);
				setState(223);
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
			setState(226);
			match(PARALLELOGRAM);
			setState(227);
			match(ID);
			setState(228);
			match(LPAREN);
			setState(229);
			match(NUM);
			setState(230);
			match(COMMA);
			setState(231);
			match(NUM);
			setState(232);
			match(COMMA);
			setState(233);
			match(NUM);
			setState(234);
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
			setState(236);
			match(CIRCLE);
			setState(237);
			match(ID);
			setState(238);
			match(LPAREN);
			setState(239);
			match(NUM);
			setState(240);
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
			setState(242);
			match(ELLIPSE);
			setState(243);
			match(ID);
			setState(244);
			match(LPAREN);
			setState(245);
			match(NUM);
			setState(246);
			match(COMMA);
			setState(247);
			match(NUM);
			setState(248);
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
			setState(250);
			match(RHOMBUS);
			setState(251);
			match(ID);
			setState(252);
			match(LPAREN);
			setState(253);
			match(NUM);
			setState(254);
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
			setState(256);
			type();
			setState(257);
			match(ID);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(258);
				match(EQUAL);
				setState(259);
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
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(265);
				match(NUM);
				}
				break;
			case TRUE:
				{
				setState(266);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(267);
				match(FALSE);
				}
				break;
			case STRING:
				{
				setState(268);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(269);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(270);
				match(LPAREN);
				setState(271);
				expression(0);
				setState(272);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(278);
					expression(3);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(284);
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
			setState(286);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0123\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\6"+
		"\2\63\n\2\r\2\16\2\64\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16"+
		"\t\u0093\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16\t\u009f"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad"+
		"\13\t\5\t\u00af\n\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00b7\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0107\n\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0115\n\26\3\26\3\26\3\26\7\26"+
		"\u011a\n\26\f\26\16\26\u011d\13\26\3\27\3\27\3\30\3\30\3\30\2\3*\31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\7\t\3\2\13\16\3"+
		"\2*+\2\u012a\2\62\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2"+
		"\fT\3\2\2\2\16\\\3\2\2\2\20\u00ae\3\2\2\2\22\u00b0\3\2\2\2\24\u00b6\3"+
		"\2\2\2\26\u00b8\3\2\2\2\30\u00bd\3\2\2\2\32\u00cf\3\2\2\2\34\u00e2\3\2"+
		"\2\2\36\u00e4\3\2\2\2 \u00ee\3\2\2\2\"\u00f4\3\2\2\2$\u00fc\3\2\2\2&\u0102"+
		"\3\2\2\2(\u0108\3\2\2\2*\u0114\3\2\2\2,\u011e\3\2\2\2.\u0120\3\2\2\2\60"+
		"\63\5\4\3\2\61\63\5\6\4\2\62\60\3\2\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66\67\5\b\5\2\678\7#\2\28>\3\2"+
		"\2\29:\5&\24\2:;\7#\2\2;>\3\2\2\2<>\5.\30\2=\66\3\2\2\2=9\3\2\2\2=<\3"+
		"\2\2\2>\5\3\2\2\2?@\7*\2\2@\7\3\2\2\2AK\5\n\6\2BK\5\f\7\2CK\5\16\b\2D"+
		"K\5\20\t\2EK\5\32\16\2FK\5\34\17\2GK\5\36\20\2HK\5 \21\2IK\5\"\22\2JA"+
		"\3\2\2\2JB\3\2\2\2JC\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2J"+
		"H\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LM\7\20\2\2MN\7 \2\2NO\7%\2\2OP\7\37\2\2"+
		"PQ\7$\2\2QR\7\37\2\2RS\7&\2\2S\13\3\2\2\2TU\7\21\2\2UV\7 \2\2VW\7%\2\2"+
		"WX\5,\27\2XY\7$\2\2YZ\5,\27\2Z[\7&\2\2[\r\3\2\2\2\\]\7\22\2\2]^\7 \2\2"+
		"^_\7%\2\2_`\5,\27\2`a\7$\2\2ab\5,\27\2bc\7&\2\2c\17\3\2\2\2de\7\23\2\2"+
		"ef\7 \2\2fg\7%\2\2gh\5,\27\2hi\7$\2\2ij\5,\27\2jk\7$\2\2kl\5,\27\2lq\7"+
		"&\2\2mn\7\17\2\2np\5\24\13\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r"+
		"\u00af\3\2\2\2sq\3\2\2\2tu\7\23\2\2uv\7 \2\2vw\7%\2\2wx\5\22\n\2xy\7$"+
		"\2\2yz\5\22\n\2z{\7$\2\2{|\5\22\n\2|\u0081\7&\2\2}~\7\17\2\2~\u0080\5"+
		"\24\13\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u00af\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\23\2\2"+
		"\u0085\u0086\7 \2\2\u0086\u0087\7%\2\2\u0087\u0088\7\37\2\2\u0088\u0089"+
		"\7$\2\2\u0089\u008a\7\37\2\2\u008a\u008b\7$\2\2\u008b\u008c\7\37\2\2\u008c"+
		"\u0091\7&\2\2\u008d\u008e\7\17\2\2\u008e\u0090\5\24\13\2\u008f\u008d\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u00af\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\24\2\2\u0095\u0096\7"+
		" \2\2\u0096\u0097\7%\2\2\u0097\u0098\7\37\2\2\u0098\u009d\7&\2\2\u0099"+
		"\u009a\7\17\2\2\u009a\u009c\5\24\13\2\u009b\u0099\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00af\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\7%"+
		"\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\7\37\2\2\u00a6"+
		"\u00ab\7&\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00aa\5\24\13\2\u00a9\u00a7\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00aed\3\2\2\2\u00aet\3\2\2\2\u00ae"+
		"\u0084\3\2\2\2\u00ae\u0094\3\2\2\2\u00ae\u00a0\3\2\2\2\u00af\21\3\2\2"+
		"\2\u00b0\u00b1\7 \2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b3\7\37\2\2\u00b3\23"+
		"\3\2\2\2\u00b4\u00b7\5\26\f\2\u00b5\u00b7\5\30\r\2\u00b6\u00b4\3\2\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba"+
		"\7%\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7&\2\2\u00bc\27\3\2\2\2\u00bd\u00be"+
		"\7\35\2\2\u00be\u00bf\7%\2\2\u00bf\u00c0\7 \2\2\u00c0\u00c1\7$\2\2\u00c1"+
		"\u00c2\7\37\2\2\u00c2\u00c3\7&\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\26\2"+
		"\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\7\37\2\2\u00c8\u00d0"+
		"\7&\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7\4\2\2\u00cc"+
		"\u00cd\7\n\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00d0\7#\2\2\u00cf\u00c4\3\2"+
		"\2\2\u00cf\u00c9\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00d3"+
		"\7 \2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\7$\2\2\u00d6"+
		"\u00d7\7\37\2\2\u00d7\u00e3\7&\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da\7"+
		" \2\2\u00da\u00db\7\5\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\7\37\2\2\u00dd"+
		"\u00de\7$\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\7\37"+
		"\2\2\u00e1\u00e3\7#\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d8\3\2\2\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\7%\2\2"+
		"\u00e7\u00e8\7\37\2\2\u00e8\u00e9\7$\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb"+
		"\7$\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\7&\2\2\u00ed\37\3\2\2\2\u00ee"+
		"\u00ef\7\31\2\2\u00ef\u00f0\7 \2\2\u00f0\u00f1\7%\2\2\u00f1\u00f2\7\37"+
		"\2\2\u00f2\u00f3\7&\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f6"+
		"\7 \2\2\u00f6\u00f7\7%\2\2\u00f7\u00f8\7\37\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"\u00fa\7\37\2\2\u00fa\u00fb\7&\2\2\u00fb#\3\2\2\2\u00fc\u00fd\7\33\2\2"+
		"\u00fd\u00fe\7 \2\2\u00fe\u00ff\7%\2\2\u00ff\u0100\7\37\2\2\u0100\u0101"+
		"\7&\2\2\u0101%\3\2\2\2\u0102\u0103\5(\25\2\u0103\u0106\7 \2\2\u0104\u0105"+
		"\7\n\2\2\u0105\u0107\5*\26\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\'\3\2\2\2\u0108\u0109\t\2\2\2\u0109)\3\2\2\2\u010a\u010b\b\26\1\2\u010b"+
		"\u0115\7\37\2\2\u010c\u0115\7\'\2\2\u010d\u0115\7(\2\2\u010e\u0115\7)"+
		"\2\2\u010f\u0115\7 \2\2\u0110\u0111\7%\2\2\u0111\u0112\5*\26\2\u0112\u0113"+
		"\7&\2\2\u0113\u0115\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010c\3\2\2\2\u0114"+
		"\u010d\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2"+
		"\2\2\u0115\u011b\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\t\3\2\2\u0118"+
		"\u011a\5*\26\5\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c+\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f"+
		"\7 \2\2\u011f-\3\2\2\2\u0120\u0121\t\4\2\2\u0121/\3\2\2\2\22\62\64=Jq"+
		"\u0081\u0091\u009d\u00ab\u00ae\u00b6\u00cf\u00e2\u0106\u0114\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}