package com.abm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.AapaniATM.Hdfc;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
		HelloWorld hw = (HelloWorld)ctx.getBean("hello");
		System.out.println("Good You have Done it");
		
		
		Car car = (Car) ctx.getBean("honda");
		car.acclerate();
		
		
		CurrencyConverter cc = (CurrencyConverter) ctx.getBean("currConv");
		System.out.println(cc.covert("USD","INR",500));
		
	
	    Bank bank = (Bank) ctx.getBean("withdraw");
	    bank.cash();
	    
	    Hdfc h = (Hdfc) ctx.getBean("hdfc");
	    h.withdraw(1234,5000);
	 
	}
}
