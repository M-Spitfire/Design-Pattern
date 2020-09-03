package com.DesignPattern.bridge.bridgeSolution.phone;

import com.DesignPattern.bridge.bridgeSolution.brand.Brand;

public class SlidePhone extends Phone{


    public SlidePhone(Brand brand) {
        super(brand);
        type = "slide";
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
