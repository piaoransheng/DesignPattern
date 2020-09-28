package com.king.bridge.brand;

import com.king.bridge.Brand;

/**
 * @author 3048
 */
public class XiaoMiBrand implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
