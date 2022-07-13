package testngstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite1 {
  @Test(groups = "sanity")
  public void a()
  {
	  Reporter.log("A is Running",true);
  }
  @Test(groups = "regression")
  public void b()
  {
	  //Assert.fail();
	  Reporter.log("B is Running",true);
  }
  @Test(groups = "sanity")
  public void c()
  {
	  Reporter.log("C is Running",true);
  }
}
