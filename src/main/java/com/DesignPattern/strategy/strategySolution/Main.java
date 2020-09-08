package com.DesignPattern.strategy.strategySolution;

/**
 * 策略模式
 *
 * 与传统方式的主要区别在于:
 * 传统方式使用继承实现, 在拓展和维护上比较麻烦;
 * 策略模式将各种行为都写成一个类, 使用组合的形式实现, 拓展和维护方便, 但每个行为一个抽象, 抽象下面多个实现会导致类爆炸
 *
 * - 策略模式的关键是：分析项目中变化部分与不变部分
 * - 策略模式的核心思想是：多用组合/聚合 少用继承；用行为类组合，而不是行为的继承。更有弹性
 * - 体现了"对修改关闭，对扩展开放"原则，客户端增加行为不用修改原有代码，只要添加一种策略（或者行为） 即可，避免了使用多重转移语句（if..else if..else）
 * - 提供了可以替换继承关系的办法： 策略模式将算法封装在独立的 Strategy 类中使得你可以独立于其 Context 改变它，使它易于切换、易于理解、易于扩展
 * - 需要注意的是：每添加一个策略就要增加一个类，当策略过多时会导致类数目庞大
 */
public class Main {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();//

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.println("使用策略模式修改北京鸭的飞行能力");
        pekingDuck.fly();
    }
}
