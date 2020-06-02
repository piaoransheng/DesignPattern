package com.king.visitor.person;

import com.king.visitor.action.Action;

public class Women extends Person {
    @Override
    public void adjust(Action action) {
        action.getWomanResult(this);
    }
}
