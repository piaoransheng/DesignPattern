package com.king.visitor.person;

import com.king.visitor.action.Action;

public class Man extends Person {

    @Override
    public void adjust(Action action) {
        action.getManResult(this);
    }
}
