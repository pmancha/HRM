package com.hrm.business;

import com.hrm.common.ActionEvents;
import com.hrm.objectrepositiry.LoginPage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class Application extends ActionEvents{

	public void loginAsAdmin() throws InterruptedException
	{
		/*type(LoginPage.username, "admin");
		Thread.sleep(5000);
		type(LoginPage.password, "admin");
		Thread.sleep(5000);*/
		click(LoginPage.login_btn, "Login button");
	}
	
	@AfterMethod
	public void takeSH(ITestResult result) throws IOException {
	if (ITestResult.FAILURE==result.getStatus())
	{
		TakesScreenshot takeSH = (TakesScreenshot)driver;
		File src = takeSH.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("E:\\"+result.getName()+"_1.png"));	
	}
	
	}
}
	
