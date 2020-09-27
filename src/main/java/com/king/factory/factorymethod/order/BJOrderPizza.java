package com.king.factory.factorymethod.order;

import com.king.factory.factorymethod.pizza.BJChessPizza;
import com.king.factory.factorymethod.pizza.BJGreekPizza;
import com.king.factory.factorymethod.pizza.Pizza;

/**
 * @Author lhc
 * @Date 2020-09-27 13:39
 **/
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("chess")){
            pizza = new BJChessPizza();
            pizza.setName("北京奶酪披萨");
        }else if (pizzaType.equals("greek")){
            pizza = new BJGreekPizza();
            pizza.setName("北京希腊披萨");
        }
        return pizza;
    }
}