package webelementstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = getOTP.isEnabled();
		System.out.println("Result status "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		Thread.sleep(1000);
		boolean result1 = getOTP.isEnabled();
		System.out.println("Result1 status "+result1);
	}

}
