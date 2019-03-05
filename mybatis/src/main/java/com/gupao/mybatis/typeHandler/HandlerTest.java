package com.gupao.mybatis.typeHandler;

import com.gupao.mybatis.dao.UserMapper;
import com.gupao.mybatis.po.User;
import org.apache.ibatis.executor.loader.ProxyFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class HandlerTest {

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session =factory.openSession();
        UserMapper mappper = session.getMapper(UserMapper.class);
//        User user = new User(3,"shss","asfaf","23234","13414",new Date());
//        mappper.insert(user);
        mappper.selectByPrimaryKey(3);
        session.commit();
        session.close();
        }

}
