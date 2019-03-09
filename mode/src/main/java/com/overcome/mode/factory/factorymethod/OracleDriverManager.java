package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Driver;
import com.overcome.mode.factory.OracleDriver;

public class OracleDriverManager implements MethodDriverManager{

    @Override
    public Driver getDriverName() {
        return new OracleDriver();
    }
}
