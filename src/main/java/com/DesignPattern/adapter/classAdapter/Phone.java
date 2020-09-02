package com.DesignPattern.adapter.classAdapter;

/**
 * 手机类, 调用适配器进行充电
 */
public class Phone {
    public void charge(Voltage5 voltageAdapter){
        //这里只是调用了适配成5V后的电源输出, 原来的220V输出依然可以使用
        if(voltageAdapter.output5() == 5){
            System.out.println("电压为5V, 可以充电");
        }
    }
}
