package file.properties;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Maven_Project.Baseclass;
import com.pommanager.Page_Object_Manager_login;
import com.properties.File_Reader_Manager;

public class Runner_Property_file extends Baseclass{


	public static WebDriver driver = browserlaunch("chrome");
	
	public static Page_Object_Manager_login pom = new Page_Object_Manager_login(driver);
	
	public static void main(String[] args) throws IOException {
		
		
 String url = File_Reader_Manager.get_FRM().get_CR().geturl();
launchurl(url);
		//login
String user = File_Reader_Manager.get_FRM().get_CR().getusername();
entervalue(pom.getP().getLogin(),user);

String pass = File_Reader_Manager.get_FRM().get_CR().getpassword();
 entervalue(pom.getP().getPassword(), pass);	
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
String in = File_Reader_Manager.get_FRM().get_CR().checkin();
   		entervalue(pom.getRoom().getCheckin(), in);
		//checkout
 String out = File_Reader_Manager.get_FRM().get_CR().checkout();
		entervalue(pom.getRoom().getCheckout(), out);
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
		String firstname = File_Reader_Manager.get_FRM().get_CR().firstname();
		 entervalue(pom.getDetails().getFirstname(), firstname);
		 String last = File_Reader_Manager.get_FRM().get_CR().lastname();
		 entervalue(pom.getDetails().getLastname(), last);
		 String address = File_Reader_Manager.get_FRM().get_CR().address();
	     entervalue(pom.getDetails().getAddress(), address);
	     String creditcard = File_Reader_Manager.get_FRM().get_CR().creditcard();
		 entervalue(pom.getDetails().getCredit(), creditcard);
		 dropdown(pom.getDetails().getCardtype(), 2);
		 dropdown(pom.getDetails().getMonth(), 2);
	     dropdown(pom.getDetails().getYear(), 4);
	     String cvvv = File_Reader_Manager.get_FRM().get_CR().cvvv();
		 entervalue(pom.getDetails().getCvv(), cvvv);
		 clickbutton(pom.getDetails().getSubmit());

	
}
}