package com.ywz.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author yangdong
 * @creat 2019-10-21 14:40
 * @Description:用于抽取dao中的重复代码
 */
public class JdbcDapSupport {
    @Autowired
    private JdbcTemplate jt;
}
