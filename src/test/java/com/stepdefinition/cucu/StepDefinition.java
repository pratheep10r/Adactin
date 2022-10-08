package com.stepdefinition.cucu;


import com.Maven_Project.Baseclass;
import com.pommanager.Page_Object_Manager_login;
import com.properties.File_Reader_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends Baseclass {
	
	public static Page_Object_Manager_login pom = new Page_Object_Manager_login(driver);
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {

		String url = File_Reader_Manager.get_FRM().get_CR().geturl();
		launchurl(url);
	}

	@When("^user Enter the Username In The Username Field$")
	public void user_Enter_the_Username_In_The_Username_Field() throws Throwable {
		String user = File_Reader_Manager.get_FRM().get_CR().getusername();
		entervalue(pom.getP().getLogin(),user);
	}
	

	@When("^user Enter the Password In The Password Field$")
	public void user_Enter_the_Password_In_The_Password_Field() throws Throwable {

        String pass = File_Reader_Manager.get_FRM().get_CR().getpassword();
        entervalue(pom.getP().getPassword(), pass);
	}

	@Then("^user Click The LoginButton  It Navigate To The Search Hotel$")
	public void user_Click_The_LoginButton_It_Navigate_To_The_Search_Hotel() throws Throwable {

		clickbutton(pom.getP().getClick());
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
	    dropdown(pom.getRoom().getLocation(), 7);
	}

	@When("^user Select The Hotel In The Hotel Field$")
	public void user_Select_The_Hotel_In_The_Hotel_Field() throws Throwable {
		dropdown(pom.getRoom().getHotels(), 3);
	}

	@When("^user Select The RoomType In The Roomtype Field$")
	public void user_Select_The_RoomType_In_The_Roomtype_Field() throws Throwable {
		dropdown(pom.getRoom().getRooms(), 2);
	}

	@When("^user Select The Numberofrooms In The Numberofrooms Field$")
	public void user_Select_The_Numberofrooms_In_The_Numberofrooms_Field() throws Throwable {
		dropdown(pom.getRoom().getRoomNo(), 2);
	}

	@When("^user Enter The CheckInDate In The CheckInDate Field$")
	public void user_Enter_The_CheckInDate_In_The_CheckInDate_Field() throws Throwable {
		String in = File_Reader_Manager.get_FRM().get_CR().checkin();
   		entervalue(pom.getRoom().getCheckin(), in);
	}

	@When("^user Enter The CheckOutDate In The CheckOutDate Field$")
	public void user_Enter_The_CheckOutDate_In_The_CheckOutDate_Field() throws Throwable {
		 String out = File_Reader_Manager.get_FRM().get_CR().checkout();
			entervalue(pom.getRoom().getCheckout(), out);
	
	}

	@When("^user Select The AdultsPerRoom In The AdultsPerRoom Field$")
	public void user_Select_The_AdultsPerRoom_In_The_AdultsPerRoom_Field() throws Throwable {
		 dropdown(pom.getRoom().getAudult(), 2);
	}

	@When("^user Select The ChildrenPerRoom In the ChildrenPerRoom Field$")
	public void user_Select_The_ChildrenPerRoom_In_the_ChildrenPerRoom_Field() throws Throwable {
		 dropdown(pom.getRoom().getChild(), 2);
	}

	@Then("^user Click The SearchButton And It Navigate To The Select Hotel$")
	public void user_Click_The_SearchButton_And_It_Navigate_To_The_Select_Hotel() throws Throwable {
		clickbutton(pom.getRoom().getSearch());
	
	}

	@When("^user Select The RadioButton In The RadioButton Field$")
	public void user_Select_The_RadioButton_In_The_RadioButton_Field() throws Throwable {
		clickbutton(pom.getDot().getDot());
	}

	@Then("^user Click The ContinueButton And It Navigate To The Book A Hotel$")
	public void user_Click_The_ContinueButton_And_It_Navigate_To_The_Book_A_Hotel() throws Throwable {
		clickbutton(pom.getDot().getContinu());
	}

	@When("^user Enter The FirstName In The FirstName Field$")
	public void user_Enter_The_FirstName_In_The_FirstName_Field() throws Throwable {

		String firstname = File_Reader_Manager.get_FRM().get_CR().firstname();
		 entervalue(pom.getDetails().getFirstname(), firstname);
	}

	@When("^user Enter The LastName In The LastName Field$")
	public void user_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
		String last = File_Reader_Manager.get_FRM().get_CR().lastname();
		 entervalue(pom.getDetails().getLastname(), last);
	}

	@When("^user Enter The BillingAddress In The BillingAddress Field$")
	public void user_Enter_The_BillingAddress_In_The_BillingAddress_Field() throws Throwable {
		 String address = File_Reader_Manager.get_FRM().get_CR().address();
	     entervalue(pom.getDetails().getAddress(), address);
	}

	@When("^user Enter The CreditCardNo In The CreditCardNo Field$")
	public void user_Enter_The_CreditCardNo_In_The_CreditCardNo_Field() throws Throwable {
		 String creditcard = File_Reader_Manager.get_FRM().get_CR().creditcard();
		 entervalue(pom.getDetails().getCredit(), creditcard);
	}

	@When("^user Select The CreditCardType In The CreditCardType Field$")
	public void user_Select_The_CreditCardType_In_The_CreditCardType_Field() throws Throwable {
		 dropdown(pom.getDetails().getCardtype(), 2);
	}

	@When("^user Select The Month In The Month Field$")
	public void user_Select_The_Month_In_The_Month_Field() throws Throwable {
		 dropdown(pom.getDetails().getMonth(), 2);
	}

	@When("^user Select The Year In The Year Field$")
	public void user_Select_The_Year_In_The_Year_Field() throws Throwable {
		  dropdown(pom.getDetails().getYear(), 4);
	}

	@When("^user Enter The CVV In The CVV Field$")
	public void user_Enter_The_CVV_In_The_CVV_Field() throws Throwable {
		String cvvv = File_Reader_Manager.get_FRM().get_CR().cvvv();
		 entervalue(pom.getDetails().getCvv(), cvvv);
	}

	@Then("^user Click The BookNowButton In The BookNowButton Field$")
	public void user_Click_The_BookNowButton_In_The_BookNowButton_Field() throws Throwable {
		 clickbutton(pom.getDetails().getSubmit());
	}


	

}
