package com.fatninja42.design.patterns.creational.factory.model;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Into Rectangle::draw()");
    }
}
