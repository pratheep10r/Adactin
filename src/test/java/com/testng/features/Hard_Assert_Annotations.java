package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Annotations {

	@Test
	public void hard() {
		
		String exp ="pratheep";
		String act ="pratheep";
		
		
		Assert.assertEquals(act, exp);
		System.out.println("validation");
		
		
	}
	
}
