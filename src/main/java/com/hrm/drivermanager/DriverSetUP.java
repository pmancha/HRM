package com.hrm.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import com.hrm.objectrepositiry.LoginPage;

public class DriverSetUP {
	public  WebDriver driver = null;

	@Parameters({"URL","Browser"})
	@BeforeTest
	public void BrowserLaunch(String URL, String Browser)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
		}
		/*else if(Browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.firefox.marionette","C://geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.setLegacy(true);
			driver = new FirefoxDriver();
			driver.get(URL);	
		}*/
			
	}
}
