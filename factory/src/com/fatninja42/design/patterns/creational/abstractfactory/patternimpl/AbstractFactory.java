package com.fatninja42.design.patterns.creational.abstractfactory.patternimpl;


public interface AbstractFactory<T> {
    T create(String objectType);
}
