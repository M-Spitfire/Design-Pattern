package com.DesignPattern.command.receiver;

/**
 * 命令的接收者的抽象类
 *
 * 这里写成接口也行
 *
 * 由于这个例子里面命令接收者只有电灯和电视两种， 都只有打开和关闭两个函数， 所以在这里进行抽象
 * 实际使用中可以不进行抽象
 */
public abstract class Receiver {
    public abstract void on();
    public abstract void off();
}
