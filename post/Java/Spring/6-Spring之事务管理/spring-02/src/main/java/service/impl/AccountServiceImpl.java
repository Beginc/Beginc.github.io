package service.impl;

import dao.AccountDao;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(int src, int dest, int num) {
        accountDao.in(dest, num);
        int i = 1 / 0;
        accountDao.out(src, num);
    }
}
