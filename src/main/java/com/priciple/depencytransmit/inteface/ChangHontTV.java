package com.priciple.depencytransmit.inteface;

public class ChangHontTV implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视播放——接口方式传递依赖");
    }
}