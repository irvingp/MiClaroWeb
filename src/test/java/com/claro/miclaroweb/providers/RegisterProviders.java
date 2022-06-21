package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class RegisterProviders extends Provider {
	@DataProvider(name = "RegisterTestProvider")
	public static Object[][] RegisterTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t7XpathButtonRegister").getValue(),
				GetParamLocatorsByName("t7XpathEmail").getValue(),
				GetParamLocatorsByName("t7XpathCheck").getValue(),
				GetParamLocatorsByName("t7XpathSubmit").getValue(),
				GetParamDataByName("email").getValue()
				
			}
		};
	}
}
