package org.dsl.geometry.processing.elements.shapes.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.shapes.Shape;

import java.awt.*;

@Slf4j
@Getter
@Setter
@ToString
public class Rectangle implements Shape {

    private double width;

    private double height;

    private Point origin;

    public Rectangle(double width, double height, Point origin) {
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    @Override
    public void draw(Graphics2D g) {
        if (g != null) {
            g.setStroke(new BasicStroke(3));
            g.setColor(Color.BLACK);
            g.drawRect((int) origin.getX(), (int) origin.getY(), (int) width, (int) height);
            g.setStroke(new BasicStroke(1));
            log.info("Прямоугольник в точке ({}, {}) с шириной {} и высотой {}", origin.getX(), origin.getY(), width, height);
        }
    }

    public double calculateArea() {
        double area = width * height;
        log.info("Площадь прямоугольника с шириной {} и высотой {}: {}", width, height, area);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (width + height);
        log.info("Периметр прямоугольника с шириной {} и высотой {}: {}", width, height, perimeter);
        return perimeter;
    }
}
