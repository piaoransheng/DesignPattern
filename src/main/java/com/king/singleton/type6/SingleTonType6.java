package com.king.singleton.type6;

/**
 * @Author lhc
 * @Date 2020-09-24 10:26
 **/
public class SingleTonType6 {
    private static volatile SingleTonType6 instance;

    private SingleTonType6() {

    }

    public static SingleTonType6 getInstance() {
        if (instance == null) {
            synchronized (SingleTonType6.class) {
                if (instance == null) {
                    instance = new SingleTonType6();
                }
            }
        }
        return instance;
    }
}