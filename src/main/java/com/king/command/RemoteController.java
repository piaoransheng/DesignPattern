package com.king.command;

import com.king.command.command.Command;
import com.king.command.command.NoCommand;

//遥控器
public class RemoteController {

    Command[] onCommands;   //遥控器上开机按钮数组
    Command[] offCommands;  //遥控器上关机按钮数组
    Command undoCommand;    //遥控器上撤销按钮

    //初始化按钮为空命令
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i =0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下 开机按钮
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下 关机按钮
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    //按下 撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
