package com.DesignPattern.command;

import com.DesignPattern.command.commands.OffCommand;
import com.DesignPattern.command.commands.OnCommand;
import com.DesignPattern.command.receiver.LightReceiver;
import com.DesignPattern.command.receiver.TVReceiver;

/**
 * 命令模式
 *
 * 命令调用者：顾名思义
 * 命令：每一条命令都对应一个命令对象
 * 命令接受者：命令的最终执行者
 *
 * 命令调用者使用命令， 命令对象将任务交给命令执行者去执行
 * 将发起请求的对象与执行请求的对象解耦。发起请求的对象是调用者，调用者只要调用命令对象的 execute()方法就可以让接收者工作，
 * 而不必知道具体的接收者对象是谁、是如何实现的，命令对象会负责让接收者执行请求的动作，
 * 也就是说："请求发起者"和"请求执行者"之间的解耦是通过命令对象实现的，命令对象起到了纽带桥梁的作用。
 *
 * 有时候可以不必单独写一个命令接收者， 将具体命令和命令接收者合二为一即可
 *
 * 优点：
 *      1. 容易设计一个命令队列。只要把命令对象放到列队，就可以多线程的执行命令
 *      2. 容易实现对请求的撤销和重做
 * 缺点：
 *      1. 可能产生类爆炸。在这个例子中命令接收者（电灯和电视）都只有打开和关闭两个方法， 因此可以进行抽象，减少类的数量
 *      如果不能进行抽象，每一个命令接收者都需要对每一个命令写一个类，比如这个例子， 电灯需要实现LightOnCommand和LightOffCommand
 *      两个类，电视需要实现TVOnCommand和TVOffCommand两个类，以此类推， 这就会导致有很多命令对象
 */
public class Main {
    public static void main(String[] args) {
        //创建命令接收者
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();

        //创建遥控器
        RemoteController controller = new RemoteController();

        //设置命令
        controller.setOnCommands(0, new OnCommand(lightReceiver));
        controller.setOnCommands(1, new OnCommand(tvReceiver));
        controller.setOffCommands(0, new OffCommand(lightReceiver));
        controller.setOffCommands(1, new OffCommand(tvReceiver));

        //使用遥控器
        controller.openEquipment(0);
        controller.closeEquipment(0);
        controller.cancel();
        controller.openEquipment(1);
        controller.closeEquipment(1);
        controller.cancel();

    }
}
