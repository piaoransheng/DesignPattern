package com.king.decorator2.decorator;

import com.king.decorator2.decorated.House;
import com.king.decorator2.decorated.House2011;

public class Decorator2016 extends Decorator {

    public Decorator2016(House house) {
        super(house);
    }

    public void findWife(){
        House2011 house2011 = (House2011) this.house;
        house2011.peopleList.add("老婆");
        System.out.println("2016年找到老婆");
    }

    public void addGoods(){
        House2011 house2011 = (House2011) this.house;
        house2011.goodsList.add("冰箱");
        System.out.println("2016年家里添加了冰箱");
    }

    @Override
    public void people() {
        super.people();
        findWife();
    }

    @Override
    public void goods() {
        super.goods();
        addGoods();
    }
}