package com.DesignPattern.observer.observerSolution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 被观察者抽象类
 */
public abstract class Subject {
    protected Set<Observer> observerList;//用于存放观察者

    public Subject() {
        this.observerList = new HashSet<>();
    }

    //添加观察者
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    //删除观察者
    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    //抽象方法, 提醒观察者们被观察者有变化了
    public abstract void notifyObservers();
}
