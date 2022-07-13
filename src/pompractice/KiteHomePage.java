package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserId()
	{
		String expectedUserId="ELR321";
		String actualUserId=userid.getText();
		if(expectedUserId.equals(actualUserId))
		{
			System.out.println("Test Case is Pass");
		}
		else
		{
			System.out.println("Test Case is Fail");
		}
	}
	
	public void clickUserId()
	{
		userid.click();
	}
	public void clickLogout()
	{
		logoutButton.click();
	}
}
