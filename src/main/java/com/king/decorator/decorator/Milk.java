package com.king.decorator.decorator;

import com.king.decorator.Drink;

//具体的decorator，这里就是调味品
public class Milk extends BaseDecorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);  //一份牛奶调味品3块钱
    }
}
