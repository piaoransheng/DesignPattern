package com.king.builder.improve;

public class Client {
    public static void main(String[] args) {
        //准备盖房子的技术人员
        HouseBuilder houseBulider = new HighHouseBulider();
        //准备盖房子的指挥者
        HouseDirector houseDirector = new HouseDirector(houseBulider);
        House house = houseDirector.buildHouse();
    }
}
