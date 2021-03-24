package com.fatninja42.design.patterns.creational.factory.shape.model;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Into Circle::draw()");
    }
}
