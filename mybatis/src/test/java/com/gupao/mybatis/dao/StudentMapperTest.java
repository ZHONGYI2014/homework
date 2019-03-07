package com.gupao.mybatis.dao;


import com.gupao.mybatis.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentMapperTest {

    SqlSession session = null;


    @Test
    public void testInsert() {
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<String> list = new ArrayList<>();
        list.add("数学");
        list.add("篮球");
        Student obj = new Student(2, list);
        mapper.insert(obj);
    }

    @Before
    public void init() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        session = new SqlSessionFactoryBuilder().build(inputStream).openSession();
    }

    @After
    public void destory() {
        session.commit();
        session.close();
    }

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession sqlsession = new SqlSessionFactoryBuilder().build(inputStream).openSession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<String> list = new ArrayList<>();
        list.add("数学");
        list.add("篮球");
        Student obj = new Student(6, list);
        mapper.insert(obj);
        sqlsession.commit();
        sqlsession.close();
    }
}