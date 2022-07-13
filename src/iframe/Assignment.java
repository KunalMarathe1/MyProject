package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Hello World");
		Thread.sleep(500);
		driver.switchTo().frame(0);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();  //switch to main page
		Thread.sleep(500);
		driver.switchTo().frame("frame2");
		Thread.sleep(500);
		WebElement list = driver.findElement(By.id("animals"));
		
		Select s = new Select(list);
		Thread.sleep(500);
		s.selectByVisibleText("Cat");
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		WebElement text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		System.out.println("Main Page Text:-"+text.getText());
		
		
	}

}
