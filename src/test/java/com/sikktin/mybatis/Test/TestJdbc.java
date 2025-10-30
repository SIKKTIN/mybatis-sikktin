package com.sikktin.mybatis.Test;

import org.junit.Test;

import java.sql.*;

public class TestJdbc {
    @Test
    public void test() throws Exception {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis_sikktin", "root", "Cz636363");

        PreparedStatement ps = connection.prepareStatement("select * from t_user");
        ps.execute();

        ResultSet rs = ps.getResultSet();
        while (rs.next()) {
            System.out.println(rs.getString("name") + " -- " + rs.getInt("age"));
        }
        rs.close();
        ps.close();
        connection.close();
    }
}
