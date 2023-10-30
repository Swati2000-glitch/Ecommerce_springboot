package com.abm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("withdraw")
public class Bank {
	@Autowired
	private Atm atm;
	public void cash() {
		atm.start();
	}
	
	

}
