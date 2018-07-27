package com.hrm.objectrepositiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminPage {
	
	public static By admin_link=By.xpath(".//*[@id='menu_admin_viewAdminModule']/a");
	public static By user_mgmt=By.xpath(".//*[@id='menu_admin_UserManagement']/a");
	public static By user_roles=By.xpath(".//*[@id='menu_admin_viewUserRoles']");
	public static By user_role_drp=By.xpath(".//*[@id='userRoleType']");
	public static By drp_options=By.xpath(".//*[@id='userRoleType']/option");
	
	public static By users_link=By.xpath(".//*[@id='menu_admin_viewSystemUsers']");
	public static By add_users_icon=By.xpath(".//*[@id='systemUserDiv']/div[1]/a/i");
	public static By user_roles_field=By.id("systemUser_essRole");
	public static By supervisor_role=By.xpath(".//*[@id='systemUser_supervisorRole']");
	public static By adminrole_field=By.xpath(".//*[@id='adminrole_inputfileddiv']/div/input");
	public static By adminrole_field_values=By.xpath(".//*[@id='adminrole_inputfileddiv']/div/ul/li");
	
	
	public static By employee_name_field=By.xpath(".//*[@id='selectedEmployee_value']");
	public static By username_filed=By.xpath(".//*[@id='user_name']");
	public static By status_field=By.xpath(".//*[@id='systemUser_status']");
	public static By password_field=By.xpath(".//*[@id='password']");
	public static By confirm_password_field=By.xpath(".//*[@id='confirmpassword']");
	public static By save_btn=By.xpath(".//*[@id='systemUserSaveBtn']");
	
	public static By checkboxval_to_clk_addlink=By.xpath(".//*[@id='systemUserDiv']/crud-panel/div/div/list/table/tbody/tr[1]/td[1]/label");
	public static By users_filter_icon=By.xpath(".//*[@id='right-side']/header/div/nav/div/div/ul[2]/li/a/i");
	public static By users_filter_usrname=By.xpath(".//*[@id='systemuser_uname_filter']");
    public static By users_filter_srch_btn=By.xpath(".//*[@id='systemUser_list_search_modal']/div[2]/a[1]");
   public static By users_srch_rlt_usrname=By.xpath(".//*[@id='systemUserDiv']/crud-panel/div/div/list/table/tbody/tr/td[2]/ng-include/span");
   public static By organeHRM_link=By.linkText("OrangeHRM, Inc");
}
