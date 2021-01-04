package com.king.decorator2.decorator;

import com.king.decorator2.decorated.House;
import com.king.decorator2.decorated.House2011;

public class Decorator2017 extends Decorator {

    public Decorator2017(House house) {
        super(house);
    }

    public void hasBabt() {
        House2011 house2011 = (House2011) this.house;
        house2011.peopleList.add("小孩");
        System.out.println("2017年家里添加了老婆");
    }

    public void addGoods(){
        House2011 house2011 = (House2011) this.house;
        house2011.goodsList.add("汽车");
        System.out.println("2017年家里添加了汽车");
    }


    @Override
    public void people() {
        super.people();
        hasBabt();
    }

    @Override
    public void goods() {
        addGoods();
        super.goods();
    }
}