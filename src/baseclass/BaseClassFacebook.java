package baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.UtilityFacebook;

public class BaseClassFacebook
{
	protected WebDriver driver;
	public void launchChromeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver=new ChromeDriver(ch);
		driver.get(UtilityFacebook.facebookData("URL"));
	}
}
