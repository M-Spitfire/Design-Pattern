package com.DesignPattern.adapter.interfaceAdapter;

public class calculator implements myInterface{
    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void autoAdd(int a) {

    }
}
