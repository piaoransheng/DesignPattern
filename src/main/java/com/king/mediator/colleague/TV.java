package com.king.mediator.colleague;

import com.king.mediator.mediator.Mediator;

//具体的同时类：闹钟
public class TV extends Colleague {

    //构造器
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void setMessage(int message) {
    }
}
