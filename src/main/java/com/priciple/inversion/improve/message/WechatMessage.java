package com.priciple.inversion.improve.message;

public class WechatMessage implements Message {
    @Override
    public String getInfo() {
        return "微信信息，你好";
    }
}