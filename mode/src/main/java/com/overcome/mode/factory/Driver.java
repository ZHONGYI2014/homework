package com.overcome.mode.factory;

import java.sql.Connection;
import java.util.Properties;

public interface Driver {

    /**
     * 连接数据库的桥梁
     * @return 应该返回一个连接对象Connection 这里先简单处理下
     */
    Connection Connect(String url, Properties info);


    String getName();

}
