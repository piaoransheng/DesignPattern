package com.priciple.depencytransmit.set;

public class ChangHongTV3 implements ITV3 {
    @Override
    public void play() {
        System.out.println("长虹电视播放——set方法传递依赖");
    }
}