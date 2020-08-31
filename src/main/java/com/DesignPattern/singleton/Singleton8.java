package com.DesignPattern.singleton;

/**
 * 枚举
 * 优点:
 *      1. 各方面都属于完美级别的单例实现方式
 *
 *      前面介绍的所有方法都能够被反射破坏其单例的特性, 但是枚举类不会, 通过反射的newInstance()方法获取新实例的时候,
 *      如果创建的是一个枚举类对象, 会直接抛出异常, 反射失败
 */
public enum  Singleton8 {
    //1. 申明单例对象
    SINGLETON_8;

    //2. 私有化构造器(由于是枚举类, 前面的权限修饰符可以省略)
    Singleton8(){};

    public void saySomething(){
        System.out.println("hello");
    }
}
