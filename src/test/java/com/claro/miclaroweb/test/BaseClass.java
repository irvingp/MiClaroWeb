package com.claro.miclaroweb.test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.claro.qa.core.ExtentManager;
import com.claro.qa.core.SeleniumMain;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass extends SeleniumMain {

	@BeforeSuite
	public void BeforeSuite(ITestContext context)
	{
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = GetWebInstance(options);
		driver.manage().window().maximize();
		SuiteName=context.getSuite().getName();
		report = ExtentManager.getReporter(SuiteName+"ExtendsReport-MiClaroWeb.html");
	}
	
	@AfterMethod
    protected void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, result.getThrowable().getMessage());
	    } else if (result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable().getMessage());
	    } else {
	    	test.log(LogStatus.PASS, "Test passed");
	    		}
    
		report.endTest(test);        
		report.flush();
    }
	
	@AfterSuite
	public void TearDown()
	{
		report.close();
		driver.quit();
	}
		
	
	
}
