package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		//act.dragAndDrop(src, dest).perform();
		
		
	}

}
