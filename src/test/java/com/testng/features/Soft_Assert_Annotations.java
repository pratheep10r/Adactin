package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Annotations {

	@Test
	public void soft() {
		
		String exp ="harry";
		String act ="harry222";
		
		SoftAssert s = new SoftAssert();
		 
		s.assertEquals(exp, act);
		System.out.println("verification");
		
		
	}
}
