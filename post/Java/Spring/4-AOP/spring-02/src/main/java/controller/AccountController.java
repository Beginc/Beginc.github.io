package controller;

import service.AccountService;

public class AccountController {
    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void transfer() {
        accountService.transfer(1, 2, 100);
    }
}
