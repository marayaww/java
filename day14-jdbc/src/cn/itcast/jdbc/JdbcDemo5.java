package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * "SELECT *FROM USER WHERE username=''PASSWORD='';"
 *
 * */
public class JdbcDemo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password=sc.nextLine();
        boolean login = new JdbcDemo5().login(username, password);
        if (login){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }


    }
    public boolean login(String username,String password){
        if (username==null||password==null){
            return false;
        }
        Connection conn =null;
        Statement stmt =null;
        ResultSet rs =null;
        try {
            conn = JDBCUtils.getConnection();
            String sql="select *from user where username='"+username+"'and password='"+password+"'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
//
            return rs.next();

        } catch (SQLException e) {
//            e.printStackTrace();
        }

        finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return  false;
    }
}
