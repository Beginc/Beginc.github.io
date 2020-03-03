package dao.impl;

import dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void in(int id, int num) {
        System.out.println("[Account" + id + "]: " + "收了" + num + "元钱");
    }

    @Override
    public void out(int id, int num) {
        System.out.println("[Account" + id + "]: " + "花了" + num + "元钱");
    }
}
