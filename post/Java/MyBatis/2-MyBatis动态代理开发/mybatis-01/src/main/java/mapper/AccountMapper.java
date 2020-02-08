package mapper;

import pojo.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll();

    Account find(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);
}
