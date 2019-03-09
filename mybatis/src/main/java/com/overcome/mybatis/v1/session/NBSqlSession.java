package com.overcome.mybatis.v1.session;

import com.overcome.mybatis.v1.Proxy.NBMapperProxy;
import com.overcome.mybatis.v1.configuration.NBConfiguration;
import com.overcome.mybatis.v1.executor.NBExecutor;

import java.lang.reflect.Proxy;

/**
 * SqlSession 获取配置信息再执行SQL
 * Configuration <----- sqlsession  ------> Executor
 * Configuration 配置信息
 * Executor 执行sql
 */
public class NBSqlSession {

    private NBConfiguration nbConfiguration;

    private NBExecutor nbExecutor;

    /** 让SqlSession关联 configuration 和 executor */
    public NBSqlSession(NBConfiguration nbConfiguration, NBExecutor nbExecutor) {
        this.nbConfiguration = nbConfiguration;
        this.nbExecutor = nbExecutor;
    }

    /** 获取 mapper 文件对象 */
    public<T> T getMapper(Class<T> clazz) {
        //来看看这个mapper是怎么生成的，动态代理？ 动态代理的目标是 interface 和平时的代理对象有点不一样
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class[]{clazz},
                new NBMapperProxy(this, clazz));
    }

    /** 执行Sql */
    public <T> T selectOne(String statement, Object param) {
        return nbExecutor.execute(statement, param);
    }

}
