package com.overcome.mybatis.v2.executor;

import com.overcome.mybatis.v2.registory.MapperRegistory;

import java.sql.SQLException;

public interface  NBExecutor {

    <T> T execute(MapperRegistory.MapperData mapperData, Object param) throws Exception;
}
