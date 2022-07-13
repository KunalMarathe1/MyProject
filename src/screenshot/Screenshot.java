package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Computers ']")).click();
		Thread.sleep(2000);
		WebElement section = driver.findElement(By.xpath("//div[@class='page category-page']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\SSS\\Section.png");
		FileHandler.copy(src, dest);
		
		//Screenshot of full page
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Users\\Kalyani\\Desktop\\SSS\\Screenshot.png");
//		FileHandler.copy(src, dest);
		}

}
