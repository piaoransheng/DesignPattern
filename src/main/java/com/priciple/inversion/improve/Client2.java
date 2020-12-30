package com.priciple.inversion.improve;

import com.priciple.inversion.improve.message.EmailMessage;
import com.priciple.inversion.improve.message.WechatMessage;

/**
 * 使用依赖倒转原则：使用接口或者抽象类
 * 新增消息类型不用在person类再加readMessage方法，只需要再加一个消息实现Message接口
 */
public class Client2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.readMessage(new EmailMessage());
        person2.readMessage(new WechatMessage());
    }
}