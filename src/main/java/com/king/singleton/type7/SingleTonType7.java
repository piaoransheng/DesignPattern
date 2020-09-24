package com.king.singleton.type7;

/**
 * 静态内部类
 **/
public class SingleTonType7 {

    //构造器私有化
    private SingleTonType7(){

    }

    //静态内部类，该类中有一个静态属性SingleTonType7
    private static class InClass{
        private static final SingleTonType7 instance = new SingleTonType7();
    }

    //静态公有方法
    public static synchronized SingleTonType7 getInstance(){
        return InClass.instance;
    }
}