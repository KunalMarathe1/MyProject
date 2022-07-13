package dropdownstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement multiple = driver.findElement(By.id("cars"));
		
		Select s=new Select(multiple);
		
		
		for(int i=0;i<=3;i++)
		{
			s.selectByIndex(i);
		}
//		s.selectByVisibleText("Audi");
//		s.selectByIndex(2);
//		s.selectByValue("volvo");
		//Thread.sleep(2000);
		//s.deselectAll();
		
		//s.deselectByIndex(2);
		
		List<WebElement> list = s.getOptions();
		
	
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		
	}

}
