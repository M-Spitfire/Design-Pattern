package com.DesignPattern.decorator.decorator;

import com.DesignPattern.decorator.Drink;

/**
 * 装饰类
 *
 * drink成员通过多态将咖啡(也可以是添加过调味料的咖啡)注入进来, 这样就可以进行递归'装饰'了
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        //当前花费是当前装饰类的钱加上drink(可能有装饰)的钱
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //更新一下描述, 当前装饰类的描述 + 注入进来的drink的描述
        //这里由于重写了getDes方法, 所以不能使用getDes获取装饰类的描述信息, 这样会导致递归调用
        //由于描述信息定义在Drink中(父类), 所以我们用super.getDes获取描述
        return super.getDes() + " " + getPrice() + " || " + drink.getDes();
    }
}
