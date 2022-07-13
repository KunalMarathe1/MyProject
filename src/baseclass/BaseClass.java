package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	protected WebDriver driver;
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);
		driver.get("https://kite.zerodha.com/");
	}
	
	public void launchFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\geckodriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
	}
	
	
	
	
	
}
