package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtils implements ITestListener  {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println(" ****** Test case finished ****** " + arg0.getName());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
    System.out.println(" ****** test case started ****** "+ arg0.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
	 System.out.println(" ****** Test case failed ****** " + arg0.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
