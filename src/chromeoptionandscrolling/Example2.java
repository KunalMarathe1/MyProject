package chromeoptionandscrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		//je.executeScript("window.scrollBy(90,800)");
		WebElement ref = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[1]"));
		je.executeScript("arguments[0].scrollIntoView(true)",ref);
	
		
		
	}

}
