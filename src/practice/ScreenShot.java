package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{

	public static void takeScreenshot(WebDriver driver,String name) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Kalyani\\Pictures\\SeleniumScreenShot\\"+name+".png");
		
		FileHandler.copy(src, dest);
	}
}
