package com.overcome.mybatis.v2.registory;


import com.overcome.mybatis.po.User;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册SQl语句
 */
public class MapperRegistory {

    public static final Map<String, MapperData> methodSqlMapping = new HashMap<>();


    public MapperRegistory() {
        methodSqlMapping.put("com.overcome.mybatis.v1.dao.TestMapper.selectByPrimaryKey",
                new MapperData("select * from t_user where id = %d", User.class));
    }

    public MapperData getByNameSpace(String nameSpace) {
        return methodSqlMapping.get(nameSpace);
    }

    /**
     * 内部类
     * @param <T>
     */
    public class MapperData<T> {

        private String sql;
        /** 结果类型 */
        private Class<T> type;

        public MapperData(String sql, Class<T> type) {
            this.sql = sql;
            this.type = type;
        }

        public String getSql() {
            return sql;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }

        public Class<T> getType() {
            return type;
        }

        public void setType(Class<T> type) {
            this.type = type;
        }
    }
}
