
	package com.testcases;

	import java.io.IOException;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;


import com.baseclass.Wrapperclass;
import com.pages.OrangeHrmLogin;

import com.pages.orangehrm_performance;
import com.seleniumutility.utility;




	public class OrangehrmperfTestcase  extends Wrapperclass{
		
		@BeforeClass
		public void starting() throws IOException {
			launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		}

		@Test
		public void perfomclick() {
			//OrangehrmLogin performpage = new OrangehrmLogin(driver);
			
			OrangeHrmLogin logpage = new OrangeHrmLogin(driver);
			logpage.orangehrm_username("Admin");
			logpage.orangehrm_password("admin123");
			logpage.orangehrm_loginbtn();
		
			orangehrm_performance	performpage = new orangehrm_performance(driver);
			performpage.performance();
		}
		
		 @AfterClass
		  public void closeApp() throws IOException {
			 utility util = new utility(driver);
			  util.Takessnapshot("F:\\APPU\\eclipse\\orangehrmdemo\\src\\test\\resources\\Screenshot\\performencpage.png");
			  driver.quit();
		  }
	}

