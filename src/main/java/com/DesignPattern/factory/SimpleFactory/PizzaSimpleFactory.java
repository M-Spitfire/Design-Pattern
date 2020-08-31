package com.DesignPattern.factory.SimpleFactory;

import com.DesignPattern.factory.SimpleFactory.pizza.CheesePizza;
import com.DesignPattern.factory.SimpleFactory.pizza.GreekPizza;
import com.DesignPattern.factory.SimpleFactory.pizza.Pizza;

/**
 * 这里仍然使用switch结构, 更好的方式是使用反射, 代码能够简洁很多
 *
 * 可以将生产对象的方法写成静态方法, 使得不需要实例化工程类就能通过工厂类获取对象
 */
public class PizzaSimpleFactory {
    public static Pizza getPizza(String pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case "greek":
                pizza = new GreekPizza("Greek [simple factory]");break;
            case "cheese":
                pizza = new CheesePizza("Cheese [simple factory]");break;
            default:
                break;
        }
        return pizza;
    }
}
