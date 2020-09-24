package com.king.singleton.type2;

/**
 * 静态代码块饿汉式  这种单例模式可以用，但可能造成内存浪费
 */
public class SingleTonType2 {
    //1.本类内部创建对象实例
    private static SingleTonType2 instance;
    static {
        //静态代码中创建单例对象
        instance = new SingleTonType2();
    }

    //2.构造器私有化
    private SingleTonType2(){

    }

    //3.提供公有的静态方法，返回实例对象
    public static SingleTonType2 getInstance(){
        return instance;
    }
}
