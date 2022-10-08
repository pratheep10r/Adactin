package com.datadriven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Maven_Project.Task_Baseclass;

public class Task_Runner extends Task_Baseclass {
	

	public static void main(String[] args) throws IOException {
		browserlaunch("chrome");
		launchurl("https://leafground.com/alert.xhtml;jsessionid=node076kdaqteqnjv1f8twwsk1qkug291579.node0");
	
		
		//alert simple alert
		WebElement simple = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		alert(simple, "accept");
		
		//confirm alert
		WebElement confirm = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));
	   alert(confirm, "dismiss");
	
	    //prompt alert
			WebElement prompt = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
			promptalert(prompt, "pratheep");
			
			
			//actions
			WebElement acti = driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
			actions(acti);
		//Screenshot	
		screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\screenshot\\maven.png");
   
		
		//navigate
		launch_2("https://www.facebook.com/");
		
		// implicit wait
		WebElement mail = driver.findElement(By.id("email"));
		 wait(mail, "pratheep");
		 
		 //explicit wait
		 WebElement pass = driver.findElement(By.id("pass"));
		 wait(pass, "love");
		 
		 //gettext
		 launch_2("https://leafground.com/table.xhtml;jsessionid=node06g7wgohua9sh1hjyesrd4k9do299661.node0");
			List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
		    webtable((WebElement) findElements); 
		 
}
}