package com.ywz.dao.impl;

import com.ywz.dao.IAccountDao;
import com.ywz.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-21 11:38
 * @Description:TODO
 */
@Repository("accountDaoImpl")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private JdbcTemplate jt;
    public Account findAccountById(Integer id) {
        List<Account> query = jt.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return query.isEmpty()?null:query.get(0);
    }

    public Account findAccountByName(String name) {
        List<Account> query = jt.query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), name);
        if(query.isEmpty()){
            return null;
        }else if(query.size() > 1){
            throw new RuntimeException("有多个结果哦");
        }
        return query.get(0);
    }

    public List<Account> findAllAccount() {
        List<Account> query = jt.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        return query.isEmpty()?null:query;
    }

    public void updateAccount(Account account) {
        jt.update("update account set name = ?,money = ? where id = ?",account.getName(),account.getMoney(),account.getId());
    }
}
