package com.abm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("honda")
public class Car{
	@Autowired
	public Engine engine;
	public void acclerate() {
		engine.start();
	}
}