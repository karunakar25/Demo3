package com.test.org.testAutomation.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.org.testAutomation.TestBase.TestBase;
import com.test.org.testAutomation.pageObjects.poCPLogInPage;

public class TC001_CustomerPortalLogin extends TestBase {

	poCPLogInPage poH;
	
	@BeforeTest
	@Parameters("myBrowser")
	public void beforeClass(String myBrowser)
	{
		init(myBrowser);
	}
	
	@Test
	public void CustomerPortalLogin()
	{
		 poH = new poCPLogInPage(driver);
		 poH.CustomerPortalLogin("Automationeugbp", "0000");		
	}	
	
	
}
