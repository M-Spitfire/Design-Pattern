package com.DesignPattern.mediator;

public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //闹钟类创建的时候就加入到中介的管理中
        mediator.addColleague(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者的getMessage, mediator和name定义在父类Colleague中
        getMediator().getMessage(stateChange, getName());
    }
}
