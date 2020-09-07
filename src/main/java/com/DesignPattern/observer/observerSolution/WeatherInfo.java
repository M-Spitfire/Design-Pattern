package com.DesignPattern.observer.observerSolution;

/**
 * 天气信息, 天气信息发生改变时, 首先会更新到这里, 然后提醒所有观察者执行相应操作
 */
public class WeatherInfo extends Subject{
    private double temperature;
    private double pressure;
    private double humidity;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    //设置最新的数据
    public void setData(double temperature, double pressure, double humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;

        //提醒观察者们这里的数据发生改变了
        //这个方法继承自Observable
        notifyObservers();

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(temperature, pressure, humidity);
        }
    }
}
