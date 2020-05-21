package com.king.bridge;

//直立式手机
public class UpPhone extends Phone {

    //构造器
    public UpPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立样式手机");
    }
    public void close(){
        super.close();
        System.out.println("直立样式手机");
    }
    public void call(){
        super.call();
        System.out.println("直立样式手机");
    }
}
