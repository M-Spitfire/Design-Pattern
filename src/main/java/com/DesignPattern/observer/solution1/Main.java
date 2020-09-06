package com.DesignPattern.observer.solution1;

/**
 * 传统解决方式
 *
 * 这样的方式又一个最大的缺陷:
 *      1. 目前只有CurrentWeather一个对象关注天气信息,
 *          如果需要添加一个新的观察者SinaWeather, 并且在WeatherData的setData()方法中加上SinaWeather的update()方法
 *          稍显麻烦, 违反了ocp原则
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentWeather());

        //更新天气信息
        weatherData.setData(29, 29, 29);
    }
}
