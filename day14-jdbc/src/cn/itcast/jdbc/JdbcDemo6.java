package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * "SELECT *FROM USER WHERE username=''PASSWORD='';"
 */
public class JdbcDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = sc.nextLine();
        System.out.print("请输入密码:");
        String password = sc.nextLine();
        boolean login = new JdbcDemo6().login2(username, password);
        if (login) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }

    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select *from user where username=? and password=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
//            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return false;
    }
}
