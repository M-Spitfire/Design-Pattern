package com.DesignPattern.factory.abstractFactory.factory;


import com.DesignPattern.factory.abstractFactory.pizza.Pizza;

public interface PizzaFactory {
    Pizza getPizza(String type);
}
