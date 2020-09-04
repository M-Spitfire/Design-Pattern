package com.DesignPattern.composite;

/**
 * 组合模式应该说现在使常识了, 不多说
 */
public class Main {
    public static void main(String[] args) {
        College computer = new College("science", "computer");
        College infoEngine = new College("info", "infoEngine");

        computer.add(new Department("软件工程", "软件工程"));
        computer.add(new Department("计算机科学", "计算机科学"));

        infoEngine.add(new Department("通信工程","通信工程"));

        University university = new University("清华大学", "清华大学");
        university.add(computer);
        university.add(infoEngine);

        university.print();
    }
}
