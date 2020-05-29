package com.king.proxy.staticproxy;

import com.king.proxy.staticproxy.business.ITeacherDao;
import com.king.proxy.staticproxy.business.TeacherDao;

public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //2.创建代理对象
        Proxy proxy = new Proxy(teacherDao);
        //3.代理对象执行方法
        proxy.teach();
    }
}
