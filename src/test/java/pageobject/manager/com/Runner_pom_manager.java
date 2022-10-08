package pageobject.manager.com;

import org.openqa.selenium.WebDriver;

import com.Maven_Project.Baseclass;
import com.pommanager.Page_Object_Manager_login;

import pomclass.Details_page;
import pomclass.Pom_pojo_miniproject;
import pomclass.Select_page;

public class Runner_pom_manager extends Baseclass{
	
	public static WebDriver driver = browserlaunch("chrome");
	
	public static Page_Object_Manager_login pom = new Page_Object_Manager_login(driver);
	
	public static void main(String[] args) {
		
		launchurl("https://adactinhotelapp.com/index.php");
		//login
		entervalue(pom.getP().getLogin(),"benten11");
	    entervalue(pom.getP().getPassword(), "benten");	
		clickbutton(pom.getP().getClick());
		
		//loaction
	    dropdown(pom.getRoom().getLocation(), 7);
     	//hotel
		dropdown(pom.getRoom().getHotels(), 3);
		//room
		dropdown(pom.getRoom().getRooms(), 2);
		//room num
		dropdown(pom.getRoom().getRoomNo(), 2);
		//checkin
		entervalue(pom.getRoom().getCheckin(), "20/09/2022");
		//checkout
		entervalue(pom.getRoom().getCheckout(), "22/09/2022");
		//audult
		 dropdown(pom.getRoom().getAudult(), 2);
		// child
		  dropdown(pom.getRoom().getChild(), 2);
		// search
		clickbutton(pom.getRoom().getSearch());
		
		
		//selectpage--->
		clickbutton(pom.getDot().getDot());
		// continue
		clickbutton(pom.getDot().getContinu());
		
		//details_page
		 entervalue(pom.getDetails().getFirstname(), "pratheep");
		 entervalue(pom.getDetails().getLastname(), "raj");
	     entervalue(pom.getDetails().getAddress(), "no 7 gangaiyamman  kovil street pudhu nagar, pondicherry");
		 entervalue(pom.getDetails().getCredit(), "1234567899562145");
		 dropdown(pom.getDetails().getCardtype(), 2);
		 dropdown(pom.getDetails().getMonth(), 2);
	     dropdown(pom.getDetails().getYear(), 4);
		 entervalue(pom.getDetails().getCvv(), "236");
		 clickbutton(pom.getDetails().getSubmit());
	}
}
