package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i = all.iterator();
		
		String main = i.next();
		String child = i.next();
		
		driver.switchTo().window(child);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Java");
		
		driver.close();
		
		driver.switchTo().window(main);
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		System.out.println(text.getText());
		
		
	}

}
