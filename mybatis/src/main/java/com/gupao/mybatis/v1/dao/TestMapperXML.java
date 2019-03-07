package com.gupao.mybatis.v1.dao;

import java.util.HashMap;
import java.util.Map;

public class TestMapperXML {

    public static final String nameSpace = "com.gupao.mybatis.v1.dao.TestMapper";

    public static final Map<String, String> methodSqlMapping = new HashMap<String, String>();

    static {
        methodSqlMapping.put("selectByPrimaryKey", "select * from t_user where id = %d");
    }

}
