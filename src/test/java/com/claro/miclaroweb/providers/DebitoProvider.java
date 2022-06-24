package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class DebitoProvider extends Provider{
	@DataProvider(name = "DebitoTestProvider")
	public static Object[][] DebitoTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathDebito").getValue()
			}
		};
	}
}
