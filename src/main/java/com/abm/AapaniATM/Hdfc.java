package com.abm.AapaniATM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hdfc implements Atm {
	
	@Autowired
	private Bank bank;
	
	public void withdraw(int acno,double money) {
		System.out.println("Customer at hdfc trying to withdraw money");
		bank.withdraw(1001, acno, money);
		
	}

}
