package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.RecargaProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Recargas extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Recarga");
	}
	@Test(priority= 0, dataProvider="RecargaTestProvider", dataProviderClass=RecargaProvider.class)	
	public void RecargaTestProvider(String t5XpathAncla4 ,String t5XpathRecargas) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a las recargas");
		WaitToClikByXpath(t5XpathAncla4, 20);		  
		driver.findElement(By.xpath(t5XpathAncla4)).click();
		
		test.log(LogStatus.INFO, "Verificar enlace a hacer una recarga");
		WaitToClikByXpath(t5XpathRecargas, 20);		  
		driver.findElement(By.xpath(t5XpathRecargas)).click();
		TakeScreenShot("Recarga_1");	
	}
}
