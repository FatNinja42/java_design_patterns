package com.fatninja42.design.patterns.creational.abstractfactory.model.animal;

public class Bear implements Animal {
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "roars";
    }
}
