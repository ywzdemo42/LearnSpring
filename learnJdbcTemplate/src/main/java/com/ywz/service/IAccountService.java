package com.ywz.service;

import com.ywz.domain.Account;

import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-21 15:07
 * @Description:TODO
 */
public interface IAccountService {
    List<Account> findAllAccount();
    Account findAccountById(Integer id);
    Account findAccountByName(String name);

}
