package com.abm;

import org.springframework.stereotype.Component;

@Component("currConv")
public class CurrencyConverter {
	public double covert(String from, String to, double amount) {
		if(from.equals("USD") && to.equals("INR"))
			return amount * 83.23;
		else if(from.equals("GBP") && to.equals("INR"))
			return amount * 100.51;
		else
			return 0;
	}

}
