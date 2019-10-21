package com.ywz.jdbctemplate;

import com.ywz.config.JdbcTemplateConfig;
import com.ywz.domain.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-21 10:15
 * @Description:Jdbc基本用法
 */
public class JdbcTemplateDemo3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JdbcTemplateConfig.class);
        JdbcTemplate jt = ac.getBean("jdbcTemplate",JdbcTemplate.class);
        //执行操作
        //保存
        List<Account> query = jt.query("select * from account where money < ?", new AccountRowMapper(), 1000f);
        for (Account account:query) {
            System.out.println(account.toString());
        }





    }
}

class AccountRowMapper implements RowMapper<Account> {
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getFloat("money"));
        return account;
    }
}
