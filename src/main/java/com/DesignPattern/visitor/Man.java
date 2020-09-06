package com.DesignPattern.visitor;

public class Man extends Person{
    @Override
    public void vote(Action action) {
        action.getManResult(this);
    }
}
