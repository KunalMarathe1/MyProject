package testngpackage;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseclass.BaseProp;
import testngpom.LogOut;
import testngpom.LoginPage;
import testngpom.PinPage;
import utility.UtilityProp;

@Listeners(listeners.ListenerProp.class)
public class TestClassProp extends BaseProp{
	
	LoginPage login;
	PinPage pin;
	LogOut logout;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		launchChromeBrowser();
		login=new LoginPage(driver);
		pin=new PinPage(driver);
		logout=new LogOut(driver);
	}
	
	@BeforeMethod
	public void userIDPage() throws IOException
	{
		login.UserId(UtilityProp.readDataFromProperty("UID"));
		login.PWD(UtilityProp.readDataFromProperty("PWD"));
		login.Submit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		pin.PIN(UtilityProp.readDataFromProperty("PIN"));
		pin.Continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
    @Test
  public void validateUserID() throws IOException 
  {
    	String act = logout.validateId();
    	String expt = UtilityProp.readDataFromProperty("UID");
    
    	Assert.assertEquals(act,expt,"User ID Not Match TC Fail");
    	Reporter.log("User ID Match TC Pass",true);
  }
    
    @AfterMethod
   public void logoutPage()
   {
    	logout.UN();
    	logout.logout();
   }
    @AfterClass
    public void closeBrowser()
    {
    	driver.close();
    }
}
