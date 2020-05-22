package com.king.decorator;

import com.king.decorator.coffee.LongBlack;
import com.king.decorator.coffee.ShortBlack;
import com.king.decorator.decorator.Chocolate;
import com.king.decorator.decorator.Milk;

public class Client {
    //装饰者模式下订单：两份巧克力 + 1分牛奶 + LongBlack 的一杯饮料
    public static void main(String[] args) {

        //1.先点一份单排咖啡：longBlack
        Drink order = new ShortBlack();
        System.out.println(order.getDes());
        System.out.println(order.cost());

        //2.加入一分牛奶
        order = new Milk(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());

        //3.再加入一份巧克力
        order = new Chocolate(order);
        System.out.println(order.getDes());
        System.out.println(order.cost());

    }
}
