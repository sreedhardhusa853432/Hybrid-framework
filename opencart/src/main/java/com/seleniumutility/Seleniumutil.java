package com.seleniumutility;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Library;
		public class Seleniumutil extends Library{
			 WebDriver driver;
			 WebDriverWait wait;
			 @FindBy(xpath="//*[@id=\\'content\\']/div/div[2]/div/form/input")
				WebElement Loginbutton;
			 @FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
				WebElement Continue;
			 @FindBy(xpath="//*[@id='menu']/div[2]/ul/li[2]/a")
				WebElement Laptops;
			 @FindBy(xpath="/html/body/footer/div/div/div[2]/ul/li[1]/a")
				WebElement contactus;
			 

				public  Seleniumutil(WebDriver driver) 
				{
					this.driver =driver;
			}
				
				//to get the title
				public void gettitle() {
					System.out.println("title of the page"+driver.getTitle());
				}
				//explicit wait
				public void Explicitwaiting() {
					WebDriverWait wait=new WebDriverWait(driver,20);
					wait.until(ExpectedConditions.elementToBeClickable(Loginbutton));
				}
				
			 	public void Takessnapshot(String path) throws IOException{
			 		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 		try {
			 		 // now copy the  screenshot to desired location using copyFile //method
			 		FileUtils.copyFile(source1, new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot\\opencartlogin.png"));
		
			 		}
			 		 
			 		catch (IOException e)
			 		 {
			 		  System.out.println(e.getMessage());
			 		 
			 		 }
			 	}
			 		//explicit wait
					public void Explicitwait() {
						WebDriverWait wait=new WebDriverWait(driver,20);
						wait.until(ExpectedConditions.elementToBeClickable(Continue));
					}
					
				 	public void Takessnapshot1(String path1) throws IOException{
				 		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 		try {
				 		 // now copy the  screenshot to desired location using copyFile //method
				 		FileUtils.copyFile(source1, new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot\\opencartregistration.png"));
			
				 		}
				 		 
				 		catch (IOException e)
				 		 {
				 		  System.out.println(e.getMessage());
				 		 
				 		 }
				 	}	
				 		public void Explicitlywait() {
							WebDriverWait wait=new WebDriverWait(driver,20);
							wait.until(ExpectedConditions.elementToBeClickable(Laptops));
						}
						
					 	public void Takessnapshot2(String path1) throws IOException{
					 		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					 		try {
					 		 // now copy the  screenshot to desired location using copyFile //method
					 		FileUtils.copyFile(source1, new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot\\opencartlaptop.png"));
				
					 		}
					 		 
					 		catch (IOException e)
					 		 {
					 		  System.out.println(e.getMessage());
					 		 
					 		 }
					 	}
					 		public void Explicitlwait() {
								WebDriverWait wait=new WebDriverWait(driver,20);
								wait.until(ExpectedConditions.elementToBeClickable(contactus));
							}
							
						 	public void Takessnapshot3(String path1) throws IOException{
						 		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						 		try {
						 		 // now copy the  screenshot to desired location using copyFile //method
						 		FileUtils.copyFile(source1, new File("C:\\Users\\durga\\eclipse-workspace\\opencart\\src\\test\\resources\\Screenshot\\opencartcontactus.png"));
					
						 		}
						 		 
						 		catch (IOException e)
						 		 {
						 		  System.out.println(e.getMessage());
						 		 
						 		 }
				 		
			 	}
								}
				
			 	
			


