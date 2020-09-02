package com.DesignPattern.adapter.interfaceAdapter;

/**
 * 接口适配器
 *
 * 有些时候, 适配器要实现的接口中有很多方法, 适配其中只需要使用其中的一部分
 * 但是实现接口就必须实现所有接口中的抽象方法
 * 所以有了接口适配器模式
 *
 * 用一个抽象类先实现接口中的方法(可以是空实现), 然后由适配器继承这个抽象类, 重写需要的方法
 */
public class Main {
    public static void main(String[] args) {
        calculator calculator = new calculator();
        calculator.add(1,2);
    }
}
