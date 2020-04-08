package com.stepdefinition2;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Excelutility1.Excelopencart;
import com.baseclass.Library;
import com.pages.Opencartlogin;
import com.seleniumutility.Seleniumutil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitionlogin extends Library {
	final static Logger logger = LogManager.getLogger(Stepdefinitionlogin .class.getName());

	Opencartlogin login;
	Library baseclass;
	Excelopencart excel;
public void chromeBrowser() throws IOException {
 baseclass=new Library();
baseclass.launchApp();
System.out.println("chrome Browser is launched");
}

@Then("^clicks on Myaccount in homepage$")
public void Myaccount1() throws IOException {
	login=new Opencartlogin(driver);
	login.opencart_account();
	logger.info("clicking on Myaccount in the homepage ");
}

@Then("^clicks on login$")
public void opencart() throws IOException {
	login=new Opencartlogin(driver);
	login.opencart_login();
	logger.info("clicking on Login in the homepage ");
}


@When("^enter <username> and <password> in the field$")
public void enter_and_in_the_field() throws IOException {
	//login=new Opencartlogin(driver);
	login=new Opencartlogin(driver);
	excel=new Excelopencart(driver);
	login.opencart_username(excel.excel_username(0));
	login.opencart_password(excel.excel_password(0));
	
	logger.info("Entered email and password in tbe field ");
}
	
@Then("^click submit button$")
public void click_submit_button() throws IOException  {
	login=new Opencartlogin(driver);
	login.opencart_loginbtn();
	logger.info("Login Button is Clicked");
}

@Then("^takes a screenshot$")
	 public void takes_a_screenshot() throws IOException {
		 Seleniumutil util=new Seleniumutil(driver);
			util.Takessnapshot("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot.png");
			logger.info("takes a Screenshot");
			driver.quit();
}

	
	
}

