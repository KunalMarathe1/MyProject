package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("cars");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li"));
		
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		for(WebElement ref:list)
			
		{
			String act=ref.getText();
			String exp="cars under 10 lakhS";
			if(act.equalsIgnoreCase(exp))
			{
				ref.click();
				break;
			}
		}
		driver.findElement(By.linkText("Images")).click();
		List<WebElement> count = driver.findElements(By.tagName("img"));
		System.out.println(count.size());
	}

}
