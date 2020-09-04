package com.DesignPattern.decorator.decorator;

import com.DesignPattern.decorator.Drink;

public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3);
    }
}
