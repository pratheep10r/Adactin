package com.testng.features;

import org.testng.annotations.Test;

public class Exp_Exception_Test {

	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		
		int a=20;
		System.out.println(a/0);
		
	}
	
	
}
