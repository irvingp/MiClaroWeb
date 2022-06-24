package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.AtencionProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Atencion extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Atencion");
	}
	
	@Test(priority= 0, dataProvider="AtencionTestProvider", dataProviderClass=AtencionProvider.class)		
	public void AtencionTestProvider(String t5XpathAtencion ,String t5XpathBot,String t5XpathWa,String t5XpathContratacion,String t5XpathCerrarSesion) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace as");
		WaitToClikByXpath(t5XpathAtencion, 20);		  
		driver.findElement(By.xpath(t5XpathAtencion)).click();
		TakeScreenShot("Atencion_1");	
		
		test.log(LogStatus.INFO, "Verificar enlace as");
		WaitToClikByXpath(t5XpathBot, 20);		  
		driver.findElement(By.xpath(t5XpathBot)).click();
		SwitchToOriginalWindows(); 
		
		test.log(LogStatus.INFO, "Verificar enlace as");
		WaitToClikByXpath(t5XpathWa, 20);		  
		driver.findElement(By.xpath(t5XpathWa)).click();
		SwitchToOriginalWindows();
		
		test.log(LogStatus.INFO, "Verificar enlace as");
		WaitToClikByXpath(t5XpathContratacion, 20);		  
		driver.findElement(By.xpath(t5XpathContratacion)).click();
		SwitchToOriginalWindows(); 	
		
		test.log(LogStatus.INFO, "Verificar enlace as");
		WaitToClikByXpath(t5XpathCerrarSesion, 20);		  
		driver.findElement(By.xpath(t5XpathCerrarSesion)).click();
		time.sleep(5);
		
	}
}
