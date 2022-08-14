package com.customer.tightcoup.ex1;

public class LoanAccount {
	
	private int accNumber;
	private String accType;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public String getAccountDetails()
	{
		return "Acc Type :\t"+accType+" Acc Number:\t"+accNumber;
	}
	

}
