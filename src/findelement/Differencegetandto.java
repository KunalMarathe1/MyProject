package findelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Differencegetandto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();

	}

}
