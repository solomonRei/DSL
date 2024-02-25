// Generated from org/dsl/geometry/grammar/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeometryParser}.
 */
public interface GeometryListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link GeometryParser#areaFunction}.
	 * @param ctx the parse tree
	 */
	void enterAreaFunction(GeometryParser.AreaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#areaFunction}.
	 * @param ctx the parse tree
	 */
	void exitAreaFunction(GeometryParser.AreaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#perimeterFunction}.
	 * @param ctx the parse tree
	 */
	void enterPerimeterFunction(GeometryParser.PerimeterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#perimeterFunction}.
	 * @param ctx the parse tree
	 */
	void exitPerimeterFunction(GeometryParser.PerimeterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#lengthFunction}.
	 * @param ctx the parse tree
	 */
	void enterLengthFunction(GeometryParser.LengthFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#lengthFunction}.
	 * @param ctx the parse tree
	 */
	void exitLengthFunction(GeometryParser.LengthFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeometryParser#figureID}.
	 * @param ctx the parse tree
	 */
	void enterFigureID(GeometryParser.FigureIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#figureID}.
	 * @param ctx the parse tree
	 */
	void exitFigureID(GeometryParser.FigureIDContext ctx);
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