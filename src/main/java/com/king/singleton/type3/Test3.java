package com.king.singleton.type3;

/**
 * @Author lhc
 * @Date 2020-09-24 10:00
 **/
public class Test3 {
    public static void main(String[] args) {
        SingleTonType3 object1 = SingleTonType3.getInstance();
        SingleTonType3 object2 = SingleTonType3.getInstance();
        System.out.println( object1=object2 );
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}