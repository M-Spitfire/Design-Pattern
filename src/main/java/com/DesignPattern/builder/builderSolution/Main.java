package com.DesignPattern.builder.builderSolution;

public class Main {
    public static void main(String[] args) {
        //创建要造的房子的建造类
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //创建指挥类
        HouseDirector director = new HouseDirector(commonHouseBuilder);
        //造房子
        House house = director.build();

        //改成造高楼
        director.setBuilder(new HighHouseBuilder());
        house = director.build();
    }
}
