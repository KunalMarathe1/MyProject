package listeners;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utility.Utility;
import utility.UtilityProp;

public class Listener implements ITestListener
{
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test Case Pass Successfully",true);
		Reporter.log("Name of Pass Method is "+result.getName(),true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Case Failed",true);
		Reporter.log("Name of Failed Method is "+result.getName(),true);	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test Case Skipped",true);
		Reporter.log("Name of Skipped Method is "+result.getName(),true);
	}
	
//	@Override
//	public void onStart(ITestContext context) {
//		
//		Reporter.log("Test Case is Running",true);
//		
//	}
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) 
//	{
//		Reporter.log("Test Case is Failed due to timeout",true);
//	}
	

}
