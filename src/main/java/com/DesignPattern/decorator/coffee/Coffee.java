package com.DesignPattern.decorator.coffee;

import com.DesignPattern.decorator.Drink;

/**
 * 咖啡类, 重写一下cost方法, 返回单价
 */
public class Coffee extends Drink {
    @Override
    public double cost() {
        return getPrice();
    }
}
