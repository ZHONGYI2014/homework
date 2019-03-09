package com.overcome.mode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 静态内部类在被调用之前不会被初始化
 */
public class LazyNBSingleton {

    private boolean initialized = false;

    /**
     * 这个是为了防止反射强吻
     */
    private LazyNBSingleton(){
        System.out.println("强吻");
        synchronized (LazyNBSingleton.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例已被侵犯");
            }
        }
    }



    public static final LazyNBSingleton getInstance() {
        return SingletonHolderInnderClass.INSTANCE;
    }

    /**
     * 默认不加载
     * 静态内部类在被调用之前不会被初始化
     */
    private static class SingletonHolderInnderClass {
        private static final LazyNBSingleton INSTANCE = new LazyNBSingleton();
    }

    //反射机制强制访问
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clzz = LazyNBSingleton.class;
        Constructor c = clzz.getDeclaredConstructor(null);
        c.setAccessible(true);
        c.newInstance();
    }

}
