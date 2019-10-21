package com.ywz.service.impl;

import com.ywz.dao.IAccountDao;
import com.ywz.dao.impl.AccountDaoImpl;
import com.ywz.domain.Account;
import com.ywz.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-21 15:07
 * @Description:TODO
 */
@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public List<Account> findAllAccount() {
        List<Account> allAccount = accountDao.findAllAccount();
        return allAccount;
    }

    public Account findAccountById(Integer id) {
        Account accountById = accountDao.findAccountById(id);
        return accountById;
    }

    public Account findAccountByName(String name) {
        Account accountByName = accountDao.findAccountByName(name);
        return accountByName;
    }

}
