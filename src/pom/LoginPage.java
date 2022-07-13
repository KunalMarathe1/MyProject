package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id="userid")  private WebElement username;
	@FindBy(id ="password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement submitButton;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void UserId(String UN) 
	{
		username.sendKeys(UN);
	}
	
	public void PWD(String PW)
	{
		password.sendKeys(PW);
	}
	
	public void Submit()
	{
		submitButton.click();
	}
	
	
	
}
