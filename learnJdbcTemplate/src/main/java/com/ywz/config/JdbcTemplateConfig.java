package com.ywz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.validation.annotation.Validated;

import java.net.URL;

/**
 * @author yangdong
 * @creat 2019-10-21 10:34
 * @Description:TODO
 */

public class JdbcTemplateConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.name}")
    private String name;
    @Value("${jdbc.psw}")
    private String psw;


    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(name);
        ds.setPassword(psw);
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DriverManagerDataSource driverManagerDataSource){
        return new JdbcTemplate(driverManagerDataSource);
    }
}
