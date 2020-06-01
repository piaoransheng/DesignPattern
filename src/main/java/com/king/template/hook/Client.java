package com.king.template.hook;

import com.king.template.hook.sort.GreenBeanSoyaMilk;
import com.king.template.hook.sort.PureSoyaMilk;
import com.king.template.hook.sort.RedBeanSoyaMilk;

public class Client {
    public static void main(String[] args) {
        //1.制作红豆豆浆
        SoyaMilk soyaMilk1 = new RedBeanSoyaMilk();
        soyaMilk1.make();


        //2.制作绿豆豆浆
        SoyaMilk soyaMilk2 = new GreenBeanSoyaMilk();
        soyaMilk2.make();


        //3.制作纯豆浆
        SoyaMilk soyaMilk3 = new PureSoyaMilk();
        soyaMilk3.make();

    }
}
