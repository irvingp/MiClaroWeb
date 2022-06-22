package com.claro.miclaroweb.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.claro.miclaroweb.providers.DataProfileProvider;

public class Password extends BaseClass{
	@BeforeClass
	public void init()
	{
		test = report.startTest("Pass");
	}
	@Test(priority= 0, dataProvider="PasswordFieldsProvider", dataProviderClass=DataProfileProvider.class)		
	public void PasswordFieldsProvider() throws InterruptedException{
		
	}
}
