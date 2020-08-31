package com.DesignPattern.singleton;

/**
 * 懒汉式(线程安全, 同步代码块)
 * 优点:
 *      1. 满足懒加载
 * 缺点:
 *      1. 不能保证线程安全
 */
public class Singleton5 {
    //1. 私有化构造器
    private Singleton5(){}

    //2. 申明单例对象
    private static Singleton5 singleton5;

    //3. 提供获取单例对象的方法
    public Singleton5 getInstance(){
        if(singleton5 == null){
            synchronized (Singleton5.class){
                singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}
