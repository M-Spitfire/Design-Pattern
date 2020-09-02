package com.DesignPattern.adapter.objectAdapter;

/**
 * 对象适配器
 *
 * 于类适配器的区别很小, 只是适配器类不在继承被适配的类, 而是作为一个成员进行聚合
 * 这样做的好处:
 *      1. 继承之后父类的方法可以被重写, 虽然提高了灵活度, 但是也存在篡改的风险
 *      2. 继承的主要目的是代码重用, 聚合同样能够起到这个作用
 */
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220()));
    }
}
