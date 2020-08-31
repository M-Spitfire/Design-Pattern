package com.DesignPattern.factory.FactoryMethod.factory;

import com.DesignPattern.factory.FactoryMethod.pizza.BJCheesePizza;
import com.DesignPattern.factory.FactoryMethod.pizza.BJPepperPizza;
import com.DesignPattern.factory.FactoryMethod.pizza.Pizza;

/**
 * 北京口味披萨的工厂类
 */
public class BJPizzaFactory extends PizzaFactory{
    @Override
    Pizza getPizza(String type) {
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
