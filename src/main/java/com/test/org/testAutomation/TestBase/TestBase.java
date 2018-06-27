package com.test.org.testAutomation.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;	
	
	public void init(String myBrowser)
	{
		try{
			if (myBrowser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Kreddy\\COLT_HeadVersion\\testAutomation\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();				
			}else if (myBrowser.equalsIgnoreCase("firefox"))
			{
				// https://github.com/mozilla/geckodriver/releases				
				System.setProperty("webdriver.gecko.driver","C:\\Kreddy\\COLT_HeadVersion\\testAutomation\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://amsnov03:8230/#!/login#%2Flogin");
			
		}catch (Exception EX)
		{
			System.out.println("Exception in init. Exception - " + EX.toString() );
		}		
	}
	
	public void teaardown()
	{
		try{
			driver.close();
		}catch (Exception EX)
		{
			System.out.println("Exception in init. Exception - " + EX.toString() );
		}		
	}
	
}
