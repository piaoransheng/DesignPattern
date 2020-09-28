package com.king.bridge;

/**
 * 手机
 * @author 3048
 */
public class Phone {

    /**
     * 品牌
     */
    private Brand brand;

    /**
     * 构造器载入品牌
     *
     * @param brand 品牌
     */
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }
}
