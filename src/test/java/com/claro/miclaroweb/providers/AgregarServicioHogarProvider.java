package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class AgregarServicioHogarProvider extends Provider{
	@DataProvider(name = "AgregarServicioHogarProvider")
	public static Object[][] AgregarServicioHogarProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAgregarServicioHogar").getValue()
			}
		};
	}
}
