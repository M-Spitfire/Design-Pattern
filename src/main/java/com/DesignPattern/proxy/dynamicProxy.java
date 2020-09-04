package com.DesignPattern.proxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class dynamicProxy {
    public static void main(String[] args) {
        ClothFactory clothFactory = new ClothFactory();
        //生成的代理类装换成被代理类的接口, 如果转换成被代理类的类型, 会报转换失败
        Factory proxyFactory = (Factory) ProxyFactory.getProxyInstance(clothFactory);
        proxyFactory.makeCloth();
    }
}

/**
 * 这里被代理类及其接口就借用静态代理里面的了
 */

//代理类工厂
class ProxyFactory{
    public static Object getProxyInstance(Object object){
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("[动态代理]前置准备");
                        Object returnVal = method.invoke(object, args);
                        System.out.println("[动态代理]后置扫尾");
                        return returnVal;
                    }
                });
    }
}
