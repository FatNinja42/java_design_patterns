package com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.animal;

import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Animal;
import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Bear;
import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Dog;
import com.fatninja42.design.patterns.creational.abstractfactory.model.animal.Duck;
import com.fatninja42.design.patterns.creational.abstractfactory.patternimpl.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        } else if ("Bear".equalsIgnoreCase(animalType)) {
            return new Bear();
        }

        return null;
    }
}
