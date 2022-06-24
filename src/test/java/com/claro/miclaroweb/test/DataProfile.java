package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.DataProfileProvider;
import com.relevantcodes.extentreports.LogStatus;

public class DataProfile extends BaseClass{

	@BeforeClass
	public void init()
	{
		test = report.startTest("Profile");
	}
	@Test(priority= 0, dataProvider="ModifyTestProvider", dataProviderClass=DataProfileProvider.class)		
	public void ModifyTestProvider(String t5XpathAncla1,String t5XpathDatosPerfil,String t5XpathNombre,String t5XpathGuardar,String t5XpathCerrar,String Name) throws InterruptedException
	{
		time.sleep(7);
		test.log(LogStatus.INFO, "Verificar enlace a los datos");
		WaitToClikByXpath(t5XpathAncla1, 20);		  
		driver.findElement(By.xpath(t5XpathAncla1)).click();
		
		test.log(LogStatus.INFO, "Verificar el enlace a los datos de informacion");
		WaitToClikByXpath(t5XpathAncla1, 20);		  
		driver.findElement(By.xpath(t5XpathDatosPerfil)).click();
		
		test.log(LogStatus.INFO, "Verificar la existencia de el textfield para el nombre y borra lo ya ingresado");
		WaitToClikByXpath(t5XpathNombre, 20);		  
		driver.findElement(By.xpath(t5XpathNombre)).clear();
		
		test.log(LogStatus.INFO, "Verificar el llenado con el nombre ya guardado");
		WaitToClikByXpath(t5XpathNombre, 20);		  
		driver.findElement(By.xpath(t5XpathNombre)).sendKeys(Name);
		
		test.log(LogStatus.INFO, "Verificar enlace de guardado");
		WaitToClikByXpath(t5XpathGuardar, 20);		  
		driver.findElement(By.xpath(t5XpathGuardar)).click();
		TakeScreenShot("Login_2");
		
		test.log(LogStatus.INFO, "Verificar enlace de guardado");
		WaitToClikByXpath(t5XpathCerrar, 20);		  
		driver.findElement(By.xpath(t5XpathCerrar)).click();
	}
	
	  @Test(priority= 1, dataProvider="ExistTestProvider",dataProviderClass=DataProfileProvider.class) 
	  public void ExistTestProvider(String t5XpathTextDatosPerfil,String t5XpathTextNombres,String t5XpathNombre,String t5XpathTextCorreo,String t5XpathCorreo) throws InterruptedException {
	  
	  test.log(LogStatus.INFO,"Verificar la existencia de texto datos de perfil");
	  WaitToClikByXpath(t5XpathTextDatosPerfil,20);
	  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextDatosPerfil)).isDisplayed(), true);  
	  
	  test.log(LogStatus.INFO,"Verificar la existencia de texto nombre y apellidos");
	  WaitToClikByXpath(t5XpathTextNombres,20);
	  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextNombres)).isDisplayed(), true);
	  
	  test.log(LogStatus.INFO,"Verificar la existencia de textfield de nombre y apellido");
	  WaitToClikByXpath(t5XpathNombre,20);
	  Assert.assertEquals(driver.findElement(By.xpath(t5XpathNombre)).isDisplayed(), true);
	  
	  test.log(LogStatus.INFO, "Verifica texto de correo.");
	  WaitToClikByXpath(t5XpathTextCorreo,20);
	  Assert.assertEquals(driver.findElement(By.xpath(t5XpathTextCorreo)).isDisplayed(), true);
	  
	  test.log(LogStatus.INFO, "Verifica textfield de correo");
	  WaitToClikByXpath(t5XpathCorreo,20);
	  Assert.assertEquals(driver.findElement(By.xpath(t5XpathCorreo)).isDisplayed(), true); TakeScreenShot("Login_3"); 
	  }
}
