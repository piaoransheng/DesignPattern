package com.king.proxy.cglib.business;

public class TeacherDao  {
    public void teach() {
        System.out.println("老师正在授课中,我是cglib，目标对象里面的teach方法，不需要接口");
    }

    public void say(String name) {
        System.out.println("hello " + name);
    }
}
