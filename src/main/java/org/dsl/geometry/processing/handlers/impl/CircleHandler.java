package org.dsl.geometry.processing.handlers.impl;

import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.elements.Drawable;
import org.dsl.geometry.processing.elements.shapes.impl.Circle;
import org.dsl.geometry.processing.elements.shapes.impl.Point;
import org.dsl.geometry.processing.handlers.Handler;
import org.dsl.geometry.processing.utils.Settings;
import org.dsl.geometry.processing.utils.Utils;

import java.util.List;

@Slf4j
public class CircleHandler implements Handler<GeometryParser.CircleDeclarationContext> {

    private static final int DEFAULT_RADIUS = 50;

    private final List<Drawable> figures;

    public CircleHandler(List<Drawable> figures) {
        this.figures = figures;
    }

    @Override
    public List<Drawable> handle(GeometryParser.CircleDeclarationContext context) {
        String circleId = context.ID().getText();
        Point center = parseCenter(context);
        double radius = parseRadius(context);

        Circle circle = new Circle(radius, center);
        if (circleId != null) {
            circle.scaleCircle();
            figures.add(circle);
            log.info("Added circle with ID {} at center ({}, {}) with radius {}", circleId, center.getX(), center.getY(), radius);
        } else {
            log.error("Circle ID is null");
        }
        return figures;
    }

    private Point parseCenter(GeometryParser.CircleDeclarationContext context) {
        if (context.expression() != null && context.expression().size() == 2) {
            double x = Double.parseDouble(context.expression(0).getText());
            double y = Double.parseDouble(context.expression(1).getText());
            return new Point(Settings.INITIAL_COORDINATE_X + (int) x, Settings.INITIAL_COORDINATE_Y + (int) y, Utils.generateRandomId());
        }
        return new Point(Settings.INITIAL_COORDINATE_X, Settings.INITIAL_COORDINATE_Y, Utils.generateRandomId());
    }

    private double parseRadius(GeometryParser.CircleDeclarationContext context) {
        if ("radius".equals(context.getChild(2).getText())) {
            return Double.parseDouble(context.expression(0).getText());
        }
        return DEFAULT_RADIUS;
    }
}
