package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.OrangeHrmLogin;
import com.pages.OrangeLeaveApp;
import com.seleniumutility.utility;

public class OrangeLeaveAppTest extends Library {
			
			@BeforeClass
			public void start() throws IOException {
				launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			}
			
			@Test
			public void OrangeHrm() {
				OrangeHrmLogin logpage = new OrangeHrmLogin(driver);
				logpage.orangehrm_username("Admin");
				logpage.orangehrm_password("admin123");
				logpage.orangehrm_loginbtn();
			
				OrangeLeaveApp userreg = new OrangeLeaveApp(driver);
				userreg.leave();
				userreg.sreedhar();
				userreg.dropdown();
				userreg.virat();
			//	userreg.dropdown(03, 05, "1998");
				//userreg.leave_dropdown( 03, 05, "1998");
				userreg.drop();
			//	userreg.leave1_dropdown( 31, 03, "2020");
				userreg.username("virat");
				userreg.subunit("IT");
				userreg.search();
				
			}
			
			 @AfterClass
			  public void close() throws IOException {
				utility util=new utility(driver);
				util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\Screenshot\\AmazonLogin.png");
				
			  }
		}



