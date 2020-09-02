package com.DesignPattern.adapter.classAdapter;

/**
 * 类适配器
 *
 * 优点:
 *      1. 继承了被适配的类, 可以适当重写一些方法
 * 缺点:
 *      1. Java只支持单继承, 由于被适配的类会被继承, 所以目标适配的类只能是一个接口, 有一定的局限性
 *      2. 同样是继承带来的问题, 在适配器中会暴露被适配类的一些方法
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
