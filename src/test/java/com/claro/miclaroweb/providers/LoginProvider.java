package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class LoginProvider extends Provider{


	@DataProvider(name = "IconTestProvider")
	public static Object[][] IconTestProvider() throws JAXBException
	{
		return new Object[][]
				{
					{
						GetListLocatorsByParam("t1")
						
					}
				};
	}
}
