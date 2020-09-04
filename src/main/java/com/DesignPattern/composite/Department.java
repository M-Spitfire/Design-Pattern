package com.DesignPattern.composite;

public class Department extends Organization{

    public Department(String des, String name) {
        super(des, name);
    }

    @Override
    public void print() {
//        System.out.println("------------------" + name + "------------------");
        System.out.println(this);
    }
}
