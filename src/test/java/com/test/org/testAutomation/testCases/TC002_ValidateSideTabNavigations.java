package com.test.org.testAutomation.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.test.org.testAutomation.TestBase.TestBase;
import com.test.org.testAutomation.pageObjects.poCPHomePage;


public class TC002_ValidateSideTabNavigations extends TestBase  {
	
	poCPHomePage CPHomePage;
	
	@Test
	public void validateSideNavigations()
	{
		System.out.println("=========== Starting validateSideNavigations Test=============");
		CPHomePage = new poCPHomePage(driver);
		CPHomePage.NavigateToPortsPage();
		Assert.assertEquals(CPHomePage.ValidatePortsNavigations(), true);		
		CPHomePage.NavigateToConnectionsPage();
		Assert.assertEquals(CPHomePage.ValidateConnectionsNavigations(), true);		
		System.out.println("=========== Finished validateSideNavigations Test=============");		
	}
	
	@AfterTest
	public void afterClass()
	{
		teaardown();
	}

}
