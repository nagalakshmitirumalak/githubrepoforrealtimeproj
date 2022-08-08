package realtimepageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@class='dropdown']//*[text()='My Account']")
	private WebElement myAccountDropdown;
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement loginOption;
	
	public WebElement myAccountDropdown() {
		
		return myAccountDropdown;
		
	}
	
	public WebElement loginOption() {
		
		return loginOption;
		
	}
	
	
}
