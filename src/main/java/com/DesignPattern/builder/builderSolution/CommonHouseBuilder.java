package com.DesignPattern.builder.builderSolution;

/**
 * 普通房子建造类
 */
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        house.setBase("common base");
        System.out.println("build " + house.getBase() + "[BUILDER]");
    }

    @Override
    public void buildWall() {
        house.setWall("common wall");
        System.out.println("build " + house.getWall() + "[BUILDER]");
    }

    @Override
    public void buildRoof() {
        house.setRoof("common roof");
        System.out.println("build " + house.getRoof() + "[BUILDER]");
    }
}
