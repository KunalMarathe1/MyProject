package readexcelsheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ZeroDaUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		File file=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\Sample.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
		
		String uname = sheet.getRow(0).getCell(0).getStringCellValue();
		WebElement username = driver.findElement(By.id("userid"));
		username.sendKeys(uname);
		Thread.sleep(500);
		
		
		String pas = sheet.getRow(0).getCell(1).getStringCellValue();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pas);
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		String pin = sheet.getRow(0).getCell(2).getStringCellValue();
		WebElement pinmain = driver.findElement(By.id("pin"));
		pinmain.sendKeys(pin);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualid = text.getText();
		String expectedid="ELR321";
		if(actualid.equals(expectedid))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
//		text.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@target='_self']")).click();
//		Thread.sleep(1000);
//		driver.quit();

	}

}
