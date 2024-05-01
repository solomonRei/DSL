package org.dsl.geometry.processing.utils;

import org.dsl.geometry.grammar.GeometryBaseVisitor;
import org.dsl.geometry.grammar.GeometryParser;

import java.util.HashMap;
import java.util.Map;

public class GeometryEvaluator extends GeometryBaseVisitor<Double> {

    private Map<String, Double> variables = new HashMap<>();

    @Override
    public Double visitExpression(GeometryParser.ExpressionContext ctx) {
        if (ctx.NUM() != null) {
            return Double.parseDouble(ctx.NUM().getText());
        } else if (ctx.ID() != null) {
            return getVariableValue(ctx.ID().getText());
        } else if (ctx.PLUS() != null) {
            return visit(ctx.expression(0)) + visit(ctx.expression(1));
        } else if (ctx.MINUS() != null) {
            return visit(ctx.expression(0)) - visit(ctx.expression(1));
        } else if (ctx.MUL() != null) {
            return visit(ctx.expression(0)) * visit(ctx.expression(1));
        } else if (ctx.DIV() != null) {
            return visit(ctx.expression(0)) / visit(ctx.expression(1));
        } else if (ctx.PERCENT() != null) {
            return visit(ctx.expression(0)) % visit(ctx.expression(1));
        }
        return 0.0;
    }

    public void setVariable(String name, Double value) {
        variables.put(name, value);
    }

    public Double getVariableValue(String variableName) {
        return variables.getOrDefault(variableName, 0.0);
    }
}

