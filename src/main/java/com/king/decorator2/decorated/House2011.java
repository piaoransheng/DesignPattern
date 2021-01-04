package com.king.decorator2.decorated;

import java.util.ArrayList;
import java.util.List;

public class House2011 implements House {
    public List<String> peopleList = new ArrayList<>();
    public List<String> goodsList = new ArrayList<>();

    @Override
    public void people() {
        peopleList.add("爸爸");
        peopleList.add("妈妈");
        peopleList.add("我");
        System.out.println("2011年家里有爸爸 妈妈  我");
    }

    @Override
    public void goods() {
        goodsList.add("手电筒");
        System.out.println("2011年家里有手电筒");
    }
}