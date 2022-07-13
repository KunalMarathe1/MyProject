package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.linkText("Create New Account"));
		Actions act=new Actions(driver);
		act.click(click).perform();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		Thread.sleep(1000);
		act.keyDown(firstname, Keys.SHIFT).sendKeys("k").keyUp(firstname, Keys.SHIFT).sendKeys(Keys.ARROW_RIGHT).sendKeys("unal").build().perform();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		
		for(int i=1;i<=4;i++)
		{
			
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
