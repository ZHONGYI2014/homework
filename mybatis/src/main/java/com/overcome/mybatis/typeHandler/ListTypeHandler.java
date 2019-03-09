package com.overcome.mybatis.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * list 拦截器
 * 将Javatype 的List 专成数据库对应的String 类型
 * 如: {java,c++}
 */
@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({List.class})
public class ListTypeHandler extends BaseTypeHandler<List<String>> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<String> list, JdbcType jdbcType) throws SQLException {
        String str = "";
        for (String item : list) {
            str+=item;
        }
        preparedStatement.setString(i, str);
    }

    @Override
    public List getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public List getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public List getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
