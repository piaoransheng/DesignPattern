package com.king.singleton.type1;

public class Test1 {
    public static void main(String[] args) {
        //测试
        SingleTonType1 object1 = SingleTonType1.getInstance();
        SingleTonType1 object2 = SingleTonType1.getInstance();
        System.out.println(object1 == object2);
        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());
    }
}
