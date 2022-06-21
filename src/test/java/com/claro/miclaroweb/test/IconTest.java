package com.claro.miclaroweb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.configxml.Parameter;
import com.claro.miclaroweb.providers.IconTestProvider;
import com.relevantcodes.extentreports.LogStatus;

public class IconTest extends BaseClass {
	
	@BeforeClass
	public void init()
	{
		driver.get("https://miclaroni-uat-v3.tmx-internacional.com/login");
		OriginalWindows = driver.getWindowHandle();//Toma el valor de la pagina del login y lo guarda en una variable llamada original window
		test = report.startTest("Iconos");
	}
	 @Test(priority=0, dataProvider="IconTestProvider",dataProviderClass=IconTestProvider.class) public void IconTest(List<Parameter>icons) throws InterruptedException { test.log(LogStatus.INFO,
	  "Probar iconos"); int count=0; for(Parameter icono : icons) {
	  test.log(LogStatus.INFO, "Verificar que existe el enlace: " +
	  icono.getValue()); WaitToClikByXpath(icono.getValue(), 10);
	  driver.findElement(By.xpath(icono.getValue())).sendKeys(Keys.ENTER);
	  time.sleep(2);
	  test.log(LogStatus.INFO, "Verifica enlace: " + String.valueOf(count));
	  TakeScreenShot("Icon_"+ String.valueOf(count));
	  SwitchToOriginalWindows();  
	  count++; } 
	  }
		@Test(priority= 1, dataProvider="IconModalTestProvider2", dataProviderClass=IconTestProvider.class)		
		public void IconModalTest2(String t3XpathContratarServicio, String t3XpathCotizador,String t3XpathCasaMegas) throws InterruptedException
		{
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathContratarServicio)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathCotizador)).sendKeys(Keys.ENTER);
			time.sleep(3);
			TakeScreenShot("Login_13");
			
			SwitchToOriginalWindows();
			
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathContratarServicio)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathCasaMegas)).sendKeys(Keys.ENTER);
			time.sleep(3);
			TakeScreenShot("Login_14");
			SwitchToOriginalWindows();
		}
		@Test(priority= 2, dataProvider="IconModalTestProvider", dataProviderClass=IconTestProvider.class)
		public void IconModalTest(String XpathDescargaFactura, String XpathFormularioFactura) throws InterruptedException
		{
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(XpathDescargaFactura, 10);		  
			driver.findElement(By.xpath(XpathDescargaFactura)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(XpathDescargaFactura, 10);		  
			driver.findElement(By.xpath(XpathFormularioFactura)).sendKeys(Keys.ENTER);
			time.sleep(3);
			TakeScreenShot("Login_15");
			SwitchToOriginalWindows();
		}
}
