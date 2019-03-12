package com.gupao.mybatis.dao;


import com.overcome.mybatis.dao.StudentMapper;
import com.overcome.mybatis.po.Student;
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
        Student student = mapper.selectByPrimaryKey(2);
        System.out.println(student.toString());
        sqlsession.commit();
        sqlsession.close();
    }
}