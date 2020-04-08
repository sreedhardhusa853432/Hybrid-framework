package com.pages;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Library;
	public class OpencartLaptop extends Library {
		
		Logger LOG = Logger.getLogger( Opencartlogin .class.getName());
		public WebDriver driver;
		
	//	WebElement Laptop = By.xpath("//*[@id=\'menu\']/div[2]/ul/li[2]/a");
		//WebElement showallLaptop = By.xpath("//*[@id=\'menu\']/div[2]/ul/li[2]/div/a");
		@FindBy(xpath="//*[@id='menu']/div[2]/ul/li[2]/a")
		WebElement Laptops;
		@FindBy(xpath="//*[@id='menu']/div[2]/ul/li[2]/div/a")
		WebElement showallLaptop;
		@FindBy(xpath="//*[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[1]/span")
		WebElement Addtocart;
		public  OpencartLaptop (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		//clicking Laptop in the homepage
			public void opencart_account() {
				Actions action = new Actions(driver);
				if(Laptops.isDisplayed()) {
				action.moveToElement(Laptops).click().build().perform();
				if(showallLaptop.isDisplayed()) {
					action.moveToElement(showallLaptop).click().build().perform();
					LOG.info("clicking ShowAllLaptop in the homepage");
				LOG.info("clicking on Laptop in the Loginpage ");
			}
			}
			}
			//clicking Addtocart in the Loginpage
			public void opencart_login() {
			Addtocart.click();
				LOG.info("clicking on Addtocart in the Loginpage");
			}
		
	}


