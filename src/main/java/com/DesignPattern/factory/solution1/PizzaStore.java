package com.DesignPattern.factory.solution1;



import com.DesignPattern.factory.solution1.pizza.CheesePizza;
import com.DesignPattern.factory.solution1.pizza.GreekPizza;
import com.DesignPattern.factory.solution1.pizza.Pizza;

import java.util.Scanner;

/**
 * 这个类会去订购不同的披萨, 输出信息
 *
 * 这是最普通, 比较容易想到的方式:
 *      先写一个抽象Pizza类,各种不同的Pizza去继承这个抽象类
 *
 * 缺点:
 *      缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。
 *      即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
 *
 *      解释一下缺点: 当增加或减少了披萨的种类的时候, PizzaStore中的代码需要相应修改,
 *      如果只有这一个地方使用了这部分订购披萨的代码, 那修改只需要修改一次, 还可以接受
 *      但PizzaStore可能被用在很多个地方, 所以需要修改的代码量就会变多,
 *      我们希望尽量减少这种修改
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入想要什么披萨: ");
            String name = scanner.nextLine();
            Pizza pizza = null;
            switch(name){
                case "greek":
                    pizza = new GreekPizza();
                    break;
                case "cheese":
                    pizza = new CheesePizza();
                    break;
                default:
                    System.out.println("没有这种披萨");
            }
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }
    }
}
