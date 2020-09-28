package com.king.decorator.coffee;

import com.king.decorator.Drink;

/**
 * 咖啡类，继承饮料类
 */
public class BaseCoffe extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
