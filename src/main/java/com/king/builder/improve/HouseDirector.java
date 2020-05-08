package com.king.builder.improve;

//指挥者，动态地指定建造流程
public class HouseDirector {
    private HouseBuilder houseBuilder = null;

    //构造器方式传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //set方式传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //处理建造房子的流程，交给指挥者
    public House buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        houseBuilder.buildBasic();
        House house = houseBuilder.buildHouse();
        return house;
    }

}
