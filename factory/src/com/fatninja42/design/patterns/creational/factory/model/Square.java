package com.fatninja42.design.patterns.creational.factory.model;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Into Square::draw()");
    }
}
