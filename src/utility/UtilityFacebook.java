package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityFacebook
{
	public static String facebookData(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream data=new FileInputStream("C:\\Users\\Kalyani\\eclipse-workspace\\Selenium\\FacebookData.properties");
		prop.load(data);
		String value = prop.getProperty(key);
		return value;
	}

}
