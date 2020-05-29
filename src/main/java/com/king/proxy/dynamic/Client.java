package com.king.proxy.dynamic;

import com.king.proxy.dynamic.business.ITeacherDao;
import com.king.proxy.dynamic.business.TeacherDao;

public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        ITeacherDao target = new TeacherDao();

        //2.创建代理对象
        ITeacherDao proxy = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //3.执行方法
//        proxy.teach();

        proxy.say("tom");

    }
}
