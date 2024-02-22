// Generated from org/dsl/geometry/Geometry.g4 by ANTLR 4.7.1
package org.dsl.geometry;
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
	 * Enter a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(GeometryParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeometryParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(GeometryParser.PointContext ctx);
}