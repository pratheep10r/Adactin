package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Concepts {
    @Test(groups = "vehicle")
	public void bike() {
		System.out.println("Royal Enfield");
	}

	@Test(groups = "vehicle")
	public void car() {
		System.out.println("hyundai i20");
	}
	@Test(groups = "vehicle")
	public void bus() {
		System.out.println("public transport");
	}
	@Test(groups = "corporates")
	public void tcs() {
		System.out.println("TCS");
	}
	@Test(groups = "corporates")
   public void hcl() {
	System.out.println("HCL");
}
}