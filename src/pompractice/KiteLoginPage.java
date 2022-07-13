package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	@FindBy(id = "userid") private WebElement username;
	@FindBy(id = "password")private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserId()
	{
		username.sendKeys("ELR321");
	}
	public void PWD()
	{
		password.sendKeys("Dhana1111");
	}
	public void Login()
	{
		loginButton.click();
	}
}
