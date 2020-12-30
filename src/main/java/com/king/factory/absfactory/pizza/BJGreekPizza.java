package com.king.factory.absfactory.pizza;

/**
 * @Author lhc
 * @Date 2020-09-24 11:27
 * 巧克力披萨
 **/
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备北京希腊披萨的原材料");
    }
}