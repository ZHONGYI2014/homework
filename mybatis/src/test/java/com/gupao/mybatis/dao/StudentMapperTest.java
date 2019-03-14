package com.gupao.mybatis.dao;


import com.overcome.mybatis.dao.StudentMapper;
import com.overcome.mybatis.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlsession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);

        Instant current = Instant.now();
        Student student = mapper.selectByPrimaryKey(6);
        Instant end = Instant.now();
        System.out.println("耗时1： " + Duration.between(current, end).toMillis());

        System.out.println(student.toString());
        sqlsession.commit();
        sqlsession.close();
    }
}