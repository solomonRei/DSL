// Generated from org/dsl/geometry/grammar/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeometryParser}.
 */
public interface GeometryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeometryParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GeometryParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GeometryParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GeometryParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GeometryParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(GeometryParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(GeometryParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentStatement(GeometryParser.CommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#commentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentStatement(GeometryParser.CommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GeometryParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GeometryParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(GeometryParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(GeometryParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(GeometryParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(GeometryParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(GeometryParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(GeometryParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GeometryParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GeometryParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GeometryParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GeometryParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(GeometryParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(GeometryParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(GeometryParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(GeometryParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(GeometryParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(GeometryParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#figureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFigureDeclaration(GeometryParser.FigureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#figureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFigureDeclaration(GeometryParser.FigureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#areaCall}.
	 * @param ctx the parse tree
	 */
	void enterAreaCall(GeometryParser.AreaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#areaCall}.
	 * @param ctx the parse tree
	 */
	void exitAreaCall(GeometryParser.AreaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#perimeterCall}.
	 * @param ctx the parse tree
	 */
	void enterPerimeterCall(GeometryParser.PerimeterCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#perimeterCall}.
	 * @param ctx the parse tree
	 */
	void exitPerimeterCall(GeometryParser.PerimeterCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#diagonalCall}.
	 * @param ctx the parse tree
	 */
	void enterDiagonalCall(GeometryParser.DiagonalCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#diagonalCall}.
	 * @param ctx the parse tree
	 */
	void exitDiagonalCall(GeometryParser.DiagonalCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#pointDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPointDeclaration(GeometryParser.PointDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#pointDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPointDeclaration(GeometryParser.PointDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#lineDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLineDeclaration(GeometryParser.LineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#lineDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLineDeclaration(GeometryParser.LineDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#segmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSegmentDeclaration(GeometryParser.SegmentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#segmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSegmentDeclaration(GeometryParser.SegmentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#triangleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTriangleDeclaration(GeometryParser.TriangleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#triangleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTriangleDeclaration(GeometryParser.TriangleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#aliasVertex}.
	 * @param ctx the parse tree
	 */
	void enterAliasVertex(GeometryParser.AliasVertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#aliasVertex}.
	 * @param ctx the parse tree
	 */
	void exitAliasVertex(GeometryParser.AliasVertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#triangleProperty}.
	 * @param ctx the parse tree
	 */
	void enterTriangleProperty(GeometryParser.TrianglePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#triangleProperty}.
	 * @param ctx the parse tree
	 */
	void exitTriangleProperty(GeometryParser.TrianglePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#bisectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBisectorDeclaration(GeometryParser.BisectorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#bisectorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBisectorDeclaration(GeometryParser.BisectorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#angleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAngleDeclaration(GeometryParser.AngleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#angleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAngleDeclaration(GeometryParser.AngleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#heightDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHeightDeclaration(GeometryParser.HeightDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#heightDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHeightDeclaration(GeometryParser.HeightDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#squareDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSquareDeclaration(GeometryParser.SquareDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#squareDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSquareDeclaration(GeometryParser.SquareDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#rectangleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRectangleDeclaration(GeometryParser.RectangleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#rectangleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRectangleDeclaration(GeometryParser.RectangleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#parallelogramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParallelogramDeclaration(GeometryParser.ParallelogramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#parallelogramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParallelogramDeclaration(GeometryParser.ParallelogramDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#circleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCircleDeclaration(GeometryParser.CircleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#circleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCircleDeclaration(GeometryParser.CircleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#ellipseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEllipseDeclaration(GeometryParser.EllipseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#ellipseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEllipseDeclaration(GeometryParser.EllipseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#rhombusDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRhombusDeclaration(GeometryParser.RhombusDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#rhombusDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRhombusDeclaration(GeometryParser.RhombusDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(GeometryParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(GeometryParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GeometryParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GeometryParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GeometryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GeometryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(GeometryParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(GeometryParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(GeometryParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(GeometryParser.CommentContext ctx);
}