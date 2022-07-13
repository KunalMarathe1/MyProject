package webelementstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
	/*	WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		boolean result = checkbox.isSelected();
		System.out.println("Result status "+result);
		
		checkbox.click();
		boolean result2 = checkbox.isSelected();
		Thread.sleep(2000);
		System.out.println("Result2 status "+result2); */
		
		WebElement radio = driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
		radio.click();
		System.out.println(""+radio.isSelected()); 
		//System.out.println("Status "+result);
	}

}
