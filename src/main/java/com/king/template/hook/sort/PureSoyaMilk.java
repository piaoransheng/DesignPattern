package com.king.template.hook.sort;

import com.king.template.hook.SoyaMilk;

/**
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        //纯豆浆不添加配料
        System.out.println("这个方法不会执行");
    }

    @Override
    public boolean hook(){
        return false;
    }
}
