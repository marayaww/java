package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        String sql="update account set balance=1000 where id=1";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();

    }
}
