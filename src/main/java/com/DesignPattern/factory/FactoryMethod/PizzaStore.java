package com.DesignPattern.factory.FactoryMethod;

import com.DesignPattern.factory.FactoryMethod.factory.BJPizzaFactory;
import com.DesignPattern.factory.FactoryMethod.factory.LDPizzaFactory;
import com.DesignPattern.factory.FactoryMethod.factory.PizzaFactory;
import com.DesignPattern.factory.FactoryMethod.pizza.Pizza;

import java.util.Scanner;

/**
 * 工厂方法模式
 *
 * 当工厂类需要创建的对象包含不止一个的分类时, 如果在一个工厂类中写全部逻辑, 可能复杂度会很高, 所以需要拆分成多个工厂类
 * 但是多个工厂类的维护同样不简单, 所以为这些工厂类创建一个公共的抽象类, 继承这个抽象工厂类的工厂类需要实现创建对象的方法
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("输入想要的口味: ");
            String pizzaType = scan.nextLine();

            PizzaFactory pizzaFactory = null;
            //根据输入的口味创建相应的工厂类
            if("bj".equals(pizzaType)){
                pizzaFactory = new BJPizzaFactory();
            }
            else if("ld".equals(pizzaType)){
                pizzaFactory = new LDPizzaFactory();
            }

            System.out.println("请输入披萨种类: ");
            String type = scan.nextLine();

            Pizza pizza = null;
            if(pizzaFactory != null){
                pizza = pizzaFactory.createPizza(type);
            }
            else{
                System.out.println("没有这种口味哦~~");
            }

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
