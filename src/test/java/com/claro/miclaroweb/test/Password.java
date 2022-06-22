package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.PasswordProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Password extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Pass");
	}
	@Test(priority= 0, dataProvider="PasswordFieldsProvider", dataProviderClass=PasswordProvider.class)		
	public void PasswordFieldsProvider(String t5XpathPassword,String t5XpathTextChangePassword,String t5XpathFieldPass,String t5XpathTextActualPass,String t5XpathTextNewPass,String t5XpathFieldNewPass,String t5XpathTextConfirmPass,String t5XpathConfirm ) throws InterruptedException{
		  test.log(LogStatus.INFO,"Verificar el enlace a cambio de contraseña");
		  WaitToClikByXpath(t5XpathPassword,20);
		  driver.findElement(By.xpath(t5XpathPassword)).click();  
		  
		  test.log(LogStatus.INFO,"Verificar la existencia de texto cambiar contraseña");
		  WaitToClikByXpath(t5XpathTextChangePassword,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextChangePassword)).isDisplayed(), true);
		  
		  test.log(LogStatus.INFO,"Verificar la existencia de textfield de cambiar contraseña");
		  WaitToClikByXpath(t5XpathFieldPass,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathFieldPass)).isDisplayed(), true);
		  
		  test.log(LogStatus.INFO, "Verificar la existencia de texto actual contraseña");
		  WaitToClikByXpath(t5XpathTextActualPass,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextActualPass)).isDisplayed(), true);
		  
		  test.log(LogStatus.INFO, "Verificar la existencia de texto nueva contraseña");
		  WaitToClikByXpath(t5XpathTextNewPass,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextNewPass)).isDisplayed(), true); 
		  
		  test.log(LogStatus.INFO, "Verificar la existencia de textfield nueva contraseña");
		  WaitToClikByXpath(t5XpathFieldNewPass,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathFieldNewPass)).isDisplayed(), true); 
		  
		  test.log(LogStatus.INFO, "Verificar la existencia de texto confirmar contraseña");
		  WaitToClikByXpath(t5XpathTextConfirmPass,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextConfirmPass)).isDisplayed(), true); 
		  
		  test.log(LogStatus.INFO, "Verificar la existencia de textfield confirmar contraseña");
		  WaitToClikByXpath(t5XpathConfirm,20);
		  Assert.assertEquals(driver.findElement(By.xpath(t5XpathConfirm)).isDisplayed(), true);
		  TakeScreenShot("Login_3"); 
		  }
	}

