package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.AgregarServicioHogarProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AgregarServicioHogar extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("AddHomeServices");
	}
	
	@Test(priority= 0, dataProvider="AgregarServicioHogarProvider", dataProviderClass=AgregarServicioHogarProvider.class)		
	public void AgregarServicioHogarProvider(String t5XpathAgregarServicioHogar) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a agregar servicio");
		WaitToClikByXpath(t5XpathAgregarServicioHogar, 20);		  
		driver.findElement(By.xpath(t5XpathAgregarServicioHogar)).click();	
		driver.navigate().back();
	}
}
