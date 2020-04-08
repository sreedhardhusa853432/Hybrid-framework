package com.pages;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
public class Opencartlogin extends Library{
	
	Logger LOG = Logger.getLogger( Opencartlogin.class.getName());
	public WebDriver driver;
	@FindBy(linkText="My Account")
	WebElement Myaccount;
	@FindBy(linkText="Login")
	WebElement Login;
	@FindBy(xpath="//*[@id='input-email']")
	WebElement username;
	@FindBy(xpath="//*[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//*[@id='content']/div/div[2]/div/form/input")
	WebElement Loginbutton;
	
	
	public Opencartlogin (WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	//clicking Myaccount in the homepage
		public void opencart_account() {
			Myaccount.click();
			LOG.info("clicking on  Myaccount in the homepage ");
		}
		
		//clicking Login in the homepage
		public void opencart_login() {
			Login.click();
			LOG.info("clicking on Login in the homepage");
		}
	//Enter email address
	public void opencart_username(String userid) {
		username.sendKeys(userid);
		LOG.info("Entered email address in the email address field ");
	}
	
	//Entering the password
	public void opencart_password(String pass) {
		password.sendKeys(pass);
		LOG.info("Enterd password in tbe Password field");
	}

	//click the login button
	public void opencart_loginbtn() {
		Loginbutton.click();
		LOG.info("Login Button is Clicked");
	}
	
	
}

