package com.king.decorator.decorator;

import com.king.decorator.Decorator;
import com.king.decorator.Drink;

//具体的decorator，这里就是调味品
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.0f);  //一份豆浆调味品1块钱
    }
}
