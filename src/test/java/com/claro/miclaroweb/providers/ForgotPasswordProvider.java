package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class ForgotPasswordProvider extends Provider {

	@DataProvider(name = "ButtonTestProvider")
	public static Object[][] ButtonTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t4XpathOlvideContrasena").getValue(),
				GetParamLocatorsByName("t4XpathEmail").getValue(),
				GetParamLocatorsByName("t4XpathAceptar").getValue(),
				GetParamDataByName("email").getValue()
				
			}
		};
	}
}
