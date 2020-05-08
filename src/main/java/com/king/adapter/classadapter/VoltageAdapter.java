package com.king.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Ivoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();  //获取220V电压
        int detV = srcV / 44;    //转成5V电压
        System.out.println("适配完成，输出的电压为：" + detV +  "伏");
        return detV;
    }
}
