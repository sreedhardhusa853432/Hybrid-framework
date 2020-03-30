

	package com.testcases;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.baseclass.Library;
	import com.pages.RedBusSearch;

	public class RedBusTestcase extends Library {
		
	@BeforeClass
		public void start() {
			launchApp("chrome","https://www.redbus.in/");
		}

		@Test
		public void searchbus() {
			
			RedBusSearch searchbus = new RedBusSearch(driver);
			searchbus.redbus_from("Hyderabad");
			searchbus.redbus_to("Chennai");
			searchbus.redbus_date();
			searchbus.redbus_searchbtn();
			
		}
		
		@AfterClass
		public void quit() {
			quit();
		}
	}


