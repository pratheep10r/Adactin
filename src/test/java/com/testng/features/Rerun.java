package com.testng.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{

	int first =1;
	int last = 3;
	
	
	@Override
	public boolean retry(ITestResult result) {

		if (first<last) {
			
			first++;
			return true;
			
		}
		return false;
	}

}
