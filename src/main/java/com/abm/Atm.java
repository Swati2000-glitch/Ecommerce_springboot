package com.abm;

import org.springframework.stereotype.Component;

@Component("cash")
public class Atm {
	public void start() {
		System.out.println("Withdraw Money ");
	}	

}
