package com.king.factory.absfactory.order;

import com.king.factory.absfactory.pizza.BJChessPizza;
import com.king.factory.absfactory.pizza.BJGreekPizza;
import com.king.factory.absfactory.pizza.Pizza;

/**
 * @Author lhc
 * @Date 2020-09-27 13:58
 **/
public class BJFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("chess".equals(pizzaType)) {
            pizza = new BJChessPizza();
            pizza.setName("北京奶酪披萨");
        } else if ("greek".equals(pizzaType)) {
            pizza = new BJGreekPizza();
            pizza.setName("北京希腊披萨");
        }
        return pizza;
    }
}