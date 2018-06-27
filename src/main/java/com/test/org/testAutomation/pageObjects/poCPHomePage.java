package com.test.org.testAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.org.testAutomation.TestBase.TestBase;

public class poCPHomePage extends TestBase{

	WebDriver driver;
		
	@FindBy(xpath="//ul[@class='nav nav-sidebar']/li[a[@ng-href='#!/ports']]") WebElement Portal_Ports;
	@FindBy(xpath="//ul[@class='nav nav-sidebar']/li[a[@ng-href='#!/connections']]") WebElement Portal_Connections;
		
	public poCPHomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToPortsPage()
	{		
		Portal_Ports.click();	
	}
	
	public void NavigateToConnectionsPage()
	{		
		Portal_Connections.click();	
	}
	
	
	public boolean ValidatePortsNavigations()
	{
		try {			
			Portal_Ports.isDisplayed();
			return true;
		} catch (Exception e) {
		   return false;
		}
	}
		
	public boolean ValidateConnectionsNavigations()
	{
		try {			
			Portal_Connections.isDisplayed();
			return true;
		} catch (Exception e) {
		   return false;
		}
	}
}
