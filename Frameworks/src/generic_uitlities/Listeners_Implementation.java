package generic_uitlities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;
public class Listeners_Implementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName + "starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName =result.getMethod().getMethodName();
		Reporter.log(methodName+ "passed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+ "failed");
		TakesScreenshot ts = (TakesScreenshot) Base_Class.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShot\\"+ methodName + ".png");
		try {
			Files.copy(src, dest);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName =result.getMethod().getMethodName();
		Reporter.log(methodName + "skipped");
	}

	
	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
