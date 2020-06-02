package com.king.command.command;

public interface Command {
    public void execute();  //执行命令
    public void undo();   //撤销命令
}
