package com.DesignPattern.visitor;

public class Woman extends Person{
    @Override
    public void vote(Action action) {
        action.getWomanResult(this);
    }
}
