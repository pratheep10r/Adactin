package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Features {
 
	@Test(timeOut = 8000)
	public void name() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("prathee");
		
		Thread.sleep(1000);
		System.out.println("mani");
		
		Thread.sleep(2000);
		System.out.println("latha");
		
		Thread.sleep(2000);
		System.out.println("parkar");
		
	}
	
	
	
	
}
