package chromeoptionandscrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import practice.ScreenShot;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//		WebElement ref = driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]"));
//		
//		driver.switchTo().frame(ref);
//		Thread.sleep(2000);
//		WebElement button = driver.findElement(By.xpath("//button[text()='No thanks']"));
//
//		button.click();
		
		//Thread.sleep(2000);
		WebElement india = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		
		File src = india.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Kalyani\\Pictures\\SeleniumScreenShot\\Google.png");
		
		FileHandler.copy(src, dest);
		
	}

}
