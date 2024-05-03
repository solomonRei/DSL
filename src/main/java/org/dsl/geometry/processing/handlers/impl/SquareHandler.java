package org.dsl.geometry.processing.handlers.impl;

import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.elements.shapes.impl.Square;
import org.dsl.geometry.processing.handlers.Handler;
import org.dsl.geometry.processing.utils.Settings;
import org.dsl.geometry.processing.utils.Utils;

import java.util.Map;

public class SquareHandler implements Handler<GeometryParser.SquareDeclarationContext> {

    private final Map<String, Drawable> figures;

    public SquareHandler(Map<String, Drawable> figures) {
        this.figures = figures;
    }

    @Override
    public Map<String, Drawable> handle(GeometryParser.SquareDeclarationContext context) {
        String squareId = context.ID().getText();
        double sideLength = 0;

        if (context.expression() != null) {
            sideLength = Double.parseDouble(context.expression().getText());
        } else {
            System.err.println("Invalid square declaration for ID: " + squareId);
            return figures;
        }

        Point origin = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        Square square = new Square(sideLength, origin);
        System.out.println("Creating square with ID: " + squareId + " and side length: " + sideLength);
        figures.put(squareId, square);

        return figures;
    }
}
