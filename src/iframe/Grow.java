package iframe;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		Thread.sleep(2000);
		WebElement growiframe = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(growiframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Sign in with Google'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		Set<String> allpageid = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(allpageid);
		
		driver.switchTo().window(al.get(1));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kunalmarathe720@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
