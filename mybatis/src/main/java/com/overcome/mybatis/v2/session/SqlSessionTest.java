package com.overcome.mybatis.v2.session;


import com.overcome.mybatis.po.User;
import com.overcome.mybatis.v1.dao.TestMapper;
import com.overcome.mybatis.v2.configuration.NBConfiguration;
import com.overcome.mybatis.v2.executor.NBSimpleExecutor;

public class SqlSessionTest {

    public static void main(String[] args) {
        NBConfiguration conf = new NBConfiguration();
        conf.scanPath("com.mybatis.*");
        conf.build();
        NBSqlSession sqlSession = new NBSqlSession(conf, new NBSimpleExecutor(conf));
        TestMapper mapper = sqlSession.getMapper(TestMapper.class);
        User user = mapper.selectByPrimaryKey(2);
        System.out.println(user.getAccount());
    }
}
