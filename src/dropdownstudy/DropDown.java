package dropdownstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//1.Identify list box to be handled and store in reference varaible 
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		//2.Create an object of Select Class which will accept WebElement as argument 
		Select s=new Select(dropdown);
		
		//3.By using one of the Select class methods we can select values from list/dropdown box
		Thread.sleep(1000);
		s.selectByVisibleText("Option2");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("option1");
		
	}

}
