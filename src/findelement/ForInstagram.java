package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ForInstagram
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click(); //by using text
		driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click(); // by contains using text
	}

}
