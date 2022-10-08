package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom_pojo_miniproject {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement login;
	
	public Pom_pojo_miniproject(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return login;
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClick() {
		return click;
	}


	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement click;
	
	
	
}
