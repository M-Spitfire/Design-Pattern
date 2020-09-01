package com.DesignPattern.builder.builderSolution;

/**
 * 建造房子的指挥
 *
 * 由这个指挥类负责具体的建造过程
 */
public class HouseDirector {
    HouseBuilder builder = null;

    //使用构造器传入建造类
    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    //使用set方法传入建造类
    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build(){
        builder.buildBase();
        builder.buildWall();
        builder.buildRoof();
        return builder.build();
    }
}
