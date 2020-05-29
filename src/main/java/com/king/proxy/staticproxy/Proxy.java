package com.king.proxy.staticproxy;

import com.king.proxy.staticproxy.business.ITeacherDao;

/**
 * 静态代理对象
 */
public class Proxy implements ITeacherDao {
    private ITeacherDao target; //目标对象

    public Proxy(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();

        System.out.println("代理结束");

    }
}
