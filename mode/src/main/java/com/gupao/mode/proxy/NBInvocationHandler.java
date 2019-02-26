package com.gupao.mode.proxy;

import java.lang.reflect.Method;

public interface NBInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;

}
