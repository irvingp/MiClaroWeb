package com.claro.miclaroweb.providers;

import javax.xml.bind.JAXBException;

import org.testng.annotations.DataProvider;

import com.claro.qa.core.Provider;

public class IconTestProvider extends Provider {
 	
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
	
}
