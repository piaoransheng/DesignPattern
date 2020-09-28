package com.king.bridge.phone;

import com.king.bridge.Phone;
import com.king.bridge.Brand;

/**
 * @author 3048
 * 折叠样式手机
 */
public class FolderPhone extends Phone {

    /**
     * 构造器载入品牌
     *
     * @param brand 品牌
     */
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("折叠样式开机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("折叠样式关机");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("折叠样式打电话");
    }

}
