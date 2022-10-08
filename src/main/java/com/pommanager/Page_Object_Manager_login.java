package com.pommanager;

import org.openqa.selenium.WebDriver;

import pomclass.Details_page;
import pomclass.Pom_pojo_miniproject;
import pomclass.Rooms_page;
import pomclass.Select_page;

public class Page_Object_Manager_login {
	
	public WebDriver driver;
	public Page_Object_Manager_login(WebDriver driver2) {
           this.driver = driver2;
	}
	
	//private classname obj;  // loginpage
	private Pom_pojo_miniproject p;
	public Pom_pojo_miniproject getP() {
		if (p==null) {
		 p = new Pom_pojo_miniproject(driver);
		}
		return p;
	}
	
	//private classname obj;  // rooms page
	private Rooms_page room;
	public Rooms_page getRoom() {
		if (room == null) {
		 room = new Rooms_page(driver);	
		}
		return room;
	}
	
	//private classname obj; // select page
	private Select_page dot;
	public Select_page getDot() {
		if (dot==null) {
			 dot = new Select_page(driver);	
		}
		return dot;
	}
	
	//private classname obj // personal details page
	private Details_page details;
	public Details_page getDetails() {
		if (details==null) {
			 details = new Details_page(driver);
		}
		return details;
	}
	
	

}
