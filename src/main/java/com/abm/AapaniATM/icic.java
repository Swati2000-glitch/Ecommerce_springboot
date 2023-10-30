package com.abm.AapaniATM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class icic implements Bank{
	
	
	public void withdraw(int atmId, int acno, double amount) {
		System.out.println("ICIC bank customer");
		
	}

}
