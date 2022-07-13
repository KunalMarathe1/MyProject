package utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility
{
	//excel
	public static String excelReading(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\POM.xlsx");
		 Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 String data = sh.getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}
//	public static String excelr(int a,int b) throws EncryptedDocumentException, IOException
//	{
//		File myfile=new File("C:\\Users\\Kalyani\\Desktop\\Kunal\\Selenium\\POM.xlsx");
//		 Sheet sh = WorkbookFactory.create(myfile).getSheet("Sheet1");
//		 String value = sh.getRow(a).getCell(b).getStringCellValue();
//		 return value;
//	}
	public static void Screenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String st = RandomString.make(3);
		File dest=new File("C:\\Users\\Kalyani\\Pictures\\SeleniumScreenShot\\"+TCID+".png");
		FileHandler.copy(src, dest);
		
		
	}
}
