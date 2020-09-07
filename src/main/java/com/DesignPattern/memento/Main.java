package com.DesignPattern.memento;

/**
 * 备忘录模式
 *
 * 记录了某个对象的历史状态, 以此提供后悔药, 让用户能够恢复到以前的状态
 *
 * 个人理解: 备忘录模式就是记录某个对象的历史状态, 记录的方式可以是创建一个Memento类, 也可以是使用原型模式复制一个对象
 *          具体到这个例子: 整个备忘录的重点在于CareTaker这个类, 它提供了存储和获取备份的服务, 植于里面存的东西,
 *          只要是能够保存Role里面的数据即可, 不必拘泥于创建一个Memento对象来完成
 *
 * 优点:
 *      1. 提供了一种恢复机制
 * 缺点:
 *      1. 如果保存的状态比较多, 非常浪费内存
 */
public class Main {
    public static void main(String[] args) {
        //角色初始状态为攻击力100, 防御力100
        Role gameRole = new Role(100, 100);

        System.out.println("初始状态:" + gameRole);

        //创建备份负责人
        CareTaker caretaker = new CareTaker();

        //备份当前状态
        caretaker.setMemento(gameRole.createMemento());

        //受到debuff
        gameRole.setDef(30);
        gameRole.setAtk(30);
        System.out.println("受到debuff:" + gameRole);

        //debuff结束, 恢复状态
        gameRole.recoveryFromMemento(caretaker.getMemento());
        System.out.println("恢复状态:" + gameRole);
    }
}
