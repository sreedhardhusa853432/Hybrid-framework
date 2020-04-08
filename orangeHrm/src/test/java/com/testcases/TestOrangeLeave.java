package com.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.OrangeHrmLeave;
import com.pages.OrangeHrmLogin;
import com.seleniumutility.utility;


public class TestOrangeLeave extends Library{
	OrangeHrmLogin loginpage;
	
	@BeforeClass
	public void starting() throws IOException {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com");
	}
	
	@Test
	public void leavemenuclick() {
		OrangeHrmLogin logpage = new OrangeHrmLogin(driver);
		logpage.orangehrm_username("Admin");
		logpage.orangehrm_password("admin123");
		logpage.orangehrm_loginbtn();
	
		OrangeHrmLeave leavemenu = new OrangeHrmLeave(driver);
		leavemenu.leavemenu();
		
	}
	
	 @AfterClass
	  public void quit() throws IOException {
		utility util = new utility(driver);
		  util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\orangeHrm\\src\\test\\resources\\Screenshots\\Leave.png");
		  quit();
	  }

}
