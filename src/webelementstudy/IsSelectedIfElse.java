package webelementstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIfElse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Thread.sleep(2000);
		boolean result = female.isSelected();
		System.out.println("Result status "+result);
		Thread.sleep(2000);
		if(result==false)
		{
			
			Thread.sleep(1000);
			female.click();
			Thread.sleep(1000);
			boolean result2=female.isSelected();
			if(result2==true)
			{
				System.out.println("Female Radio Button is Selected");
			}
	
			else
			{
				WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				Thread.sleep(1000);
				male.click();
				Thread.sleep(1000);
				boolean result3=male.isSelected();
				if(result3==true)
				{
					System.out.println("Male Radio Button is Selected");
				}
				else
				{
					WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
					Thread.sleep(1000);
					custom.click();
					Thread.sleep(1000);
					boolean result4=custom.isSelected();
					if(result4==true)
					{
						System.out.println("Custom Radio Button is Selected");
					}
					else
					{
						System.out.println("*Please Select Gender*");
					}
				}
			}
			
		}
		
	}

}
