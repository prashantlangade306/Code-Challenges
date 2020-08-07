package com.anz.wholesale.service;

import com.anz.wholesale.Exception.AccountTransactionNotFoundException;
import com.anz.wholesale.domain.Account;
import com.anz.wholesale.domain.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class AccountService {

    /**
     * This method returns the dummy list of accounts to be returned to client.
     *
     * @return
     */
    public List<Account> getAccountList(){
        Account account = new Account(585309209, "SGSavings726","Savings",
                new Date("08/11/2018"), "SGD",84327.51);

        Account account1 = new Account(791066619, "AUSavings933","Savings",
                new Date("08/11/2018"), "AUD",88005.93);

        Account account2 = new Account(321143048, "AUCurrent433","Current",
                new Date("08/11/2018"), "AUD",38010.62);

        Account account3 = new Account(347786244, "SGCurrent166","Current",
                new Date("08/11/2018"), "SGD",50664.65);

        Account account4 = new Account(680168913, "AUCurrent374","Current",
                new Date("08/11/2018"), "AUD",41327.28);

        Account account5 = new Account(136056165, "AUSavings938","Savings",
                new Date("08/11/2018"), "AUD",48928.79);

        Account account6 = new Account(453963528, "SGSavings842","Savings",
                new Date("08/11/2018"), "SGD",72117.53);

        Account account7 = new Account(334666982, "AUSavings253","Savings",
                new Date("08/11/2018"), "AUD",20588.16);

        Account account8 = new Account(793949180, "AUCurrent754","Current",
                new Date("08/11/2018"), "AUD",88794.48);

        Account account9 = new Account(768759901, "SGCurrent294","Current",
                new Date("08/11/2018"), "SGD",5906.55);

        Account account10 = new Account(847257972, "AUCurrent591","Current",
                new Date("08/11/2018"), "AUD",92561.68);

        List<Account> accountList = Stream.of(account,account1,account2,account3,account4,account5,account6,account7,account8,account9,account10)
                .collect(Collectors.toList());

        return accountList;

    }

    /**
     * This method returns the list of dummy transactions for the account number.
     * Also, it throws a custom exception in case if there are no transactions found for a given account.
     *
     * Note: At the moment, only two accounts have been coded to return a list of transactions.
     *
     * @param accountNumber
     * @return
     * @throws AccountTransactionNotFoundException
     */
    public List<Transaction> getAccountTransactionList(long accountNumber) throws AccountTransactionNotFoundException {
        Transaction transaction = null;
        Transaction transaction1 = null;
        Transaction transaction2 = null;
        Transaction transaction3 = null;
        Transaction transaction4 = null;
        Transaction transaction5 = null;
        List<Transaction> transactionList = new ArrayList<Transaction>();

        if(accountNumber == 585309209){
            transaction = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 9540.98, "Credit","");

            transaction1 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 7497.82, "Credit","");

            transaction2 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 5564.79, "Credit","");

            transaction3 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 8136.18, "Credit","");

            transaction4 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 9442.46, "Credit","");

            transaction5 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 7614.45, "Credit","");

        } else if (accountNumber == 791066619){
            transaction = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 3311.55, "Credit","");

            transaction1 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 9186.09, "Credit","");

            transaction2 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 1905.86, "Credit","");

            transaction3 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 197.78, "Credit","");

            transaction4 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 8430.49, "Credit","");

            transaction5 = new Transaction(1232223212, "Current Account",new Date("Jan 12,2012")
                    ,"SGD", 0, 8.33, "Credit","");
        } else {
            throw new AccountTransactionNotFoundException();
        }

        transactionList = Stream.of(transaction,transaction1,transaction2,transaction3,transaction4,transaction5)
                .collect(Collectors.toList());

        return transactionList;
    }
}
