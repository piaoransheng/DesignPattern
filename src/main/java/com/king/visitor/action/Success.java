package com.king.visitor.action;

import com.king.visitor.action.Action;
import com.king.visitor.person.Man;
import com.king.visitor.person.Women;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人得到的评价是成功");
    }

    @Override
    public void getWomanResult(Women women) {
        System.out.println("女人得到的评价是成功");
    }
}
