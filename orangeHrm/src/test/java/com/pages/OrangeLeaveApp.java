package com.pages;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeLeaveApp {
		
			Logger LOG=Logger.getLogger(OrangeHrmLogin.class.getName());
	WebDriver driver;
				By leave = By.xpath("//*[@id='menu_leave_viewLeaveModule']");
				By call=By.id("calFromDate");
				By from = By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[3]/a");
				By date=By.id("calToDate");
				By to = By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[6]/td[2]/a");
				/*By leaveday = By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[3]/td[4]/a");
				By leavemonth = By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[1]");
				By leaveyear = By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[2]");
				By to = By.id("calToDate");
				By leaveday1 = By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[6]/td[2]/a");
				By leavemonth1 = By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[1]");
				By leaveyear1 = By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[2]");*/
				By name = By.xpath("//*[@id=\'leaveList_txtEmployee_empName\']");
				By it = By.xpath("//*[@id=\'leaveList_cmbSubunit\']");
				By search = By.xpath("//*[@id=\'btnSearch\']");
				
				public  OrangeLeaveApp(WebDriver driver) 
				{
					this.driver =driver;
				}

				
				public void leave() {
					driver.findElement(leave).click();
				}
				public void sreedhar() {
					driver.findElement(call).click();
				}
				
				public void dropdown() {
					driver.findElement(from).click();
				/*	Select bday = new Select(driver.findElement(leaveday));
					bday.selectByIndex(day);
					Select bdaymonth = new Select(driver.findElement(leavemonth));
					bdaymonth.selectByIndex(month);
					Select bdayyear = new Select(driver.findElement(leaveyear));
					bdayyear.selectByVisibleText(year);
					
					*/
				}
				
				public void virat(){
					driver.findElement(date).click();
				}
				
				
				public void drop() {
					driver.findElement(to).click();
				/*	Select bday = new Select(driver.findElement(leaveday));
					bday.selectByIndex(day);
					Select bdaymonth = new Select(driver.findElement(leavemonth));
					bdaymonth.selectByIndex(month);
					Select bdayyear = new Select(driver.findElement(leaveyear));
					bdayyear.selectByVisibleText(year);*/
				}
				
			
		
				public void username(String user) {
					driver.findElement(name).sendKeys(user);
				}
				
				public void subunit(String name) {
					Select bday = new Select(driver.findElement(it));
					bday.selectByVisibleText(name);
				}
					public void search() {
						driver.findElement(search).click();
					}
	
	
	
	
	
	
	
	
	
}

