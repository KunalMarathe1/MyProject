package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		Set<String> allpage = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(allpage);
		
		driver.switchTo().window(al.get(1));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Java");
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(al.get(0));
		

		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		System.out.println(text.getText());
		
		

		
	}

}
