
	package com.testcases;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;


	import com.baseclass.Library;
	import com.pages.FacebookRegister;

	public class FbRegisterTestcase extends Library {
		
		@BeforeClass
		public void start() {
			launchApp("chrome","https://www.facebook.com");
		}
		
		@Test
		public void register() {
			FacebookRegister userreg = new FacebookRegister(driver);
			userreg.register_fusername("sreedhar");
			userreg.register_lname("Dhusa");
			userreg.register_email("sreedhardhusa@gmail.com");
			userreg.register_pass("123456789");
			userreg.register_birthdaydropdown( 03, 05, "1998");
			userreg.register_gender();
			userreg.register_signup();
		}
		
	@AfterClass
		public void close() {
			quit();
		}

	}


