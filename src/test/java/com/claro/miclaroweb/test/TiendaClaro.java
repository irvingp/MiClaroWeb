package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import com.claro.miclaroweb.providers.PayProvider;
import com.claro.miclaroweb.providers.TiendaClaroProvider;
import com.relevantcodes.extentreports.LogStatus;

public class TiendaClaro extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Tienda");
	}
	@Test(priority= 0, dataProvider="TiendaTestProvider", dataProviderClass=TiendaClaroProvider.class)	
	public void TiendaTestProvider(String t5XpathAncla5 ,String t5XpathTienda,String t5XpathSelect2,String t5XpathBuscar,String t5XpathMapa) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a las tiendas");
		WaitToClikByXpath(t5XpathAncla5, 20);		  
		driver.findElement(By.xpath(t5XpathAncla5)).click();
		
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a tiendas");
		WaitToClikByXpath(t5XpathTienda, 20);		  
		driver.findElement(By.xpath(t5XpathTienda)).click();
		TakeScreenShot("Tienda_1");	
		
		test.log(LogStatus.INFO, "Verificar existencia del select");
		WaitToClikByXpath(t5XpathSelect2, 20);		  
		Select Pais = new Select(driver.findElement(By.xpath(t5XpathSelect2)));
		Pais.selectByVisibleText("Leon");
		
		test.log(LogStatus.INFO, "Verificar clickeo de boton");
		WaitToClikByXpath(t5XpathBuscar, 20);		  
		driver.findElement(By.xpath(t5XpathBuscar)).click();
		
		test.log(LogStatus.INFO, "Verificar clickeo de mapa");
		WaitToClikByXpath(t5XpathBuscar, 20);		  
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathBuscar)).isDisplayed(), true);
		TakeScreenShot("Tienda_2");
		
	}
}