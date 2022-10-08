package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
 
	@Test
	@Parameters({"name","name2","a"})
	public void names(String name, String name2, int a) {
		System.out.println("Parameterized");
		System.out.println("First name is "+ name);
		System.out.println("second name is "+ name2);
		System.out.println("number is "+ a);
		
	}
	
	
}
