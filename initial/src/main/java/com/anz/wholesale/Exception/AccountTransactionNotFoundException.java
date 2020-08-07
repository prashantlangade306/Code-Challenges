package com.anz.wholesale.Exception;

/**
 * Class for custom exception handling for no transactions for any given account.
 *
 */
public class AccountTransactionNotFoundException extends Exception{

    public AccountTransactionNotFoundException() {
        super("No transactions found for given account number");
    }
}
