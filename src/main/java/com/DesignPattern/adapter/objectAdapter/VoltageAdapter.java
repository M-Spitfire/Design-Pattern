package com.DesignPattern.adapter.objectAdapter;

public class VoltageAdapter implements Voltage5 {
    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int currentVoltage = 0;
        if(voltage220 != null){
            currentVoltage = voltage220.output220() / 44;//获取220V电源并将电压变为5V
        }
        System.out.println(currentVoltage + "V电压输出");
        return currentVoltage;
    }
}
