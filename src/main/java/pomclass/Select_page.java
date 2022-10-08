package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_page {

	public WebDriver driver;
	

	public Select_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDot() {
		return dot;
	}

	public WebElement getContinu() {
		return continu;
	}

	@FindBy(id="radiobutton_0")
	private WebElement dot;
	
		@FindBy(id="continue")
	private WebElement continu;
	
}
