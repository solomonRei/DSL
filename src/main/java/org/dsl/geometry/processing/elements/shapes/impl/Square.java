package org.dsl.geometry.processing.elements.shapes.impl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.dsl.geometry.processing.elements.functions.BasicFunctions;
import org.dsl.geometry.processing.elements.shapes.Shape;

import java.awt.*;

@Slf4j
@Getter
@Setter
@ToString
public class Square implements Shape, BasicFunctions {

    private double sideLength;

    private Point origin;

    public Square(double sideLength, Point origin) {
        this.sideLength = sideLength;
        this.origin = origin;
    }

    @Override
    public void draw(Graphics2D g) {
        if (g != null) {
            g.setStroke(new BasicStroke(3));
            g.setColor(Color.BLACK);
            g.drawRect((int) origin.getX(), (int) origin.getY(), (int) sideLength, (int) sideLength);
            g.setStroke(new BasicStroke(1));
            log.info("Drawing square at ({}, {}) with side length {}", origin.getX(), origin.getY(), sideLength);
        }
    }

    @Override
    public double calculateArea() {
        double area = sideLength * sideLength;
        log.info("Calculated area of square with side length {}: {}", sideLength, area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * sideLength;
        log.info("Calculated perimeter of square with side length {}: {}", sideLength, perimeter);
        return perimeter;
    }
}
