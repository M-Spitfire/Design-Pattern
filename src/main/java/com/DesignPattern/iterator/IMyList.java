package com.DesignPattern.iterator;

import java.util.Iterator;

/**
 * 自定义列表的接口
 *
 * @param <T>
 */
public interface IMyList<T> {
    void add(T t);
    Iterator<T> getIterator();
}
