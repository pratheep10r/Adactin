package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Iretry {

	@Test
	public void name() {
		
		
		String exp ="nisha";
		String act ="nisha";
		
		Assert.assertEquals(exp, act);
		
	}
	@Test(retryAnalyzer = Rerun.class )
	public void number() {
		
		String exp ="8489999279";
		String act ="8682900221";
		
		Assert.assertEquals(exp,act);
		
		
	}
	
	
	
}
