package com.king.command.command;

/**
 * 没有任何命令，即空执行；用于初始化每个按钮，但调用命令时，什么都不做
 * 其实，这是一种设计模式，可以省掉对空判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
