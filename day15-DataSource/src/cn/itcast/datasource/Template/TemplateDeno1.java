package cn.itcast.datasource.Template;

import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class TemplateDeno1 {
    public static void main(String[] args) {
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update account set  balance=? ,name=? where id=?";
        int count = template.update(sql,3000,"迪丽热巴",1);
        System.out.println(count);


    }
}
