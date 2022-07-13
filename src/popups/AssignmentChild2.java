package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentChild2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freejobalert.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OSSC Soil Conservation Extension Worker Final Result']")).click();
		Thread.sleep(200);
		Set<String> allid = driver.getWindowHandles();
	
		ArrayList<String> al=new ArrayList<String>(allid);
		
		driver.switchTo().window(al.get(1));
		Thread.sleep(200);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Java");
		
		
		
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='UPPSC Medical Officer (Orthopedician) 2022 Marks']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(al.get(1));
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div[11]/div[2]/div[2]/div/div/div[1]/h1/span/a"));
		System.out.println(text.getText());
	
		
		
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Rajasthan Police Constable 2021 New Exam Date']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.name("email")).sendKeys("kunalmarathe720@gmail.com");
		
		
		

	}

}
