package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("cars");
		Thread.sleep(1000);
		
		List<WebElement> alllist = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		Iterator<WebElement> it = alllist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}

	}

}
