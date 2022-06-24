package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.RegisterProviders;
import com.relevantcodes.extentreports.LogStatus;

public class Register extends BaseClass {
	@BeforeClass
	public void init()
	{
		driver.get("https://miclaroni-uat-v3.tmx-internacional.com/login");
		OriginalWindows = driver.getWindowHandle();//Toma el valor de la pagina del login y lo guarda en una variable llamada original window
		test = report.startTest("Register");
	}
	@Test(priority = 0, dataProvider="RegisterTestProvider", dataProviderClass=RegisterProviders.class)
	public void RegisterTestProvider(String t7XpathButtonRegister,String t7XpathEmail,String t7XpathCheck,String t7XpathSubmit,String email) throws  InterruptedException{
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t7XpathButtonRegister,10);
		driver.findElement(By.xpath(t7XpathButtonRegister)).click();
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t7XpathEmail,10);
		driver.findElement(By.xpath(t7XpathEmail)).sendKeys(email);
		TakeScreenShot("Register_1");	
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t7XpathCheck,10);
		driver.findElement(By.xpath(t7XpathCheck)).click();
		time.sleep(3);
		
		test.log(LogStatus.INFO,"Verificar la existencia del modal" );
		WaitToClikByXpath(t7XpathSubmit,10);
		driver.findElement(By.xpath(t7XpathSubmit)).click();
		time.sleep(3);
	}
}
