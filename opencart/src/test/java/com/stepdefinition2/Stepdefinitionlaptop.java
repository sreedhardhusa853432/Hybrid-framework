package com.stepdefinition2;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.OpencartLaptop;
import com.pages.Opencartlogin;
import com.seleniumutility.Seleniumutil;

import cucumber.api.java.en.Then;

public class Stepdefinitionlaptop extends Library {
	final static Logger logger = LogManager.getLogger(Stepdefinitionlaptop .class.getName());
		OpencartLaptop laptop;
		Library baseclass;

	public void chromeBrowser() throws IOException {
	 baseclass=new Library();
	baseclass.launchApp();
	System.out.println("chrome Browser is launched");
	}
	@Then("^clicks on laptops&Notebooks$")
	public void notebook() throws IOException {
	laptop =new  OpencartLaptop(driver);
	laptop.opencart_account();	
	logger.info("clicks on laptops&Notebooks");
}

@Then("^clicks on Addtocart$")
public void clicks_on_Addtocart() throws IOException  {
	laptop =new  OpencartLaptop(driver);
	laptop.opencart_login();
	logger.info("clicks on Addtocart");
	}

@Then("^takes a ScreenShot$")
public void takes_a_screenshot() throws IOException {
	 Seleniumutil util=new Seleniumutil(driver);
		util.Takessnapshot2("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot.png");
		logger.info("takes a Screenshot");
		driver.quit();
}



}