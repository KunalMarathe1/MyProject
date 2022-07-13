package readexcelsheet;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZeroDa {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys("982278");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualid = text.getText();
		String expectedid="ELR321";
		if(actualid.equals(expectedid))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		Actions act=new Actions(driver);
		act.click(text).perform();
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
