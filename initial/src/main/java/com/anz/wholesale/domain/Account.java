package com.anz.wholesale.domain;

import java.util.Date;

public class Account {

	private long accountNumber;
	private String accountName;
	private String accountType;
	private Date balanceDate;
	private String currency;
	private double openingAvailableBalance;

	public Account(long accountNumber, String accountName, String accountType, Date balanceDate, String currency, double openingAvailableBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingAvailableBalance = openingAvailableBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}

	public void setOpeningAvailableBalance(double openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}

	@Override
	public String toString() {
		return "Account{" +
				"accountNumber=" + accountNumber +
				", accountName='" + accountName + '\'' +
				", accountType='" + accountType + '\'' +
				", balanceDate=" + balanceDate +
				", currency='" + currency + '\'' +
				", openingAvailableBalance=" + openingAvailableBalance +
				'}';
	}
}