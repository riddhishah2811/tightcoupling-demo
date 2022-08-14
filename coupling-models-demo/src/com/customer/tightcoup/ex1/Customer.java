package com.customer.tightcoup.ex1;

import java.util.UUID;

public class Customer {
	private int id;
	private String name;
	private LoanAccount loanAccount;
	
	public Customer() {
		loanAccount=new LoanAccount();
		loanAccount.setAccNumber(UUID.randomUUID().variant());
		loanAccount.setAccType("Savings");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String myAccDetails()
	{
		return loanAccount.getAccountDetails();
	}

}
