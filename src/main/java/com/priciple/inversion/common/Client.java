package com.priciple.inversion.common;

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.readMessage(new Email());
    }
}