package com.king.builder.improve;

public class HighHouseBulider extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给高楼房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给高楼房子封顶");
    }
}
