package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class TiendaClaroProvider extends Provider{
	@DataProvider(name = "TiendaTestProvider")
	public static Object[][] TiendaTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAncla5").getValue(),
				GetParamLocatorsByName("t5XpathTienda").getValue(),
				GetParamLocatorsByName("t5XpathSelect2").getValue(),
				GetParamLocatorsByName("t5XpathBuscar").getValue(),
				GetParamLocatorsByName("t5XpathMapa").getValue()
			}
		};	
	}
}
