package com.DesignPattern.factory.solution1.pizza;

/**
 *
 */
public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    //下面是披萨制作的四个步骤
    //1. 准备
    public void prepare(){
        System.out.println("prepare " + name);
    }

    //2. 烘焙
    public void bake(){
        System.out.println("bake " + name);
    }

    //3. 切割
    public void cut(){
        System.out.println("cut " + name);
    }

    //4. 包装
    public void box(){
        System.out.println("box " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
