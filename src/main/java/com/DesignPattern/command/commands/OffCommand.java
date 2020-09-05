package com.DesignPattern.command.commands;

import com.DesignPattern.command.receiver.Receiver;

/**
 * 关闭命令
 *
 * 这里有点像装饰者模式， 将被装饰的接收者注入进来， 不过只有这一层
 */
public class OffCommand implements Command{
    Receiver receiver;

    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 这里看到execute实际上只是调用了receiver的方法， 如果没有cancel方法的话，完全可以将这个命令和receiver合成一个
     * 不过这也可能导致类爆炸，每一个Receiver都需要为每一个命令写一个命令的类
     */
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void cancel() {
        receiver.on();
    }
}
