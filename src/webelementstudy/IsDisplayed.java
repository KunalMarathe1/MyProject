package webelementstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement text = driver.findElement(By.name("show-hide"));
		hide.click();
		if(text.isDisplayed())
		{
			System.out.println("TextBox is Displayed");
		}
		else
		{
			//show.click();
			if(text.isDisplayed())
			{
				System.out.println("TextBox is Displayed Now");
			}
			else
			{
				System.out.println("TextBox is not Displayed");
			}
		}
		
	}

}
