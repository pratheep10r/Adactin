package com.testng.features;

import org.testng.annotations.Test;
public class Dependency_Concept {

	@Test(dependsOnMethods = "petrol")
	public void bikes() {
            System.out.println("R15");		
	}
	@Test
	public void petrol() {
		System.out.println("Indian OIL");
	}
	
	
}
