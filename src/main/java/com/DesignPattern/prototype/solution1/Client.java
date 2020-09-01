package com.DesignPattern.prototype.solution1;

/**
 * 复制对象的传统解决方法
 *
 * 将对象中的所有属性拿出来,用于构造器new一个新的对象
 *
 * 优点:
 *      1. 简单易操作, 易于理解
 *
 * 缺点:
 *      1. 复制对象时总是需要一个已经被实例化的对象用于获取属性, 如果对象比较复杂, 效率比较低
 *          这里总是需要一个对象用于获取属性不算缺点, 因为原型模式一样需要
 *          缺点在于如果属性的数量,名字等发生了改变, 需要修改代码
 *      2. 复制对象的过程是创建一个新的对象, 不够灵活
 *
 * 改进思路:
 *      Object类中提供了一个clone()方法, 用于复制Java对象
 *      使用clone()方法需要实现Cloneable接口, 这个接口表示这个类可以被复制且具有复制的能力
 */
public class Client {
    public static void main(String[] args) {
        //原有的羊
        Sheep sheep = new Sheep("tom", "black");

        //复制羊, 复制多少次就new多少次
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }
}
