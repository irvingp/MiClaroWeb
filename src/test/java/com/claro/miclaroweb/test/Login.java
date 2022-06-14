package com.claro.miclaroweb.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
		test = report.startTest("Login");
	}
	
	@Test(priority=0, dataProvider="IconTestProvider", dataProviderClass=LoginProvider.class)
	public void IconTest(List<Parameter> icons) throws InterruptedException
	{
		test.log(LogStatus.INFO, "Probar iconos");
		for(Parameter icono : icons)
		{
			test.log(LogStatus.INFO, "Verificar que existe el enlace: " + icono.getValue());
			WaitToClikByXpath(icono.getValue(), 10);
			
			WebElement element = driver.findElement(By.xpath(icono.getValue()));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			
			Assert.assertEquals(driver.getTitle(), "MI PAGO CLARO");
			/*
			 * if(driver.findElement(By.xpath(icono.getValue())).isDisplayed()) {
			 * click(By.xpath(icono.getValue())); }else { test.log(LogStatus.FAIL,
			 * "No se encontró el enlace"); }
			 */
			
		}
	}
}
