package com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.color;

import com.fatninja42.design.patterns.creational.abstractfactory.model.color.Blue;
import com.fatninja42.design.patterns.creational.abstractfactory.model.color.Color;
import com.fatninja42.design.patterns.creational.abstractfactory.model.color.Cyan;
import com.fatninja42.design.patterns.creational.abstractfactory.model.color.Red;
import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color>{

    @Override
    public Color create(String colorName) {
        if ("Red".equalsIgnoreCase(colorName)) {
            return new Red();
        } else if ("Blue".equalsIgnoreCase(colorName)) {
            return new Blue();
        } else if ("Cyan".equalsIgnoreCase(colorName)) {
            return new Cyan();
        }

        return null;
    }
}
