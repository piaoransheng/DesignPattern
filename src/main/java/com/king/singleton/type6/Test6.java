package com.king.singleton.type6;

/**
 * @Author lhc
 * @Date 2020-09-24 10:33
 **/
public class Test6 {
    public static void main(String[] args) {
        SingleTonType6 object1 = SingleTonType6.getInstance();
        SingleTonType6 object2 = SingleTonType6.getInstance();
        System.out.println(object1==object2);
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}