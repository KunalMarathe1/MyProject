package actionsclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement contextclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(contextclick).contextClick().build().perform();//2nd use
		//act.contextClick(contextclick).perform();  //1st use
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(300);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		Alert at=driver.switchTo().alert();
		Thread.sleep(200);
		System.out.println(at.getText());
		at.accept();
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		System.out.println(at.getText());
		at.accept();
		
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.linkText("Selenium"));
		act.click(click).perform();
		for(int j=1;j<=5;j++)
		{
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
	
		
		
		
		
		
		
		
	}

}
