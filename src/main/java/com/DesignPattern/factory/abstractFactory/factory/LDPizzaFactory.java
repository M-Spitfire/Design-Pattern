package com.DesignPattern.factory.abstractFactory.factory;


import com.DesignPattern.factory.abstractFactory.pizza.LDCheesePizza;
import com.DesignPattern.factory.abstractFactory.pizza.LDPepperPizza;
import com.DesignPattern.factory.abstractFactory.pizza.Pizza;

/**
 * 伦敦口味披萨的工厂类
 */
public class LDPizzaFactory implements PizzaFactory {

    @Override
    public Pizza getPizza(String type) {
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
