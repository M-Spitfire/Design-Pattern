package com.DesignPattern.factory.FactoryMethod.factory;

import com.DesignPattern.factory.FactoryMethod.pizza.Pizza;

public abstract class PizzaFactory {
    abstract Pizza getPizza(String type);

    public Pizza createPizza(String type){
        return getPizza(type);
    }
}
