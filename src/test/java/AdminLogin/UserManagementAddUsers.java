package AdminLogin;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import com.hrm.objectrepositiry.*;
import com.hrm.utils.GetTestData;
import com.hrm.business.Application;
import com.hrm.common.ActionEvents;
import com.hrm.drivermanager.DriverSetUP;

public class UserManagementAddUsers extends Application {
	@Test(dataProvider="get_Data",enabled=true,groups= {"Regression","UserModule"})
	public void addUsers(String empName,String userName,String essRole, String supervisorRole,
			String adminRole,String staus, String password,String confirmPassword) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		/********* Explicit Wait Object Creation***********/
		loginAsAdmin();
		WebDriverWait wait = new WebDriverWait(driver,60);
		System.out.println("Looged into HRM");
		click(AdminPage.admin_link, "Admin Link");
		click(AdminPage.user_mgmt, "User Management");
		click(AdminPage.users_link, "users link");
		/********* Explicit Wait Declaration***********/
		wait.until(ExpectedConditions.elementToBeClickable(AdminPage.checkboxval_to_clk_addlink));
		mouseOver(AdminPage.add_users_icon, "Add Link");
		wait.until(ExpectedConditions.elementToBeClickable(AdminPage.add_users_icon));
		click(AdminPage.add_users_icon, "Add Users");
		wait.until(ExpectedConditions.elementToBeClickable(AdminPage.employee_name_field));
		type(AdminPage.employee_name_field,empName);
		type(AdminPage.username_filed,userName);
		/*click(AdminPage.adminrole_field, "Admin Role Field");
		int size = getCount(AdminPage.adminrole_field_values, "Drop count");
		selectSpecDrpVal(AdminPage.adminrole_field_values, size,adminRole);*/
		type(AdminPage.password_field, password);
		type(AdminPage.confirm_password_field,confirmPassword);
		Thread.sleep(5000);
		click(AdminPage.save_btn, "Save Button");

		wait.until(ExpectedConditions.visibilityOfElementLocated(AdminPage.users_filter_icon));
		/*click(AdminPage.users_filter_icon,"Filter icon");
		type(AdminPage.users_filter_usrname,userName);
		click(AdminPage.users_filter_srch_btn,"Search button");
		String actualUsrName=driver.findElement(AdminPage.users_srch_rlt_usrname).getText();
		Assert.assertEquals(actualUsrName, userName);*/
	}
	
	@Test(groups="smoke")
	public void sampleTest()
	{
		System.out.println("This SMOKE Group Test Cases");
	}
	
	@DataProvider
	public Object[][] get_Data() throws IOException{
		return GetTestData.getData();
	}
}
