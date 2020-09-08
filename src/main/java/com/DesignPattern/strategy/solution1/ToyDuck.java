package com.DesignPattern.strategy.solution1;

/**
 * 玩具鸭
 */
public class ToyDuck extends Duck{
    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
