package com.DesignPattern.composite;

import java.util.HashSet;
import java.util.Set;

public class College extends Organization{
    Set<Organization> children = new HashSet<>();

    public College(String des, String name) {
        super(des, name);
    }

    @Override
    public void print() {
        System.out.println("------------------" + name + "------------------");
//        System.out.println(this);
        for(Organization organization : children){
            organization.print();
        }
    }

    @Override
    public void add(Organization organization) {
        children.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        children.remove(organization);
    }
}
