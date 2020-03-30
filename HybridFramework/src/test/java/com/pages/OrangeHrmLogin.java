package com.pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OrangeHrmLogin {
	
		Logger LOG=Logger.getLogger(OrangeHrmLogin.class.getName());
			WebDriver driver;
			By username = By.id("txtUsername");
			By password = By.id("txtPassword");
			By loginbutton = By.xpath("//*[@id=\'btnLogin\']");
			public  OrangeHrmLogin(WebDriver driver) 
			{
				this.driver =driver;
			}
			public void loginToApp_username(String userid) 
			{
				driver.findElement(username).sendKeys(userid);
				LOG.info("entered name in the username field");
			}
			
			public void loginToApp_password(String pass) 
			{
				driver.findElement(password).sendKeys(pass);
				LOG.info("entered password in the username field");
				
			}
			public void loginToApp_loginbtn() { 
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginbutton)));
				driver.findElement(loginbutton).click();
				LOG.info("clicked loginbutton");
			}
		}

