package com.overcome.mybatis.v1.dao;

import com.overcome.mybatis.po.User;

public interface TestMapper {

    User selectByPrimaryKey(int id);

}
