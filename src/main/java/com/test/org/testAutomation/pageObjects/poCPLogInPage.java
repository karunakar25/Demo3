package com.test.org.testAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.org.testAutomation.TestBase.TestBase;

public class poCPLogInPage extends TestBase {
	
	WebDriver driver;
	
	@FindBy (id="username") WebElement eUserName;
	@FindBy (id="password") WebElement ePassword;
	@FindBy (id="login-btn") WebElement eLogin;
	
		
	public poCPLogInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void CustomerPortalLogin (String UserName, String Password)
	{
		eUserName.sendKeys(UserName);
		ePassword.sendKeys(Password);
		eLogin.click();		
	}
	
}
