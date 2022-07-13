package testngpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import testngpom.LogOut;
import testngpom.LoginPage;
import testngpom.PinPage;
import utility.Utility;

public class TestClass extends BaseClass{
	LoginPage login;
	PinPage pin;
	LogOut logout;
	
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String name)
	{
		if(name.equals("chrome"))
		{
			launchChromeBrowser();
		}
		else if(name.equals("firefox"))
		{
			launchFireFoxBrowser();
		}
		login=new LoginPage(driver);
		pin=new PinPage(driver);
		logout=new LogOut(driver);
		
	}
	
	@BeforeMethod
	public void loginPage() throws EncryptedDocumentException, IOException
	{
		login.UserId(Utility.excelReading(0, 0));
		login.PWD(Utility.excelReading(0, 1));
		login.Submit();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.PIN(Utility.excelReading(0, 2));
		pin.Continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
  @Test
  public void validateusername() throws EncryptedDocumentException, IOException 
  {
	String exp = Utility.excelReading(0, 0);
	String act = logout.validateId();
	  Assert.assertEquals(act,exp ,"UserID is not Match TC Fail"); 
	  Reporter.log("UserID is Match TC Pass");
	  Utility.Screenshot(driver, "UserID");
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
