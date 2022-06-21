package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class BotProvider extends Provider {
	@DataProvider(name = "ButtonBotTestProvider")
	public static Object[][] ButtonBotTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t6XpathVentanaBot").getValue(),
				GetParamLocatorsByName("t6XpathBot").getValue(),
				GetParamLocatorsByName("t6XpathCerrarBot").getValue()
			}
		};
	}
	
}
