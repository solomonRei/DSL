// Generated from org/dsl/geometry/grammar/Geometry.g4 by ANTLR 4.7.1
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
	 * Visit a parse tree produced by {@link GeometryParser#figureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigureDeclaration(GeometryParser.FigureDeclarationContext ctx);
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