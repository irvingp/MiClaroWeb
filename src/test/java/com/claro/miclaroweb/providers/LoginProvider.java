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
	@DataProvider(name = "IconModalTestProvider")
	public static Object[][] IconModalTestProvider() throws JAXBException
	{
		return new Object[][]
				{
					{
						GetParamLocatorsByName("t2XpathDescargarFactura").getValue(),
						GetParamLocatorsByName("t2XpathFormularioFactura").getValue()
						
					}
				};
	}
}
