package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSauceDemo
{
	protected WebDriver driver;
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
}
