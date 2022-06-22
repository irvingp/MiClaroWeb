package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.ForgotPasswordProvider;
import com.relevantcodes.extentreports.LogStatus;

public class ForgotPassword extends BaseClass {
	
	@BeforeClass
	public void init()
	{
		driver.get("https://miclaroni-uat-v3.tmx-internacional.com/login");
		OriginalWindows = driver.getWindowHandle();//Toma el valor de la pagina del login y lo guarda en una variable llamada original window
		test = report.startTest("Recuperar Contrasena");
	}
	@Test(priority = 1, dataProvider="ButtonTestProvider", dataProviderClass=ForgotPasswordProvider.class)
	public void ButtonTestProvider(String t4XpathOlvideContrasena,String t4XpathEmail,String t4XpathAceptar,String t7XpathTexto,String email,String GmailButton,String GmailCorreo) throws  InterruptedException{
		test.log(LogStatus.INFO,"Verificar la existencia del boton de olvide contrasena" );
		WaitToClikByXpath(t4XpathOlvideContrasena,10);
		driver.findElement(By.xpath(t4XpathOlvideContrasena)).click();
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t4XpathEmail,10);
		driver.findElement(By.xpath(t4XpathEmail)).sendKeys(email);
		TakeScreenShot("Login_16");	
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del boton de aceptar" );
		WaitToClikByXpath(t4XpathAceptar,10);
		driver.findElement(By.xpath(t4XpathAceptar)).click();
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del texto" );
		WaitToClikByXpath(t7XpathTexto,10);
		driver.findElement(By.xpath(t7XpathTexto)).click();
		time.sleep(3);
			
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.gmail.com/mail/help/intl/es/about.html?iframe");	
		
		test.log(LogStatus.INFO,"Verificar la redireccion a Gmail" );
		WaitToClikByXpath(GmailButton,10);
		driver.findElement(By.xpath(GmailButton)).click(); 
		time.sleep(3);
		  
		test.log(LogStatus.INFO,"Verificar el ingreso del correo" );
		WaitToClikByXpath(GmailCorreo,10);
		driver.findElement(By.xpath(GmailCorreo)).sendKeys(email,Keys.ENTER);
		SwitchToOriginalWindows();
		time.sleep(3);
	}
}
