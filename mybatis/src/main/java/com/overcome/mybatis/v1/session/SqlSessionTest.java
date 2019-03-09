package com.overcome.mybatis.v1.session;

import com.overcome.mybatis.po.User;
import com.overcome.mybatis.v1.dao.TestMapper;
import com.overcome.mybatis.v1.executor.NBSimpleExecutor;

public class SqlSessionTest {

    public static void main(String[] args) {
        NBSqlSession session = new NBSqlSession(null, new NBSimpleExecutor());
        TestMapper mapper = session.getMapper(TestMapper.class);
        User user = mapper.selectByPrimaryKey(2);
        System.out.println(user.toString());
    }
}
