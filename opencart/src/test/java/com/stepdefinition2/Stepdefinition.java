package com.stepdefinition2;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.OpencartRegistration;
import com.pages.Opencartlogin;
import com.seleniumutility.Seleniumutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
	public class Stepdefinition extends Library{
	final static Logger logger = LogManager.getLogger( Stepdefinition .class.getName());
		OpencartRegistration register;
		Opencartlogin login;
		Library baseclass;
	@Given("^I launch Chrome Browser$")
public void chromeBrowser() throws IOException {
	 baseclass=new Library();
	baseclass.launchApp();
System.out.println("chrome Browser is launched");
}

	@When("^clicks on Myaccount$")
	public void Myaccount() throws IOException {
		register=new OpencartRegistration(driver);
		register.opencart_myaccount();
		logger.info("clicking on Myaccount in the homepage ");
	}
	
    @Then("^clicks on Register$")
    public void clicks_on_Register() throws IOException {
    	register=new OpencartRegistration(driver);
		register.opencart_Register();
		logger.info("clicking on Register in the homepage");
    }
	

@Then("^enters First Name in details$")
public void enters_First_Name_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_FirstName("sreedhar");
	logger.info("clicking on Register in the homepage");
}
	
@Then("^enters Last Name in details$")
public void enters_Last_Name_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_LastName("Dhusa");
	logger.info("clicking on Last Name in the homepage");
}

@Then("^enters Email in details$")
public void enters_Email_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_Email("sreedhardhusa@gmail.com");
	logger.info("Entered Emailid in the details");
}

@Then("^enters Telephone in details$")
public void enters_Telephone_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_Telephone("8328386774");
	logger.info("Entered Telephone in the details");
}

@Then("^enters Password in details$")
public void enters_Password_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_Password("Justin3670");
	logger.info("Entered Password in the details");
}

@Then("^enters confirm Password in details$")
public void enters_confirm_Password_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.opencart_ConfirmPassword("Justin3670");
	logger.info("Entered ConfirmPassword in the details");
}
	

@Then("^clicks on privacy policy in details$")
public void clicks_on_privacy_policy_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.PrivacyPolicy();
	logger.info("clicking on PrivacyPolicy in the details");
}

@Then("^clicks on submit in details$")
public void clicks_on_submit_in_details() throws IOException {
	register=new OpencartRegistration(driver);
	register.Continue();
	logger.info("clicking on Continue in the details");
}
@Then("^takes a Screenshot$")
public void takes_a_screenshot() throws IOException {
	 Seleniumutil util=new Seleniumutil(driver);
		util.Takessnapshot1("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot.png");
		logger.info("takes a Screenshot");
		driver.quit();
}
}