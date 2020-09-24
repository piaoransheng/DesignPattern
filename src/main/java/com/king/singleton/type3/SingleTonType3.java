package com.king.singleton.type3;

/**
 * 线程不安全懒汉式    （实际开发中不能用，因为多线程情况下会new多个对象）
 */
public class SingleTonType3 {

    private static SingleTonType3 instance;

    //2.构造器私有化
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
