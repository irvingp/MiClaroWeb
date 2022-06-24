package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.ComprarPaqueteProvider;
import com.relevantcodes.extentreports.LogStatus;

public class ComprarPaquete extends BaseClass{
	public void init()
	{
		test = report.startTest("Paquetes");
	}
	@Test(priority= 0, dataProvider="PaqueteTestProvider", dataProviderClass=ComprarPaqueteProvider.class)		
	
	public void PaqueteTestProvider(String t5XpathComprarPaquete ,String t5XpathComprar,String t5XpathNombre,String t5XpathRUC,String t5XpathDireccion,String t5XpathEmail,String Name,String RUC,String Direccion,String email) throws InterruptedException
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
		
		test.log(LogStatus.INFO, "Envia datos de el nombre");
		WaitToClikByXpath(t5XpathNombre, 20);		  
		driver.findElement(By.xpath(t5XpathNombre)).sendKeys(Name);
		
		test.log(LogStatus.INFO, "Envia datos de el RUC");
		WaitToClikByXpath(t5XpathRUC, 20);		  
		driver.findElement(By.xpath(t5XpathRUC)).sendKeys(RUC);

		test.log(LogStatus.INFO, "Envia datos de la direccion");
		WaitToClikByXpath(t5XpathDireccion, 20);		  
		driver.findElement(By.xpath(t5XpathDireccion)).sendKeys(Direccion);

		test.log(LogStatus.INFO, "Envia datos de el email");
		WaitToClikByXpath(t5XpathEmail, 20);		  
		driver.findElement(By.xpath(t5XpathEmail)).sendKeys(email);
		TakeScreenShot("Paquete_3");	
	}
}
