
	package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class Library {
		Logger LOG = Logger.getLogger( Library .class.getName());
	 public WebDriver driver;
	FileInputStream inputStream; 
	 Properties prop;
	 	public void launchApplication() throws IOException {
	 		
	 	    inputStream = new FileInputStream(new File("C:\\Users\\durga\\eclipse-workspace\\HybridFramework\\src\\test\\resources\\configurationproperty\\config.property"));
	 	    prop = new Properties();
				prop.load(inputStream );
				LOG.info("property file is loaded ");
			String browser=prop.getProperty("browser");
	 		String path=prop.getProperty("url");
	 			if(browser.equalsIgnoreCase("firefox")) {
	 				driver = new FirefoxDriver();
	 			}
	 			else if (browser.equalsIgnoreCase("chrome")) {
	 				System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
	 		 		driver = new ChromeDriver();
	 		 		LOG.info("ChromeDriver is launched ");
	 		driver.manage().window().maximize();
	 		//driver.get(prop.getProperty("browser"));
	 		//driver.manage().deleteAllCookies();
	 		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		driver.get(prop.getProperty("url"));
	 		LOG.info("url is loaded ");
	 		
	 	}
	
	 	}
	 	public void quit() throws IOException {
	 		driver.quit();
	 	}
	
	 	}
	
	
	
