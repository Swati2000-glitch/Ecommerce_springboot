package com.abm;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine{
	public void start()
	{
		System.out.println("Go to long drive");
	}
}
