
package com.testcases;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.AmazonLogin;
import com.seleniumutility.utility;
public class LoginTestcase extends Library {
		
		@BeforeClass
		public void startUp() throws IOException{
			launchApplication();
		}

		@Test
		public void login() {
			
		AmazonLogin lpage = new AmazonLogin(driver);
		lpage.loginToApp_username("9441952086");
		lpage.loginToApp_continue();
		lpage.loginToApp_password("Justin3670");
		lpage.loginToApp_loginbtn();
		
		}
		
	 @AfterClass
		  public void close() throws IOException {
			utility util=new utility(driver);
			util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\Screenshot\\AmazonLogin.png");
			quit();
			
		  }
	}
	



