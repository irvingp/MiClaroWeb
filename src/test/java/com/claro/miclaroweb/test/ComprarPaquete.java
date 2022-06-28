package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.ComprarPaqueteProvider;
import com.relevantcodes.extentreports.LogStatus;

public class ComprarPaquete extends BaseClass{
	public void init()
	{
		test = report.startTest("Paquetes");
	}
	@Test(priority= 0, dataProvider="PaqueteTestProvider", dataProviderClass=ComprarPaqueteProvider.class)		
	
	public void PaqueteTestProvider(String t5XpathComprarPaquete ,String t5XpathComprar) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a comprar paquete");
		WaitToClikByXpath(t5XpathComprarPaquete, 20);		  
		driver.findElement(By.xpath(t5XpathComprarPaquete)).click();
		TakeScreenShot("Paquete_1");	
		
		test.log(LogStatus.INFO, "Verificar enlace a seleecion de paquete");
		WaitToClikByXpath(t5XpathComprar, 20);		  
		driver.findElement(By.xpath(t5XpathComprar)).click();
		TakeScreenShot("Paquete_2");	
	}
}
