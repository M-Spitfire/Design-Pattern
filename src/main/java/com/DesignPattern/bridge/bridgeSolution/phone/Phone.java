package com.DesignPattern.bridge.bridgeSolution.phone;

import com.DesignPattern.bridge.bridgeSolution.brand.Brand;

public abstract class Phone {
    protected Brand brand;
    protected String type;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();
    public abstract void close();
    public abstract void call();
}
