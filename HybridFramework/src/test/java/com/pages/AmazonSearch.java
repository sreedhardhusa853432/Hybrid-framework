package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearch {
	Logger LOG=Logger.getLogger(AmazonSearch.class.getName());
	WebDriver driver;
	By search = By.id("twotabsearchtextbox");
	By submit = By.xpath("//*[@id=\'nav-search\']/form/div[2]/div/input");
	public  AmazonSearch(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	
	
	public void search(String userid) 
	{
		driver.findElement(search).sendKeys(userid);
		LOG.info("entered text in the search field");
	}
	public void submit() {
		driver.findElement(submit).click();
		LOG.info("clicked search button");
	}


	
	
	
}
