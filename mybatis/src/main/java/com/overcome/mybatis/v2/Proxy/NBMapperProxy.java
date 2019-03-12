package com.overcome.mybatis.v2.Proxy;

import com.overcome.mybatis.v2.registory.MapperRegistory;
import com.overcome.mybatis.v2.session.NBSqlSession;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MapperProxy 做实现动态代理当然要实现一个 InvocationHandler
 * 注意invoke方法是调用sql的入口, 动态代理类中调用 InvocationHandler.invoke方法, 就会跑到这里来
 * 看这个 MapperProxy 动态代理代理了所有执行sql语句的方法, 统一在这个invoke方法中调用
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
        MapperRegistory.MapperData mapperData = nbSqlSession.getNbConfiguration().getMapperRegistory().getByNameSpace(method.getDeclaringClass().getName() + "." + method.getName());
        if (null != mapperData) {
            System.out.println(String.format("SQL [ %s ], parameter [%s], ", mapperData.getSql(), args[0]));
            return nbSqlSession.selectOne(mapperData, String.valueOf(args[0]));
        }
        return method.invoke(proxy, args);
    }
}
