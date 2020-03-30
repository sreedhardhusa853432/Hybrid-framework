

	package com.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class RedBusSearch {

		WebDriver driver;
		By busfrom = By.id("src");
		By busto = By.id("dest");
		By searchbtn = By.xpath("//*[@id='search_btn']");
		
		public RedBusSearch(WebDriver driver){
			this.driver= driver;
		}
		
		public void redbus_from(String src ) {
			driver.findElement(busfrom).sendKeys(src);
		}
		
		public void redbus_to(String dest) {
			driver.findElement(busto).sendKeys(dest);
		}
		
		public void redbus_date() {
			driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[5]")).click();
			
		}
		
		public void redbus_searchbtn() {
			driver.findElement(searchbtn).click();
		}
	}


