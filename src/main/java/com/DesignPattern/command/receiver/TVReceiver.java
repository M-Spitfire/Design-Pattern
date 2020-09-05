package com.DesignPattern.command.receiver;

public class TVReceiver extends Receiver{
    @Override
    public void on() {
        System.out.println("TV is open");
    }

    @Override
    public void off() {
        System.out.println("TV is close");
    }
}
