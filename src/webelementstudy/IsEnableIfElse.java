package webelementstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableIfElse 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = getOTP.isEnabled();
		System.out.println("Result status "+result);
		if(result==false)
		{
			System.out.println("Please Enter Mobile Number");
			driver.findElement(By.name("mobileNumber")).sendKeys("8329306305");
			Thread.sleep(1000);
			boolean result1 = getOTP.isEnabled();
			if(result1==true)
			{
				System.out.println("OTP button get Enable");
				getOTP.click();
				Thread.sleep(3000);
				WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
				System.out.println("Please Enter OTP");
				Thread.sleep(3000);
				driver.findElement(By.id("OTP")).sendKeys("262878");
				Thread.sleep(1000);
				boolean result2=submitbutton.isEnabled();
				if(result2==true)
				{
					System.out.println("Welcome To Application");
				}
				else
				{
					System.out.println("Invalid OTP");
				}
			}
			else
			{
				System.out.println("getOTP button get Disable please *Check Your Mobile Number*");
			}
		}
		
	}
}
