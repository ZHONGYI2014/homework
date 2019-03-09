package com.overcome.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HourseProxy implements InvocationHandler {

    private Object target;

    public HourseProxy(Object obj) {
        this.target= obj;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在帮你筛选房源信息");
        Object obj = method.invoke(target, args);
        System.out.println("你已经拥有了一栋新房子");
        return obj;
    }
}
