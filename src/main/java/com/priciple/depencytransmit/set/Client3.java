package com.priciple.depencytransmit.set;

/**
 * 依赖关系传递——set方法
 * <p>
 * 看电视的方法没有依赖对象
 */
public class Client3 {
    public static void main(String[] args) {
        Person3 person3 = new Person3();
        person3.setItv3(new ChangHongTV3());
        person3.watchTV();
    }
}