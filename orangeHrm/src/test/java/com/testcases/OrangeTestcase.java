package com.testcases;
	

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

import com.ExcelUtility.OrangeHrmExcel;
import com.baseclass.Library;
import com.pages.OrangeHrmLogin;
import com.seleniumutility.utility;

public class OrangeTestcase extends Library {
		
		@BeforeClass
		public void startUp() throws IOException {
			launchApplication("chrome","https://opensource-demo.orangehrmlive.com");
		}


		@Test
		public void login() {
			OrangeHrmLogin lpage = new  OrangeHrmLogin(driver);
			///OrangeHrmExcel data=new OrangeHrmExcel();
		lpage.orangehrm_username("Admin");
		lpage.orangehrm_password("admin123");
		lpage.orangehrm_loginbtn();
	//	lpage.orangehrm_username("data.excel_username");
		//lpage.orangehrm_password("data.excel_password");
		lpage.orangehrm_loginbtn();
	
		
		}
		
	 @AfterClass
		  public void close() throws IOException {
			utility util=new utility(driver);
			util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\Screenshot\\OrangeLogin.png");
			driver.close();
		  }
	}
