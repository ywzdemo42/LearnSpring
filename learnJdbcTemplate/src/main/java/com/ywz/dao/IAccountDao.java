package com.ywz.dao;

import com.ywz.domain.Account;

import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-21 11:36
 * @Description:TODO
 */
public interface IAccountDao {
    Account findAccountById(Integer id);
    Account findAccountByName(String name);
    List<Account> findAllAccount();
    void updateAccount(Account account);
}
