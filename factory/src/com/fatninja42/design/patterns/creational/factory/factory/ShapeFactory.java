package com.fatninja42.design.patterns.creational.factory.factory;

import com.fatninja42.design.patterns.creational.factory.model.Shape;
import com.fatninja42.design.patterns.creational.factory.model.Circle;
import com.fatninja42.design.patterns.creational.factory.model.Rectangle;
import com.fatninja42.design.patterns.creational.factory.model.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        } else if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }

        return null;
    }
}
