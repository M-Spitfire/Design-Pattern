package com.DesignPattern.composite;

import java.util.HashSet;
import java.util.Set;

public class University extends Organization{
    Set<Organization> children = new HashSet<>();

    public University(String des, String name) {
        super(des, name);
    }

    @Override
    public void print() {
        System.out.println("------------------" + name + "------------------");
        for(Organization organization : children){
//            System.out.println(organization);
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
