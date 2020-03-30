package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLeave {

	WebDriver driver;
	Logger LOG = Logger.getLogger(OrangeHrmLeave.class.getName());
	By leave = By.xpath("//*[@id='menu_leave_viewLeaveModule']");
	By reports = By.xpath("//*[@id='menu_leave_Reports']");
	By LEUR = By.xpath("//*[@id='menu_leave_viewLeaveBalanceReport']");
	
	public OrangeHrmLeave(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	//click performance
		public void leavemenu() {
			
			driver.findElement(leave).click();
			driver.findElement(reports).click();
			driver.findElement(LEUR).click();
			LOG.info("Leave Entitlements and Usage Report is clicked");
		}
	
}
