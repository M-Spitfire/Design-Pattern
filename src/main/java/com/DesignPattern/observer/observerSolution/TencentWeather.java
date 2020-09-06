package com.DesignPattern.observer.observerSolution;

public class TencentWeather implements Observer{
    //在被观察者发生变化, 这个方法就会被调用
    @Override
    public void update(double temperature, double pressure, double humidity) {
        System.out.println("[tencent]天气信息发生变化");
        System.out.println("温度:" + temperature);
        System.out.println("气压:" + pressure);
        System.out.println("湿度:" + humidity);
    }
}
