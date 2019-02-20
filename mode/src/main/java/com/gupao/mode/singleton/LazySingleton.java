package com.gupao.mode.singleton;

public class LazySingleton {

    private LazySingleton() {}

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (null != instance) {

        } else {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
