package com.priciple.inversion.common;

public class Person {
    public void readMessage(Email email) {
        System.out.println(email.getInfo());
    }
}