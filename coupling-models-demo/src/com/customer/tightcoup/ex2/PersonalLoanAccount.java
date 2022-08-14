package com.customer.tightcoup.ex2;

import java.util.UUID;

public class PersonalLoanAccount implements Account{
	
	@Override
	public String getAccountDetails() {
		return "Acc Type :\t"+getAccType()+" Acc Number:\t"+getAccNumber(); 
	}
	
	public int getAccNumber() {
		return UUID.randomUUID().variant();
	}
	public String getAccType() {
		return AccType.PERSONAL_LOAN.name();
	}
	

}
