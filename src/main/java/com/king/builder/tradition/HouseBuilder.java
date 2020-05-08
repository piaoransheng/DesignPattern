package com.king.builder.tradition;

public abstract class HouseBuilder {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void bulidWalls();

    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        bulidWalls();
        roofed();
    }
}
