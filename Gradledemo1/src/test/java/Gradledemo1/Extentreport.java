package Gradledemo1;

import java.io.File;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Extentreport{
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void startReport() {
		extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/myOwnreport.html",true);
extent.addSystemInfo("HostName","sreedhar").addSystemInfo("Environment","produuction environment").addSystemInfo("User Name","sreedhar");
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent.config"));
	}
	@Test
	public void demoReportpass() {
		test=extent.startTest("demoReportpass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"Assert pass as condition is true");
	}
	@Test
	public void demoReportfail() {
		test=extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL,"Assert fail as condition is false");
	}
	@AfterMethod
	public void getResult(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(LogStatus.FAIL,result.getThrowable());
		
	}
		extent.endTest(test);
	}
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}
	}
