package com.king.facade;

import com.king.facade.list.DVD;
import com.king.facade.list.Popcorn;
import com.king.facade.list.Projecters;
import com.king.facade.list.Screen;

/**
 * 外观类
 */
public class Facade {

    /**
     * 各个接口
     */
    private DVD dvd;
    private Popcorn popcorn;
    private Projecters projecters;
    private Screen screen;

    /**
     * 构造函数
     */
    Facade() {
        this.dvd = DVD.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projecters = Projecters.getInstance();
        this.screen = Screen.getInstance();
    }


    /**
     * 开机
     */
    public void ready(){
        dvd.on();
        popcorn.on();
        projecters.on();
        screen.down();
    }

    /**
     * 关机
     */
    public void end(){
        dvd.off();
        popcorn.off();
        projecters.off();
        screen.up();
    }

}
