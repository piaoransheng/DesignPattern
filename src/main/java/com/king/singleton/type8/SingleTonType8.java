package com.king.singleton.type8;

/**
 * 枚举
 **/
public class SingleTonType8 {
    public static void main(String[] args) {
        SingleTonEnum object1 = SingleTonEnum.INSTANCE;
        SingleTonEnum object2 = SingleTonEnum.INSTANCE;
        System.out.println(object1 ==object2);
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}


enum SingleTonEnum {
    INSTANCE;
    public void say(){
        System.out.println("hello");
    }
}