package com.fatninja42.design.patterns.creational.abstractfactory;

import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Animal;
import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Dog;
import com.fatninja42.design.patterns.creational.abstractfactory.model.color.Color;
import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.AbstractFactory;
import com.fatninja42.design.patterns.creational.abstractfactory.provider.FactoryProvider;

import static com.fatninja42.design.patterns.creational.abstractfactory.definition.Definition.DEFINITION;

public class Main {
    public static void main(String[] args) {
        System.out.println(DEFINITION);

        AbstractFactory<Dog> animalFactory = FactoryProvider.getFactory("Animal");
        AbstractFactory<Color> colorFactory = FactoryProvider.getFactory("Color");

        Animal animal = animalFactory.create("Dog");
        Color color = colorFactory.create("Red");

        System.out.println("You have created an animal that " +animal.makeSound() + " + and has the color " + color.getName());

    }
}
