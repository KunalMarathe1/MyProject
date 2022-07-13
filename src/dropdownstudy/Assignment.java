package dropdownstudy;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		//step1
	
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//step2
		Select s=new Select(date);
		Select s1=new Select(month);
		Select s2=new Select(year);
		
		//step3
		Thread.sleep(1000);
		s.selectByValue("29");
		Thread.sleep(1000);
		s1.selectByIndex(4);
		Thread.sleep(1000);
		s2.selectByVisibleText("1997");
		Thread.sleep(1000);
		

	}

}
