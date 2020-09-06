package com.DesignPattern.observer.solution1;

public class WeatherData {
    private double temperature;
    private double pressure;
    private double humidity;
    private CurrentWeather currentWeather;

    public WeatherData(CurrentWeather currentWeather){
        this.currentWeather = currentWeather;
    }

    //设置最新的数据
    public void setData(double temperature, double pressure, double humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;

        //更新到当前天气
        currentWeather.update(this.temperature,this.pressure,this.humidity);
    }
}
