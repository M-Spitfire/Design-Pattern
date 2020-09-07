package com.DesignPattern.mediator;

/**
 * 终结者抽象类
 */
public abstract class Mediator {
    //添加"同事"的方法
    public abstract void addColleague(String name, Colleague colleague);
    //收到各"同事"后安排后续要执行的操作(主体)
    public abstract void getMessage(int stateChange, String ColleagueName);
    public abstract void sendMessage();
}
