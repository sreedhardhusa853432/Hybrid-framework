
	package com.pages;
	import java.io.IOException;
	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
	public class Opencartcontactus extends Library{
		
		Logger LOG = Logger.getLogger( Opencartlogin .class.getName());
		public WebDriver driver;
		@FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[1]/a")
		WebElement contactus;
		@FindBy(xpath="//*[@id='input-name']")
		WebElement YourName;
		@FindBy(xpath="//*[@id='input-email']")
		WebElement Email;
		@FindBy(id="input-enquiry")
		WebElement Enquiry;
		@FindBy(xpath="//*[@id='content']/form/div/div/input")
		WebElement Loginbutton;
		@FindBy(xpath="//*[@id='content']/div/div/a")
		WebElement Continue;
	
		
		public Opencartcontactus (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//clicking on Contactus in the homepage
			public void opencartcont() {
			contactus.click();
				LOG.info("clicking on Contactus in the homepage ");
			}
			
			//enters Name in the your name field
			public void opencartusername(String user) {
			YourName.sendKeys(user);
				LOG.info(" enters Name in the your name field");
			}
		//Entered email address in the email address field
		public void opencartmail(String userid) {
			Email.sendKeys(userid);
			LOG.info("Entered email address in the email address field ");
		}
		
		//Enters info related to enquiry in the field
		public void opencartenq(String pass) {
			Enquiry.sendKeys(pass);
			LOG.info("Enters info related to enquiry in the field");
		}

		//click the login button
		public void opencart_loginbtn() {
			Loginbutton.click();
			LOG.info("Login Button is Clicked");
		}
	
		
		//click the continue button
				public void opencart_continuebtn() {
					Continue.click();
					LOG.info("Continue Button is Clicked");
				}
		
		
		
	}
