package com.DesignPattern.builder.solution1;

public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBase() {
        System.out.println("build base for common house");
    }

    @Override
    public void buildWall() {
        System.out.println("build wall for common house");
    }

    @Override
    public void buildRoof() {
        System.out.println("build roof for common house");
    }
}
