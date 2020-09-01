package com.DesignPattern.prototype.prototypeSolution;

import java.io.*;

/**
 * 羊
 */
//实现Cloneable接口, 这个接口里面其实什么也没有, 就是一个标记. 主要的功能还是后面重写Object类中的clone方法
public class Sheep implements Cloneable, Serializable {
    private String name;
    private String color;
    private Sheep friend;

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    //实际上是一个浅拷贝
    protected Sheep clone() {
        //使用Object里面的clone()方法, 原样复制
        //Object里面的clone()是一个native方法, 不是Java实现的
        //返回的是一个Object对象, 强转一下
        //这里为了CloneNotSupportedException, 去掉throw, 使用try,catch
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sheep;
    }

    //对引用数据类型单独处理, 实现深拷贝. 当类中的引用数据类型比较多时, 写起来就比较麻烦了
    public Sheep deepClone(){
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //单独处理引用数据类型
        assert sheep != null;
        sheep.setFriend(this.friend.clone());
        return sheep;
    }

    //序列化实现深复制
    public Sheep serializeClone(){
        //创建流
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        Sheep copySheep = null;

        try {
            //将当前对象序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化获取对象
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copySheep = (Sheep) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return copySheep;
    }
}
