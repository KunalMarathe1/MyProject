package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisEnaSelMethodUse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//use of isDisplayed() and isEnabled
		WebElement find=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		System.out.println("Display Status "+find.isDisplayed());
		System.out.println("Enable Status "+find.isEnabled());
		
		//use of isSelected()     radiobutton, checkbox, dropdown
		WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
	
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
	}

}
