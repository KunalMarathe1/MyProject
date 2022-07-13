package dropdownstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.xpath("(//select[@class='select select-initialized'])[1]"));
		Thread.sleep(2000);
		Select s=new Select(list);
		Thread.sleep(2000);
		s.selectByVisibleText("One");
		Thread.sleep(2000);
		s.selectByValue("2");
		
//		 
		//		
//		
		
	}

}
