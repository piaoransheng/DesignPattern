package com.king.factory.absfactory.pizza;

/**
 * @Author lhc
 * @Date 2020-09-24 11:27
 * 希腊披萨
 **/
public class BJChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备北京奶酪披萨的原材料");
    }
}