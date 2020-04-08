
package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmLogin {
	
	Logger LOG = Logger.getLogger( OrangeHrmLogin .class.getName());
	protected WebDriver driver;
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By Loginbutton = By.xpath("//*[@id='btnLogin']");
	
	
	public OrangeHrmLogin (WebDriver driver) 
	{
		this.driver=driver;
	}

	//Enter username
	public void orangehrm_username(String userid) {
		driver.findElement(username).sendKeys(userid);
		LOG.info("Entered Name in the UserName field ");
	}
	
	//Entering the password
	public void orangehrm_password(String pass) {
		driver.findElement(password).sendKeys(pass);
		LOG.info("Entered password in tbe Password field");
	}
	
	//click the login button
	public void orangehrm_loginbtn() {
		driver.findElement(Loginbutton).click();
		LOG.info("Login Button is Clicked");
	}
	
	
}
