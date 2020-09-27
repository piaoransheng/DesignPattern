package com.king.factory.absfactory.order;

import com.king.factory.absfactory.pizza.*;
import com.king.factory.simplefactory.pizza.ChessPizza;

/**
 * @Author lhc
 * @Date 2020-09-27 13:58
 **/
public class LDFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza =null;
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