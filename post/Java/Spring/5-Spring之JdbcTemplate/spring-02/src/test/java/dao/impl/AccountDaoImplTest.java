package test.dao.impl;

import dao.AccountDao;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;

import java.util.List;

/**
 * AccountDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>01/26/2020</pre>
 */
public class AccountDaoImplTest {
    private static AccountDao accountDao;

    @BeforeClass
    public static void setUpClass() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        accountDao = context.getBean("accountDao", AccountDao.class);
    }


    @Test
    public void testInsert() throws Exception {
        Account account = new Account();
        account.setMoney(1000);
        accountDao.insert(account);
    }

    @Test
    public void testDelete() throws Exception {
        accountDao.delete(5);
    }

    @Test
    public void testIn() throws Exception {
        accountDao.in(3, 100);
    }

    @Test
    public void testOut() throws Exception {
        accountDao.out(3, 100);
    }

    @Test
    public void testFind() throws Exception {
        System.out.println(accountDao.find(3));
    }

    @Test
    public void testFindAll() throws Exception {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountNum() throws Exception {
        System.out.println(accountDao.findAccountNum());
    }
} 
