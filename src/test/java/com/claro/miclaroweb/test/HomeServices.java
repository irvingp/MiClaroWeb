package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.HomeServicesProvider;
import com.relevantcodes.extentreports.LogStatus;

public class HomeServices extends BaseClass {

	public void init()
	{
		test = report.startTest("Profile");
	}
	@Test(priority= 0, dataProvider="HomeServicesTestProvider", dataProviderClass=HomeServicesProvider.class)		
	public void HomeServicesTestProvider(String t5XpathClaroHogar) throws InterruptedException
	{
		time.sleep(6);
		test.log(LogStatus.INFO, "Verificar enlace a los Servicios");
		WaitToClikByXpath(t5XpathClaroHogar, 20);		  
		driver.findElement(By.xpath(t5XpathClaroHogar)).click();
		TakeScreenShot("Home_1");	
	}
}
