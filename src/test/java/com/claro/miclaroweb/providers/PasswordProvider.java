package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class PasswordProvider extends Provider{
	@DataProvider(name = "PasswordFieldsProvider")
	public static Object[][] PasswordFieldsProvider() throws JAXBException{
		return new Object[][] {
			{
				
			}
		};
	}
}
