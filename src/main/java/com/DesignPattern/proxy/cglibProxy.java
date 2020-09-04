package com.DesignPattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib实现的动态代理
 *
 * -----------------------------------------------
 * |      cglib动态代理      |      jdk动态代理    |
 * -----------------------------------------------
 * |使用继承的方式实现        |实现被代理类的接口实现 |
 * -----------------------------------------------
 * |不需要被代理类有一个接口   |运行时生成字节码,效率高|
 * -----------------------------------------------
 * |无法代理final修饰的类和方法|无法代理没有接口的方法 |
 * -----------------------------------------------
 */
public class cglibProxy {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        ProxyFactory1 proxyFactory = new ProxyFactory1();
        Teacher teacherProxy = (Teacher) proxyFactory.getProxyInstance(teacher);
        teacherProxy.teach();
    }
}

//被代理类
class Teacher{
    public void teach(){
        System.out.println("teaching...");
    }
}

class ProxyFactory1 implements MethodInterceptor{
    private Object target;

    public Object getProxyInstance(Object object){
        this.target = object;//这一步可以通过构造函数实现, 写在这里主要是可以代理不止一种类的对象

        //1. 创建cgilb提供的工具类
        Enhancer enhancer = new Enhancer();

        //2. 设置父类
        enhancer.setSuperclass(object.getClass());

        //3. 设置回调函数
        enhancer.setCallback(this);

        //4. 创建代理对象(通过继承实现)
        return enhancer.create();
    }

    //实现MethodInterceptor中的intercept, 在执行方法的时候这个拦截器就会执行
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("[cglib]前置处理");
        Object returnVal = method.invoke(target, objects);
        System.out.println("[cglib]后置扫尾");
        return returnVal;
    }
}
