package com.priciple.depencytransmit.construct;

/**
 * 依赖关系传递——构造函数
 * <p>
 * 看电视的方法没有依赖对象
 */
public class Client2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2(new ChangHongTV2());
        person2.watchTV();
    }
}