package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapperclass {
protected WebDriver driver;
public void launchApplication(String browser,String url) 
{
	try
	{
		//to launch the browser
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
	}
	//to launch chrome
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
}
catch(WebDriverException e) {
	System.out.println("browser could not be launched");
}
}
}
