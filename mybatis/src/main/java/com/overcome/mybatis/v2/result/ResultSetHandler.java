package com.overcome.mybatis.v2.result;

import com.overcome.mybatis.v2.configuration.NBConfiguration;
import com.overcome.mybatis.v2.registory.MapperRegistory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetHandler {

    private NBConfiguration configuration;

    public ResultSetHandler(NBConfiguration configuration) {
        this.configuration = configuration;
    }

    public <T> T handle(PreparedStatement pstmt, MapperRegistory.MapperData mapperData) {
        Object result = new DefaultObjectFactory().create(mapperData.getType());
        try {
            ResultSet set = pstmt.getResultSet();
            if (set.next()) {
                int i = 0;
                for (Field field : result.getClass().getDeclaredFields()) {
                    setValue(result, field, set, i);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (T) result;
    }

    private void setValue(Object result, Field field, ResultSet set, int i) throws NoSuchMethodException, SQLException, InvocationTargetException, IllegalAccessException {
        Method setMethod = result.getClass().getMethod("set" + upperCapital(field.getName()), field.getType());
        setMethod.invoke(result, getResult(field,set));
    }

    private Object getResult(Field field, ResultSet rs) throws SQLException {
        //TODO type handles
        Class<?> type = field.getType();
        if(Integer.class == type){
            return rs.getInt(field.getName());
        }
        if(String.class == type){
            return rs.getString(field.getName());
        }
        return rs.getString(field.getName());
    }


    private String upperCapital(String name) {
        String first = name.substring(0, 1);
        String tail = name.substring(1);
        return first.toUpperCase() + tail;
    }
}
