package com.DesignPattern.observer.observerSolution;

/**
 * 观察者接口
 */
public interface Observer {
    //观察者只需要在被观察者出现变化后更新相关操作即可
    void update(double temperature, double pressure, double humidity);
}
