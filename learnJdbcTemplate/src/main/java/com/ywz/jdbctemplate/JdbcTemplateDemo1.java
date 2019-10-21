package com.ywz.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author yangdong
 * @creat 2019-10-21 10:15
 * @Description:Jdbc基本用法
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //准备数据源spring内置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
        ds.setUsername("root");
        ds.setPassword("root");


        //1.创建JDBCTEMPLATE对象
        JdbcTemplate jt = new JdbcTemplate();
        //设置数据源
        jt.setDataSource(ds);
        //2.执行操作
        jt.execute("insert into account(name,money) values ('ccc',1000)");
    }
}
