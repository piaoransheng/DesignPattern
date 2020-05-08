package com.king.builder.improve;

public class Client {
    public static void main(String[] args) {
        //准备盖房子的技术人员
        CommonHouseBulider commonHouseBulider = new CommonHouseBulider();
        //准备盖房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouseBulider);
        House house = houseDirector.buildHouse();
    }
}
