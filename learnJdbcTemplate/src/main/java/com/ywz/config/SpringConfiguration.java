package com.ywz.config;

import org.springframework.context.annotation.*;

/**
 * @author yangdong
 * @creat 2019-10-21 17:11
 * @Description:TODO
 */
@Configuration
@ComponentScan("com.ywz")
@Import({JdbcTemplateConfig.class,TransactionConfig.class})
@PropertySource("jdbcconfig.properties")
@EnableAspectJAutoProxy
public class SpringConfiguration {

}
