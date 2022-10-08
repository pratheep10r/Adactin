package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_page {
	public WebDriver driver;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	public Details_page(WebDriver driver2) {
         this.driver = driver2;
         PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement credit;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement submit;
	
	

}
