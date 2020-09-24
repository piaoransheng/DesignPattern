package com.king.singleton.type7;

import com.king.singleton.type6.SingleTonType6;

/**
 * @Author lhc
 * @Date 2020-09-24 10:33
 **/
public class Test7 {
    public static void main(String[] args) {
        SingleTonType7 object1 = SingleTonType7.getInstance();
        SingleTonType7 object2 = SingleTonType7.getInstance();
        System.out.println(object1==object2);
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}