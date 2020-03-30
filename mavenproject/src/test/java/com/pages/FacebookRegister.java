

	package com.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.Select;

	public class FacebookRegister {
		
		WebDriver driver;
		By Firstname = By.id("u_0_m");
		By Lastname = By.id("u_0_o");
		By email = By.id("u_0_r");
		By password = By.id("u_0_w");
		By birthday = By.id("day");
		By birthmonth = By.id("month");
		By birthyear = By.id("year");
		By gender = By.id("u_0_7");
		By signup = By.xpath("//*[@id='u_0_13']");
		
		public FacebookRegister(WebDriver driver) {
			this.driver= driver;
		}
		 
		public void register_fusername(String userfirstname) {
			driver.findElement(Firstname).sendKeys(userfirstname);
		}
		
		public void register_lname(String lastname) {
			driver.findElement(Lastname).sendKeys(lastname);
			}
		public void register_email(String useremail) {
			driver.findElement(email).sendKeys(useremail);
		}
		public void register_pass(String userpassword) {
			driver.findElement(password).sendKeys(userpassword);
		}
		
		public void register_birthdaydropdown(int day, int month, String year) {
			Select bday = new Select(driver.findElement(birthday));
			bday.selectByIndex(day);
			Select bdaymonth = new Select(driver.findElement(birthmonth));
			bdaymonth.selectByIndex(month);
			Select bdayyear = new Select(driver.findElement(birthyear));
			bdayyear.selectByVisibleText(year);
		}

		public void register_gender() {
			driver.findElement(gender).click();
		}
		 public void register_signup() {
			 driver.findElement(signup).click();
		 }
	}
