package com.DesignPattern.bridge.bridgeSolution.phone;

import com.DesignPattern.bridge.bridgeSolution.brand.Brand;

public class TouchPhone extends Phone{
    public TouchPhone(Brand brand) {
        super(brand);
        type = "touch";
    }

    @Override
    public void open() {
        System.out.println(brand.getBrandName() + type + "phone is open");
    }

    @Override
    public void close() {
        System.out.println(brand.getBrandName() + type + "phone is close");
    }

    @Override
    public void call() {
        System.out.println(brand.getBrandName() + type + "phone is call");
    }
}
