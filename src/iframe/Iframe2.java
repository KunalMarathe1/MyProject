package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Kunal");
		driver.switchTo().parentFrame();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();		

	}

}
