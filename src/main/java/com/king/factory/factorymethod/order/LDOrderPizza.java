package com.king.factory.factorymethod.order;

import com.king.factory.factorymethod.pizza.*;

/**
 * @Author lhc
 * @Date 2020-09-27 13:39
 **/
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("chess")){
            pizza = new LDChessPizza();
            pizza.setName("伦敦奶酪披萨");
        }else if (pizzaType.equals("greek")){
            pizza = new LDGreekPizza();
            pizza.setName("伦敦希腊披萨");
        }
        return pizza;
    }
}