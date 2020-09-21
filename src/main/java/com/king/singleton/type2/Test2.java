package com.king.singleton.type2;

public class Test2 {
    public static void main(String[] args) {
        //测试
        SingleTonType2 object1 = SingleTonType2.getInstance();
        SingleTonType2 object2 = SingleTonType2.getInstance();
        System.out.println(object1 == object2);
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}
