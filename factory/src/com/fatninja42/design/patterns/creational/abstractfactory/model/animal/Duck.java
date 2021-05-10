package com.fatninja42.design.patterns.creational.abstractfactory.model.animal;

public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "quacks";
    }
}
