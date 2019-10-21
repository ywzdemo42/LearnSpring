package com.ywz.jdbctemplate;

import com.ywz.config.JdbcTemplateConfig;
import com.ywz.dao.IAccountDao;
import com.ywz.dao.impl.AccountDaoImpl;
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
public class JdbcTemplateDemo4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JdbcTemplateConfig.class);
        AccountDaoImpl accountDaoImpl = ac.getBean("accountDaoImpl", AccountDaoImpl.class);
        Account account = accountDaoImpl.findAccountById(1);
        System.out.println(account.toString());
    }
}

