package com.DesignPattern.decorator.decorator;

import com.DesignPattern.decorator.Drink;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2);
    }
}
