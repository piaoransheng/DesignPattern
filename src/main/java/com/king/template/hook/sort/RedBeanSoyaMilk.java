package com.king.template.hook.sort;

import com.king.template.hook.SoyaMilk;

/**
 * 红豆豆浆
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        System.out.println("加入上好的红豆");
    }
}
