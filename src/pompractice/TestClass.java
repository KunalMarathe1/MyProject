package pompractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.UserId();
		Thread.sleep(300);
		login.PWD();
		Thread.sleep(300);
		login.Login();
		
		Thread.sleep(2000);
		KitePinPage pin=new KitePinPage(driver);
		pin.enterPin();
		Thread.sleep(300);
		pin.Continue();
		
		Thread.sleep(2000);
		KiteHomePage home=new KiteHomePage(driver);
		home.validateUserId();
		Thread.sleep(300);
		home.clickUserId();
		Thread.sleep(300);
		home.clickLogout();
	}

}
