package dao.impl;

import dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import pojo.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Account account) {
        jdbcTemplate.update("insert into account (money) values (?)", account.getMoney());
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("delete from account where id = ?", id);
    }

    @Override
    public void in(int id, int num) {
        jdbcTemplate.update("update account set money = money + ? where id = ?", num, id);
    }

    @Override
    public void out(int id, int num) {
        jdbcTemplate.update("update account set money = money - ? where id = ?", num, id);
    }

    @Override
    public Account find(int id) {
        List<Account> account = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);

        return account.size() != 0 ? account.get(0) : null;
    }

    @Override
    public List<Account> findAll() {
        List<Account> account = jdbcTemplate.query("select * from account", new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet resultSet, int i) throws SQLException {
                Account account = new Account();
                account.setId(resultSet.getInt(1));
                account.setMoney(resultSet.getInt(2));
                return account;
            }
        });
        return account;
    }

    @Override
    public int findAccountNum() {
        int accountNum = jdbcTemplate.queryForObject("select count(1) from account", Integer.class);
        return accountNum;
    }
}
