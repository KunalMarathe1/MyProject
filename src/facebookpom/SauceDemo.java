package facebookpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo 
{

	@FindBy(id = "user-name") private WebElement userid;
	@FindBy(id = "password") private WebElement passWord;
	@FindBy(id="login-button") private WebElement loginbutton;
	
	
	public SauceDemo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		userid.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passWord.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	
	
	
}
