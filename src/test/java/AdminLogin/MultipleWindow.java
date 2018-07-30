package AdminLogin;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.hrm.objectrepositiry.*;
import com.hrm.business.Application;
import com.hrm.common.ActionEvents;
import com.hrm.drivermanager.DriverSetUP;

public class MultipleWindow extends Application {
	@Test(enabled=true)
	
	public void verifyHRMLink() throws InterruptedException {
		// Test 123
		loginAsAdmin();
		System.out.println("Logged into HRM");
		Thread.sleep(2000);
		click(AdminPage.organeHRM_link,"Orange HRM Link");
		
		/***********Code for Multiple Window Concept********/
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> win=windows.iterator();
		String pWin=win.next();
		String cWin=win.next();
		driver.switchTo().window(cWin);
		System.out.println(" Child Window URL : "+driver.getCurrentUrl());
		driver.switchTo().window(pWin);
		System.out.println("Parent Window URL :"+driver.getCurrentUrl());
		
		/* ******** Code for Frames Concept***************
		System.out.println(" iframes count : " +driver.findElements(By.tagName("iframe")).size());
		System.out.println(" frameset count : " +driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame(0);// Based on Frame sequence 
	    driver.switchTo().frame(arg0); // Based on attribute val
	    
		driver.switchTo().defaultContent(); // To get back to actual scope
*/		
	}
}

