package com.stepdefinition2;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.OpencartLaptop;
import com.pages.Opencartcontactus;
import com.seleniumutility.Seleniumutil;

import cucumber.api.java.en.Then;
	public class StepdefinitionContactus extends Library {
		final static Logger logger = LogManager.getLogger(Stepdefinitionlaptop .class.getName());
		Opencartcontactus contactus;
		Library baseclass;

	public void chromeBrowser() throws IOException {
	 baseclass=new Library();
	baseclass.launchApp();
	System.out.println("chrome Browser is launched");
	}
	
	@Then("^clicks on contact us$")
	public void clicks_on_contact_us() throws IOException {
	contactus=new Opencartcontactus(driver);
	contactus.opencartcont();
	logger.info("clicks on contact us");
}


@Then("^enters name on Your name field$")
public void enters_name_on_Your_name_field() throws IOException  {
	contactus=new Opencartcontactus(driver);
	contactus.opencartusername("sreedhar");
	logger.info("Enters name on Your name field");
}

@Then("^enters email address$")
public void enters_email_address() throws IOException  {
	contactus=new Opencartcontactus(driver);
	contactus.opencartmail("sreedhardhusa@gmail.com");
	logger.info("Enters email address");
}

@Then("^enters info related to enquiry$")
public void enters_info_related_to_enquiry() throws IOException {
	contactus=new Opencartcontactus(driver);
	contactus.opencartenq("The laptop which i have ordered recently has not been delivered yet");
	logger.info("Enters info related to enquiry");
}

@Then("^clicks on submit$")
public void clicks_on_submit() throws IOException  {
	contactus=new Opencartcontactus(driver);
	contactus.opencart_loginbtn();
	logger.info("clicks on submit");
}
@Then("^clicks on continue$")
public void clicksoncontinue() throws IOException {
	contactus=new Opencartcontactus(driver);
	contactus.opencart_continuebtn();
	logger.info("clicks on continue");

	}
@Then("^takes a screenShot$")
public void takes_a_screenshot() throws IOException {
	 Seleniumutil util=new Seleniumutil(driver);
		util.Takessnapshot3("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot.png");
		logger.info("takes a Screenshot");
		driver.quit();
}



}