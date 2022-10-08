package com.cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features  ="src\\test\\java\\com\\feature"  , glue = "com.stepdefinition.cucu" ,
plugin= {"html:Report.html"})
public class Test_Runner_Cucu {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {

		driver = Baseclass.browserlaunch("chrome");
	}

	
	@AfterClass
	public static void tearDown() {
		
		
		
	}
	
}
