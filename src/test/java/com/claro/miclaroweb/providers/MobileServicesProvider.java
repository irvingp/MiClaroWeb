package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class MobileServicesProvider extends Provider{
		@DataProvider(name = "ServicesTestProvider")
		public static Object[][] ServicesTestProvider() throws JAXBException{
			return new Object[][] {
				{
					GetParamLocatorsByName("t5XpathAncla2").getValue(),
					GetParamLocatorsByName("t5XpathServiciosMoviles").getValue()
				}
			};
		}
}
