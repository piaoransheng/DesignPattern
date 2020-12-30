package com.priciple.inversion.improve.message;

public class EmailMessage implements Message {
    @Override
    public String getInfo() {
        return "邮件信息，你好";
    }
}