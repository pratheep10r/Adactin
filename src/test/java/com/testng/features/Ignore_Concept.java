package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	public void bike() {
		System.out.println("Royal Enfield");
	}
	@Ignore
	@Test
	public void car() {
		System.out.println("hyundai i20");
	}
	@Test(enabled = false)
	public void bus() {
		System.out.println("public transport");
	}
	@Test
	public void tcs() {
		System.out.println("TCS");
	}
	@Test
   public void hcl() {
	System.out.println("HCL");
}
	
}
