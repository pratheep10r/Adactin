package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.Baseclass;

public class Runner_baseclass extends Baseclass{
	
	public static void main(String[] args) {
		
		
	//System.setProperty("webdriver.chrome.driver", 
	//.getProperty("user.dir")+"C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
	
  	//WebDriver driver = new ChromeDriver();
    // driver.get("https://adactinhotelapp.com/index.php");
    //	driver.manage().window().maximize();
	
		browserlaunch("chrome");
		launchurl("https://adactinhotelapp.com/index.php");
		
		
	//login
	WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
	entervalue(login,"benten11");
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    entervalue(password, "benten");	
	WebElement clk = driver.findElement(By.xpath("//input[@type='Submit']"));
	clickbutton(clk);
	
	//loaction
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
    dropdown(location, 7);
    
	//hotel
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	dropdown(hotel, 3);
	
	//room
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	dropdown(room, 2);
	
	//room num
	WebElement noo = driver.findElement(By.xpath("//select[@name='room_nos']"));
	dropdown(noo, 2);
	
	//checkin
	WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	entervalue(checkin, "20/09/2022");
	
	//checkout
	WebElement checkout = driver.findElement(By.name("datepick_out"));
	entervalue(checkout, "22/09/2022");
	
	//audult
	WebElement audult = driver.findElement(By.xpath("//select[@name='adult_room']"));
	dropdown(audult, 2);
	
	// child
	WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	  dropdown(child, 2);
	  
	// search
	WebElement sc = driver.findElement(By.id("Submit"));
	clickbutton(sc);
	
	WebElement dot = driver.findElement(By.id("radiobutton_0"));
	clickbutton(dot);
	
	// continue
	WebElement con = driver.findElement(By.id("continue"));
	clickbutton(con);
	
	//name & address
	WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	entervalue(name, "pratheep");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	entervalue(lastname, "raj");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
     entervalue(address, "no 7 gangaiyamman  kovil street pudhu nagar, pondicherry");
     
	// card details
	WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
	entervalue(credit, "1234567899562145");
	
	WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	dropdown(cardtype, 2);
	
	WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	dropdown(month, 2);
	
     WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
     dropdown(year, 4);
	 
	 WebElement cvv = driver.findElement(By.id("cc_cvv"));
	 entervalue(cvv, "236");
	 
	 WebElement clk3 = driver.findElement(By.id("book_now"));
	 clickbutton(clk3);
	 
		
	}

	
	}


