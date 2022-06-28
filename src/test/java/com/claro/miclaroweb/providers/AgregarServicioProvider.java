package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class AgregarServicioProvider extends Provider{
	@DataProvider(name = "AgregarServicioProvider")
	public static Object[][] AgregarServicioProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAgregarServicio").getValue()
			}
		};
	}
}
