package com.DesignPattern.command.commands;

import com.DesignPattern.command.receiver.Receiver;

/**
 * 打开命令
 *
 * 这里有点像装饰者模式， 将被装饰的接收者注入进来， 不过只有这一层
 */
public class OnCommand implements Command{
    Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void cancel() {
        receiver.off();
    }
}
