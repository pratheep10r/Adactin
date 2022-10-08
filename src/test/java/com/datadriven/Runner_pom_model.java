package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.Baseclass;

import pomclass.Details_page;
import pomclass.Pom_pojo_miniproject;
import pomclass.Rooms_page;
import pomclass.Select_page;

public class Runner_pom_model extends Baseclass {
	
	public static void main(String[] args) {

		browserlaunch("chrome");
		launchurl("https://adactinhotelapp.com/index.php");
		
	Pom_pojo_miniproject p = new Pom_pojo_miniproject(driver);
	//login
	entervalue(p.getLogin(),"benten11");
    entervalue(p.getPassword(), "benten");	
	clickbutton(p.getClick());
	
	//---> room_spage
	    Rooms_page r = new Rooms_page(driver);
////loaction
    dropdown(r.getLocation(), 7);
//	//hotel
	dropdown(r.getHotels(), 3);
//	//room
	dropdown(r.getRooms(), 2);
//	//room num
	dropdown(r.getRoomNo(), 2);
//	//checkin
	entervalue(r.getCheckin(), "20/09/2022");
//	//checkout
	entervalue(r.getCheckout(), "22/09/2022");
//	//audult
	 dropdown(r.getAudult(), 2);
//	// child
	  dropdown(r.getChild(), 2);
//	// search
	clickbutton(r.getSearch());
	
	//selectpage--->
	Select_page s = new Select_page(driver);
	clickbutton(s.getDot());
//	// continue
	clickbutton(s.getContinu());
	
	//details_page
	Details_page d = new Details_page(driver);
//	//name & address
	entervalue(d.getFirstname(), "pratheep");
	entervalue(d.getLastname(), "raj");
    entervalue(d.getAddress(), "no 7 gangaiyamman  kovil street pudhu nagar, pondicherry");
//	// card details
	 entervalue(d.getCredit(), "1234567899562145");
	 dropdown(d.getCardtype(), 2);
	 dropdown(d.getMonth(), 2);
     dropdown(d.getYear(), 4);
	 entervalue(d.getCvv(), "236");
	 clickbutton(d.getSubmit());
	}
	}