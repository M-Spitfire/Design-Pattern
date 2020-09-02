package com.DesignPattern.adapter.classAdapter;

/**
 * 这个类是220V电源
 *
 * 需要使用适配器将电压改为5V才能够给手机充电
 */
public class Voltage220 {
    private Integer voltage = 220;

    //默认构造函数

    //输出220V电压
    public int output220(){
        System.out.println(voltage + "V电压输出");
        return voltage;
    }
}
