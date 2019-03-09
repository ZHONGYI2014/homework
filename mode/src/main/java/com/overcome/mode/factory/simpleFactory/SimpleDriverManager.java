package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.MysqlDriver;
import com.overcome.mode.factory.OracleDriver;

/**
 * 获取 driver 的简单工厂方法
 * 缺点：违背了开闭原则、工厂类职责太重
 */
public class SimpleDriverManager {


    /**
     * 通过传入参数来获取相应的驱动
     * @param name
     * @return
     */
    public String getDriverByName(String name) {
        if ("mysql".equals(name)) {
            return new MysqlDriver().getName();
        } else if("oracle".equals(name)) {
            return new OracleDriver().getName();
        }
        return null;
    }

    public static void main(String[] args) {
        SimpleDriverManager manager = new SimpleDriverManager();
        String mysql = manager.getDriverByName("mysql");
        String oracle = manager.getDriverByName("oracle");
        System.out.println(mysql + "\n"+ oracle);
    }
}
