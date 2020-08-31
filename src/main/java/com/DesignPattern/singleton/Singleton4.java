package com.DesignPattern.singleton;

/**
 * 懒汉式(线程安全, 同步方法)
 * 优点:
 *      1. 满足懒加载
 *      2. 线程安全
 * 缺点:
 *      1. 同步的粒度太大, 只是在第一次调用的时候才需要同步, 之后都是直接返回的, 同步效率太低
 */
public class Singleton4 {
    //1. 私有化构造器
    private Singleton4(){}

    //2. 申明单例对象
    private static Singleton4 singleton4;

    //3. 提供获取单例对象的方法
    public synchronized Singleton4 getInstance(){
        if(singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}
