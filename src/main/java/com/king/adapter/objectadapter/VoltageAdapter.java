package com.king.adapter.objectadapter;

public class VoltageAdapter implements Ivoltage5V {
    private Voltage220V voltage220V;

    //通过构造器传入220V的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V();  //获取220V的电压
            dst = src / 44;
            System.out.println("适配完成，输出的电压为：" + dst +  "伏");
        }
        return dst;
    }
}
