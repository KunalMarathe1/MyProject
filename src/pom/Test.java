package pom;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		File myfile=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\POM.xlsx");
		Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
	
		
			
				String UN = sh.getRow(0).getCell(0).getStringCellValue();
				String PW = sh.getRow(0).getCell(1).getStringCellValue();
				String pi = sh.getRow(0).getCell(2).getStringCellValue();
				
				LoginPage login=new LoginPage(driver);
				login.UserId(UN);
				Thread.sleep(200);
				login.PWD(PW);
				Thread.sleep(200);
				login.Submit();
				Thread.sleep(2000);
			
				PinPage pin=new PinPage(driver);
				pin.PIN(pi);
				pin.Continue();
				
				Thread.sleep(2000);
				LogOut home=new LogOut(driver);
				home.validateId(UN);
				home.UN();
				home.logout();
				
				driver.findElement(By.linkText("Change user")).click();
				
				
				
			
		
		


	}

}
