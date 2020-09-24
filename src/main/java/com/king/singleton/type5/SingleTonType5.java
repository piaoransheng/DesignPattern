package com.king.singleton.type5;

/**
 * 懒汉式 线程安全 效率高 同步代码块
 **/
public class SingleTonType5 {
    private static SingleTonType5 instance;

    private SingleTonType5(){

    }

    public static SingleTonType5 getInstance(){
        if (instance == null){
            synchronized (SingleTonType5.class){
                instance = new SingleTonType5();
            }
        }
        return instance;
    }
}