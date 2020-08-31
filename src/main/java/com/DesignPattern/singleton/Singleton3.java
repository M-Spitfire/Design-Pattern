package com.DesignPattern.singleton;

/**
 * 懒汉式(线程不安全)
 * 优点:
 *      1. 满足懒加载
 * 缺点:
 *      1. 在多线程环境下, 不能保证单例
 */
public class Singleton3 {
    //1. 私有化构造器
    private Singleton3(){}

    //2. 申明单例对象
    private static Singleton3 singleton3;

    //3. 提供获取单例对象的方法
    public Singleton3 getInstance(){
        if(singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
