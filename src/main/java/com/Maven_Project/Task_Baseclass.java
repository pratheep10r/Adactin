package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Baseclass {
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
     //launch
	public static void launchurl(String url) {
		driver.get(url);	
	}
	//alert
	public static void alert(WebElement element , String alt) {
		element.click();
		Alert a = driver.switchTo().alert();
		if (alt.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (alt.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
		
	}
	public static void promptalert(WebElement element , String pro) {
		
        element.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys(pro);
		Alert a2 = driver.switchTo().alert();
		a1.accept();
	
	}
	//Screenshot
	public static void screenshot(String sr) throws IOException {
		TakesScreenshot s =(TakesScreenshot) driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File Destination = new File(sr);
		FileUtils.copyFile(screenshotAs, Destination);
	
	}
	
	//action
	public static void actions(WebElement element) {
	
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
		
	}
	
	//navigate
public static void launch_2 (String url) {
	driver.navigate().to(url);
	
}	
	// wait
	public static void wait(WebElement element , String w) {
		element.sendKeys(w);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	
   //webtable
	public static void webtable(WebElement element  ) {
		
		String text = element.getText();
		System.out.println(text);
	
		}
	}
	
	
	

