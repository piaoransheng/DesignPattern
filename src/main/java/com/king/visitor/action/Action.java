package com.king.visitor.action;

import com.king.visitor.person.Man;
import com.king.visitor.person.Women;

public abstract class Action {

    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女性的测评
    public abstract void getWomanResult(Women women);
}
