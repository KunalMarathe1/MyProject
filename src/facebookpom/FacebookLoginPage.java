package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage 
{
	@FindBy(id = "email") private WebElement username;
	@FindBy(id = "pass") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String UN)
	{
		username.sendKeys(UN);
	}
	public void enterPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
