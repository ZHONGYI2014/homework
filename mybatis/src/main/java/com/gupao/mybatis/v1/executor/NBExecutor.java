package com.gupao.mybatis.v1.executor;

public interface NBExecutor {

    <T> T execute(String sql, Object param);
}
