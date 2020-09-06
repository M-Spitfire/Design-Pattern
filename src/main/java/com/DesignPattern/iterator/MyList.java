package com.DesignPattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList<T> implements IMyList<T>{

    private Object[] data = new Object[5];//模拟一下, 容量为5, 不支持扩容
    private int size = 0;//当前存有几个元素

    //迭代器类, 写成内部类的原因是迭代器和容器往往是一对一的关系
    private class MyIterator implements Iterator<T>{
        private int index = 0;//用于迭代器遍历

        @Override
        public boolean hasNext() {
            return index < 5 && data[index] != null;//容量固定为5, 不扩容
        }

        @Override
        public T next() {
            return (T) data[index++];
        }
    }

    @Override
    public void add(T t) {
        data[size++] = t;
    }

    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }
}
