package com.DesignPattern.strategy.solution1;

/**
 * 北京鸭
 */
public class BeijingDuck extends Duck{
    @Override
    public void fly() {
        System.out.println("北京鸭不会飞");
    }
}
