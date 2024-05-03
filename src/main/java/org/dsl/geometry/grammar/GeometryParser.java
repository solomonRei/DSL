// Generated from org\dsl\geometry\grammar\Geometry.g4 by ANTLR 4.7.1
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

    static {
        RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;

    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();

    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, EQUAL = 22, PLUS = 23, MINUS = 24, MUL = 25,
            DIV = 26, PERCENT = 27, ARROW = 28, FOR = 29, WHILE = 30, IF = 31, ELSE = 32, POINT = 33,
            LINE = 34, SEGMENT = 35, TRIANGLE = 36, HEIGHT = 37, EQUILATERAL_TRIANGLE = 38,
            ISOSCELES_TRIANGLE = 39, SQUARE = 40, RECTANGLE = 41, PARALLELOGRAM = 42, CIRCLE = 43,
            ELLIPSE = 44, RHOMBUS = 45, BISECTOR = 46, ANGLE = 47, VERTEX = 48, STRING = 49, LBRACE = 50,
            RBRACE = 51, SEMICOLON = 52, COMMA = 53, LPAREN = 54, RPAREN = 55, TRUE = 56, FALSE = 57,
            LT = 58, LE = 59, GT = 60, GE = 61, EQ = 62, NEQ = 63, INCREMENT = 64, DECREMENT = 65,
            NUM = 66, ID = 67, ALIAS = 68, WS = 69, COMMENT = 70, ML_COMMENT = 71;

    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_functionCallStatement = 2,
            RULE_commentStatement = 3, RULE_functionCall = 4, RULE_functionDeclaration = 5,
            RULE_loopStatement = 6, RULE_forLoop = 7, RULE_whileLoop = 8, RULE_forInit = 9,
            RULE_forCondition = 10, RULE_forUpdate = 11, RULE_ifElseStatement = 12,
            RULE_figureDeclaration = 13, RULE_areaCall = 14, RULE_perimeterCall = 15,
            RULE_diagonalCall = 16, RULE_areaTriangleCall = 17, RULE_areaCircleCall = 18,
            RULE_areaSquareCall = 19, RULE_areaRectangleCall = 20, RULE_perimeterTriangleCall = 21,
            RULE_perimeterCircleCall = 22, RULE_perimeterSquareCall = 23, RULE_perimeterRectangleCall = 24,
            RULE_pointDeclaration = 25, RULE_lineDeclaration = 26, RULE_segmentDeclaration = 27,
            RULE_triangleDeclaration = 28, RULE_aliasVertex = 29, RULE_triangleProperty = 30,
            RULE_bisectorDeclaration = 31, RULE_angleDeclaration = 32, RULE_heightDeclaration = 33,
            RULE_squareDeclaration = 34, RULE_rectangleDeclaration = 35, RULE_parallelogramDeclaration = 36,
            RULE_circleDeclaration = 37, RULE_ellipseDeclaration = 38, RULE_variableDeclaration = 39,
            RULE_type = 40, RULE_expression = 41, RULE_point = 42, RULE_comment = 43;

    public static final String[] ruleNames = {
            "program", "statement", "functionCallStatement", "commentStatement", "functionCall",
            "functionDeclaration", "loopStatement", "forLoop", "whileLoop", "forInit",
            "forCondition", "forUpdate", "ifElseStatement", "figureDeclaration", "areaCall",
            "perimeterCall", "diagonalCall", "areaTriangleCall", "areaCircleCall",
            "areaSquareCall", "areaRectangleCall", "perimeterTriangleCall", "perimeterCircleCall",
            "perimeterSquareCall", "perimeterRectangleCall", "pointDeclaration", "lineDeclaration",
            "segmentDeclaration", "triangleDeclaration", "aliasVertex", "triangleProperty",
            "bisectorDeclaration", "angleDeclaration", "heightDeclaration", "squareDeclaration",
            "rectangleDeclaration", "parallelogramDeclaration", "circleDeclaration",
            "ellipseDeclaration", "variableDeclaration", "type", "expression", "point",
            "comment"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'area'", "'perimeter'", "'diagonal'", "'areaTriangle'", "'areaCircle'",
            "'areaSquare'", "'areaRectangle'", "'perimeterTriangle'", "'perimeterCircle'",
            "'perimeterSquare'", "'perimeterRectangle'", "':'", "'side'", "'width'",
            "'height'", "'radius'", "'center'", "'num'", "'bool'", "'string'", "'int'",
            "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'->'", "'for'", "'while'",
            "'if'", "'else'", "'Point'", "'Line'", "'Segment'", "'Triangle'", "'Height'",
            "'EquilateralTriangle'", "'IsoscelesTriangle'", "'Square'", "'Rectangle'",
            "'Parallelogram'", "'Circle'", "'Ellipse'", "'Rhombus'", "'bisector'",
            "'Angle'", "'Vertex'", null, "'{'", "'}'", "';'", "','", "'('", "')'",
            "'true'", "'false'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'++'",
            "'--'"
    };

    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, "EQUAL", "PLUS",
            "MINUS", "MUL", "DIV", "PERCENT", "ARROW", "FOR", "WHILE", "IF", "ELSE",
            "POINT", "LINE", "SEGMENT", "TRIANGLE", "HEIGHT", "EQUILATERAL_TRIANGLE",
            "ISOSCELES_TRIANGLE", "SQUARE", "RECTANGLE", "PARALLELOGRAM", "CIRCLE",
            "ELLIPSE", "RHOMBUS", "BISECTOR", "ANGLE", "VERTEX", "STRING", "LBRACE",
            "RBRACE", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "TRUE", "FALSE", "LT",
            "LE", "GT", "GE", "EQ", "NEQ", "INCREMENT", "DECREMENT", "NUM", "ID",
            "ALIAS", "WS", "COMMENT", "ML_COMMENT"
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
    public String getGrammarFileName() {
        return "Geometry.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public GeometryParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ProgramContext extends ParserRuleContext {

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<CommentStatementContext> commentStatement() {
            return getRuleContexts(CommentStatementContext.class);
        }

        public CommentStatementContext commentStatement(int i) {
            return getRuleContext(CommentStatementContext.class, i);
        }

        public List<FunctionCallStatementContext> functionCallStatement() {
            return getRuleContexts(FunctionCallStatementContext.class);
        }

        public FunctionCallStatementContext functionCallStatement(int i) {
            return getRuleContext(FunctionCallStatementContext.class, i);
        }

        public List<LoopStatementContext> loopStatement() {
            return getRuleContexts(LoopStatementContext.class);
        }

        public LoopStatementContext loopStatement(int i) {
            return getRuleContext(LoopStatementContext.class, i);
        }

        public List<IfElseStatementContext> ifElseStatement() {
            return getRuleContexts(IfElseStatementContext.class);
        }

        public IfElseStatementContext ifElseStatement(int i) {
            return getRuleContext(IfElseStatementContext.class, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitProgram(this);
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
                setState(93);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(93);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(88);
                                statement();
                            }
                            break;
                            case 2: {
                                setState(89);
                                commentStatement();
                            }
                            break;
                            case 3: {
                                setState(90);
                                functionCallStatement();
                            }
                            break;
                            case 4: {
                                setState(91);
                                loopStatement();
                            }
                            break;
                            case 5: {
                                setState(92);
                                ifElseStatement();
                            }
                            break;
                        }
                    }
                    setState(95);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__18 - 18)) | (1L << (T__19 - 18)) | (1L << (T__20 - 18)) | (1L << (FOR - 18)) | (1L << (WHILE - 18)) | (1L << (IF - 18)) | (1L << (POINT - 18)) | (1L << (LINE - 18)) | (1L << (SEGMENT - 18)) | (1L << (TRIANGLE - 18)) | (1L << (EQUILATERAL_TRIANGLE - 18)) | (1L << (ISOSCELES_TRIANGLE - 18)) | (1L << (SQUARE - 18)) | (1L << (RECTANGLE - 18)) | (1L << (PARALLELOGRAM - 18)) | (1L << (CIRCLE - 18)) | (1L << (ELLIPSE - 18)) | (1L << (STRING - 18)) | (1L << (LPAREN - 18)) | (1L << (TRUE - 18)) | (1L << (FALSE - 18)) | (1L << (NUM - 18)) | (1L << (ID - 18)) | (1L << (COMMENT - 18)) | (1L << (ML_COMMENT - 18)))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {

        public FigureDeclarationContext figureDeclaration() {
            return getRuleContext(FigureDeclarationContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GeometryParser.SEMICOLON, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(107);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(97);
                    figureDeclaration();
                    setState(98);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(100);
                    variableDeclaration();
                    setState(101);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(103);
                    expression(0);
                    setState(104);
                    match(SEMICOLON);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(106);
                    comment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionCallStatementContext extends ParserRuleContext {

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GeometryParser.SEMICOLON, 0);
        }

        public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCallStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterFunctionCallStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitFunctionCallStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitFunctionCallStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
        FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_functionCallStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                functionCall();
                setState(110);
                match(SEMICOLON);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommentStatementContext extends ParserRuleContext {

        public TerminalNode COMMENT() {
            return getToken(GeometryParser.COMMENT, 0);
        }

        public CommentStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_commentStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterCommentStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitCommentStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitCommentStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CommentStatementContext commentStatement() throws RecognitionException {
        CommentStatementContext _localctx = new CommentStatementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_commentStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                match(COMMENT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionCallContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode ARROW() {
            return getToken(GeometryParser.ARROW, 0);
        }

        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class, 0);
        }

        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_functionCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);
                match(ID);
                setState(115);
                match(ARROW);
                setState(116);
                functionDeclaration();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FunctionDeclarationContext extends ParserRuleContext {

        public AreaCallContext areaCall() {
            return getRuleContext(AreaCallContext.class, 0);
        }

        public PerimeterCallContext perimeterCall() {
            return getRuleContext(PerimeterCallContext.class, 0);
        }

        public DiagonalCallContext diagonalCall() {
            return getRuleContext(DiagonalCallContext.class, 0);
        }

        public AreaTriangleCallContext areaTriangleCall() {
            return getRuleContext(AreaTriangleCallContext.class, 0);
        }

        public AreaCircleCallContext areaCircleCall() {
            return getRuleContext(AreaCircleCallContext.class, 0);
        }

        public AreaSquareCallContext areaSquareCall() {
            return getRuleContext(AreaSquareCallContext.class, 0);
        }

        public AreaRectangleCallContext areaRectangleCall() {
            return getRuleContext(AreaRectangleCallContext.class, 0);
        }

        public PerimeterTriangleCallContext perimeterTriangleCall() {
            return getRuleContext(PerimeterTriangleCallContext.class, 0);
        }

        public PerimeterCircleCallContext perimeterCircleCall() {
            return getRuleContext(PerimeterCircleCallContext.class, 0);
        }

        public PerimeterSquareCallContext perimeterSquareCall() {
            return getRuleContext(PerimeterSquareCallContext.class, 0);
        }

        public PerimeterRectangleCallContext perimeterRectangleCall() {
            return getRuleContext(PerimeterRectangleCallContext.class, 0);
        }

        public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterFunctionDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitFunctionDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitFunctionDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
        FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_functionDeclaration);
        try {
            setState(129);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__0:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(118);
                    areaCall();
                }
                break;
                case T__1:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(119);
                    perimeterCall();
                }
                break;
                case T__2:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(120);
                    diagonalCall();
                }
                break;
                case T__3:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(121);
                    areaTriangleCall();
                }
                break;
                case T__4:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(122);
                    areaCircleCall();
                }
                break;
                case T__5:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(123);
                    areaSquareCall();
                }
                break;
                case T__6:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(124);
                    areaRectangleCall();
                }
                break;
                case T__7:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(125);
                    perimeterTriangleCall();
                }
                break;
                case T__8:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(126);
                    perimeterCircleCall();
                }
                break;
                case T__9:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(127);
                    perimeterSquareCall();
                }
                break;
                case T__10:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(128);
                    perimeterRectangleCall();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LoopStatementContext extends ParserRuleContext {

        public ForLoopContext forLoop() {
            return getRuleContext(ForLoopContext.class, 0);
        }

        public WhileLoopContext whileLoop() {
            return getRuleContext(WhileLoopContext.class, 0);
        }

        public LoopStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_loopStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterLoopStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitLoopStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitLoopStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LoopStatementContext loopStatement() throws RecognitionException {
        LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_loopStatement);
        try {
            setState(133);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case FOR:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(131);
                    forLoop();
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(132);
                    whileLoop();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForLoopContext extends ParserRuleContext {

        public TerminalNode FOR() {
            return getToken(GeometryParser.FOR, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ForInitContext forInit() {
            return getRuleContext(ForInitContext.class, 0);
        }

        public List<TerminalNode> SEMICOLON() {
            return getTokens(GeometryParser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i) {
            return getToken(GeometryParser.SEMICOLON, i);
        }

        public ForConditionContext forCondition() {
            return getRuleContext(ForConditionContext.class, 0);
        }

        public ForUpdateContext forUpdate() {
            return getRuleContext(ForUpdateContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(GeometryParser.LBRACE, 0);
        }

        public ProgramContext program() {
            return getRuleContext(ProgramContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(GeometryParser.RBRACE, 0);
        }

        public ForLoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forLoop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterForLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitForLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitForLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ForLoopContext forLoop() throws RecognitionException {
        ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_forLoop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                match(FOR);
                setState(136);
                match(LPAREN);
                setState(137);
                forInit();
                setState(138);
                match(SEMICOLON);
                setState(139);
                forCondition();
                setState(140);
                match(SEMICOLON);
                setState(141);
                forUpdate();
                setState(142);
                match(RPAREN);
                setState(143);
                match(LBRACE);
                setState(144);
                program();
                setState(145);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhileLoopContext extends ParserRuleContext {

        public TerminalNode WHILE() {
            return getToken(GeometryParser.WHILE, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public TerminalNode LBRACE() {
            return getToken(GeometryParser.LBRACE, 0);
        }

        public ProgramContext program() {
            return getRuleContext(ProgramContext.class, 0);
        }

        public TerminalNode RBRACE() {
            return getToken(GeometryParser.RBRACE, 0);
        }

        public WhileLoopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileLoop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterWhileLoop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitWhileLoop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitWhileLoop(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhileLoopContext whileLoop() throws RecognitionException {
        WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_whileLoop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                match(WHILE);
                setState(148);
                match(LPAREN);
                setState(149);
                expression(0);
                setState(150);
                match(RPAREN);
                setState(151);
                match(LBRACE);
                setState(152);
                program();
                setState(153);
                match(RBRACE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForInitContext extends ParserRuleContext {

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ForInitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forInit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterForInit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitForInit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitForInit(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ForInitContext forInit() throws RecognitionException {
        ForInitContext _localctx = new ForInitContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_forInit);
        try {
            setState(157);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(155);
                    variableDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(156);
                    expression(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForConditionContext extends ParserRuleContext {

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ForConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forCondition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterForCondition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitForCondition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitForCondition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ForConditionContext forCondition() throws RecognitionException {
        ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_forCondition);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForUpdateContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode INCREMENT() {
            return getToken(GeometryParser.INCREMENT, 0);
        }

        public TerminalNode DECREMENT() {
            return getToken(GeometryParser.DECREMENT, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ForUpdateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forUpdate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterForUpdate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitForUpdate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitForUpdate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ForUpdateContext forUpdate() throws RecognitionException {
        ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_forUpdate);
        int _la;
        try {
            setState(164);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(161);
                    match(ID);
                    setState(162);
                    _la = _input.LA(1);
                    if (!(_la == INCREMENT || _la == DECREMENT)) {
                        _errHandler.recoverInline(this);
                    } else {
                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                        _errHandler.reportMatch(this);
                        consume();
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(163);
                    expression(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfElseStatementContext extends ParserRuleContext {

        public TerminalNode IF() {
            return getToken(GeometryParser.IF, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public List<TerminalNode> LBRACE() {
            return getTokens(GeometryParser.LBRACE);
        }

        public TerminalNode LBRACE(int i) {
            return getToken(GeometryParser.LBRACE, i);
        }

        public List<ProgramContext> program() {
            return getRuleContexts(ProgramContext.class);
        }

        public ProgramContext program(int i) {
            return getRuleContext(ProgramContext.class, i);
        }

        public List<TerminalNode> RBRACE() {
            return getTokens(GeometryParser.RBRACE);
        }

        public TerminalNode RBRACE(int i) {
            return getToken(GeometryParser.RBRACE, i);
        }

        public TerminalNode ELSE() {
            return getToken(GeometryParser.ELSE, 0);
        }

        public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifElseStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterIfElseStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitIfElseStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitIfElseStatement(this);
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
                setState(166);
                match(IF);
                setState(167);
                match(LPAREN);
                setState(168);
                expression(0);
                setState(169);
                match(RPAREN);
                setState(170);
                match(LBRACE);
                setState(171);
                program();
                setState(172);
                match(RBRACE);
                setState(178);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(173);
                        match(ELSE);
                        setState(174);
                        match(LBRACE);
                        setState(175);
                        program();
                        setState(176);
                        match(RBRACE);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FigureDeclarationContext extends ParserRuleContext {

        public PointDeclarationContext pointDeclaration() {
            return getRuleContext(PointDeclarationContext.class, 0);
        }

        public LineDeclarationContext lineDeclaration() {
            return getRuleContext(LineDeclarationContext.class, 0);
        }

        public SegmentDeclarationContext segmentDeclaration() {
            return getRuleContext(SegmentDeclarationContext.class, 0);
        }

        public TriangleDeclarationContext triangleDeclaration() {
            return getRuleContext(TriangleDeclarationContext.class, 0);
        }

        public SquareDeclarationContext squareDeclaration() {
            return getRuleContext(SquareDeclarationContext.class, 0);
        }

        public RectangleDeclarationContext rectangleDeclaration() {
            return getRuleContext(RectangleDeclarationContext.class, 0);
        }

        public ParallelogramDeclarationContext parallelogramDeclaration() {
            return getRuleContext(ParallelogramDeclarationContext.class, 0);
        }

        public CircleDeclarationContext circleDeclaration() {
            return getRuleContext(CircleDeclarationContext.class, 0);
        }

        public EllipseDeclarationContext ellipseDeclaration() {
            return getRuleContext(EllipseDeclarationContext.class, 0);
        }

        public FigureDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_figureDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterFigureDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitFigureDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitFigureDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FigureDeclarationContext figureDeclaration() throws RecognitionException {
        FigureDeclarationContext _localctx = new FigureDeclarationContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_figureDeclaration);
        try {
            setState(189);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case POINT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(180);
                    pointDeclaration();
                }
                break;
                case LINE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(181);
                    lineDeclaration();
                }
                break;
                case SEGMENT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(182);
                    segmentDeclaration();
                }
                break;
                case TRIANGLE:
                case EQUILATERAL_TRIANGLE:
                case ISOSCELES_TRIANGLE:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(183);
                    triangleDeclaration();
                }
                break;
                case SQUARE:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(184);
                    squareDeclaration();
                }
                break;
                case RECTANGLE:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(185);
                    rectangleDeclaration();
                }
                break;
                case PARALLELOGRAM:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(186);
                    parallelogramDeclaration();
                }
                break;
                case CIRCLE:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(187);
                    circleDeclaration();
                }
                break;
                case ELLIPSE:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(188);
                    ellipseDeclaration();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AreaCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AreaCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_areaCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAreaCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAreaCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitAreaCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AreaCallContext areaCall() throws RecognitionException {
        AreaCallContext _localctx = new AreaCallContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_areaCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                match(T__0);
                setState(192);
                match(LPAREN);
                setState(193);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PerimeterCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PerimeterCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perimeterCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPerimeterCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPerimeterCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPerimeterCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PerimeterCallContext perimeterCall() throws RecognitionException {
        PerimeterCallContext _localctx = new PerimeterCallContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_perimeterCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                match(T__1);
                setState(196);
                match(LPAREN);
                setState(197);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DiagonalCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public DiagonalCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_diagonalCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterDiagonalCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitDiagonalCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitDiagonalCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DiagonalCallContext diagonalCall() throws RecognitionException {
        DiagonalCallContext _localctx = new DiagonalCallContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_diagonalCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(199);
                match(T__2);
                setState(200);
                match(LPAREN);
                setState(201);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AreaTriangleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GeometryParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GeometryParser.COMMA, i);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AreaTriangleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_areaTriangleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAreaTriangleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAreaTriangleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAreaTriangleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AreaTriangleCallContext areaTriangleCall() throws RecognitionException {
        AreaTriangleCallContext _localctx = new AreaTriangleCallContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_areaTriangleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(203);
                match(T__3);
                setState(204);
                match(LPAREN);
                setState(205);
                expression(0);
                setState(206);
                match(COMMA);
                setState(207);
                expression(0);
                setState(208);
                match(COMMA);
                setState(209);
                expression(0);
                setState(210);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AreaCircleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AreaCircleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_areaCircleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAreaCircleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAreaCircleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAreaCircleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AreaCircleCallContext areaCircleCall() throws RecognitionException {
        AreaCircleCallContext _localctx = new AreaCircleCallContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_areaCircleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(T__4);
                setState(213);
                match(LPAREN);
                setState(214);
                expression(0);
                setState(215);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AreaSquareCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AreaSquareCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_areaSquareCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAreaSquareCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAreaSquareCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAreaSquareCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AreaSquareCallContext areaSquareCall() throws RecognitionException {
        AreaSquareCallContext _localctx = new AreaSquareCallContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_areaSquareCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                match(T__5);
                setState(218);
                match(LPAREN);
                setState(219);
                expression(0);
                setState(220);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AreaRectangleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AreaRectangleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_areaRectangleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAreaRectangleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAreaRectangleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAreaRectangleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AreaRectangleCallContext areaRectangleCall() throws RecognitionException {
        AreaRectangleCallContext _localctx = new AreaRectangleCallContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_areaRectangleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
                match(T__6);
                setState(223);
                match(LPAREN);
                setState(224);
                expression(0);
                setState(225);
                match(COMMA);
                setState(226);
                expression(0);
                setState(227);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PerimeterTriangleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GeometryParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GeometryParser.COMMA, i);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PerimeterTriangleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perimeterTriangleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPerimeterTriangleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPerimeterTriangleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPerimeterTriangleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PerimeterTriangleCallContext perimeterTriangleCall() throws RecognitionException {
        PerimeterTriangleCallContext _localctx = new PerimeterTriangleCallContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_perimeterTriangleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(229);
                match(T__7);
                setState(230);
                match(LPAREN);
                setState(231);
                expression(0);
                setState(232);
                match(COMMA);
                setState(233);
                expression(0);
                setState(234);
                match(COMMA);
                setState(235);
                expression(0);
                setState(236);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PerimeterCircleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PerimeterCircleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perimeterCircleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPerimeterCircleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPerimeterCircleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPerimeterCircleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PerimeterCircleCallContext perimeterCircleCall() throws RecognitionException {
        PerimeterCircleCallContext _localctx = new PerimeterCircleCallContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_perimeterCircleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(T__8);
                setState(239);
                match(LPAREN);
                setState(240);
                expression(0);
                setState(241);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PerimeterSquareCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PerimeterSquareCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perimeterSquareCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPerimeterSquareCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPerimeterSquareCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPerimeterSquareCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PerimeterSquareCallContext perimeterSquareCall() throws RecognitionException {
        PerimeterSquareCallContext _localctx = new PerimeterSquareCallContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_perimeterSquareCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(T__9);
                setState(244);
                match(LPAREN);
                setState(245);
                expression(0);
                setState(246);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PerimeterRectangleCallContext extends ParserRuleContext {

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PerimeterRectangleCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_perimeterRectangleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPerimeterRectangleCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPerimeterRectangleCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPerimeterRectangleCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PerimeterRectangleCallContext perimeterRectangleCall() throws RecognitionException {
        PerimeterRectangleCallContext _localctx = new PerimeterRectangleCallContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_perimeterRectangleCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(248);
                match(T__10);
                setState(249);
                match(LPAREN);
                setState(250);
                expression(0);
                setState(251);
                match(COMMA);
                setState(252);
                expression(0);
                setState(253);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PointDeclarationContext extends ParserRuleContext {

        public TerminalNode POINT() {
            return getToken(GeometryParser.POINT, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public PointDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pointDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPointDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPointDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitPointDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PointDeclarationContext pointDeclaration() throws RecognitionException {
        PointDeclarationContext _localctx = new PointDeclarationContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_pointDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                match(POINT);
                setState(256);
                match(ID);
                setState(257);
                match(LPAREN);
                setState(258);
                expression(0);
                setState(259);
                match(COMMA);
                setState(260);
                expression(0);
                setState(261);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LineDeclarationContext extends ParserRuleContext {

        public TerminalNode LINE() {
            return getToken(GeometryParser.LINE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<PointContext> point() {
            return getRuleContexts(PointContext.class);
        }

        public PointContext point(int i) {
            return getRuleContext(PointContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public LineDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lineDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterLineDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitLineDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitLineDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LineDeclarationContext lineDeclaration() throws RecognitionException {
        LineDeclarationContext _localctx = new LineDeclarationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_lineDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(263);
                match(LINE);
                setState(264);
                match(ID);
                setState(265);
                match(LPAREN);
                setState(266);
                point();
                setState(267);
                match(COMMA);
                setState(268);
                point();
                setState(269);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SegmentDeclarationContext extends ParserRuleContext {

        public TerminalNode SEGMENT() {
            return getToken(GeometryParser.SEGMENT, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<PointContext> point() {
            return getRuleContexts(PointContext.class);
        }

        public PointContext point(int i) {
            return getRuleContext(PointContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public SegmentDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_segmentDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterSegmentDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitSegmentDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitSegmentDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SegmentDeclarationContext segmentDeclaration() throws RecognitionException {
        SegmentDeclarationContext _localctx = new SegmentDeclarationContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_segmentDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(SEGMENT);
                setState(272);
                match(ID);
                setState(273);
                match(LPAREN);
                setState(274);
                point();
                setState(275);
                match(COMMA);
                setState(276);
                point();
                setState(277);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TriangleDeclarationContext extends ParserRuleContext {

        public TerminalNode TRIANGLE() {
            return getToken(GeometryParser.TRIANGLE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<PointContext> point() {
            return getRuleContexts(PointContext.class);
        }

        public PointContext point(int i) {
            return getRuleContext(PointContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GeometryParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GeometryParser.COMMA, i);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public List<TerminalNode> ARROW() {
            return getTokens(GeometryParser.ARROW);
        }

        public TerminalNode ARROW(int i) {
            return getToken(GeometryParser.ARROW, i);
        }

        public List<TrianglePropertyContext> triangleProperty() {
            return getRuleContexts(TrianglePropertyContext.class);
        }

        public TrianglePropertyContext triangleProperty(int i) {
            return getRuleContext(TrianglePropertyContext.class, i);
        }

        public List<AliasVertexContext> aliasVertex() {
            return getRuleContexts(AliasVertexContext.class);
        }

        public AliasVertexContext aliasVertex(int i) {
            return getRuleContext(AliasVertexContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode EQUILATERAL_TRIANGLE() {
            return getToken(GeometryParser.EQUILATERAL_TRIANGLE, 0);
        }

        public TerminalNode ISOSCELES_TRIANGLE() {
            return getToken(GeometryParser.ISOSCELES_TRIANGLE, 0);
        }

        public TriangleDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_triangleDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterTriangleDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitTriangleDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitTriangleDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TriangleDeclarationContext triangleDeclaration() throws RecognitionException {
        TriangleDeclarationContext _localctx = new TriangleDeclarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_triangleDeclaration);
        int _la;
        try {
            setState(353);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(279);
                    match(TRIANGLE);
                    setState(280);
                    match(ID);
                    setState(281);
                    match(LPAREN);
                    setState(282);
                    point();
                    setState(283);
                    match(COMMA);
                    setState(284);
                    point();
                    setState(285);
                    match(COMMA);
                    setState(286);
                    point();
                    setState(287);
                    match(RPAREN);
                    setState(292);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARROW) {
                        {
                            {
                                setState(288);
                                match(ARROW);
                                setState(289);
                                triangleProperty();
                            }
                        }
                        setState(294);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(295);
                    match(TRIANGLE);
                    setState(296);
                    match(ID);
                    setState(297);
                    match(LPAREN);
                    setState(298);
                    aliasVertex();
                    setState(299);
                    match(COMMA);
                    setState(300);
                    aliasVertex();
                    setState(301);
                    match(COMMA);
                    setState(302);
                    aliasVertex();
                    setState(303);
                    match(RPAREN);
                    setState(308);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARROW) {
                        {
                            {
                                setState(304);
                                match(ARROW);
                                setState(305);
                                triangleProperty();
                            }
                        }
                        setState(310);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(311);
                    match(TRIANGLE);
                    setState(312);
                    match(ID);
                    setState(313);
                    match(LPAREN);
                    setState(314);
                    expression(0);
                    setState(315);
                    match(COMMA);
                    setState(316);
                    expression(0);
                    setState(317);
                    match(COMMA);
                    setState(318);
                    expression(0);
                    setState(319);
                    match(RPAREN);
                    setState(324);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARROW) {
                        {
                            {
                                setState(320);
                                match(ARROW);
                                setState(321);
                                triangleProperty();
                            }
                        }
                        setState(326);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(327);
                    match(EQUILATERAL_TRIANGLE);
                    setState(328);
                    match(ID);
                    setState(329);
                    match(LPAREN);
                    setState(330);
                    expression(0);
                    setState(331);
                    match(RPAREN);
                    setState(336);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARROW) {
                        {
                            {
                                setState(332);
                                match(ARROW);
                                setState(333);
                                triangleProperty();
                            }
                        }
                        setState(338);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(339);
                    match(ISOSCELES_TRIANGLE);
                    setState(340);
                    match(ID);
                    setState(341);
                    match(LPAREN);
                    setState(342);
                    expression(0);
                    setState(343);
                    match(COMMA);
                    setState(344);
                    expression(0);
                    setState(345);
                    match(RPAREN);
                    setState(350);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARROW) {
                        {
                            {
                                setState(346);
                                match(ARROW);
                                setState(347);
                                triangleProperty();
                            }
                        }
                        setState(352);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AliasVertexContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public AliasVertexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_aliasVertex;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAliasVertex(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAliasVertex(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAliasVertex(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AliasVertexContext aliasVertex() throws RecognitionException {
        AliasVertexContext _localctx = new AliasVertexContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_aliasVertex);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(355);
                match(ID);
                setState(356);
                match(T__11);
                setState(357);
                expression(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TrianglePropertyContext extends ParserRuleContext {

        public BisectorDeclarationContext bisectorDeclaration() {
            return getRuleContext(BisectorDeclarationContext.class, 0);
        }

        public AngleDeclarationContext angleDeclaration() {
            return getRuleContext(AngleDeclarationContext.class, 0);
        }

        public HeightDeclarationContext heightDeclaration() {
            return getRuleContext(HeightDeclarationContext.class, 0);
        }

        public TrianglePropertyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_triangleProperty;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterTriangleProperty(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitTriangleProperty(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitTriangleProperty(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TrianglePropertyContext triangleProperty() throws RecognitionException {
        TrianglePropertyContext _localctx = new TrianglePropertyContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_triangleProperty);
        try {
            setState(362);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case BISECTOR:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(359);
                    bisectorDeclaration();
                }
                break;
                case ANGLE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(360);
                    angleDeclaration();
                }
                break;
                case HEIGHT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(361);
                    heightDeclaration();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BisectorDeclarationContext extends ParserRuleContext {

        public TerminalNode BISECTOR() {
            return getToken(GeometryParser.BISECTOR, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public BisectorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_bisectorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterBisectorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitBisectorDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitBisectorDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BisectorDeclarationContext bisectorDeclaration() throws RecognitionException {
        BisectorDeclarationContext _localctx = new BisectorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_bisectorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(364);
                match(BISECTOR);
                setState(365);
                match(LPAREN);
                setState(366);
                match(ID);
                setState(367);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AngleDeclarationContext extends ParserRuleContext {

        public TerminalNode ANGLE() {
            return getToken(GeometryParser.ANGLE, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public AngleDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_angleDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterAngleDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitAngleDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitAngleDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AngleDeclarationContext angleDeclaration() throws RecognitionException {
        AngleDeclarationContext _localctx = new AngleDeclarationContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_angleDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(369);
                match(ANGLE);
                setState(370);
                match(LPAREN);
                setState(371);
                match(ID);
                setState(372);
                match(COMMA);
                setState(373);
                expression(0);
                setState(374);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class HeightDeclarationContext extends ParserRuleContext {

        public TerminalNode HEIGHT() {
            return getToken(GeometryParser.HEIGHT, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public HeightDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_heightDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterHeightDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitHeightDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitHeightDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HeightDeclarationContext heightDeclaration() throws RecognitionException {
        HeightDeclarationContext _localctx = new HeightDeclarationContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_heightDeclaration);
        try {
            setState(387);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(376);
                    match(HEIGHT);
                    setState(377);
                    match(LPAREN);
                    setState(378);
                    match(ID);
                    setState(379);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(380);
                    match(HEIGHT);
                    setState(381);
                    match(LPAREN);
                    setState(382);
                    match(ID);
                    setState(383);
                    match(COMMA);
                    setState(384);
                    expression(0);
                    setState(385);
                    match(RPAREN);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SquareDeclarationContext extends ParserRuleContext {

        public TerminalNode SQUARE() {
            return getToken(GeometryParser.SQUARE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(GeometryParser.EQUAL, 0);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GeometryParser.SEMICOLON, 0);
        }

        public SquareDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_squareDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterSquareDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitSquareDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitSquareDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SquareDeclarationContext squareDeclaration() throws RecognitionException {
        SquareDeclarationContext _localctx = new SquareDeclarationContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_squareDeclaration);
        try {
            setState(402);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(389);
                    match(SQUARE);
                    setState(390);
                    match(ID);
                    setState(391);
                    match(LPAREN);
                    setState(392);
                    expression(0);
                    setState(393);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(395);
                    match(SQUARE);
                    setState(396);
                    match(ID);
                    setState(397);
                    match(T__12);
                    setState(398);
                    match(EQUAL);
                    setState(399);
                    expression(0);
                    setState(400);
                    match(SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RectangleDeclarationContext extends ParserRuleContext {

        public TerminalNode RECTANGLE() {
            return getToken(GeometryParser.RECTANGLE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public List<TerminalNode> EQUAL() {
            return getTokens(GeometryParser.EQUAL);
        }

        public TerminalNode EQUAL(int i) {
            return getToken(GeometryParser.EQUAL, i);
        }

        public TerminalNode SEMICOLON() {
            return getToken(GeometryParser.SEMICOLON, 0);
        }

        public RectangleDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rectangleDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterRectangleDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitRectangleDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitRectangleDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RectangleDeclarationContext rectangleDeclaration() throws RecognitionException {
        RectangleDeclarationContext _localctx = new RectangleDeclarationContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_rectangleDeclaration);
        try {
            setState(423);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(404);
                    match(RECTANGLE);
                    setState(405);
                    match(ID);
                    setState(406);
                    match(LPAREN);
                    setState(407);
                    expression(0);
                    setState(408);
                    match(COMMA);
                    setState(409);
                    expression(0);
                    setState(410);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(412);
                    match(RECTANGLE);
                    setState(413);
                    match(ID);
                    setState(414);
                    match(T__13);
                    setState(415);
                    match(EQUAL);
                    setState(416);
                    expression(0);
                    setState(417);
                    match(COMMA);
                    setState(418);
                    match(T__14);
                    setState(419);
                    match(EQUAL);
                    setState(420);
                    expression(0);
                    setState(421);
                    match(SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ParallelogramDeclarationContext extends ParserRuleContext {

        public TerminalNode PARALLELOGRAM() {
            return getToken(GeometryParser.PARALLELOGRAM, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(GeometryParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(GeometryParser.COMMA, i);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public ParallelogramDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parallelogramDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterParallelogramDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitParallelogramDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitParallelogramDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParallelogramDeclarationContext parallelogramDeclaration() throws RecognitionException {
        ParallelogramDeclarationContext _localctx = new ParallelogramDeclarationContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_parallelogramDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(425);
                match(PARALLELOGRAM);
                setState(426);
                match(ID);
                setState(427);
                match(LPAREN);
                setState(428);
                expression(0);
                setState(429);
                match(COMMA);
                setState(430);
                expression(0);
                setState(431);
                match(COMMA);
                setState(432);
                expression(0);
                setState(433);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CircleDeclarationContext extends ParserRuleContext {

        public TerminalNode CIRCLE() {
            return getToken(GeometryParser.CIRCLE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public List<TerminalNode> EQUAL() {
            return getTokens(GeometryParser.EQUAL);
        }

        public TerminalNode EQUAL(int i) {
            return getToken(GeometryParser.EQUAL, i);
        }

        public PointContext point() {
            return getRuleContext(PointContext.class, 0);
        }

        public CircleDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_circleDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterCircleDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitCircleDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitCircleDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CircleDeclarationContext circleDeclaration() throws RecognitionException {
        CircleDeclarationContext _localctx = new CircleDeclarationContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_circleDeclaration);
        try {
            setState(467);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(435);
                    match(CIRCLE);
                    setState(436);
                    match(ID);
                    setState(437);
                    match(LPAREN);
                    setState(438);
                    expression(0);
                    setState(439);
                    match(COMMA);
                    setState(440);
                    expression(0);
                    setState(441);
                    match(RPAREN);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(443);
                    match(CIRCLE);
                    setState(444);
                    match(ID);
                    setState(445);
                    match(T__15);
                    setState(446);
                    match(EQUAL);
                    setState(447);
                    expression(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(448);
                    match(CIRCLE);
                    setState(449);
                    match(ID);
                    setState(450);
                    match(T__16);
                    setState(451);
                    match(EQUAL);
                    setState(452);
                    point();
                    setState(453);
                    match(COMMA);
                    setState(454);
                    match(T__15);
                    setState(455);
                    match(EQUAL);
                    setState(456);
                    expression(0);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(458);
                    match(CIRCLE);
                    setState(459);
                    match(ID);
                    setState(460);
                    match(T__16);
                    setState(461);
                    match(EQUAL);
                    setState(462);
                    match(LPAREN);
                    setState(463);
                    expression(0);
                    setState(464);
                    match(COMMA);
                    setState(465);
                    expression(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class EllipseDeclarationContext extends ParserRuleContext {

        public TerminalNode ELLIPSE() {
            return getToken(GeometryParser.ELLIPSE, 0);
        }

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(GeometryParser.COMMA, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public EllipseDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ellipseDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterEllipseDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitEllipseDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitEllipseDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final EllipseDeclarationContext ellipseDeclaration() throws RecognitionException {
        EllipseDeclarationContext _localctx = new EllipseDeclarationContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_ellipseDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                match(ELLIPSE);
                setState(470);
                match(ID);
                setState(471);
                match(LPAREN);
                setState(472);
                expression(0);
                setState(473);
                match(COMMA);
                setState(474);
                expression(0);
                setState(475);
                match(RPAREN);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class VariableDeclarationContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public TerminalNode EQUAL() {
            return getToken(GeometryParser.EQUAL, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitVariableDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitVariableDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
        VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_variableDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(478);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
                    {
                        setState(477);
                        type();
                    }
                }

                setState(480);
                match(ID);
                setState(483);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == EQUAL) {
                    {
                        setState(481);
                        match(EQUAL);
                        setState(482);
                        expression(0);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TypeContext extends ParserRuleContext {

        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(485);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public TerminalNode INCREMENT() {
            return getToken(GeometryParser.INCREMENT, 0);
        }

        public TerminalNode DECREMENT() {
            return getToken(GeometryParser.DECREMENT, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(GeometryParser.LPAREN, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode RPAREN() {
            return getToken(GeometryParser.RPAREN, 0);
        }

        public TerminalNode NUM() {
            return getToken(GeometryParser.NUM, 0);
        }

        public TerminalNode TRUE() {
            return getToken(GeometryParser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(GeometryParser.FALSE, 0);
        }

        public TerminalNode STRING() {
            return getToken(GeometryParser.STRING, 0);
        }

        public TerminalNode PLUS() {
            return getToken(GeometryParser.PLUS, 0);
        }

        public TerminalNode MINUS() {
            return getToken(GeometryParser.MINUS, 0);
        }

        public TerminalNode MUL() {
            return getToken(GeometryParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(GeometryParser.DIV, 0);
        }

        public TerminalNode PERCENT() {
            return getToken(GeometryParser.PERCENT, 0);
        }

        public TerminalNode LT() {
            return getToken(GeometryParser.LT, 0);
        }

        public TerminalNode LE() {
            return getToken(GeometryParser.LE, 0);
        }

        public TerminalNode GT() {
            return getToken(GeometryParser.GT, 0);
        }

        public TerminalNode GE() {
            return getToken(GeometryParser.GE, 0);
        }

        public TerminalNode EQ() {
            return getToken(GeometryParser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(GeometryParser.NEQ, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor)
                return ((GeometryVisitor<? extends T>) visitor).visitExpression(this);
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
        int _startState = 82;
        enterRecursionRule(_localctx, 82, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(501);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        setState(488);
                        match(ID);
                        setState(489);
                        match(INCREMENT);
                    }
                    break;
                    case 2: {
                        setState(490);
                        match(ID);
                        setState(491);
                        match(DECREMENT);
                    }
                    break;
                    case 3: {
                        setState(492);
                        match(LPAREN);
                        setState(493);
                        expression(0);
                        setState(494);
                        match(RPAREN);
                    }
                    break;
                    case 4: {
                        setState(496);
                        match(NUM);
                    }
                    break;
                    case 5: {
                        setState(497);
                        match(TRUE);
                    }
                    break;
                    case 6: {
                        setState(498);
                        match(FALSE);
                    }
                    break;
                    case 7: {
                        setState(499);
                        match(STRING);
                    }
                    break;
                    case 8: {
                        setState(500);
                        match(ID);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(508);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(503);
                                if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                setState(504);
                                _la = _input.LA(1);
                                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << PERCENT) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE) | (1L << EQ) | (1L << NEQ))) != 0))) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(505);
                                expression(10);
                            }
                        }
                    }
                    setState(510);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PointContext extends ParserRuleContext {

        public TerminalNode ID() {
            return getToken(GeometryParser.ID, 0);
        }

        public PointContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_point;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterPoint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitPoint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitPoint(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PointContext point() throws RecognitionException {
        PointContext _localctx = new PointContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_point);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(511);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommentContext extends ParserRuleContext {

        public TerminalNode COMMENT() {
            return getToken(GeometryParser.COMMENT, 0);
        }

        public TerminalNode ML_COMMENT() {
            return getToken(GeometryParser.ML_COMMENT, 0);
        }

        public CommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).enterComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GeometryListener) ((GeometryListener) listener).exitComment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GeometryVisitor) return ((GeometryVisitor<? extends T>) visitor).visitComment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CommentContext comment() throws RecognitionException {
        CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_comment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(513);
                _la = _input.LA(1);
                if (!(_la == COMMENT || _la == ML_COMMENT)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 41:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 9);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0206\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\6\2`\n\2\r\2\16\2a\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\b\3\b\5\b\u0088" +
                    "\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00a7" +
                    "\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16" +
                    "\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c0\n" +
                    "\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3" +
                    "\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3" +
                    "\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3" +
                    "\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3" +
                    "\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3" +
                    "\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3" +
                    "\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3" +
                    "\36\3\36\7\36\u0125\n\36\f\36\16\36\u0128\13\36\3\36\3\36\3\36\3\36\3" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0135\n\36\f\36\16\36\u0138\13" +
                    "\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0145" +
                    "\n\36\f\36\16\36\u0148\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0151" +
                    "\n\36\f\36\16\36\u0154\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3" +
                    "\36\7\36\u015f\n\36\f\36\16\36\u0162\13\36\5\36\u0164\n\36\3\37\3\37\3" +
                    "\37\3\37\3 \3 \3 \5 \u016d\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3" +
                    "\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0186\n#\3$\3$\3$\3$\3$\3$\3$\3" +
                    "$\3$\3$\3$\3$\3$\5$\u0195\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3" +
                    "%\3%\3%\3%\3%\3%\5%\u01aa\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d6\n\'\3(\3(\3(" +
                    "\3(\3(\3(\3(\3(\3)\5)\u01e1\n)\3)\3)\3)\5)\u01e6\n)\3*\3*\3+\3+\3+\3+" +
                    "\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01f8\n+\3+\3+\3+\7+\u01fd\n+\f+\16" +
                    "+\u0200\13+\3,\3,\3-\3-\3-\2\3T.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36" +
                    " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\6\3\2BC\3\2\24\27\4\2\31\35<" +
                    "A\3\2HI\2\u0212\2_\3\2\2\2\4m\3\2\2\2\6o\3\2\2\2\br\3\2\2\2\nt\3\2\2\2" +
                    "\f\u0083\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u0095\3\2\2\2\24" +
                    "\u009f\3\2\2\2\26\u00a1\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2\34\u00bf" +
                    "\3\2\2\2\36\u00c1\3\2\2\2 \u00c5\3\2\2\2\"\u00c9\3\2\2\2$\u00cd\3\2\2" +
                    "\2&\u00d6\3\2\2\2(\u00db\3\2\2\2*\u00e0\3\2\2\2,\u00e7\3\2\2\2.\u00f0" +
                    "\3\2\2\2\60\u00f5\3\2\2\2\62\u00fa\3\2\2\2\64\u0101\3\2\2\2\66\u0109\3" +
                    "\2\2\28\u0111\3\2\2\2:\u0163\3\2\2\2<\u0165\3\2\2\2>\u016c\3\2\2\2@\u016e" +
                    "\3\2\2\2B\u0173\3\2\2\2D\u0185\3\2\2\2F\u0194\3\2\2\2H\u01a9\3\2\2\2J" +
                    "\u01ab\3\2\2\2L\u01d5\3\2\2\2N\u01d7\3\2\2\2P\u01e0\3\2\2\2R\u01e7\3\2" +
                    "\2\2T\u01f7\3\2\2\2V\u0201\3\2\2\2X\u0203\3\2\2\2Z`\5\4\3\2[`\5\b\5\2" +
                    "\\`\5\6\4\2]`\5\16\b\2^`\5\32\16\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3" +
                    "\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\3\3\2\2\2cd\5\34\17\2" +
                    "de\7\66\2\2en\3\2\2\2fg\5P)\2gh\7\66\2\2hn\3\2\2\2ij\5T+\2jk\7\66\2\2" +
                    "kn\3\2\2\2ln\5X-\2mc\3\2\2\2mf\3\2\2\2mi\3\2\2\2ml\3\2\2\2n\5\3\2\2\2" +
                    "op\5\n\6\2pq\7\66\2\2q\7\3\2\2\2rs\7H\2\2s\t\3\2\2\2tu\7E\2\2uv\7\36\2" +
                    "\2vw\5\f\7\2w\13\3\2\2\2x\u0084\5\36\20\2y\u0084\5 \21\2z\u0084\5\"\22" +
                    "\2{\u0084\5$\23\2|\u0084\5&\24\2}\u0084\5(\25\2~\u0084\5*\26\2\177\u0084" +
                    "\5,\27\2\u0080\u0084\5.\30\2\u0081\u0084\5\60\31\2\u0082\u0084\5\62\32" +
                    "\2\u0083x\3\2\2\2\u0083y\3\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|" +
                    "\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3" +
                    "\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085\u0088" +
                    "\5\20\t\2\u0086\u0088\5\22\n\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2" +
                    "\u0088\17\3\2\2\2\u0089\u008a\7\37\2\2\u008a\u008b\78\2\2\u008b\u008c" +
                    "\5\24\13\2\u008c\u008d\7\66\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\66" +
                    "\2\2\u008f\u0090\5\30\r\2\u0090\u0091\79\2\2\u0091\u0092\7\64\2\2\u0092" +
                    "\u0093\5\2\2\2\u0093\u0094\7\65\2\2\u0094\21\3\2\2\2\u0095\u0096\7 \2" +
                    "\2\u0096\u0097\78\2\2\u0097\u0098\5T+\2\u0098\u0099\79\2\2\u0099\u009a" +
                    "\7\64\2\2\u009a\u009b\5\2\2\2\u009b\u009c\7\65\2\2\u009c\23\3\2\2\2\u009d" +
                    "\u00a0\5P)\2\u009e\u00a0\5T+\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2" +
                    "\u00a0\25\3\2\2\2\u00a1\u00a2\5T+\2\u00a2\27\3\2\2\2\u00a3\u00a4\7E\2" +
                    "\2\u00a4\u00a7\t\2\2\2\u00a5\u00a7\5T+\2\u00a6\u00a3\3\2\2\2\u00a6\u00a5" +
                    "\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\7!\2\2\u00a9\u00aa\78\2\2\u00aa" +
                    "\u00ab\5T+\2\u00ab\u00ac\79\2\2\u00ac\u00ad\7\64\2\2\u00ad\u00ae\5\2\2" +
                    "\2\u00ae\u00b4\7\65\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\7\64\2\2\u00b1" +
                    "\u00b2\5\2\2\2\u00b2\u00b3\7\65\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00af\3" +
                    "\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00c0\5\64\33\2\u00b7" +
                    "\u00c0\5\66\34\2\u00b8\u00c0\58\35\2\u00b9\u00c0\5:\36\2\u00ba\u00c0\5" +
                    "F$\2\u00bb\u00c0\5H%\2\u00bc\u00c0\5J&\2\u00bd\u00c0\5L\'\2\u00be\u00c0" +
                    "\5N(\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf" +
                    "\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2" +
                    "\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c2" +
                    "\7\3\2\2\u00c2\u00c3\78\2\2\u00c3\u00c4\79\2\2\u00c4\37\3\2\2\2\u00c5" +
                    "\u00c6\7\4\2\2\u00c6\u00c7\78\2\2\u00c7\u00c8\79\2\2\u00c8!\3\2\2\2\u00c9" +
                    "\u00ca\7\5\2\2\u00ca\u00cb\78\2\2\u00cb\u00cc\79\2\2\u00cc#\3\2\2\2\u00cd" +
                    "\u00ce\7\6\2\2\u00ce\u00cf\78\2\2\u00cf\u00d0\5T+\2\u00d0\u00d1\7\67\2" +
                    "\2\u00d1\u00d2\5T+\2\u00d2\u00d3\7\67\2\2\u00d3\u00d4\5T+\2\u00d4\u00d5" +
                    "\79\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\78\2\2\u00d8\u00d9" +
                    "\5T+\2\u00d9\u00da\79\2\2\u00da\'\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00dd" +
                    "\78\2\2\u00dd\u00de\5T+\2\u00de\u00df\79\2\2\u00df)\3\2\2\2\u00e0\u00e1" +
                    "\7\t\2\2\u00e1\u00e2\78\2\2\u00e2\u00e3\5T+\2\u00e3\u00e4\7\67\2\2\u00e4" +
                    "\u00e5\5T+\2\u00e5\u00e6\79\2\2\u00e6+\3\2\2\2\u00e7\u00e8\7\n\2\2\u00e8" +
                    "\u00e9\78\2\2\u00e9\u00ea\5T+\2\u00ea\u00eb\7\67\2\2\u00eb\u00ec\5T+\2" +
                    "\u00ec\u00ed\7\67\2\2\u00ed\u00ee\5T+\2\u00ee\u00ef\79\2\2\u00ef-\3\2" +
                    "\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\78\2\2\u00f2\u00f3\5T+\2\u00f3\u00f4" +
                    "\79\2\2\u00f4/\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\78\2\2\u00f7\u00f8" +
                    "\5T+\2\u00f8\u00f9\79\2\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc" +
                    "\78\2\2\u00fc\u00fd\5T+\2\u00fd\u00fe\7\67\2\2\u00fe\u00ff\5T+\2\u00ff" +
                    "\u0100\79\2\2\u0100\63\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103\7E\2\2\u0103" +
                    "\u0104\78\2\2\u0104\u0105\5T+\2\u0105\u0106\7\67\2\2\u0106\u0107\5T+\2" +
                    "\u0107\u0108\79\2\2\u0108\65\3\2\2\2\u0109\u010a\7$\2\2\u010a\u010b\7" +
                    "E\2\2\u010b\u010c\78\2\2\u010c\u010d\5V,\2\u010d\u010e\7\67\2\2\u010e" +
                    "\u010f\5V,\2\u010f\u0110\79\2\2\u0110\67\3\2\2\2\u0111\u0112\7%\2\2\u0112" +
                    "\u0113\7E\2\2\u0113\u0114\78\2\2\u0114\u0115\5V,\2\u0115\u0116\7\67\2" +
                    "\2\u0116\u0117\5V,\2\u0117\u0118\79\2\2\u01189\3\2\2\2\u0119\u011a\7&" +
                    "\2\2\u011a\u011b\7E\2\2\u011b\u011c\78\2\2\u011c\u011d\5V,\2\u011d\u011e" +
                    "\7\67\2\2\u011e\u011f\5V,\2\u011f\u0120\7\67\2\2\u0120\u0121\5V,\2\u0121" +
                    "\u0126\79\2\2\u0122\u0123\7\36\2\2\u0123\u0125\5> \2\u0124\u0122\3\2\2" +
                    "\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0164" +
                    "\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7&\2\2\u012a\u012b\7E\2\2\u012b" +
                    "\u012c\78\2\2\u012c\u012d\5<\37\2\u012d\u012e\7\67\2\2\u012e\u012f\5<" +
                    "\37\2\u012f\u0130\7\67\2\2\u0130\u0131\5<\37\2\u0131\u0136\79\2\2\u0132" +
                    "\u0133\7\36\2\2\u0133\u0135\5> \2\u0134\u0132\3\2\2\2\u0135\u0138\3\2" +
                    "\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0164\3\2\2\2\u0138" +
                    "\u0136\3\2\2\2\u0139\u013a\7&\2\2\u013a\u013b\7E\2\2\u013b\u013c\78\2" +
                    "\2\u013c\u013d\5T+\2\u013d\u013e\7\67\2\2\u013e\u013f\5T+\2\u013f\u0140" +
                    "\7\67\2\2\u0140\u0141\5T+\2\u0141\u0146\79\2\2\u0142\u0143\7\36\2\2\u0143" +
                    "\u0145\5> \2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2" +
                    "\2\u0146\u0147\3\2\2\2\u0147\u0164\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a" +
                    "\7(\2\2\u014a\u014b\7E\2\2\u014b\u014c\78\2\2\u014c\u014d\5T+\2\u014d" +
                    "\u0152\79\2\2\u014e\u014f\7\36\2\2\u014f\u0151\5> \2\u0150\u014e\3\2\2" +
                    "\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0164" +
                    "\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7)\2\2\u0156\u0157\7E\2\2\u0157" +
                    "\u0158\78\2\2\u0158\u0159\5T+\2\u0159\u015a\7\67\2\2\u015a\u015b\5T+\2" +
                    "\u015b\u0160\79\2\2\u015c\u015d\7\36\2\2\u015d\u015f\5> \2\u015e\u015c" +
                    "\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161" +
                    "\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0119\3\2\2\2\u0163\u0129\3\2" +
                    "\2\2\u0163\u0139\3\2\2\2\u0163\u0149\3\2\2\2\u0163\u0155\3\2\2\2\u0164" +
                    ";\3\2\2\2\u0165\u0166\7E\2\2\u0166\u0167\7\16\2\2\u0167\u0168\5T+\2\u0168" +
                    "=\3\2\2\2\u0169\u016d\5@!\2\u016a\u016d\5B\"\2\u016b\u016d\5D#\2\u016c" +
                    "\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d?\3\2\2\2" +
                    "\u016e\u016f\7\60\2\2\u016f\u0170\78\2\2\u0170\u0171\7E\2\2\u0171\u0172" +
                    "\79\2\2\u0172A\3\2\2\2\u0173\u0174\7\61\2\2\u0174\u0175\78\2\2\u0175\u0176" +
                    "\7E\2\2\u0176\u0177\7\67\2\2\u0177\u0178\5T+\2\u0178\u0179\79\2\2\u0179" +
                    "C\3\2\2\2\u017a\u017b\7\'\2\2\u017b\u017c\78\2\2\u017c\u017d\7E\2\2\u017d" +
                    "\u0186\79\2\2\u017e\u017f\7\'\2\2\u017f\u0180\78\2\2\u0180\u0181\7E\2" +
                    "\2\u0181\u0182\7\67\2\2\u0182\u0183\5T+\2\u0183\u0184\79\2\2\u0184\u0186" +
                    "\3\2\2\2\u0185\u017a\3\2\2\2\u0185\u017e\3\2\2\2\u0186E\3\2\2\2\u0187" +
                    "\u0188\7*\2\2\u0188\u0189\7E\2\2\u0189\u018a\78\2\2\u018a\u018b\5T+\2" +
                    "\u018b\u018c\79\2\2\u018c\u0195\3\2\2\2\u018d\u018e\7*\2\2\u018e\u018f" +
                    "\7E\2\2\u018f\u0190\7\17\2\2\u0190\u0191\7\30\2\2\u0191\u0192\5T+\2\u0192" +
                    "\u0193\7\66\2\2\u0193\u0195\3\2\2\2\u0194\u0187\3\2\2\2\u0194\u018d\3" +
                    "\2\2\2\u0195G\3\2\2\2\u0196\u0197\7+\2\2\u0197\u0198\7E\2\2\u0198\u0199" +
                    "\78\2\2\u0199\u019a\5T+\2\u019a\u019b\7\67\2\2\u019b\u019c\5T+\2\u019c" +
                    "\u019d\79\2\2\u019d\u01aa\3\2\2\2\u019e\u019f\7+\2\2\u019f\u01a0\7E\2" +
                    "\2\u01a0\u01a1\7\20\2\2\u01a1\u01a2\7\30\2\2\u01a2\u01a3\5T+\2\u01a3\u01a4" +
                    "\7\67\2\2\u01a4\u01a5\7\21\2\2\u01a5\u01a6\7\30\2\2\u01a6\u01a7\5T+\2" +
                    "\u01a7\u01a8\7\66\2\2\u01a8\u01aa\3\2\2\2\u01a9\u0196\3\2\2\2\u01a9\u019e" +
                    "\3\2\2\2\u01aaI\3\2\2\2\u01ab\u01ac\7,\2\2\u01ac\u01ad\7E\2\2\u01ad\u01ae" +
                    "\78\2\2\u01ae\u01af\5T+\2\u01af\u01b0\7\67\2\2\u01b0\u01b1\5T+\2\u01b1" +
                    "\u01b2\7\67\2\2\u01b2\u01b3\5T+\2\u01b3\u01b4\79\2\2\u01b4K\3\2\2\2\u01b5" +
                    "\u01b6\7-\2\2\u01b6\u01b7\7E\2\2\u01b7\u01b8\78\2\2\u01b8\u01b9\5T+\2" +
                    "\u01b9\u01ba\7\67\2\2\u01ba\u01bb\5T+\2\u01bb\u01bc\79\2\2\u01bc\u01d6" +
                    "\3\2\2\2\u01bd\u01be\7-\2\2\u01be\u01bf\7E\2\2\u01bf\u01c0\7\22\2\2\u01c0" +
                    "\u01c1\7\30\2\2\u01c1\u01d6\5T+\2\u01c2\u01c3\7-\2\2\u01c3\u01c4\7E\2" +
                    "\2\u01c4\u01c5\7\23\2\2\u01c5\u01c6\7\30\2\2\u01c6\u01c7\5V,\2\u01c7\u01c8" +
                    "\7\67\2\2\u01c8\u01c9\7\22\2\2\u01c9\u01ca\7\30\2\2\u01ca\u01cb\5T+\2" +
                    "\u01cb\u01d6\3\2\2\2\u01cc\u01cd\7-\2\2\u01cd\u01ce\7E\2\2\u01ce\u01cf" +
                    "\7\23\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d1\78\2\2\u01d1\u01d2\5T+\2\u01d2" +
                    "\u01d3\7\67\2\2\u01d3\u01d4\5T+\2\u01d4\u01d6\3\2\2\2\u01d5\u01b5\3\2" +
                    "\2\2\u01d5\u01bd\3\2\2\2\u01d5\u01c2\3\2\2\2\u01d5\u01cc\3\2\2\2\u01d6" +
                    "M\3\2\2\2\u01d7\u01d8\7.\2\2\u01d8\u01d9\7E\2\2\u01d9\u01da\78\2\2\u01da" +
                    "\u01db\5T+\2\u01db\u01dc\7\67\2\2\u01dc\u01dd\5T+\2\u01dd\u01de\79\2\2" +
                    "\u01deO\3\2\2\2\u01df\u01e1\5R*\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2" +
                    "\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\7E\2\2\u01e3\u01e4\7\30\2\2\u01e4" +
                    "\u01e6\5T+\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6Q\3\2\2\2\u01e7" +
                    "\u01e8\t\3\2\2\u01e8S\3\2\2\2\u01e9\u01ea\b+\1\2\u01ea\u01eb\7E\2\2\u01eb" +
                    "\u01f8\7B\2\2\u01ec\u01ed\7E\2\2\u01ed\u01f8\7C\2\2\u01ee\u01ef\78\2\2" +
                    "\u01ef\u01f0\5T+\2\u01f0\u01f1\79\2\2\u01f1\u01f8\3\2\2\2\u01f2\u01f8" +
                    "\7D\2\2\u01f3\u01f8\7:\2\2\u01f4\u01f8\7;\2\2\u01f5\u01f8\7\63\2\2\u01f6" +
                    "\u01f8\7E\2\2\u01f7\u01e9\3\2\2\2\u01f7\u01ec\3\2\2\2\u01f7\u01ee\3\2" +
                    "\2\2\u01f7\u01f2\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7" +
                    "\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa\f\13" +
                    "\2\2\u01fa\u01fb\t\4\2\2\u01fb\u01fd\5T+\f\u01fc\u01f9\3\2\2\2\u01fd\u0200" +
                    "\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffU\3\2\2\2\u0200" +
                    "\u01fe\3\2\2\2\u0201\u0202\7E\2\2\u0202W\3\2\2\2\u0203\u0204\t\5\2\2\u0204" +
                    "Y\3\2\2\2\32_am\u0083\u0087\u009f\u00a6\u00b4\u00bf\u0126\u0136\u0146" +
                    "\u0152\u0160\u0163\u016c\u0185\u0194\u01a9\u01d5\u01e0\u01e5\u01f7\u01fe";

    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}