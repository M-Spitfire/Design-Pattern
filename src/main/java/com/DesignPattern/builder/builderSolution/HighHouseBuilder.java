package com.DesignPattern.builder.builderSolution;

/**
 * 高楼建造类
 */
public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        house.setRoof("high base");
        System.out.println("build " + house.getBase() + "[BUILDER]");
    }

    @Override
    public void buildWall() {
        house.setRoof("high wall");
        System.out.println("build " + house.getWall() + "[BUILDER]");
    }

    @Override
    public void buildRoof() {
        house.setRoof("high root");
        System.out.println("build " + house.getRoof() + "[BUILDER]");
    }
}
