package com.hrm.objectrepositiry;

import org.openqa.selenium.By;

public class LoginPage {
	public static By username=By.xpath(".//*[@id='txtUsername']");
	public static By password=By.xpath(".//*[@id='txtPassword']");
	public static By login_btn=By.xpath(".//*[@id='btnLogin']");
}
