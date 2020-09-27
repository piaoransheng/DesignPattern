package com.king.factory.simplefactory.pizza;

/**
 * @Author lhc
 * @Date 2020-09-24 11:27
 * 希腊披萨
 **/
public class ChessPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨的原材料");
    }
}