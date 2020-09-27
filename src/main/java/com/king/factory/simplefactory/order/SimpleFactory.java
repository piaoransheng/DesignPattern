package com.king.factory.simplefactory.order;

import com.king.factory.simplefactory.pizza.ChessPizza;
import com.king.factory.simplefactory.pizza.GreekPizza;
import com.king.factory.simplefactory.pizza.Pizza;

/**
 * @Author lhc
 * @Date 2020-09-27 10:39
 **/
public class SimpleFactory {

    /**
     * 根据披萨类型返回对应披萨
     *
     * @param pizzaType 披萨类型
     * @return 披萨实例
     */
    public static Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("greak".equals(pizzaType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("chess".equals(pizzaType)) {
            pizza = new ChessPizza();
            pizza.setName("奶酪披萨");
        } else {
            System.out.println("没有类型为：" + pizzaType + "的披萨");
        }
        return pizza;
    }
}