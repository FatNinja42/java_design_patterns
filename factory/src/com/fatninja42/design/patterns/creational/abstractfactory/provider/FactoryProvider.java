package com.fatninja42.design.patterns.creational.abstractfactory.provider;

import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.AbstractFactory;
import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.animal.AnimalFactory;
import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.color.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory) {
        if("Animal".equalsIgnoreCase(factory)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }

        return null;
    }
}
