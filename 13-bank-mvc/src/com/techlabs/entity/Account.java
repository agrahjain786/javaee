package com.techlabs.entity;


public class Account {
	
    private int customerId;
    private int accountNumber;
    private double balance;
    
    
	public Account(int customerId, int accountNumber, double balance) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public Account(int customerId, double balance) {
		super();
		this.customerId = customerId;
		this.balance = balance;
	}
    

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [customerId=" + customerId + ", accountNumber=" + accountNumber + ", balance="
				+ balance + "]";
	}

    

}
