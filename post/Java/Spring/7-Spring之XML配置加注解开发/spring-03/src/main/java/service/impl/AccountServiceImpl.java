package service.impl;

import dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.AccountService;

import javax.annotation.Resource;

@Service("accountService")
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false, timeout = -1)
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(int src, int dest, int num) {
        accountDao.in(dest, num);
//        int i = 1 / 0;
        accountDao.out(src, num);
    }
}
