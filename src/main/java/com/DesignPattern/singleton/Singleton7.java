package com.DesignPattern.singleton;

/**
 * 静态内部类
 * 优点:
 *      1. 利用类装载机制保证线程安全
 *      2. 静态内部类不会和所在类一起加载, 而是在需要实例化的时候才加载, 以此保证懒加载
 * 缺点:
 */
public class Singleton7 {

    private Singleton7(){}

    private static class Instance{
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return Instance.SINGLETON_7;
    }
}
