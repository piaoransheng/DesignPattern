package com.king.bridge.phone;

import com.king.bridge.Phone;
import com.king.bridge.Brand;

//折叠式手机
public class FolderPhone extends Phone {

    //构造器
    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠样式手机");
    }
}
