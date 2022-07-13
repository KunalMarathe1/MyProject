package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allid = driver.getWindowHandles();
		
		ArrayList<String> al= new ArrayList<String>(allid);
		Iterator<String> i = al.iterator();		
		while(i.hasNext())
		{
			String main = i.next();
			String child=i.next();
			if(!main.equals(child))
			{
				driver.switchTo().window(al.get(1));
				Thread.sleep(1000);
				driver.findElement(By.name("emailid")).sendKeys("kunalmarathe720@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				
				driver.close();
			}
			
		}	
		driver.switchTo().window(al.get(0));
		WebElement text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']"));
		System.out.println(text.getText());
	}

}
