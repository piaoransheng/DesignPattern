package com.king.factory.absfactory.order;

import com.king.factory.absfactory.pizza.Pizza;

/**
 * @Author lhc
 * @Date 2020-09-27 13:58
 **/
public abstract class AbsFactory {
    public abstract Pizza createPizza(String pizzaType);
}