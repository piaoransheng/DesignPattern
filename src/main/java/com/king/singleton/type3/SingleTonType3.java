package com.king.singleton.type3;

/**
 * 线程不安全懒汉式
 */
public class SingleTonType3 {
    private static SingleTonType3 instance;

    private SingleTonType3(){

    }

    //提供静态公用方法，当用到的时候才创建 即懒汉式
    public static SingleTonType3 getInstance(){
        if (instance == null){
            instance = new SingleTonType3();
        }
        return instance;
    }


}
