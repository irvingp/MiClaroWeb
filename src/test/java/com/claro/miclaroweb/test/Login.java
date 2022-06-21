package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
}
