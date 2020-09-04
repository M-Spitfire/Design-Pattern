package com.DesignPattern.proxy;

/**
 * 静态代理
 *
 * 代理类与被代理类实现相同的接口, 实现被代理类实现的方法的同时, 可以在被代理类方法的基础上进行增强
 *
 * 优点:
 *      1. 简单直观
 *      2. 能够在不修改源代码的情况下增强原有的方法[代理模式都具有这个优点]
 * 缺点:
 *      1. 非常明显, 静态代理的方式每有一个被代理类, 就需要写一个代理类, 这带来了大量的编码量, 所以使用较少
 */
public class staticProxy {
    public static void main(String[] args) {
        ClothFactory clothFactory = new ClothFactory();
        ClothFactoryProxy clothFactoryProxy = new ClothFactoryProxy(clothFactory);
        clothFactoryProxy.makeCloth();
    }
}

interface Factory{
    void makeCloth();
}

//被代理类
class ClothFactory implements Factory{

    @Override
    public void makeCloth() {
        System.out.println("衣服工厂生产衣服");
    }
}

//代理类
class ClothFactoryProxy implements Factory{

    private Factory factory;

    public ClothFactoryProxy(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void makeCloth() {
        System.out.println("[代理类]生产衣服之前的一些工作");
        factory.makeCloth();
        System.out.println("[代理类]生产衣服之后的一些工作");
    }
}