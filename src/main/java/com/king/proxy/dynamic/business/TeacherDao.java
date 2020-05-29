package com.king.proxy.dynamic.business;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    @Override
    public void say(String name) {
        System.out.println("hello " + name);
    }
}
