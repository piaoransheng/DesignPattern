package com.king.decorator2;

import com.king.decorator2.decorated.House;
import com.king.decorator2.decorated.House2011;
import com.king.decorator2.decorator.Decorator2016;
import com.king.decorator2.decorator.Decorator2017;

public class Client {
    public static void main(String[] args) {
        System.out.println("———————————————————————————2011年情况———————————————————————————");
        House house2011 = new House2011();
        house2011.people();
        house2011.goods();


        System.out.println("———————————————————————————2016年情况———————————————————————————");
        House decorator2016 = new Decorator2016(house2011);
        decorator2016.people();
        decorator2016.goods();


        System.out.println("———————————————————————————2017年情况———————————————————————————");
        House decorator2017 = new Decorator2017(house2011);
        decorator2017.people();
        decorator2017.goods();
    }
}