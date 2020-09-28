package com.king.bridge.phone;

import com.king.bridge.Phone;
import com.king.bridge.Brand;


/**
 * 直立手机
 * @author 3048
 */
public class UpPhone extends Phone {

    /**
     * 构造器载入品牌
     *
     * @param brand 品牌
     */
    public UpPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("直立样式开机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("直立样式关机");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("直立样式打电话");
    }
}
