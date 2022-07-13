package seleniumStudy1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_1stCode {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.navigate().to("https://www.cricbuzz.com/"); //this is used for we have to open another page
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle()); 
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}
