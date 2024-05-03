package org.dsl.geometry.processing.handlers.impl;

import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.elements.shapes.impl.Rectangle;
import org.dsl.geometry.processing.handlers.Handler;
import org.dsl.geometry.processing.utils.Settings;
import org.dsl.geometry.processing.utils.Utils;

import java.util.Map;

public class RectangleHandler implements Handler<GeometryParser.RectangleDeclarationContext> {

    private final Map<String, Drawable> figures;

    public RectangleHandler(Map<String, Drawable> figures) {
        this.figures = figures;
    }

    @Override
    public Map<String, Drawable> handle(GeometryParser.RectangleDeclarationContext context) {
        String rectangleId = context.ID().getText();
        double width = 0;
        double height = 0;

        if (context.getChild(2).getText().equals("(")) {
            width = Double.parseDouble(context.expression(0).getText());
            height = Double.parseDouble(context.expression(1).getText());
        } else if (context.getChild(2).getText().equals("width")) {
            width = Double.parseDouble(context.expression(0).getText());
            height = Double.parseDouble(context.expression(1).getText());
        } else {
            System.err.println("Ошибка при создании прямоугольника ID: " + rectangleId);
            return figures;
        }

        Point origin = new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
        Rectangle rectangle = new Rectangle(width, height, origin);
        System.out.println("Creating rectangle with ID: " + rectangleId + " width: " + width + " and height: " + height);
        figures.put(rectangleId, rectangle);

        return figures;
    }
}
