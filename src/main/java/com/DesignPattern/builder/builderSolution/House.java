package com.DesignPattern.builder.builderSolution;

/**
 * 最终的产品
 */
public class House {
    private String base;
    private String wall;
    private String roof;

    public House(String base, String wall, String roof) {
        this.base = base;
        this.wall = wall;
        this.roof = roof;
    }

    public House() {
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
