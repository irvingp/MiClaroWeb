package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.MobileServicesProvider;
import com.relevantcodes.extentreports.LogStatus;

public class MobileServices extends BaseClass {
	@BeforeClass
	public void init()
	{
		test = report.startTest("Services");
	}
	@Test(priority= 0, dataProvider="ServicesTestProvider", dataProviderClass=MobileServicesProvider.class)		
	public void ServicesTestProvider(String t5XpathAncla2,String t5XpathServiciosMoviles) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a los Servicios");
		WaitToClikByXpath(t5XpathAncla2, 20);		  
		driver.findElement(By.xpath(t5XpathAncla2)).click();
		
		test.log(LogStatus.INFO, "Verificar el enlace a los datos de servicios moviles");
		WaitToClikByXpath(t5XpathAncla2, 20);		  
		driver.findElement(By.xpath(t5XpathServiciosMoviles)).click();
		time.sleep(5);
	}
}
