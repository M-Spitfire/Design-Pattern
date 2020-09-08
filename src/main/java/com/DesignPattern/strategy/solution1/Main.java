package com.DesignPattern.strategy.solution1;

/**
 * 传统解决方案
 *
 * 首先写一个高层的Duck类, 里面定义了鸭子的所有相关方法
 * 具体的某一种鸭子去继承这个Duck类
 *
 * 这样的方式会带来以下不足:
 *      1. 如果Duck类中的方法具有默认实现, 那么继承它的子类也会继承这个实现, 需要重写方法
 *      2. 一旦Duck类发生了修改, 那么继承它的所有子类都有可能需要修改
 */
public class Main {
    public static void main(String[] args) {

    }
}
