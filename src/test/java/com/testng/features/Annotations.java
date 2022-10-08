package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void browser_launch() {
		System.out.println("browser_launch");
	}
    @BeforeClass
	public void url_launch() {
		System.out.println(" URL launch");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = -1)
	public void name() {
		System.out.println("pratheep");
	}
	@Test(priority = 0)
	public void age() {
		System.out.println("25");
	}
	
	@Test(invocationCount = 2)
	public void number() {
		System.out.println("8489999279");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void refresh() {
		System.out.println("refresh");
	}
	
	@AfterSuite
	public void quit() {
		System.out.println("quit");
	}
	
	
	}

