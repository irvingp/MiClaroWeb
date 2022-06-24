package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class RecargaProvider extends Provider{
	@DataProvider(name = "RecargaTestProvider")
	public static Object[][] RecargaTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAncla4").getValue(),
				GetParamLocatorsByName("t5XpathRecargas").getValue()
			}
		};	
	}
}
