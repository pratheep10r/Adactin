package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rooms_page {

	public WebDriver driver;
	

	public Rooms_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAudult() {
		return audult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@name='location']")
	private WebElement location ; 
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement rooms;


	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkin;
	
	@FindBy(name="datepick_out")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement audult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(id="Submit")
    private WebElement search;

}
