package testngstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)
public class ListenerStudy {
  @Test
  public void Method1() 
  {
	  Reporter.log("Method1 Pass",true);
  }
  
  @Test
  public void Method2()
  {
	  Assert.fail();
	  Reporter.log("Method2 Fail",true);
  }
  
  @Test(dependsOnMethods = {"Method2"})
  public void Method3()
  {
	  Reporter.log("Method3 Skipped",true);
  }
//  @Test(timeOut = 1000)
//  public void Method4() throws InterruptedException
//  {
//	  Thread.sleep(2000);
//	  Reporter.log("Method4 Failed Due To Timeout",true);
//  }
}
