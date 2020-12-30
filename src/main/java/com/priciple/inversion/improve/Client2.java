package com.priciple.inversion.improve;

import com.priciple.inversion.improve.message.EmailMessage;
import com.priciple.inversion.improve.message.WechatMessage;

public class Client2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.readMessage(new EmailMessage());
        person2.readMessage(new WechatMessage());
    }
}