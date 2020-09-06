package com.DesignPattern.observer.solution1;

/**
 * 最新的天气信息
 */
public class CurrentWeather {
    private double temperature;
    private double pressure;
    private double humidity;

    //更新数据
    public void update(double temperature, double pressure, double humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        show();
    }

    //显示最新的天气信息
    private void show(){
        System.out.println("温度:" + temperature);
        System.out.println("气压:" + pressure);
        System.out.println("湿度:" + humidity);
    }
}
