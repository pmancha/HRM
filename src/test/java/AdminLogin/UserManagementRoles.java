package AdminLogin;

import java.util.List;

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

public class UserManagementRoles extends Application {
	@Test()
	public void rolesVerification() throws InterruptedException {
		loginAsAdmin();
		System.out.println("Looged into HRM");
		Thread.sleep(2000);
		click(AdminPage.admin_link, "Admin Link");
		mouseOver(AdminPage.user_mgmt, "User Management option");
		Thread.sleep(2000);
		click(AdminPage.user_roles, "userRoles");
		click(AdminPage.user_role_drp, "User roles feild");
		String expectedResult[] = { "Admin", "ESS", "Supervisor" };
		
		int size=getCount(AdminPage.drp_options,"Drop count");

		String actualResult[] = new String[size];
		for (int i = 2; i <= size; i++) {
			
			actualResult[i - 2] = driver.findElement(By.xpath(".//*[@id='userRoleType']/option[" + i + "]")).getText();
	
			System.out.println("These are actula values : " + actualResult[i - 2]);
		}

		for (int j = 0; j <= size - 2; j++) {
			Assert.assertEquals(expectedResult[j], actualResult[j]);
		}
		System.out.println("User Roles are verfied - Pass");
		
	}
}

