package com.DesignPattern.decorator;

/**
 * 基本类, Coffee类和Decorator类都会继承这个类, 这样可以用组合的方式代替继承, 防止类爆炸
 */
public abstract class Drink {
    private String des;
    private double price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double cost();
}
