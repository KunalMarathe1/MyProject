package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]")).click();
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/iframe"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='WebDriver'])[1]")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[1]/a")).click();
		
	}

}
