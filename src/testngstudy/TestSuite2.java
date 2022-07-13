package testngstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite2 {
	 @Test(groups = "sanity")
	  public void x()
	  {
		 //Assert.fail();
		  Reporter.log("A is Running",true);
	  }
	  @Test(groups = "sanity")
	  public void y()
	  {
		  Reporter.log("B is Running",true);
	  }
	  @Test(groups = "regression")
	  public void z()
	  {
		  Reporter.log("C is Running",true);
	  }
}
