// Generated from org/dsl/geometry/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry;
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
		T__0=1, T__1=2, T__2=3, POINT=4, LINE=5, ID=6, NUM=7, WS=8;
	public static final int
		RULE_program = 0, RULE_figureDeclaration = 1, RULE_pointDeclaration = 2, 
		RULE_lineDeclaration = 3, RULE_point = 4;
	public static final String[] ruleNames = {
		"program", "figureDeclaration", "pointDeclaration", "lineDeclaration", 
		"point"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'Point'", "'Line'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "POINT", "LINE", "ID", "NUM", "WS"
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
		public List<FigureDeclarationContext> figureDeclaration() {
			return getRuleContexts(FigureDeclarationContext.class);
		}
		public FigureDeclarationContext figureDeclaration(int i) {
			return getRuleContext(FigureDeclarationContext.class,i);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINT || _la==LINE) {
				{
				{
				setState(10);
				figureDeclaration();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 2, RULE_figureDeclaration);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				pointDeclaration();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				lineDeclaration();
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
		public List<TerminalNode> NUM() { return getTokens(GeometryParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GeometryParser.NUM, i);
		}
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
		enterRule(_localctx, 4, RULE_pointDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(POINT);
			setState(21);
			match(ID);
			setState(22);
			match(T__0);
			setState(23);
			match(NUM);
			setState(24);
			match(T__1);
			setState(25);
			match(NUM);
			setState(26);
			match(T__2);
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
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_lineDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LINE);
			setState(29);
			match(ID);
			setState(30);
			match(T__0);
			setState(31);
			point();
			setState(32);
			match(T__1);
			setState(33);
			point();
			setState(34);
			match(T__2);
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
		enterRule(_localctx, 8, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\5\3"+
		"\25\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2%\2\17\3\2\2\2\4\24\3\2\2\2\6\26\3"+
		"\2\2\2\b\36\3\2\2\2\n&\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\25\5\6\4\2\23"+
		"\25\5\b\5\2\24\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\27\7\6\2\2\27"+
		"\30\7\b\2\2\30\31\7\3\2\2\31\32\7\t\2\2\32\33\7\4\2\2\33\34\7\t\2\2\34"+
		"\35\7\5\2\2\35\7\3\2\2\2\36\37\7\7\2\2\37 \7\b\2\2 !\7\3\2\2!\"\5\n\6"+
		"\2\"#\7\4\2\2#$\5\n\6\2$%\7\5\2\2%\t\3\2\2\2&\'\7\b\2\2\'\13\3\2\2\2\4"+
		"\17\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}