package com.testrunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	        features = "src/test/resources/Openfeatures/opentestcase.feature",
	        		 glue = {"com.stepdefinition2"},
	        plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
	        		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
	   tags = {"@tc_01_Registration, @tc_02_login,"
	               + "   @tc_03_Laptop,  @tc_04_contactus,"},
	        monochrome = true
	       
	) 
	//Running with cucumber class

		public class TestRunner
		{
		    @AfterClass
		     public static void  extendReport() 
		    {
		        Reporter.loadXMLConfig("C:\\Users\\durga\\eclipse-workspace\\opencart\\ExtentReport.xml");
		        Reporter.setSystemInfo("user", System.getProperty("user.name"));
		        Reporter.setSystemInfo("os", "Windows");
		        Reporter.setTestRunnerOutput("Sample test runner output message");
		    }
		}
	
