package com.DesignPattern.prototype.prototypeSolution;

/**
 * 原型模式复制对象
 */
public class Client {
    public static void main(String[] args) {
        //原有的羊
        Sheep sheep = new Sheep("lucy", "white");

        //复制羊
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);

        //false, 说明使用clone()复制的对象和原来的对象不是同一个
        //但这不能说明clone()方法就是深复制, 继续往下看
        System.out.println(sheep == sheep1);

        sheep.setFriend(new Sheep("lilei", "yellow"));
        Sheep sheep4 = sheep.clone();
        //false, 说明使用clone()复制的对象和原来的对象不是同一个
        System.out.println(sheep == sheep4);
        //true, 但是如果成员是引用数据类型, 则这些成员是浅复制
        System.out.println(sheep.getFriend() == sheep4.getFriend());

        //使用clone()方法实现完全的深复制, 内部的引用数据类型同样需要实现Cloneable接口和重写clone方法
        //当类中的引用数据类型比较多时, 写起来就比较麻烦了, 不太推荐使用
        Sheep sheep5 = sheep.deepClone();
//        sheep5.setFriend(sheep.getFriend().clone());
        System.out.println(sheep == sheep5);//false
        System.out.println(sheep.getFriend() == sheep5.getFriend());//false

        //使用序列化和反序列化实现深复制
        //不管类中的成员如何复杂, 代码都是一样的, 推荐使用
        Sheep sheep6 = sheep.serializeClone();
        System.out.println(sheep == sheep6);//false
        System.out.println(sheep.getFriend() == sheep6.getFriend());//false
    }
}
