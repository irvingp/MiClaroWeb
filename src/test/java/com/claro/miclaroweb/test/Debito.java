package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.DebitoProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Debito extends BaseClass{
	public void init()
	{
		test = report.startTest("Debito");
	}
	@Test(priority= 0, dataProvider="DebitoTestProvider", dataProviderClass=DebitoProvider.class)		
	
	public void DebitoTestProvider(String t5XpathDebito) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar el enlace a los servicios de factura");
		WaitToClikByXpath(t5XpathDebito, 20);		  
		driver.findElement(By.xpath(t5XpathDebito)).click();
	}
}
