package com.king.decorator2.decorator;

import com.king.decorator2.decorated.House;

/**
 * 装饰者
 * <p>
 * 装饰者的成员变量持有被装饰者对象
 */
public abstract class Decorator implements House {
    public House house;

    public Decorator(House house) {
        this.house = house;
    }

    @Override
    public void people() {
        house.people();
    }

    @Override
    public void goods() {
        house.goods();
    }
}