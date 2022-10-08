package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public  class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String browsername ) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
					
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
		else if (browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();			
		}
		return driver;
	}
	//Get url
	public static void launchurl(String url) {
		driver.get(url);	
	}
	
	//Enter Id Sendkeys
	public static void entervalue(WebElement element, String id) {
		element.sendKeys(id);
	}
	
	//login--> click()
     public static void clickbutton(WebElement element) {
    	 element.click();
	}
     
     //select_location --> selectByIndex()
     public static void dropdown(WebElement element , int loc) {
    	 Select s = new Select(element);
    	  s.selectByIndex(loc);
	}
    	}
