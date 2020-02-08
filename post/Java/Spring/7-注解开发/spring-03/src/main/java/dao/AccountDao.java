package dao;

import pojo.Account;

import java.util.List;

public interface AccountDao {

    void insert(Account account);

    void delete(int id);

    void in(int id, int num);

    void out(int id, int num);

    Account find(int id);

    List<Account> findAll();

    int findAccountNum();
}
