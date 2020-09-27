package com.king.factory.factorymethod.pizza;

/**
 * @Author lhc
 * @Date 2020-09-24 11:27
 * 希腊披萨
 **/
public class LDChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备伦敦奶酪披萨的原材料");
    }
}