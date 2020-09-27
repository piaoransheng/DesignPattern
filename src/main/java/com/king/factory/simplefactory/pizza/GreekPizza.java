package com.king.factory.simplefactory.pizza;

/**
 * @Author lhc
 * @Date 2020-09-24 11:27
 * 巧克力披萨
 **/
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备巧克力披萨的原材料");
    }
}