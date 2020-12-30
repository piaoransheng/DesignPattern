package com.priciple.inversion.common;

/**
 * 没有使用依赖倒转原则
 *
 * 缺点：如果要读微信信息，person类就得再加一个方法；使用接口，读微信信息person类就不用再加方法，只要价格微信消息类继承消息接口
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.readMessage(new Email());
    }
}