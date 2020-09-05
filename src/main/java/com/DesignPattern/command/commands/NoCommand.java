package com.DesignPattern.command.commands;

/**
 * 空命令
 *
 * 单独为空操作写一个空命令， 在没有操作的时候传一个空命令对象， 这样在执行的时候不必判断命令是否为空
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        //空实现即可
    }

    @Override
    public void cancel() {
        //空实现即可
    }
}
