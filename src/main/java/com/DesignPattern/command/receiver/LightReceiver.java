package com.DesignPattern.command.receiver;

public class LightReceiver extends Receiver{
    @Override
    public void on() {
        System.out.println("light is open");
    }

    @Override
    public void off() {
        System.out.println("light is close");
    }
}
