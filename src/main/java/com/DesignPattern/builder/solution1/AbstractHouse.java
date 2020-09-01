package com.DesignPattern.builder.solution1;

/**
 * 房子抽象类
 */
public abstract class AbstractHouse {
    //造地基
    public abstract void buildBase();
    //造墙
    public abstract void buildWall();
    //造屋顶
    public abstract void buildRoof();

    //造房子
    public void buildHouse(){
        buildBase();
        buildWall();
        buildRoof();
    }
}
