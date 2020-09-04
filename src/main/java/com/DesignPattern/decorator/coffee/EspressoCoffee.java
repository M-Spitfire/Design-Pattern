package com.DesignPattern.decorator.coffee;

/**
 * 意式咖啡
 *
 * 设置描述和价格
 */
public class EspressoCoffee extends Coffee{
    public EspressoCoffee() {
        setDes("意大利咖啡 ");
        setPrice(6);
    }
}
