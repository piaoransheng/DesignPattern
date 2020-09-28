package com.king.decorator.decorator;


import com.king.decorator.Drink;

/**
 * obj是单品，是各种coffee，是被装饰类
 * super.des，super.getPrice()是调味品，是装饰类
 */
public class BaseDecorator extends Drink {
    //单品
    private Drink obj;

    public BaseDecorator(Drink obj) {  //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        //      调味品的价格，     单品的价格（构造器创建来的单品） 不理解看客户端 new Milk(order)  先点单品，再加调味
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //      调味品描述           调味品价格                单品的描述
        return super.des + "" + super.getPrice() + " && " + obj.getDes();
    }
}
