package testngstudy;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ZeroDaAnnotations
{
	WebDriver driver;
	SoftAssert so;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		so=new SoftAssert();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	}
	
	@BeforeMethod
	public void loginPage()
	{
		
		driver.findElement(By.id("userid")).sendKeys("PJF364");
		driver.findElement(By.id("password")).sendKeys("Vinaykadam@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@BeforeMethod
	public void pinPage()
	{
		driver.findElement(By.id("pin")).sendKeys("150996");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test()
	public void validateUser()
	{
		WebElement text = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualid = text.getText();
		String expectedid="PJF364";
		so.assertEquals(actualid, expectedid,"User ID not Match TC Fail");
		so.assertAll();
		Reporter.log("User ID Match TC is Pass",true);
		
	}

	@AfterMethod
	public void logoutPage()
	{
		 driver.findElement(By.xpath("//span[@class='user-id']")).click();
		 driver.findElement(By.xpath("//a[@target='_self']")).click();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
		
}
