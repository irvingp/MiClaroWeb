package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class PasswordProvider extends Provider{
	@DataProvider(name = "PasswordFieldsProvider")
	public static Object[][] PasswordFieldsProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathPassword").getValue(),
				GetParamLocatorsByName("t5XpathTextChangePassword").getValue(),
				GetParamLocatorsByName("t5XpathFieldPass").getValue(),
				GetParamLocatorsByName("t5XpathTextActualPass").getValue(),
				GetParamLocatorsByName("t5XpathTextNewPass").getValue(),
				GetParamLocatorsByName("t5XpathFieldNewPass").getValue(),
				GetParamLocatorsByName("t5XpathTextConfirmPass").getValue(),
				GetParamLocatorsByName("t5XpathConfirm").getValue()
			}
		};
	}
}
