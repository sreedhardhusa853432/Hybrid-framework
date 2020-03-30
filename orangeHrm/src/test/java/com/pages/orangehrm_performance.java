package com.pages;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class orangehrm_performance {
 
		WebDriver driver;
		Logger LOG = Logger.getLogger(orangehrm_performance.class.getName());
		By perform = By.xpath("//*[@id='menu__Performance']");
		By employee = By.xpath("//*[@id='menu_performance_viewEmployeePerformanceTrackerList']");
		
		public orangehrm_performance(WebDriver driver) 
		{
			this.driver =driver;
		}
		 
		//click performace
		public void performance() {
			driver.findElement(perform).click();
			driver.findElement(employee).click();
			LOG.info("EmployeeTracker is clicked");
		}
		
		
		
	}

