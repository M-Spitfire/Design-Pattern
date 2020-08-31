package com.DesignPattern.factory.FactoryMethod.factory;

import com.DesignPattern.factory.FactoryMethod.pizza.*;

/**
 * 伦敦口味披萨的工厂类
 */
public class LDPizzaFactory extends PizzaFactory{
    @Override
    Pizza getPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new LDCheesePizza();
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
