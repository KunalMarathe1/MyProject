package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(@id,'accountList')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("kunalmarathe720@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Jayshreeram@83");
		driver.findElement(By.xpath("//input[contains(@id,'signIn')]")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Samsung')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"imageBlock_feature_div\"]/span[1]/div/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Copy Link']")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://web.whatsapp.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@title='Search input textbox']")).sendKeys("Akshay Sadaphule");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_3OvU8'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("https://www.amazon.com/dp/B08BX7N9SK?ref_=cm_sw_r_cp_ud_dp_1H39KBYDYZM247TJH4GY");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid='send']")).click();
	}

}
