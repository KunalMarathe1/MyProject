package testngpackage;

import java.time.Duration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.BaseSauceDemo;
import facebookpom.SauceDemo;

public class TestSauceDemo extends BaseSauceDemo
{
	SauceDemo login;
	@BeforeClass
	public void openBrowser()
	{
		launchChromeBrowser();
		login=new SauceDemo(driver);
	}
  @Test(dataProvider = "create")
  public void test(String username,String password)
  {
	  login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickLoginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  driver.close();
  }
  
  @DataProvider(name="create")
  public Object[][] dataSet1()
  {
	  return new Object[][]
			  {
		  {"standard_user","secret_sauce"},	
		  {"locked_out_user","secret_sauce"},	
		  {"problem_user","secret_sauce"},	
		  {"performance_glitch_user","secret_sauce"},	
			  };
  }
}
