package com.king.singleton.type1;

/**
 * 静态变量饿汉式  这种单例模式可以用，但可能造成内存浪费
 */
public class SingleTonType1 {
    //1.构造器私有化
    private SingleTonType1(){

    }

    //2.本类内部创建对象实例
    private final static SingleTonType1 instance = new SingleTonType1();

    //3.提供公有的静态方法，返回实例对象
    public static SingleTonType1 getInstance(){
        return instance;
    }
}
