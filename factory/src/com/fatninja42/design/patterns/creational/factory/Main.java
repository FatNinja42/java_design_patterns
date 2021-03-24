package com.fatninja42.design.patterns.creational.factory;

import com.fatninja42.design.patterns.creational.factory.factory.ShapeFactory;
import com.fatninja42.design.patterns.creational.factory.model.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
