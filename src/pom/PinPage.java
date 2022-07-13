package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy(id ="pin")private WebElement pinButton;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PIN(String pi)
	{
		pinButton.sendKeys(pi);
	}
	
	public void Continue()
	{
		continueButton.click();
	}
	
	
}
