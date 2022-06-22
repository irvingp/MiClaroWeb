package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class HomeServicesProvider extends Provider{
	@DataProvider(name = "HomeServicesTestProvider")
	public static Object[][] HomeServicesTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathClaroHogar").getValue()
			}
		};
	}
}
