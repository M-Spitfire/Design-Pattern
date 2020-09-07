package com.DesignPattern.observer.observerSolution;

/**
 * 观察者模式
 *
 * 现在, 需要增加一个观察者时, 只需要添加一个新的观察者类, 并将它加入到被观察者的观察者集合中即可
 *
 * jdk中提供了util包中提供了Observer和Observable两个接口, 用于实现观察者模式
 * 不过在jdk9中标为过时, 原因是:
 *      1. 事件模型不完善, 和我们现在写的观察者模式一样, jdk提供的两个类同样不能明确到底是被观察者的哪一部分发生了改变
 *      2. Observer接口没有实现序列化接口, 导致不能序列化
 * 虽然删除了这两个类, 但是随机提供了更强大的Flow API, 由于现在的jdk版本还是8, 所以暂时不写这部分
 *
 * 观察者模式的意义在于: 优点类似于服务器推送, 内容产生之后提醒用户有新内容了.
 *                      如果不采用这种"推送"的方式, 只能是用客户端轮询的方式, 每隔一段时间来问一下是否有新内容产生
 *                      轮询方式显然是不如"推送"的(虽然各有优缺点, 在网络上需要建立长连接, 在Java里没有这个忧虑),
 *                      需要有一个线程设置定时器不断查询, 间隔时间长则实时性若, 间隔时间短则消耗大量cuo资源
 *
 */
public class Main {
    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo();

        //添加观察者:新浪天气和腾讯天气
        weatherInfo.addObserver(new SinaWeather());
        weatherInfo.addObserver(new TencentWeather());

        //天气发生改变
        weatherInfo.setData(12, 13, 14);
    }
}
