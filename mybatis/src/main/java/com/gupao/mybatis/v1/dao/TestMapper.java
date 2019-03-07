package com.gupao.mybatis.v1.dao;

import com.gupao.mybatis.po.User;

public interface TestMapper {

    User selectByPrimaryKey(int id);

}
