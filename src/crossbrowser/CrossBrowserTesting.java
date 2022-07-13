package crossbrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters("browserName")
  @Test
  public void openBrowserMultiple(String name) 
  {
		WebDriver driver = null;   
		if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			
		}
		else if(name.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		else if(name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.phonepe.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
  }
}
