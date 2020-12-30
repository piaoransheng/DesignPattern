package com.priciple.depencytransmit.construct;

public class ChangHongTV2 implements ITV2 {
    @Override
    public void play() {
        System.out.println("长虹电视播放——构造函数方式传递依赖");
    }
}