package mapper;

import pojo.Account;

import java.util.List;

public interface AccountMapper {
    List<Account> findAll();

    Account find(Integer id);

    List<Account> findByUID(Integer uid);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);
}
