package com.king.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理对象   实现InvocationHandler接口，重新invoke方法
public class ProxyFactory {

    private Object target;  //目标对象

    //构造器，对目标对象进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JKD动态代理开始");
                Object result = method.invoke(target, args);
                System.out.println("JKD动态代理结束");
                return result;
            }
        });
        return proxy;
    }
}
