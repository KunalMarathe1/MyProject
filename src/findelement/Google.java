package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Cars");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Bmw");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]/svg")).click();
	}
	

}
