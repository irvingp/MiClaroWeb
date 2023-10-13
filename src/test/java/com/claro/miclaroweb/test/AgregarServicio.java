package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.AgregarServicioProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AgregarServicio extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("AddServices");
	}
	
	@Test(priority= 0, dataProvider="AgregarServicioProvider", dataProviderClass=AgregarServicioProvider.class)		
	public void AgregarServicioProvider(String t5XpathAgregarServicio) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a agregar servicio");
		
		WaitToClikByXpath(t5XpathAgregarServicio, 20);		  
		driver.findElement(By.xpath(t5XpathAgregarServicio)).click();
		
		driver.navigate().back();
	}
}
