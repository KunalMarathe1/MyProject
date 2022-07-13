package misc;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("flags");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Iterator<WebElement> it = list.iterator();
		System.out.println("=====UnOrderList=====");
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		for(WebElement ref:list)
		{
			String actual = ref.getText();
			String expected="flags";
			if(actual.equals(expected))
			{
				ref.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println();
		System.out.println("=====Images on Web Page=====");
		System.out.println(imgList.size());	
	
	}

}
