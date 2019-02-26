package com.gupao.mode.proxy;

import java.lang.reflect.Method;

public class NBDynamicProxy implements NBInvocationHandler {


    private Object target;

    public NBDynamicProxy(Object object) {
        this.target = object;
    }

    public Object getNBProxyInstace() {
        return NBProxy.newProxyInstance(new NBClassLoader(), target.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("手写动态代理真的NB");
        method.invoke(target, args);
        System.out.println("动态代理成功了！");
        return null;
    }
}
