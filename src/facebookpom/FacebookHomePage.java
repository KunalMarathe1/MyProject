package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage 
{
	
	@FindBy(xpath = "(//input[@role='combobox'])[1]") private WebElement searchBox;
	
	public FacebookHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox(String search)
	{
		searchBox.sendKeys(search);
		
	}
}
