package com.priciple.depencytransmit.inteface;

/**
 * 依赖关系传递——接口
 *
 * 看电视的方法传入依赖对象
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        ChangHontTV changHontTV = new ChangHontTV();
        person.watchTV(changHontTV);
    }
}