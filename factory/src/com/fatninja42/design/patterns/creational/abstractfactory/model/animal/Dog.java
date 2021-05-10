package com.fatninja42.design.patterns.creational.abstractfactory.model.animal;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "barks";
    }
}
