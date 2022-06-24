package com.claro.miclaroweb.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.BotProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Bot extends BaseClass {
	@BeforeClass
	public void init()
	{
		driver.get("https://miclaroni-uat-v3.tmx-internacional.com/login");
		OriginalWindows = driver.getWindowHandle();//Toma el valor de la pagina del login y lo guarda en una variable llamada original window
		test = report.startTest("Bot");
	}
	@Test(priority = 1, dataProvider="ButtonBotTestProvider", dataProviderClass=BotProvider.class)		public void ButtonBotTestProvider(String t6XpathVentanaBot,String t6XpathBot,String t6XpathCerrarBot) throws  InterruptedException{
		test.log(LogStatus.INFO,"Verificar la existencia del boton de bot" );
		WaitToClikByXpath(t6XpathVentanaBot,10);
		driver.findElement(By.xpath(t6XpathVentanaBot)).click();
		TakeScreenShot("Bot_1");
		
		test.log(LogStatus.INFO,"Verificar la existencia del enlace al bot" );
		WaitToClikByXpath(t6XpathVentanaBot,10);
		driver.findElement(By.xpath(t6XpathBot)).click();
		SwitchToOriginalWindows();
		
		test.log(LogStatus.INFO,"Verificar la existencia del cierre de la ventana" );
		WaitToClikByXpath(t6XpathVentanaBot,10);
		driver.findElement(By.xpath(t6XpathCerrarBot)).click();		
	}
}
