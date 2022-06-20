package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class LoginProvider extends Provider{


	
	  @DataProvider(name = "IconTestProvider") 
	  public static Object[][] IconTestProvider() throws JAXBException { 
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
	@DataProvider(name = "IconModalTestProvider2")
	public static Object[][] IconModalTestProvider2() throws JAXBException
	{
		return new Object[][]
				{
					{
						GetParamLocatorsByName("t3XpathContratarServicio").getValue(),
						GetParamLocatorsByName("t3XpathCotizador").getValue(),
						GetParamLocatorsByName("t3XpathCasaMegas").getValue()
						
					}
				};
	}
	@DataProvider(name = "LoginTestProvider")
	public static Object[][] LoginTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t5XpathEmail").getValue(),
				GetParamLocatorsByName("t5XpathContraseña").getValue(),
				GetParamLocatorsByName("t5XpathLogin").getValue(),
				GetParamLocatorsByName("t5XpathCerrar").getValue(),
				GetParamDataByName("email").getValue(),
				GetParamDataByName("password").getValue()
			}
		};
	}
	@DataProvider(name = "ButtonBotTestProvider")
	public static Object[][] ButtonBotTestProvider() throws JAXBException{
		return new Object[][] {
			{
				GetParamLocatorsByName("t6XpathVentanaBot").getValue(),
				GetParamLocatorsByName("t6XpathBot").getValue(),
				GetParamLocatorsByName("t6XpathCerrarBot").getValue()
			}
		};
	}
}
