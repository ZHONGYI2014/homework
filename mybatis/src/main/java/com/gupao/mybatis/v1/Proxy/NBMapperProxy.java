package com.gupao.mybatis.v1.Proxy;

import com.gupao.mybatis.v1.dao.TestMapperXML;
import com.gupao.mybatis.v1.session.NBSqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MapperProxy 做实现动态代理当然要实现一个 InvocationHandler
 *
 */
public class NBMapperProxy<T> implements InvocationHandler {

    private final NBSqlSession nbSqlSession;

    private final Class<T> mapperInterface;

    /**
     * @param nbSqlSession 使用sqlsession
     * @param clazz 为当前的类创建实例
     */
    public NBMapperProxy(NBSqlSession nbSqlSession, Class<T> clazz) {
        this.nbSqlSession = nbSqlSession;
        this.mapperInterface = clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //绑定 dao 和 mapper 文件
        if (method.getDeclaringClass().getName().equals(TestMapperXML.nameSpace)) {
            String sql = TestMapperXML.methodSqlMapping.get(method.getName());
            System.out.println(String.format("SQL [ %s ], parameter [%s], ", sql, args[0]));
            return nbSqlSession.selectOne(sql, args[0]);
        }
        return null;
    }
}
