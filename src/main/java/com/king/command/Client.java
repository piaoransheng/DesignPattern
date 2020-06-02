package com.king.command;

import com.king.command.command.KTOffCommand;
import com.king.command.command.KTOnCommand;
import com.king.command.command.LightOffCommand;
import com.king.command.command.LightOnCommand;

public class Client {

    public static void main(String[] args) {

        //使用命令设计模式，通过遥控器实现对点灯的操作

        //1.创建电灯（命令接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //2.创建电灯按钮(命令)
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //3.创建遥控器（命令发送者）
        RemoteController remoteController = new RemoteController();
        //给遥控器设置命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        //4.发布命令
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();



        //1.创建命令接收者
        KTReceiver ktReceiver = new KTReceiver();

        //2.创建命令
        KTOnCommand ktOnCommand = new KTOnCommand(ktReceiver);
        KTOffCommand ktOffCommand = new KTOffCommand(ktReceiver);

        //3.命令发送者
        remoteController.setCommand(1,ktOnCommand,ktOffCommand);
        //4.发送命令
        remoteController.offButtonWasPushed(1);
        remoteController.onButtonWasPushed(1);
        remoteController.undoButtonWasPushed();

    }
}
