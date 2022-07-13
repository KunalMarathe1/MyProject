package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut
{
	@FindBy(xpath ="//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath ="//a[@target='_self']" ) private WebElement logoutButton;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateId(String ExpUserId)
	{
		String actualId=userid.getText();
		String expectedId=ExpUserId;
		
		if(actualId.equals(expectedId))
		{
			System.out.println("UserID match Test Case Pass");
		}
		else
		{
			System.out.println("UserID not match Test Case Fails");	
		}
	}
	public void UN()
	{
		userid.click();
	}
	
	public void logout()
	{
		logoutButton.click();
	}
}
