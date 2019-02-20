package com.gupao.mode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册方式
 */
public class RegisterSingleton {


    private RegisterSingleton() {}

    private static Map<String,Object> singleMap = new HashMap<String,Object>();

    public static RegisterSingleton getInstance(String name) {
        if (null == name) {
            name = RegisterSingleton.class.getName();
        }
        if (null == singleMap.get(name)) {
            singleMap.put(name, new RegisterSingleton());
        }
        return (RegisterSingleton)singleMap.get(name);
    }
}
