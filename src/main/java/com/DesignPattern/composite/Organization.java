package com.DesignPattern.composite;

public abstract class Organization {
    protected String des;
    protected String name;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization(String des, String name) {
        this.des = des;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "des='" + des + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //抽象方法: 打印
    public abstract void print();

    //添加和删除默认空实现
    public void add(Organization organization){}
    public void remove(Organization organization){}
}
