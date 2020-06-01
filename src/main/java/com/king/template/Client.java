package com.king.template;

import com.king.template.sort.GreenBeanSoyaMilk;
import com.king.template.sort.RedBeanSoyaMilk;

public class Client {
    public static void main(String[] args) {
        //1.制作红豆豆浆
        SoyaMilk soyaMilk1 = new RedBeanSoyaMilk();
        soyaMilk1.make();


        //2.制作绿豆豆浆
        SoyaMilk soyaMilk2 = new GreenBeanSoyaMilk();
        soyaMilk2.make();


    }
}
