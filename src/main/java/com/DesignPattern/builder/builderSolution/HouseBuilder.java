package com.DesignPattern.builder.builderSolution;

/**
 * 建造这抽象类, 当然也可以用interface
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //造地基
    public abstract void buildBase();
    //造墙
    public abstract void buildWall();
    //造屋顶
    public abstract void buildRoof();

    //造房子
    public House build(){
        return house;
    }
}
