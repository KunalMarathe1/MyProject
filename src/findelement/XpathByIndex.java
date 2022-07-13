package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("(//input[@name='radio'])[4]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[3]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();  //by using index

	}

}
