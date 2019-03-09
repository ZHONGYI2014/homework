package com.overcome.mode.factory;

import java.sql.Connection;
import java.util.Properties;

/**
 * Driver Java定义的接口
 * 有mysql、oracle、SQLServer等公司实现
 */
public class MysqlDriver implements Driver {


    @Override
    public Connection Connect(String url, Properties info) {

        //todo
        //Class.forName("com.mysql.jdbc.Driver");
        return null;
    }

    @Override
    public String getName() {
        return "com.mysql.jdbc.Driver";
    }
}
