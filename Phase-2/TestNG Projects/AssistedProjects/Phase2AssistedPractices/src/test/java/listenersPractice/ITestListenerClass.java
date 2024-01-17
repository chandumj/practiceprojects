package listenersPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener {

	
	//Invoked each time before a test will be invoked.
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test has been Invoked");
		
	}
	//Invoked each time a test succeeds.
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Log : Test has been successfull");
	}
	
   // Invoked each time a test fails.
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Log: Test has failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Log: Test has been skipped");
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Log: Test has been failed due to timeout");
	}
	
//	Invoked before running all the test methods belonging to the classes inside the <test> tag
	public void onStart(ITestContext context) {
		
		System.out.println("The Main test has started");
	}
	//Invoked after all the test methods belonging to the classes inside the <test> tag have run
	// and all their Configuration methods have been called.
	public void onFinish(ITestContext context) {
		System.out.println("The Main test has Completed");
	}
	

}
