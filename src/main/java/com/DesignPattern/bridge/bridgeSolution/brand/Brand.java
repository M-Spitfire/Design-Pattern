package com.DesignPattern.bridge.bridgeSolution.brand;

public abstract class Brand {
    protected String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Brand(String brandName) {
        this.brandName = brandName;
    }
}
