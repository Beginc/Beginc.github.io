package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.AccountService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller("accountController")
@Scope("prototype")
public class AccountController {

    @Value("1")
    private int intForTest;

    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void transfer() {
        accountService.transfer(3, 4, 100);
    }

    @PostConstruct
    public void init() {
        System.out.println("Account Controller Init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Account Controller Destroy...");
    }
}
