package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.FacturasProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Facturas extends BaseClass{
	public void init()
	{
		test = report.startTest("facturas");
	}
	@Test(priority= 0, dataProvider="FacturaTestProvider", dataProviderClass=FacturasProvider.class)		
	
	public void FacturaTestProvider(String t5XpathAncla3,String t5XpathFacturas,String t5XpathTextFacturas,String t5XpathTextFiltros,String t5XpathTextFiltroFacturas,String t5XpathLimpiarFiltros) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a los Servicios");
		WaitToClikByXpath(t5XpathAncla3, 20);		  
		driver.findElement(By.xpath(t5XpathAncla3)).click();
		
		test.log(LogStatus.INFO, "Verificar el enlace a los servicios de factura");
		WaitToClikByXpath(t5XpathAncla3, 20);		  
		driver.findElement(By.xpath(t5XpathFacturas)).click();
		
		test.log(LogStatus.INFO,"Verificar la existencia de texto Mis Facturas");
		WaitToClikByXpath(t5XpathTextFacturas,20);
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextFacturas)).isDisplayed(), true);
		
		test.log(LogStatus.INFO,"Verificar la existencia de texto de filtros");
		WaitToClikByXpath(t5XpathTextFiltros,20);
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextFiltros)).isDisplayed(), true);
		
		test.log(LogStatus.INFO,"Verificar la existencia de texto Filtro de facturas");
		WaitToClikByXpath(t5XpathTextFiltroFacturas,20);
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextFiltroFacturas)).isDisplayed(), true);
		
		test.log(LogStatus.INFO,"Verificar la existencia de el boton de limpiar filtros");
		WaitToClikByXpath(t5XpathLimpiarFiltros,20);
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathLimpiarFiltros)).isDisplayed(), true);		  
		  
	}
}
