package com.DesignPattern.factory.abstractFactory;



import com.DesignPattern.factory.abstractFactory.factory.BJPizzaFactory;
import com.DesignPattern.factory.abstractFactory.factory.LDPizzaFactory;
import com.DesignPattern.factory.abstractFactory.factory.PizzaFactory;
import com.DesignPattern.factory.abstractFactory.pizza.Pizza;

import java.util.Scanner;

/**
 * 抽象工厂模式
 *
 * 这个模式和工厂方法模式形式上非常类似, 只是把工厂抽象类改成了接口
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

            Pizza pizza = null;
            if(pizzaFactory != null){
                System.out.println("请输入披萨种类: ");
                String type = scan.nextLine();
                pizza = pizzaFactory.getPizza(type);

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
            else{
                System.out.println("没有这种口味哦~~");
            }


        }
    }
}
