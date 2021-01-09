package cn.itcast.jdbc;

import java.sql.*;

public class JdbcDemo3 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            String sql = "select *from account";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            boolean next = rs.next();
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double balance = rs.getDouble(3);
            System.out.println(id + "----" + name + "----" + balance);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
