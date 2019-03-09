package com.overcome.mode.factory;

import java.sql.Connection;
import java.util.Properties;

public class OracleDriver implements Driver{


    @Override
    public Connection Connect(String url, Properties info) {
        //todo
        // Class.forName("oracle.jdbc.driver.OracleDriver);
        return null;
    }

    @Override
    public String getName() {
        return "oracle.jdbc.driver.OracleDriver";
    }


}
