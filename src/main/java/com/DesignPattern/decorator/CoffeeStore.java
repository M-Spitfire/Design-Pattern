package com.DesignPattern.decorator;

import com.DesignPattern.decorator.coffee.LongBlackCoffee;
import com.DesignPattern.decorator.decorator.Chocolate;
import com.DesignPattern.decorator.decorator.Milk;

/**
 * 装饰者模式
 *
 * 主要思想:
 *      将被装饰者和装饰者继承同一个父类, 让装饰着能够进行嵌套装饰
 *
 *      这个例子不同种类的咖啡属于被装饰着, 各种调味料属于装饰着, 它们都是Drink的子类
 *      看起来这个例子不是很好, 把饮料加到调料中优点不符合常识
 *      但是我们换一个jdk中的例子:IO流
 *      最初始的比如说InputStream, 然后把InputStream当作参数创建BufferedInputStream...以此类推,这就是典型的装饰者模式
 *
 * 装饰者模式 vs 桥接模式
 *      1. 两者都是为了解决类爆炸的设计模式(都通过组合或聚合来解决)
 *      2. 装饰着模式的被装饰着是稳定的, 尽管不停的装饰它, 但它本身并没有什么变化, 只是装饰品让它变得更强
 *      3. 桥接模式通过不断的组合(聚合), 使自己变得更强, 也就是说本身在变强
 */
public class CoffeeStore {
    public static void main(String[] args) {
        //点一份LongBlack
        Drink longBlack = new LongBlackCoffee();
        System.out.println(longBlack.getDes());
        System.out.println(longBlack.cost());

        //加巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.getDes());
        System.out.println(longBlack.cost());

        //加牛奶
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.getDes());
        System.out.println(longBlack.cost());

        //加巧克力
        longBlack = new Chocolate(longBlack);
        System.out.println(longBlack.getDes());
        System.out.println(longBlack.cost());
    }
}
