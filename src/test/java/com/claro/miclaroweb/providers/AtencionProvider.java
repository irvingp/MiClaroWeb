package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class AtencionProvider extends Provider {
	@DataProvider(name = "AtencionTestProvider")
	public static Object[][] AtencionTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAtencion").getValue(),
				GetParamLocatorsByName("t5XpathBot").getValue(),
				GetParamLocatorsByName("t5XpathWa").getValue(),
				GetParamLocatorsByName("t5XpathContratacion").getValue(),
				GetParamLocatorsByName("t5XpathCerrarSesion").getValue()
			}
		};	
	}
}
