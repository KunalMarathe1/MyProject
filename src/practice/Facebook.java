package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		ScreenShot.takeScreenshot(driver, "HomePageFaceBook");
	}

}
