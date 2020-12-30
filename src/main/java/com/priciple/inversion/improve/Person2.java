package com.priciple.inversion.improve;

import com.priciple.inversion.improve.message.Message;

public class Person2 {
    public void readMessage(Message message) {
        System.out.println(message.getInfo());
    }
}