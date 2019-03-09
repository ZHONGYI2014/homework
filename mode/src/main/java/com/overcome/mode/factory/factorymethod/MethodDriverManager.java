package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Driver;

/**
 * 方法工厂：在简单工厂基础上改造
 * 抽象出工厂的方法
 * 缺点：类文件需要太多, 没能充分利用资源, 不节约
 */
public interface MethodDriverManager {


    /**
     * 简单工厂是 getDriverByName（String driverName）
     * @return
     */
    Driver getDriverName();


}
