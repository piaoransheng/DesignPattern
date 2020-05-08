package com.king.adapter.objectadapter;

public class Phone {
    public void charge(Ivoltage5V ivoltage5V){  //传入一个接口
        if (ivoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电~~");
        }else if (ivoltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电~~");
        }
    }
}
