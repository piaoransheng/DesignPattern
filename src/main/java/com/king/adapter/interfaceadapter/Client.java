package com.king.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter(){
            @Override
            public void method1(){
                System.out.println("使用了m1的方法");
            }
        };
        interfaceAdapter.method1();
    }
}
