package com.claro.qa.core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumMain {

	public static ExtentReports report;
	public static ExtentTest test;
	public static TimeUnit time;
	public static String SuiteName;
	public static ChromeDriver driver;
	public static String OriginalWindows;

	@SuppressWarnings("deprecation")
	public ChromeDriver GetWebInstance(ChromeOptions options) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		time = TimeUnit.SECONDS;
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void WaitToClikByXpath(String targetResourceXpath, long timeLimitInSeconds) {
		try {

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(targetResourceXpath)));

		} catch (Exception ex) {
			System.out.println("Message is: " + ex.getMessage());
			System.out.println("Cause is: " + ex.getCause());
			System.out.println(ex.getStackTrace());
		}
	}

	public void WaitToClikByCssSelector(String targetResourceXpath, long timeLimitInSeconds) {
		try {

			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(targetResourceXpath)));

		} catch (Exception ex) {
			System.out.println("Message is: " + ex.getMessage());
			System.out.println("Cause is: " + ex.getCause());
			System.out.println(ex.getStackTrace());
		}
	}

	public void TakeScreenShot( String FileName) {

		for(String window : driver.getWindowHandles())
		{
			if(!window.contentEquals(OriginalWindows))
			{
				driver.switchTo().window(window);
			}
		}
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("ScreenShot/" + SuiteName + "_" + FileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO,
				"Captura de Pantalla: " + test.addScreenCapture("ScreenShot/" + SuiteName + "_" + FileName + ".png"));
	}

	public void ScrollTo(By by) {
		WebElement iframe = driver.findElement(by);
		new Actions(driver).moveToElement(iframe).perform();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void SwitchToOriginalWindows() {
		

		for (String windowHandle : driver.getWindowHandles()) {
			if (!OriginalWindows.contentEquals(windowHandle)) {
				
				driver.switchTo().window(windowHandle);
				driver.close();
				driver.switchTo().window(OriginalWindows);
				break;
			
			} 
		}

	}

}
