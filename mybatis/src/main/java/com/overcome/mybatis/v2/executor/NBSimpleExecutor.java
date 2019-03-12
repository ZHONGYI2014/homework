package com.overcome.mybatis.v2.executor;

import com.overcome.mybatis.v2.configuration.NBConfiguration;
import com.overcome.mybatis.v2.registory.MapperRegistory;
import com.overcome.mybatis.v2.statement.StatementHandler;

public class NBSimpleExecutor implements NBExecutor {


    private NBConfiguration configuration;


    public NBConfiguration getConfiguration() {
        return configuration;
    }

    public NBSimpleExecutor(NBConfiguration configuration) {

        this.configuration = configuration;
    }

    @Override
    public <T> T execute(MapperRegistory.MapperData mapperData, Object param) throws Exception {
        StatementHandler handler = new StatementHandler(configuration);

        return (T) handler.query(mapperData, param);
    }



}
