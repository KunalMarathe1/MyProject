package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		Thread.sleep(3000);
	
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
		
	}

}
