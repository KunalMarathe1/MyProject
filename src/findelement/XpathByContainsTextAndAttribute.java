package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsTextAndAttribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")); //by contains using text
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();  //by contains using attribute
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click(); //by using contains when there is no unique value
	}

}
