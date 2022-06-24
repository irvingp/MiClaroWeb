package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class FacturasProvider extends Provider {
	@DataProvider(name = "FacturaTestProvider")
	public static Object[][] FacturaTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAncla3").getValue(),
				GetParamLocatorsByName("t5XpathFacturas").getValue(),
				GetParamLocatorsByName("t5XpathTextFacturas").getValue(),
				GetParamLocatorsByName("t5XpathTextFiltros").getValue(),
				GetParamLocatorsByName("t5XpathTextFiltroFacturas").getValue(),
				GetParamLocatorsByName("t5XpathLimpiarFiltros").getValue()
			}
		};
	}
	
}
