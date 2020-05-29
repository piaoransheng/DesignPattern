package com.king.proxy.cglib;

import com.king.proxy.cglib.business.TeacherDao;

public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        TeacherDao target = new TeacherDao();

        //2.创建代理对象
        TeacherDao proxy = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.teach();
    }
}
