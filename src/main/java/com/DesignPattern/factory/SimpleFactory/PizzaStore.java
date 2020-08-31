package com.DesignPattern.factory.SimpleFactory;

import com.DesignPattern.factory.SimpleFactory.pizza.Pizza;
import java.util.Scanner;

/**
 * 简单工厂模式属于创建型模式, 是工厂模式的一种.
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品的实例, 是工厂模式家族中最简单实用的一种
 *
 * 简单工厂模式:
 *      实际上就是在一个类中封装实例化某一类对象的行为
 *
 * 当我们要大量创建某一种的对象时, 就会使用到工厂模式
 */
public class PizzaStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入想要的披萨: ");
            String pizzaType = scanner.nextLine();
            //通过工厂类获取披萨
            Pizza pizza = PizzaSimpleFactory.getPizza(pizzaType);

            if(pizza == null){
                System.out.println("没有这种披萨哦~~");
            }
            else{
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }
    }
}
