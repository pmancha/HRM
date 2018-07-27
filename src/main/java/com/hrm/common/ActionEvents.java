package com.hrm.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.drivermanager.DriverSetUP;

public class ActionEvents extends DriverSetUP
{
	
	public void type(By element, String input)
	{
		driver.findElement(element).sendKeys(input);
	}
	
	public void click(By element, String locatorName)
	{
		driver.findElement(element).click();
	}
	
	public void mouseOver(By user_mgmt, String locatorName) throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement webelement = driver.findElement(user_mgmt);
		Actions action = new Actions(driver);
		action.moveToElement(webelement);
		action.build().perform();
	}
	
	public void selectSpecDrpVal(By element, int size , String input) throws InterruptedException
	{
		for (int i = 2; i <size; i++) {
			if(driver.findElements(element).get(i).getText().contains(input))
			{
				driver.findElements(element).get(i).click();
			}
			
		}
	}
	public int getCount(By element, String locatorName)
	{
		int count=driver.findElements(element).size();
		return count;
	}
	
}
