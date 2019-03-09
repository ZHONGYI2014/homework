package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Driver;
import com.overcome.mode.factory.MysqlDriver;

public class MysqlDriverManager implements MethodDriverManager{


    @Override
    public Driver getDriverName() {
        return new MysqlDriver();
    }
}
