package com.king.visitor.action;

import com.king.visitor.person.Man;
import com.king.visitor.person.Women;

public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人待定");
    }

    @Override
    public void getWomanResult(Women women) {
        System.out.println("女儿待定");
    }
}
