package testngstudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1st {
  @Test
  public void startBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("hi this is printing statement");  //console
		Reporter.log("hi this is reporter output");   //Emailable report
		Reporter.log("hi this is reporter output true",true); //console+emailable report+index report
  }
}
