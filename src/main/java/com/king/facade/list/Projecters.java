package com.king.facade.list;

/**
 * 投影仪
 */
public class Projecters {
    private static Projecters instance = new Projecters();

    public static Projecters getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projecters on");
    }
    public void off(){
        System.out.println("Projecters off");
    }
    public void play(){
        System.out.println("Projecters play");
    }
    public void focus(){
        System.out.println("Projecters focus");
    }
}
