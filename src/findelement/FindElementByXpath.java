package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXpath {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@name='login']")).click(); //by attributes 
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();//by text
		
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")); //by contains using text
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();  //by contains using attribute
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click(); //by using contains when there is no unique value
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("(//input[@name='radio'])[4]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[3]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();  //by using index
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();  //by using index
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click(); //by using text
		driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click(); // by contains using text
	}

}
