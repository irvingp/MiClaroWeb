package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class PayProvider extends Provider{
	@DataProvider(name = "PayTestProvider")
	public static Object[][] PayTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathPagarFactura").getValue(),
				GetParamLocatorsByName("t5XpathSelect").getValue(),
				GetParamLocatorsByName("t5XpathPagar").getValue()
			}
		};	
	}
}
