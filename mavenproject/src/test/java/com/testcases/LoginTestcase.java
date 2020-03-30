
package com.testcases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.FacebookLogin;
public class LoginTestcase extends Library {
		
		@BeforeClass
		public void startUp() {
			launchApp("chrome","http://facebook.com");
			
		}

		@Test
		public void login() {
			
		FacebookLogin lpage = new FacebookLogin(driver);
		lpage.loginToApp_username("8328386774");
		lpage.loginToApp_password("Justin3670");
		lpage.loginToApp_loginbtn();
		
		}
		
		 @AfterClass
		  public void quit() {
			  quit();
		  }
	}



