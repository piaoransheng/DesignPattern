package com.king.decorator;

/**
 * 咖啡类，继承饮料类
 */
public class Coffe extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
