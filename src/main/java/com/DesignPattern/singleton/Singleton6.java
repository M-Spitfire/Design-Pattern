package com.DesignPattern.singleton;

/**
 * 双重检查
 * 优点:
 *      1. 满足懒加载
 *      2. 线程安全
 *      3. 同步效率高, 只有在第一次获取对象的时候会进入同步代码块创建对象
 * 缺点:
 */
public class Singleton6 {
    //1. 私有化构造器
    private Singleton6(){}

    //2. 申明单例对象
    private volatile static Singleton6 singleton6;

    //3. 提供获取单例对象的方法
    public Singleton6 getInstance(){
        if(singleton6 == null){
            synchronized (Singleton6.class){
                if(singleton6 == null){
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}
