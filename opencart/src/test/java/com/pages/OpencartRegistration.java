package com.pages;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
public class OpencartRegistration extends Library {
	
	Logger LOG = Logger.getLogger( OpencartRegistration .class.getName());
	public WebDriver driver;
	@FindBy(linkText="My Account")
	WebElement Myaccount;
	@FindBy(linkText="Register")
	WebElement Register;
	@FindBy(name="firstname")
	WebElement FirstName;
	@FindBy(name="lastname")
	WebElement LastName;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(xpath="//*[@id='input-telephone']")
	WebElement Telephone;
	@FindBy(xpath="//*[@id='input-password']")
	WebElement Password;
	@FindBy(xpath="//*[@id='input-confirm']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
	WebElement PrivacyPolicy;
	@FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
	WebElement Continue;
	
	public OpencartRegistration (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//clicking Myaccount in the homepage
	public void opencart_myaccount() {
		Myaccount.click();
		LOG.info("clicking on  Myaccount in the homepage ");
	}
	
	//clicking Register in the homepage
	public void opencart_Register() {
		Register.click();
		LOG.info("clicking on Register in the homepage");
	}

	//Entered First name in the details
	public void opencart_FirstName(String name) {
		FirstName.sendKeys(name);
		LOG.info("Entered First name in the details");
	}
	
	//Entered Last Name in the details
		public void opencart_LastName(String Name) {
			LastName.sendKeys(Name);
			LOG.info("Entered Last Name in the details");
		}
		
		//Entered Emailid in the details
				public void opencart_Email(String mailid) {
					Email.sendKeys(mailid);
					LOG.info("Entered Emailid in the details");
				}	
				//Entered Telephone in the details
				public void opencart_Telephone(String mobileno) {
					Telephone.sendKeys(mobileno);
					LOG.info("Entered Telephone in the details");
				}
				
				//Entered Password in the details
				public void opencart_Password(String pass) {
					Password.sendKeys(pass);
					LOG.info("Entered Password in the details");
				}
				
				//Entered ConfirmPassword in the details
				public void opencart_ConfirmPassword(String cpass) {
					ConfirmPassword.sendKeys(cpass);
					LOG.info("Entered ConfirmPassword in the details");
				}
				
				//clicked PrivacyPolicy in the details
				public void PrivacyPolicy() {
					PrivacyPolicy.click();
					LOG.info("clicking on PrivacyPolicy in the details");
				}
				//clicked Continue in the details
				public void Continue() {
					Continue.click();
					LOG.info("clicking on Continue in the details");
				}
				
				
				
}

