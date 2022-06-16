package com.claro.miclaroweb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.configxml.Parameter;
import com.claro.miclaroweb.providers.LoginProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends BaseClass{

	@BeforeClass
	public void init()
	{
		driver.get("https://miclaroni-uat-v3.tmx-internacional.com/login");
		OriginalWindows = driver.getWindowHandle();
		test = report.startTest("Login");
	}
	
	@Test(priority=0, dataProvider="IconTestProvider", dataProviderClass=LoginProvider.class, enabled = false)
	public void IconTest(List<Parameter> icons) throws InterruptedException
	{
		test.log(LogStatus.INFO, "Probar iconos");
		int count=0;
		for(Parameter icono : icons)
		{
			test.log(LogStatus.INFO, "Verificar que existe el enlace: " + icono.getValue());
			WaitToClikByXpath(icono.getValue(), 10);		  
			driver.findElement(By.xpath(icono.getValue())).sendKeys(Keys.ENTER);
			
			  test.log(LogStatus.INFO, "Verifica enlace: " + String.valueOf(count));
			  //TakeScreenShot("Icon_"+ String.valueOf(count));
			  time.sleep(2);
			  SwitchToOriginalWindows();
			
			
			count++;
		}
	}
	
	@Test(priority= 1, dataProvider="IconModalTestProvider", dataProviderClass=LoginProvider.class)
	public void IconModalTest(String XpathDescargaFactura, String XpathFormularioFactura) throws InterruptedException
	{
		test.log(LogStatus.INFO, "Verificar enlace con modal");
		WaitToClikByXpath(XpathDescargaFactura, 10);		  
		driver.findElement(By.xpath(XpathDescargaFactura)).sendKeys(Keys.ENTER);
		
		WaitToClikByXpath(XpathDescargaFactura, 10);		  
		driver.findElement(By.xpath(XpathFormularioFactura)).sendKeys(Keys.ENTER);
		
		time.sleep(4);
		
		
	}
}
