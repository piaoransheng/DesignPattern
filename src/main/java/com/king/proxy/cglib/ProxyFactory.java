package com.king.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    //目标对象
    private Object target;

    //构造器(目的就是传入目标对象)
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //创建代理对象
    public Object getProxyInstance(){
        //1.创建工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.设置子类对象，即代理对象
        return enhancer.create();
    }

    //代理执行方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始");
        //目标对象的方法执行
        Object result = method.invoke(target, args);
        System.out.println("cglib代理模式完成");
        return result;
    }
}
