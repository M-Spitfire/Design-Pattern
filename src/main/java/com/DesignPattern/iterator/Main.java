package com.DesignPattern.iterator;

import java.util.Iterator;

/**
 * 迭代器模式
 *
 * 这个模式的目的是提供一个统一的遍历方式, 以隐藏底层的数据结构
 * 这里底层使用的是数组, 但是使用迭代器模式遍历在形式上和List完全相同
 *
 * 迭代器类主要是实现jdk提供的Iterator接口
 * 由于一种容器往往对应一种迭代器, 所以将迭代器类写成容器的内部类是一个不错的选择
 */
public class Main {
    public static void main(String[] args) {
        MyList<Student> studentList = new MyList<>();
        studentList.add(new Student("john", 18));
        studentList.add(new Student("tom", 19));

        Iterator<Student> iterator = studentList.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
