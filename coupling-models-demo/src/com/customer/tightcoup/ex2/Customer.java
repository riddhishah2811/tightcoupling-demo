package com.customer.tightcoup.ex2;

import java.util.UUID;

public class Customer {
	private int id;
	private String name;
	private Account loanAccount;
	
	public Customer() {
		loanAccount=new PersonalLoanAccount();
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
