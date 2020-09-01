package com.DesignPattern.builder.solution1;

/**
 * 传统方式建造方资
 *
 * 优点:
 *      1. 简单易操作易于理解
 * 缺点:
 *      1. 将房子和建造过程封装在一起, 不方便程序的拓展和维护
 */
public class Main {
    public static void main(String[] args) {
        CommonHouse house = new CommonHouse();
        house.buildHouse();;
    }
}
