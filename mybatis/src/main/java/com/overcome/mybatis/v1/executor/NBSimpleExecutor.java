package com.overcome.mybatis.v1.executor;

import com.overcome.mybatis.po.User;

import java.sql.*;

public class NBSimpleExecutor implements NBExecutor{

    private static Connection conn = null;

    @Override
    public <T> T execute(String sql, Object param) {
        User user = new User();
        PreparedStatement statement = null;
        ResultSet set = null;
        try {
            conn = getConnection();
            String condition = String.format(sql, Integer.parseInt(String.valueOf(param)));
            statement = conn.prepareStatement(condition);
            set = statement.executeQuery();
            while (set.next()) {
                user.setId(set.getInt(1));
                user.setAccount(set.getString(2));
                user.setPasswd(set.getString(3));
                user.setAge(set.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (null != set) {
                set = null;
            }
            if (statement != null) {
                statement = null;
            }
            if (conn != null) {
                conn = null;
            }
        }
        return (T) user;
    }

    public Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/cool?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "admin199422";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
