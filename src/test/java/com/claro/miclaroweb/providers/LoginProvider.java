package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class LoginProvider extends Provider{

	@DataProvider(name = "LoginTestProvider")
	public static Object[][] LoginTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathEmail").getValue(),
				GetParamLocatorsByName("t5XpathContrasena").getValue(),
				GetParamLocatorsByName("t5XpathLogin").getValue(),
				GetParamLocatorsByName("t5XpathCerrar").getValue(),
				GetParamDataByName("email").getValue(),
				GetParamDataByName("password").getValue()
			}
		};
	}
}
