package com.overcome.mode.singleton;

/**
 * 饿汉单例
 * 优点：不加锁，效率高，绝对线程安全
 * 缺点：不管用不用都实例化浪费内存
 */
public class HungrySingleton {

    private HungrySingleton() {}

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

}
