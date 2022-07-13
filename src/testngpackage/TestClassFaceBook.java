package testngpackage;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClassFacebook;
import facebookpom.FacebookHomePage;
import facebookpom.FacebookLoginPage;
import utility.UtilityFacebook;

public class TestClassFaceBook extends BaseClassFacebook {
	FacebookLoginPage login;
	FacebookHomePage home;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		launchChromeBrowser();
		login=new FacebookLoginPage(driver);
		home=new FacebookHomePage(driver);
	}
	@BeforeMethod
	public void loginPage() throws IOException
	{
		login.enterUsername(UtilityFacebook.facebookData("UserName"));
		login.enterPassword(UtilityFacebook.facebookData("Password"));
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
  @Test
  public void validateSearchBox() throws IOException 
  {
	 
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
