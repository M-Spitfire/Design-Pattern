package com.DesignPattern.adapter.classAdapter;

public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5() {
        int currentVoltage = output220() / 44;//获取220V电源并将电压变为5V
        System.out.println(currentVoltage + "V电压输出");
        return currentVoltage;
    }
}
