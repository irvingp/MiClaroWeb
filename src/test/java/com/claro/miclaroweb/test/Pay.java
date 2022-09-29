package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.PayProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Pay extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Pay");
	}
	
	@Test(priority= 0, dataProvider="PayTestProvider", dataProviderClass=PayProvider.class)		
	public void PayTestProvider(String t5XpathPagarFactura,String t5XpathTextoPrueba,String t5XpathSelect,String t5XpathPagar) throws InterruptedException
	{
		time.sleep(5);
		test.log(LogStatus.INFO, "Verificar enlace a pago de factura");
		WaitToClikByXpath(t5XpathPagarFactura, 20);		  
		driver.findElement(By.xpath(t5XpathPagarFactura)).click();
		
		test.log(LogStatus.INFO, "Verificar existencia de texto");
		SwitchToOriginalWindows(); 
		Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextoPrueba)).isDisplayed(), true);
		
		
		test.log(LogStatus.INFO, "Verificar existencia de boton de pago");		  
		driver.findElement(By.xpath(t5XpathSelect)).click();
		
		test.log(LogStatus.INFO, "Verificar click en pago de factura");
		WaitToClikByXpath(t5XpathPagar, 20);		  
		driver.findElement(By.xpath(t5XpathPagar)).click();
		TakeScreenShot("Pay_1");	
	}

}
