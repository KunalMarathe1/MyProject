package testngstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordsUse 
{
  @Test(priority = 2)
  public void a()
  {
	  Reporter.log("A",true);
  }
  
  @Test(enabled = false)
  public void z()
  {
	  Reporter.log("Z",true);
  }
  
  @Test(priority = 3)
  public void c()
  {
	  Assert.fail();
	  Reporter.log("C",true);
  }
  @Test(timeOut =1000)
  public void d() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("D",true);
  }
  @Test (dependsOnMethods =  {"c"})
  public void e()
  {
	  Reporter.log("E",true);
  }
}
