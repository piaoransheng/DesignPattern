package com.king.factory.absfactory.order;

/**
 * @Author lhc
 * @Date 2020-09-27 14:13
 **/
public class Client {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}