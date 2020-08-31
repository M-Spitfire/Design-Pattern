package com.DesignPattern.factory.abstractFactory.factory;


import com.DesignPattern.factory.abstractFactory.pizza.BJCheesePizza;
import com.DesignPattern.factory.abstractFactory.pizza.BJPepperPizza;
import com.DesignPattern.factory.abstractFactory.pizza.Pizza;

/**
 * 北京口味披萨的工厂类
 */
public class BJPizzaFactory implements PizzaFactory {
    @Override
    public Pizza getPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new BJCheesePizza();
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
