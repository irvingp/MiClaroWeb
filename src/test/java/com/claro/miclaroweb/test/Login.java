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
		OriginalWindows = driver.getWindowHandle();//Toma el valor de la pagina del login y lo guarda en una variable llamada original window
		test = report.startTest("Login");
	}
	@Test(priority = 0, dataProvider="LoginTestProvider", dataProviderClass=LoginProvider.class)
	public void LoginTestProvider(String t5XpathEmail,String t5XpathContraseña,String t5XpathLogin,String t5XpathCerrar,String email,String password) throws  InterruptedException{
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t5XpathEmail,10);
		driver.findElement(By.xpath(t5XpathEmail)).sendKeys(email);
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t5XpathContraseña,10);
		driver.findElement(By.xpath(t5XpathContraseña)).sendKeys(password);
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t5XpathLogin,10);
		driver.findElement(By.xpath(t5XpathLogin)).sendKeys(Keys.ENTER);
		time.sleep(3);
		TakeScreenShot("Login_1");
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t5XpathLogin,10);
		driver.findElement(By.xpath(t5XpathCerrar)).sendKeys(Keys.ENTER);
		time.sleep(3);
	}
	  @Test(priority = 1, dataProvider="ButtonBotTestProvider", dataProviderClass=LoginProvider.class)		public void ButtonBotTestProvider(String t6XpathVentanaBot,String t6XpathBot,String t6XpathCerrarBot) throws  InterruptedException{
			test.log(LogStatus.INFO,"Verificar la existencia del boton de bot" );
			WaitToClikByXpath(t6XpathVentanaBot,10);
			driver.findElement(By.xpath(t6XpathVentanaBot)).click();
			time.sleep(3);
			
			test.log(LogStatus.INFO,"Verificar la existencia del enlace al bot" );
			WaitToClikByXpath(t6XpathVentanaBot,10);
			driver.findElement(By.xpath(t6XpathBot)).click();
			time.sleep(3);			SwitchToOriginalWindows();
			TakeScreenShot("Login_2");
			
			test.log(LogStatus.INFO,"Verificar la existencia del cierre de la ventana" );
			WaitToClikByXpath(t6XpathVentanaBot,10);
			driver.findElement(By.xpath(t6XpathCerrarBot)).click();
			time.sleep(3);			
		}
	  @Test(priority= 3, dataProvider="IconModalTestProvider2", dataProviderClass=LoginProvider.class)		
		public void IconModalTest2(String t3XpathContratarServicio, String t3XpathCotizador,String t3XpathCasaMegas) throws InterruptedException
		{
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathContratarServicio)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathCotizador)).sendKeys(Keys.ENTER);
			TakeScreenShot("Login_12");
			time.sleep(3);
			
			SwitchToOriginalWindows();
			
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathContratarServicio)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			WaitToClikByXpath(t3XpathContratarServicio, 10);		  
			driver.findElement(By.xpath(t3XpathCasaMegas)).sendKeys(Keys.ENTER);
			TakeScreenShot("Login_13");
			time.sleep(3);
			SwitchToOriginalWindows();
		}
		@Test(priority= 4, dataProvider="IconModalTestProvider", dataProviderClass=LoginProvider.class)
		public void IconModalTest(String XpathDescargaFactura, String XpathFormularioFactura) throws InterruptedException
		{
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(XpathDescargaFactura, 10);		  
			driver.findElement(By.xpath(XpathDescargaFactura)).sendKeys(Keys.ENTER);
			time.sleep(3);
			
			test.log(LogStatus.INFO, "Verificar enlace con modal");
			WaitToClikByXpath(XpathDescargaFactura, 10);		  
			driver.findElement(By.xpath(XpathFormularioFactura)).sendKeys(Keys.ENTER);
			TakeScreenShot("Login_14");
			time.sleep(3);
			SwitchToOriginalWindows();
		}
}
