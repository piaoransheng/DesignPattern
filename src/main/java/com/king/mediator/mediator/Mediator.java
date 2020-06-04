package com.king.mediator.mediator;

import com.king.mediator.colleague.Colleague;

//中介者
public abstract class Mediator {
    //注册，将各个电器添加到中介者
    public abstract void register(String colleagueName, Colleague colleague);

    //获取消息
    public abstract void getMessage(int stateChange,String colleagueName);

    //发送消息
    public abstract void sendMessage();
}
