package com.DesignPattern.visitor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男性用户评价：淘汰");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性用户评价：淘汰");
    }
}
