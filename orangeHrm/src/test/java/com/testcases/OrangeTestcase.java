package com.testcases;
	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.baseclass.Wrapperclass;
import com.pages.OrangeHrmLogin;
import com.seleniumutility.utility;

public class OrangeTestcase extends Wrapperclass {
		
		@BeforeClass
		public void startUp() throws IOException {
			launchApplication("chrome","https://opensource-demo.orangehrmlive.com");
		}


		@Test
		public void login() {
			OrangeHrmLogin lpage = new  OrangeHrmLogin(driver);
		lpage.orangehrm_username("Admin");
		lpage.orangehrm_password("admin123");
		lpage.orangehrm_loginbtn();
		
		}
		
	 @AfterClass
		  public void close() throws IOException {
			utility util=new utility(driver);
			util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\Screenshot\\OrangeLogin.png");
			driver.quit();
		  }
	}
