package testngstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	WebDriver driver;
	SoftAssert so;
	
  @Test
  public void equalsUse() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
	  	so = new SoftAssert();
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//*********assertEquals Use*************
		String expectedText = driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']")).getText();
		String actualText = "Create a new account";
		so.assertEquals(expectedText, actualText,"Text is not equal TC is Fail");
		Reporter.log("Text is equal TC is Pass",true);
	
		
		//*********assertNotEquals Use**********
		String expText = driver.findElement(By.xpath("//a[text()='Already have an account?']")).getText();
		String actText = "Already have an accoun?";
		so.assertNotEquals(expText, actText,"Text is equal TC is Fail");
		Reporter.log("Text is not equal TC is Pass",true);
		
		
		//*********assertTrue Use*************
		WebElement femaleButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		femaleButton.click();
		so.assertTrue(femaleButton.isSelected(), "Female Button not selected Tc is Fail");
		Reporter.log("Female Button is selected Tc is Pass");
		
		
		//*********assertFalse Use************
		WebElement maleButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//maleButton.click();
		so.assertFalse(maleButton.isSelected(), "Male Button is selected TC fail");
		Reporter.log("Male Button is not selected TC pass");
		
		
		
		//*********assertNull Use************
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstName=null;
		so.assertNull(firstName, "FirstName Field is Not Null TC Fail");
		Reporter.log("FirstName Field is Null TC is Pass",true);
		
		
		//********assertNotNull Use**********
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("Marathe");
		so.assertNotNull(surname, "Surname Field is Null TC is Fail");
		so.assertAll();
		Reporter.log("Surname Field is Not Null TC is Pass",true);

		
		
		
  }
  
  
}
