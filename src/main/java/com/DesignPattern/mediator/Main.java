package com.DesignPattern.mediator;

/**
 * 中介者模式
 *
 * 就这个应用场景来说, 只能家具之间的相互调用可能是非常复杂的, 如果直接由一个家具调用另一个家具去执行操作
 * 那么其关系是网状结构, 耦合度非常高, 改一点就要改一片
 * 所以就用一个中介作为它们的只能消息总线, 当总线收到消息, 就去提醒相应的机器执行操作
 *
 * 优点:
 *      1. 能够有效降低类之间的耦合
 * 缺点:
 *      1. 结构非常复杂的系统中, 中介者本身会非常复杂, 承担的责任是非常重的, 一旦中介者出现问题, 后果可能比较严重
 */
public class Main {
    public static void main(String[] args) {
        //创建一个中介
        Mediator mediator = new ConcreteMediator();

        //创建一个闹钟, 起名alarm, 交给中介管理
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建一个咖啡机, coffeeMachine, 交给中介管理
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建一个窗帘, curtains, 交给中介管理
        Curtains curtains = new Curtains(mediator, "curtains");
        //创建一个电视, TV, 交给中介管理
        TV tV = new TV(mediator, "TV");

        //闹钟发出0提醒
        alarm.sendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.sendAlarm(1);
    }
}
