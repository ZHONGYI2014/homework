package com.overcome.mode.factory.factorymethod;

/**
 * 方法工厂测试
 */
public class DriverTest {
    public static void main(String[] args) {
        MethodDriverManager mysqlManager = new MysqlDriverManager();
        MethodDriverManager oracleManager = new OracleDriverManager();
        System.out.println(mysqlManager.getDriverName().getName());
        System.out.println(oracleManager.getDriverName().getName());
    }
}
