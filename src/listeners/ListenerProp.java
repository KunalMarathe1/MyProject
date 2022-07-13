package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseclass.BaseProp;
import utility.UtilityProp;

public class ListenerProp extends BaseProp implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try {
			UtilityProp.Screenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test Case Run Successfully "+result.getName(),true);
	}
}
