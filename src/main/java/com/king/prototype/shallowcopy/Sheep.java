package com.king.prototype.shallowcopy;

import lombok.Data;

@Data
public class Sheep implements Cloneable {
    private int age;
    private String name;
    private String color;

    Sheep(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    /**
     * 重新clone方法
     *
     * @return 返回羊
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
