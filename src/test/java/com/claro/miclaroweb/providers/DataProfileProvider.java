package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class DataProfileProvider extends Provider{
	@DataProvider(name = "ModifyTestProvider")
	public static Object[][] ModifyTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathAncla1").getValue(),
				GetParamLocatorsByName("t5XpathDatosPerfil").getValue(),
				GetParamLocatorsByName("t5XpathNombre").getValue(),
				GetParamLocatorsByName("t5XpathGuardar").getValue(),
				GetParamLocatorsByName("t5XpathCerrar").getValue(),
				GetParamDataByName("Name").getValue()
			}
		};
	}
	@DataProvider(name = "ExistTestProvider")
	public static Object[][] ExistTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathTextDatosPerfil").getValue(),
				GetParamLocatorsByName("t5XpathTextNombres").getValue(),
				GetParamLocatorsByName("t5XpathNombre").getValue(),
				GetParamLocatorsByName("t5XpathTextCorreo").getValue(),
				GetParamLocatorsByName("t5XpathCorreo").getValue()
			}
		};
	}
}
