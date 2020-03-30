

package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.AmazonSearch;
import com.seleniumutility.utility;

public class SearchTestcase extends Library {
		
		@BeforeClass
		public void startUp() throws IOException {
			launchApplication();
			
		}

		@Test
		public void search() {
			
		AmazonSearch lpage = new  AmazonSearch(driver);
		lpage.search("oneplus");
		lpage.submit();
		}
		
		 @AfterClass
		  public void quit() throws IOException {
			 utility util=new utility(driver);
				util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\Screenshot\\AmazonSearch.png");
				quit();
				
		  }
	}





