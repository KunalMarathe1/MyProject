package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement electronic = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(electronic).perform();
		Thread.sleep(2000);
		WebElement computer = driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
		act.moveToElement(computer).perform();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("//a[text()='Printers']"));
		act.click(click).perform();

	}

}
