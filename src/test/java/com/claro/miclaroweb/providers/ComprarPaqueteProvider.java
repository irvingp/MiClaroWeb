package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class ComprarPaqueteProvider extends Provider{
	@DataProvider(name = "PaqueteTestProvider")
	public static Object[][] PaqueteTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathComprarPaquete").getValue(),
				GetParamLocatorsByName("t5XpathComprar").getValue()
			}
		};
	}
}
