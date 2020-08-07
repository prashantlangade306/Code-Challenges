package com.anz.wholesale.controller;

import com.anz.wholesale.Exception.AccountTransactionNotFoundException;
import com.anz.wholesale.domain.Account;
import com.anz.wholesale.domain.Transaction;
import com.anz.wholesale.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is the controller class i.e. entry point of the REST API
 *
 */
@RestController
public class AccountsController {

    private AccountService accountService;

    @Autowired
    public AccountsController(AccountService accountService) {
        super();
        this.accountService = accountService;
    }

    /**
     * This is an endpoint for retrieving the list of available accounts.
     *
     * @return
     */
    @GetMapping("/accountListEnquiry")
    public List<Account> getAccountList() {
        return accountService.getAccountList();
    }

    /**
     * This is an endpoint for retrieving the list of account transactions for any given account.
     *
     * @param accountNumber
     * @return
     * @throws AccountTransactionNotFoundException
     */
    @GetMapping("/transactionListEnquiry/{accountNumber}")
    public List<Transaction> getAccountTransactionList(@PathVariable("accountNumber") final Long accountNumber) throws AccountTransactionNotFoundException {
        return accountService.getAccountTransactionList(accountNumber);
    }
}
