package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	

	@Test(dataProvider = "name")
	public void names(String name, String name2, int a) {
		System.out.println("First name is "+ name);
		System.out.println("second name is "+ name2);
		System.out.println("number is "+ a);
}
	
	
	@DataProvider
	public Object[][] name() {
		
		return new Object[][] {
			
			{"aaaaa","1111"}, {"bbbb","2222"},{"cccc","3333"}
		};
		
	}
	
	
}