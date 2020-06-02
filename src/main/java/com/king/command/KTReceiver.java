package com.king.command;

//按钮的功能（命令接收者）
public class KTReceiver {
    public void on(){
        System.out.println("空调打开");
    }

    public void off(){
        System.out.println("空调关闭");
    }
}
