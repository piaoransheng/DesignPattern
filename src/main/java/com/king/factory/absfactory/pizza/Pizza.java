package com.king.factory.absfactory.pizza;

import lombok.Data;

/**
 * @Author lhc
 * @Date 2020-09-24 11:21
 *   公用披萨
 **/
@Data
public abstract class Pizza {
    /**
     * 披萨名称
     */
    private String name;

    /**
     * 不同的披萨原材料不一样，所以我们做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "烘焙");
    }

    public void cut() {
        System.out.println(name + "切割");
    }

    public void box() {
        System.out.println(name + "打包");
    }

}