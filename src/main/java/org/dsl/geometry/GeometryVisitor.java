// Generated from org/dsl/geometry/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry;
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
	 * Visit a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(GeometryParser.PointContext ctx);
}