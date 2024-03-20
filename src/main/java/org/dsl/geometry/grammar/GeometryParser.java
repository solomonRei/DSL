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
		FALSE=42, STRING=43, COMMENT=44, ML_COMMENT=45, FOR=46, WHILE=47, IF=48, 
		ELSE=49, LBRACE=50, RBRACE=51;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_functionCallStatement = 2, 
		RULE_commentStatement = 3, RULE_functionCall = 4, RULE_functionDeclaration = 5, 
		RULE_loopStatement = 6, RULE_forLoop = 7, RULE_whileLoop = 8, RULE_forInit = 9, 
		RULE_forCondition = 10, RULE_forUpdate = 11, RULE_ifElseStatement = 12, 
		RULE_figureDeclaration = 13, RULE_areaCall = 14, RULE_perimeterCall = 15, 
		RULE_diagonalCall = 16, RULE_pointDeclaration = 17, RULE_lineDeclaration = 18, 
		RULE_segmentDeclaration = 19, RULE_triangleDeclaration = 20, RULE_aliasVertex = 21, 
		RULE_triangleProperty = 22, RULE_bisectorDeclaration = 23, RULE_angleDeclaration = 24, 
		RULE_heightDeclaration = 25, RULE_squareDeclaration = 26, RULE_rectangleDeclaration = 27, 
		RULE_parallelogramDeclaration = 28, RULE_circleDeclaration = 29, RULE_ellipseDeclaration = 30, 
		RULE_rhombusDeclaration = 31, RULE_variableDeclaration = 32, RULE_type = 33, 
		RULE_expression = 34, RULE_point = 35, RULE_comment = 36;
	public static final String[] ruleNames = {
		"program", "statement", "functionCallStatement", "commentStatement", "functionCall", 
		"functionDeclaration", "loopStatement", "forLoop", "whileLoop", "forInit", 
		"forCondition", "forUpdate", "ifElseStatement", "figureDeclaration", "areaCall", 
		"perimeterCall", "diagonalCall", "pointDeclaration", "lineDeclaration", 
		"segmentDeclaration", "triangleDeclaration", "aliasVertex", "triangleProperty", 
		"bisectorDeclaration", "angleDeclaration", "heightDeclaration", "squareDeclaration", 
		"rectangleDeclaration", "parallelogramDeclaration", "circleDeclaration", 
		"ellipseDeclaration", "rhombusDeclaration", "variableDeclaration", "type", 
		"expression", "point", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'area'", "'perimeter'", "'diagonal'", "':'", "'side'", "'width'", 
		"'height'", "'num'", "'bool'", "'string'", "'='", "'+'", "'-'", "'*'", 
		"'/'", "'->'", "'Point'", "'Line'", "'Segment'", "'Triangle'", "'Height'", 
		"'EquilateralTriangle'", "'IsoscelesTriangle'", "'Square'", "'Rectangle'", 
		"'Parallelogram'", "'Circle'", "'Ellipse'", "'Rhombus'", "'bisector'", 
		"'Angle'", "'Vertex'", null, null, null, null, "';'", "','", "'('", "')'", 
		"'true'", "'false'", null, null, null, "'for'", "'while'", "'if'", "'else'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "EQUAL", 
		"PLUS", "MINUS", "MUL", "DIV", "ARROW", "POINT", "LINE", "SEGMENT", "TRIANGLE", 
		"HEIGHT", "EQUILATERAL_TRIANGLE", "ISOSCELES_TRIANGLE", "SQUARE", "RECTANGLE", 
		"PARALLELOGRAM", "CIRCLE", "ELLIPSE", "RHOMBUS", "BISECTOR", "ANGLE", 
		"VERTEX", "NUM", "ID", "ALIAS", "WS", "SEMICOLON", "COMMA", "LPAREN", 
		"RPAREN", "TRUE", "FALSE", "STRING", "COMMENT", "ML_COMMENT", "FOR", "WHILE", 
		"IF", "ELSE", "LBRACE", "RBRACE"
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
		public List<LoopStatementContext> loopStatement() {
			return getRuleContexts(LoopStatementContext.class);
		}
		public LoopStatementContext loopStatement(int i) {
			return getRuleContext(LoopStatementContext.class,i);
		}
		public List<IfElseStatementContext> ifElseStatement() {
			return getRuleContexts(IfElseStatementContext.class);
		}
		public IfElseStatementContext ifElseStatement(int i) {
			return getRuleContext(IfElseStatementContext.class,i);
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
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					statement();
					}
					break;
				case 2:
					{
					setState(75);
					commentStatement();
					}
					break;
				case 3:
					{
					setState(76);
					functionCallStatement();
					}
					break;
				case 4:
					{
					setState(77);
					loopStatement();
					}
					break;
				case 5:
					{
					setState(78);
					ifElseStatement();
					}
					break;
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << POINT) | (1L << LINE) | (1L << SEGMENT) | (1L << TRIANGLE) | (1L << EQUILATERAL_TRIANGLE) | (1L << ISOSCELES_TRIANGLE) | (1L << SQUARE) | (1L << RECTANGLE) | (1L << PARALLELOGRAM) | (1L << CIRCLE) | (1L << ELLIPSE) | (1L << ID) | (1L << COMMENT) | (1L << ML_COMMENT) | (1L << FOR) | (1L << WHILE) | (1L << IF))) != 0) );
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
			setState(90);
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
				setState(83);
				figureDeclaration();
				setState(84);
				match(SEMICOLON);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				variableDeclaration();
				setState(87);
				match(SEMICOLON);
				}
				break;
			case COMMENT:
			case ML_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
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
			setState(92);
			functionCall();
			setState(93);
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
			setState(95);
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
			setState(97);
			match(ID);
			setState(98);
			match(ARROW);
			setState(99);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				areaCall();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				perimeterCall();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopStatement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				whileLoop();
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GeometryParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GeometryParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GeometryParser.SEMICOLON, i);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GeometryParser.LBRACE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GeometryParser.RBRACE, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FOR);
			setState(111);
			match(LPAREN);
			setState(112);
			forInit();
			setState(113);
			match(SEMICOLON);
			setState(114);
			forCondition();
			setState(115);
			match(SEMICOLON);
			setState(116);
			forUpdate();
			setState(117);
			match(RPAREN);
			setState(118);
			match(LBRACE);
			setState(119);
			program();
			setState(120);
			match(RBRACE);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GeometryParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GeometryParser.LBRACE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GeometryParser.RBRACE, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WHILE);
			setState(123);
			match(LPAREN);
			setState(124);
			expression(0);
			setState(125);
			match(RPAREN);
			setState(126);
			match(LBRACE);
			setState(127);
			program();
			setState(128);
			match(RBRACE);
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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forInit);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				variableDeclaration();
				}
				break;
			case NUM:
			case ID:
			case LPAREN:
			case TRUE:
			case FALSE:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expression(0);
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

	public static class ForConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			expression(0);
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

	public static class IfElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GeometryParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GeometryParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GeometryParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GeometryParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GeometryParser.LBRACE, i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GeometryParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GeometryParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(GeometryParser.ELSE, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeometryListener ) ((GeometryListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeometryVisitor ) return ((GeometryVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			match(LPAREN);
			setState(140);
			expression(0);
			setState(141);
			match(RPAREN);
			setState(142);
			match(LBRACE);
			setState(143);
			program();
			setState(144);
			match(RBRACE);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(145);
				match(ELSE);
				setState(146);
				match(LBRACE);
				setState(147);
				program();
				setState(148);
				match(RBRACE);
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
		enterRule(_localctx, 26, RULE_figureDeclaration);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				lineDeclaration();
				}
				break;
			case SEGMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				segmentDeclaration();
				}
				break;
			case TRIANGLE:
			case EQUILATERAL_TRIANGLE:
			case ISOSCELES_TRIANGLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				triangleDeclaration();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				squareDeclaration();
				}
				break;
			case RECTANGLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				rectangleDeclaration();
				}
				break;
			case PARALLELOGRAM:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				parallelogramDeclaration();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				circleDeclaration();
				}
				break;
			case ELLIPSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
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
		enterRule(_localctx, 28, RULE_areaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__0);
			setState(164);
			match(LPAREN);
			setState(165);
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
		enterRule(_localctx, 30, RULE_perimeterCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__1);
			setState(168);
			match(LPAREN);
			setState(169);
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
		enterRule(_localctx, 32, RULE_diagonalCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__2);
			setState(172);
			match(LPAREN);
			setState(173);
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
		enterRule(_localctx, 34, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(POINT);
			setState(176);
			match(ID);
			setState(177);
			match(LPAREN);
			setState(178);
			match(NUM);
			setState(179);
			match(COMMA);
			setState(180);
			match(NUM);
			setState(181);
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
		enterRule(_localctx, 36, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LINE);
			setState(184);
			match(ID);
			setState(185);
			match(LPAREN);
			setState(186);
			point();
			setState(187);
			match(COMMA);
			setState(188);
			point();
			setState(189);
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
		enterRule(_localctx, 38, RULE_segmentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SEGMENT);
			setState(192);
			match(ID);
			setState(193);
			match(LPAREN);
			setState(194);
			point();
			setState(195);
			match(COMMA);
			setState(196);
			point();
			setState(197);
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
		enterRule(_localctx, 40, RULE_triangleDeclaration);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(TRIANGLE);
				setState(200);
				match(ID);
				setState(201);
				match(LPAREN);
				setState(202);
				point();
				setState(203);
				match(COMMA);
				setState(204);
				point();
				setState(205);
				match(COMMA);
				setState(206);
				point();
				setState(207);
				match(RPAREN);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(208);
					match(ARROW);
					setState(209);
					triangleProperty();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(TRIANGLE);
				setState(216);
				match(ID);
				setState(217);
				match(LPAREN);
				setState(218);
				aliasVertex();
				setState(219);
				match(COMMA);
				setState(220);
				aliasVertex();
				setState(221);
				match(COMMA);
				setState(222);
				aliasVertex();
				setState(223);
				match(RPAREN);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(224);
					match(ARROW);
					setState(225);
					triangleProperty();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(TRIANGLE);
				setState(232);
				match(ID);
				setState(233);
				match(LPAREN);
				setState(234);
				match(NUM);
				setState(235);
				match(COMMA);
				setState(236);
				match(NUM);
				setState(237);
				match(COMMA);
				setState(238);
				match(NUM);
				setState(239);
				match(RPAREN);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(240);
					match(ARROW);
					setState(241);
					triangleProperty();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(EQUILATERAL_TRIANGLE);
				setState(248);
				match(ID);
				setState(249);
				match(LPAREN);
				setState(250);
				match(NUM);
				setState(251);
				match(RPAREN);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(252);
					match(ARROW);
					setState(253);
					triangleProperty();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(ISOSCELES_TRIANGLE);
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
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(266);
					match(ARROW);
					setState(267);
					triangleProperty();
					}
					}
					setState(272);
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
		enterRule(_localctx, 42, RULE_aliasVertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(T__3);
			setState(277);
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
		enterRule(_localctx, 44, RULE_triangleProperty);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BISECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				bisectorDeclaration();
				}
				break;
			case ANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				angleDeclaration();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
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
		enterRule(_localctx, 46, RULE_bisectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(BISECTOR);
			setState(285);
			match(LPAREN);
			setState(286);
			match(ID);
			setState(287);
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
		enterRule(_localctx, 48, RULE_angleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ANGLE);
			setState(290);
			match(LPAREN);
			setState(291);
			match(ID);
			setState(292);
			match(COMMA);
			setState(293);
			match(NUM);
			setState(294);
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
		enterRule(_localctx, 50, RULE_heightDeclaration);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(HEIGHT);
				setState(297);
				match(LPAREN);
				setState(298);
				match(ID);
				setState(299);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(HEIGHT);
				setState(301);
				match(LPAREN);
				setState(302);
				match(ID);
				setState(303);
				match(COMMA);
				setState(304);
				match(NUM);
				setState(305);
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
		enterRule(_localctx, 52, RULE_squareDeclaration);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(SQUARE);
				setState(309);
				match(ID);
				setState(310);
				match(LPAREN);
				setState(311);
				match(NUM);
				setState(312);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(SQUARE);
				setState(314);
				match(ID);
				setState(315);
				match(T__4);
				setState(316);
				match(EQUAL);
				setState(317);
				match(NUM);
				setState(318);
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
		enterRule(_localctx, 54, RULE_rectangleDeclaration);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(RECTANGLE);
				setState(322);
				match(ID);
				setState(323);
				match(LPAREN);
				setState(324);
				match(NUM);
				setState(325);
				match(COMMA);
				setState(326);
				match(NUM);
				setState(327);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(RECTANGLE);
				setState(329);
				match(ID);
				setState(330);
				match(T__5);
				setState(331);
				match(EQUAL);
				setState(332);
				match(NUM);
				setState(333);
				match(COMMA);
				setState(334);
				match(T__6);
				setState(335);
				match(EQUAL);
				setState(336);
				match(NUM);
				setState(337);
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
		enterRule(_localctx, 56, RULE_parallelogramDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(PARALLELOGRAM);
			setState(341);
			match(ID);
			setState(342);
			match(LPAREN);
			setState(343);
			match(NUM);
			setState(344);
			match(COMMA);
			setState(345);
			match(NUM);
			setState(346);
			match(COMMA);
			setState(347);
			match(NUM);
			setState(348);
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
		enterRule(_localctx, 58, RULE_circleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(CIRCLE);
			setState(351);
			match(ID);
			setState(352);
			match(LPAREN);
			setState(353);
			match(NUM);
			setState(354);
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
		enterRule(_localctx, 60, RULE_ellipseDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ELLIPSE);
			setState(357);
			match(ID);
			setState(358);
			match(LPAREN);
			setState(359);
			match(NUM);
			setState(360);
			match(COMMA);
			setState(361);
			match(NUM);
			setState(362);
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
		enterRule(_localctx, 62, RULE_rhombusDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(RHOMBUS);
			setState(365);
			match(ID);
			setState(366);
			match(LPAREN);
			setState(367);
			match(NUM);
			setState(368);
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
		enterRule(_localctx, 64, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			type();
			setState(371);
			match(ID);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(372);
				match(EQUAL);
				setState(373);
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
		enterRule(_localctx, 66, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(379);
				match(NUM);
				}
				break;
			case TRUE:
				{
				setState(380);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(381);
				match(FALSE);
				}
				break;
			case STRING:
				{
				setState(382);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(383);
				match(ID);
				}
				break;
			case LPAREN:
				{
				setState(384);
				match(LPAREN);
				setState(385);
				expression(0);
				setState(386);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(390);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(391);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(392);
					expression(3);
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 70, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
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
		enterRule(_localctx, 72, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		case 34:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0195\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13"+
		"\u0087\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d5\n\26\f\26"+
		"\16\26\u00d8\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f5\n\26\f\26\16\26\u00f8\13\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u010f\n\26\f\26"+
		"\16\26\u0112\13\26\5\26\u0114\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u011d\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0135\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0142\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0155\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0179\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0187\n$\3$\3$\3$\7$\u018c\n$\f$\16$\u018f\13$\3%\3%\3&"+
		"\3&\3&\2\3F\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJ\2\5\3\2\n\f\3\2\16\21\3\2./\2\u0198\2Q\3\2\2\2\4\\\3\2\2"+
		"\2\6^\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fj\3\2\2\2\16n\3\2\2\2\20p\3\2\2\2"+
		"\22|\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2\2\32\u008c"+
		"\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00a9\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00b9\3\2\2\2(\u00c1\3\2\2\2*\u0113\3\2\2\2,\u0115"+
		"\3\2\2\2.\u011c\3\2\2\2\60\u011e\3\2\2\2\62\u0123\3\2\2\2\64\u0134\3\2"+
		"\2\2\66\u0141\3\2\2\28\u0154\3\2\2\2:\u0156\3\2\2\2<\u0160\3\2\2\2>\u0166"+
		"\3\2\2\2@\u016e\3\2\2\2B\u0174\3\2\2\2D\u017a\3\2\2\2F\u0186\3\2\2\2H"+
		"\u0190\3\2\2\2J\u0192\3\2\2\2LR\5\4\3\2MR\5\b\5\2NR\5\6\4\2OR\5\16\b\2"+
		"PR\5\32\16\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\3\3\2\2\2UV\5\34\17\2VW\7\'\2\2W]\3\2\2\2XY\5"+
		"B\"\2YZ\7\'\2\2Z]\3\2\2\2[]\5J&\2\\U\3\2\2\2\\X\3\2\2\2\\[\3\2\2\2]\5"+
		"\3\2\2\2^_\5\n\6\2_`\7\'\2\2`\7\3\2\2\2ab\7.\2\2b\t\3\2\2\2cd\7$\2\2d"+
		"e\7\22\2\2ef\5\f\7\2f\13\3\2\2\2gk\5\36\20\2hk\5 \21\2ik\5\"\22\2jg\3"+
		"\2\2\2jh\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lo\5\20\t\2mo\5\22\n\2nl\3\2\2\2"+
		"nm\3\2\2\2o\17\3\2\2\2pq\7\60\2\2qr\7)\2\2rs\5\24\13\2st\7\'\2\2tu\5\26"+
		"\f\2uv\7\'\2\2vw\5\30\r\2wx\7*\2\2xy\7\64\2\2yz\5\2\2\2z{\7\65\2\2{\21"+
		"\3\2\2\2|}\7\61\2\2}~\7)\2\2~\177\5F$\2\177\u0080\7*\2\2\u0080\u0081\7"+
		"\64\2\2\u0081\u0082\5\2\2\2\u0082\u0083\7\65\2\2\u0083\23\3\2\2\2\u0084"+
		"\u0087\5B\"\2\u0085\u0087\5F$\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2"+
		"\2\u0087\25\3\2\2\2\u0088\u0089\5F$\2\u0089\27\3\2\2\2\u008a\u008b\5F"+
		"$\2\u008b\31\3\2\2\2\u008c\u008d\7\62\2\2\u008d\u008e\7)\2\2\u008e\u008f"+
		"\5F$\2\u008f\u0090\7*\2\2\u0090\u0091\7\64\2\2\u0091\u0092\5\2\2\2\u0092"+
		"\u0098\7\65\2\2\u0093\u0094\7\63\2\2\u0094\u0095\7\64\2\2\u0095\u0096"+
		"\5\2\2\2\u0096\u0097\7\65\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\33\3\2\2\2\u009a\u00a4\5$\23\2\u009b\u00a4"+
		"\5&\24\2\u009c\u00a4\5(\25\2\u009d\u00a4\5*\26\2\u009e\u00a4\5\66\34\2"+
		"\u009f\u00a4\58\35\2\u00a0\u00a4\5:\36\2\u00a1\u00a4\5<\37\2\u00a2\u00a4"+
		"\5> \2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6"+
		"\7\3\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7*\2\2\u00a8\37\3\2\2\2\u00a9"+
		"\u00aa\7\4\2\2\u00aa\u00ab\7)\2\2\u00ab\u00ac\7*\2\2\u00ac!\3\2\2\2\u00ad"+
		"\u00ae\7\5\2\2\u00ae\u00af\7)\2\2\u00af\u00b0\7*\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\7\23\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\7#\2"+
		"\2\u00b5\u00b6\7(\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7*\2\2\u00b8%\3\2"+
		"\2\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\7)\2\2\u00bc"+
		"\u00bd\5H%\2\u00bd\u00be\7(\2\2\u00be\u00bf\5H%\2\u00bf\u00c0\7*\2\2\u00c0"+
		"\'\3\2\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\7)\2\2"+
		"\u00c4\u00c5\5H%\2\u00c5\u00c6\7(\2\2\u00c6\u00c7\5H%\2\u00c7\u00c8\7"+
		"*\2\2\u00c8)\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7$\2\2\u00cb\u00cc"+
		"\7)\2\2\u00cc\u00cd\5H%\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\5H%\2\u00cf\u00d0"+
		"\7(\2\2\u00d0\u00d1\5H%\2\u00d1\u00d6\7*\2\2\u00d2\u00d3\7\22\2\2\u00d3"+
		"\u00d5\5.\30\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u0114\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00da\7\26\2\2\u00da\u00db\7$\2\2\u00db\u00dc\7)\2\2\u00dc\u00dd\5,\27"+
		"\2\u00dd\u00de\7(\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7(\2\2\u00e0\u00e1"+
		"\5,\27\2\u00e1\u00e6\7*\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e5\5.\30\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u0114\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\26\2\2\u00ea"+
		"\u00eb\7$\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7(\2\2"+
		"\u00ee\u00ef\7#\2\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f6"+
		"\7*\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f5\5.\30\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0114\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\u00fb\7$\2\2\u00fb"+
		"\u00fc\7)\2\2\u00fc\u00fd\7#\2\2\u00fd\u0102\7*\2\2\u00fe\u00ff\7\22\2"+
		"\2\u00ff\u0101\5.\30\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0114\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7\31\2\2\u0106\u0107\7$\2\2\u0107\u0108\7)\2\2\u0108\u0109\7#\2"+
		"\2\u0109\u010a\7(\2\2\u010a\u010b\7#\2\2\u010b\u0110\7*\2\2\u010c\u010d"+
		"\7\22\2\2\u010d\u010f\5.\30\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u00c9\3\2\2\2\u0113\u00d9\3\2\2\2\u0113\u00e9\3\2\2\2\u0113"+
		"\u00f9\3\2\2\2\u0113\u0105\3\2\2\2\u0114+\3\2\2\2\u0115\u0116\7$\2\2\u0116"+
		"\u0117\7\6\2\2\u0117\u0118\7#\2\2\u0118-\3\2\2\2\u0119\u011d\5\60\31\2"+
		"\u011a\u011d\5\62\32\2\u011b\u011d\5\64\33\2\u011c\u0119\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d/\3\2\2\2\u011e\u011f\7 \2\2\u011f"+
		"\u0120\7)\2\2\u0120\u0121\7$\2\2\u0121\u0122\7*\2\2\u0122\61\3\2\2\2\u0123"+
		"\u0124\7!\2\2\u0124\u0125\7)\2\2\u0125\u0126\7$\2\2\u0126\u0127\7(\2\2"+
		"\u0127\u0128\7#\2\2\u0128\u0129\7*\2\2\u0129\63\3\2\2\2\u012a\u012b\7"+
		"\27\2\2\u012b\u012c\7)\2\2\u012c\u012d\7$\2\2\u012d\u0135\7*\2\2\u012e"+
		"\u012f\7\27\2\2\u012f\u0130\7)\2\2\u0130\u0131\7$\2\2\u0131\u0132\7(\2"+
		"\2\u0132\u0133\7#\2\2\u0133\u0135\7*\2\2\u0134\u012a\3\2\2\2\u0134\u012e"+
		"\3\2\2\2\u0135\65\3\2\2\2\u0136\u0137\7\32\2\2\u0137\u0138\7$\2\2\u0138"+
		"\u0139\7)\2\2\u0139\u013a\7#\2\2\u013a\u0142\7*\2\2\u013b\u013c\7\32\2"+
		"\2\u013c\u013d\7$\2\2\u013d\u013e\7\7\2\2\u013e\u013f\7\r\2\2\u013f\u0140"+
		"\7#\2\2\u0140\u0142\7\'\2\2\u0141\u0136\3\2\2\2\u0141\u013b\3\2\2\2\u0142"+
		"\67\3\2\2\2\u0143\u0144\7\33\2\2\u0144\u0145\7$\2\2\u0145\u0146\7)\2\2"+
		"\u0146\u0147\7#\2\2\u0147\u0148\7(\2\2\u0148\u0149\7#\2\2\u0149\u0155"+
		"\7*\2\2\u014a\u014b\7\33\2\2\u014b\u014c\7$\2\2\u014c\u014d\7\b\2\2\u014d"+
		"\u014e\7\r\2\2\u014e\u014f\7#\2\2\u014f\u0150\7(\2\2\u0150\u0151\7\t\2"+
		"\2\u0151\u0152\7\r\2\2\u0152\u0153\7#\2\2\u0153\u0155\7\'\2\2\u0154\u0143"+
		"\3\2\2\2\u0154\u014a\3\2\2\2\u01559\3\2\2\2\u0156\u0157\7\34\2\2\u0157"+
		"\u0158\7$\2\2\u0158\u0159\7)\2\2\u0159\u015a\7#\2\2\u015a\u015b\7(\2\2"+
		"\u015b\u015c\7#\2\2\u015c\u015d\7(\2\2\u015d\u015e\7#\2\2\u015e\u015f"+
		"\7*\2\2\u015f;\3\2\2\2\u0160\u0161\7\35\2\2\u0161\u0162\7$\2\2\u0162\u0163"+
		"\7)\2\2\u0163\u0164\7#\2\2\u0164\u0165\7*\2\2\u0165=\3\2\2\2\u0166\u0167"+
		"\7\36\2\2\u0167\u0168\7$\2\2\u0168\u0169\7)\2\2\u0169\u016a\7#\2\2\u016a"+
		"\u016b\7(\2\2\u016b\u016c\7#\2\2\u016c\u016d\7*\2\2\u016d?\3\2\2\2\u016e"+
		"\u016f\7\37\2\2\u016f\u0170\7$\2\2\u0170\u0171\7)\2\2\u0171\u0172\7#\2"+
		"\2\u0172\u0173\7*\2\2\u0173A\3\2\2\2\u0174\u0175\5D#\2\u0175\u0178\7$"+
		"\2\2\u0176\u0177\7\r\2\2\u0177\u0179\5F$\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179C\3\2\2\2\u017a\u017b\t\2\2\2\u017bE\3\2\2\2\u017c\u017d"+
		"\b$\1\2\u017d\u0187\7#\2\2\u017e\u0187\7+\2\2\u017f\u0187\7,\2\2\u0180"+
		"\u0187\7-\2\2\u0181\u0187\7$\2\2\u0182\u0183\7)\2\2\u0183\u0184\5F$\2"+
		"\u0184\u0185\7*\2\2\u0185\u0187\3\2\2\2\u0186\u017c\3\2\2\2\u0186\u017e"+
		"\3\2\2\2\u0186\u017f\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0181\3\2\2\2\u0186"+
		"\u0182\3\2\2\2\u0187\u018d\3\2\2\2\u0188\u0189\f\4\2\2\u0189\u018a\t\3"+
		"\2\2\u018a\u018c\5F$\5\u018b\u0188\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018d\u018e\3\2\2\2\u018eG\3\2\2\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0191\7$\2\2\u0191I\3\2\2\2\u0192\u0193\t\4\2\2\u0193K\3\2\2\2\27QS\\"+
		"jn\u0086\u0098\u00a3\u00d6\u00e6\u00f6\u0102\u0110\u0113\u011c\u0134\u0141"+
		"\u0154\u0178\u0186\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}