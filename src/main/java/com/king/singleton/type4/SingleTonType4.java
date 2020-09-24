package com.king.singleton.type4;

/**
 * 懒汉式  线程安全，但是效率低
 **/

public class SingleTonType4 {
    //声明本类类型成员变量
    private static SingleTonType4 instance;

    //私有化构造函数
    private SingleTonType4(){

    }

    //对外提供公共访问接口
    public static synchronized SingleTonType4 getInstance(){
        if (instance == null){
            instance = new SingleTonType4();
        }
        return instance;
    }
}