package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp
{
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream data=new FileInputStream("C:\\Users\\Kalyani\\eclipse-workspace\\Selenium\\MyData.properties");
		prop.load(data);
		String result = prop.getProperty(key);
		return	result;
	}
	public static void Screenshot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String st = RandomString.make(3);
		File dest=new File("C:\\Users\\Kalyani\\Pictures\\SeleniumScreenShot\\"+TCID+".png");
		FileHandler.copy(src, dest);	
	}
}
