package com.DesignPattern.command;

import com.DesignPattern.command.commands.Command;
import com.DesignPattern.command.commands.NoCommand;
import com.DesignPattern.command.commands.OffCommand;
import com.DesignPattern.command.commands.OnCommand;

public class RemoteController {
    //能够存储五条命令
    private Command[] onCommands = new Command[5];
    private Command[] offCommands = new Command[5];
    //记录当前操作， 用于撤销
    private Command cancelCommand = new NoCommand();

    public RemoteController() {
        for (int i = 0; i < 5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置命令
    public void setOnCommands(int index, OnCommand onCommand){
        onCommands[index] = onCommand;
    }
    public void setOffCommands(int index, OffCommand offCommand){
        offCommands[index] = offCommand;
    }

    //打开
    public void openEquipment(int index){
        onCommands[index].execute();
        cancelCommand = onCommands[index];
    }

    //关闭
    public void closeEquipment(int index){
        offCommands[index].execute();
        cancelCommand = offCommands[index];
    }

    //取消
    public void cancel(){
        cancelCommand.cancel();
    }
}
