// Generated from org\dsl\geometry\grammar\Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeometryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeometryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeometryParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GeometryParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GeometryParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(GeometryParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#commentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentStatement(GeometryParser.CommentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GeometryParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(GeometryParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(GeometryParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(GeometryParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GeometryParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GeometryParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(GeometryParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(GeometryParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(GeometryParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#figureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureDeclaration(GeometryParser.FigureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#areaCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaCall(GeometryParser.AreaCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#perimeterCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerimeterCall(GeometryParser.PerimeterCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#diagonalCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagonalCall(GeometryParser.DiagonalCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#areaTriangleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaTriangleCall(GeometryParser.AreaTriangleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#areaCircleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaCircleCall(GeometryParser.AreaCircleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#areaSquareCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaSquareCall(GeometryParser.AreaSquareCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#areaRectangleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAreaRectangleCall(GeometryParser.AreaRectangleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#perimeterTriangleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerimeterTriangleCall(GeometryParser.PerimeterTriangleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#perimeterCircleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerimeterCircleCall(GeometryParser.PerimeterCircleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#perimeterSquareCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerimeterSquareCall(GeometryParser.PerimeterSquareCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#perimeterRectangleCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerimeterRectangleCall(GeometryParser.PerimeterRectangleCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#pointDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointDeclaration(GeometryParser.PointDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#lineDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineDeclaration(GeometryParser.LineDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#segmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentDeclaration(GeometryParser.SegmentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#triangleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriangleDeclaration(GeometryParser.TriangleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#aliasVertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasVertex(GeometryParser.AliasVertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#triangleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriangleProperty(GeometryParser.TrianglePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#bisectorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBisectorDeclaration(GeometryParser.BisectorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#angleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngleDeclaration(GeometryParser.AngleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#heightDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightDeclaration(GeometryParser.HeightDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#squareDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareDeclaration(GeometryParser.SquareDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#rectangleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangleDeclaration(GeometryParser.RectangleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#parallelogramDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelogramDeclaration(GeometryParser.ParallelogramDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#circleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleDeclaration(GeometryParser.CircleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#ellipseDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipseDeclaration(GeometryParser.EllipseDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(GeometryParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GeometryParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GeometryParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(GeometryParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeometryParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(GeometryParser.CommentContext ctx);
}