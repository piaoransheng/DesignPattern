package com.king.decorator.decorator;

import com.king.decorator.Drink;

//具体的decorator，这里就是调味品
public class Chocolate extends BaseDecorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);  //一份巧克力调味品3块钱
    }
}
