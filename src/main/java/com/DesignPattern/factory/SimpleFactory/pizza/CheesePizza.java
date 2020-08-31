package com.DesignPattern.factory.SimpleFactory.pizza;

/**
 * CheesePizza
 */
public class CheesePizza extends Pizza{

    public CheesePizza() {
        super("Cheese");
    }

    public CheesePizza(String name) {
        super(name);
    }
}
