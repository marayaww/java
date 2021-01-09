package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.*;

public class JdbcDemo4 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select *from account";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            boolean next = rs.next();
            int id = rs.getInt(1);
            String name = rs.getString(2);
            double balance = rs.getDouble(3);
            System.out.println(id + "----" + name + "----" + balance);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,stmt,conn);

        }
    }
}
