package com.DesignPattern.singleton;

/**
 *饿汉式(静态常量)
 * 优点:
 *      写法简单, 在类装载的时候就创建对象, 避免了线程安全问题(类的装载过程是线程安全的, 使用了synchronized关键字)
 *缺点:
 *      1. 类装载的时候就创建对象, 没有做到懒加载, 如果在后续程序中没有使用这个独享, 会造成内存的浪费
 *      2. 如果是通过使用了getInstance()方法使虚拟机加载这个类, 那么能够起到类似懒加载的效果.
 *         但是导致类加载的原因可能有很多, 因此大部分情况下使不满足懒加载的
 */
public class Singleton1 {
    //1. 私有化构造器
    private Singleton1(){}

    //2. 内部创建对象
    private static final Singleton1 SINGLETON_1 = new Singleton1();

    //3. 提供获取对象的方法
    public static Singleton1 getInstance(){
        return SINGLETON_1;
    }
}
