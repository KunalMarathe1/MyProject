package testngpom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
	
	WebDriver driver;
	LoginPage login;
	PinPage pin;
	LogOut logout;
	Sheet sh;
	
	@BeforeClass
		public void openBrowser() throws EncryptedDocumentException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
			ChromeOptions ch=new ChromeOptions();
			ch.addArguments("--disable-notifications");
			driver=new ChromeDriver(ch);
			
			driver.get("https://kite.zerodha.com/");
			
			login=new LoginPage(driver);
			pin=new PinPage(driver);
			logout=new LogOut(driver);
			File myfile=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\POM.xlsx");
			sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
			
			
		}
	@BeforeMethod
		public void loginPage()
		{
			String UN = sh.getRow(0).getCell(0).getStringCellValue();
			String PW = sh.getRow(0).getCell(1).getStringCellValue();
			String pi = sh.getRow(0).getCell(2).getStringCellValue();
			
			login.UserId(UN);
			login.PWD(PW);
			login.Submit();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

			pin.PIN(pi);
			pin.Continue();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
	
	@Test
	  public void validateUserID()
	  {
		String expectuserid = sh.getRow(0).getCell(0).getStringCellValue();
		String actualuserid = logout.validateId();
		
		Assert.assertEquals(actualuserid, expectuserid,"UserID not Match TC Fail");
		Reporter.log("UserID Match TC Pass",true);
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
