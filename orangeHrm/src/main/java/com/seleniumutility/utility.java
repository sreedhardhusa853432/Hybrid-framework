package com.seleniumutility;
	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebDriverException;
		import org.openqa.selenium.chrome.ChromeDriver;

	public class utility {
		 WebDriver driver;
			public  utility(WebDriver driver) 
			{
				this.driver =driver;
		}
		 	public void Takessnapshot(String path1) throws IOException{
		 		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 		try {
		 		 // now copy the  screenshot to desired location using copyFile //method
		 		FileUtils.copyFile(src, new File("C:\\Users\\durga\\git\\hybrid-framework\\orangeHrm\\src\\test\\resources\\Screenshots.png"));
		 		}
		 		 
		 		catch (IOException e)
		 		 {
		 		  System.out.println(e.getMessage());
		 		 
		 		 }
		 		 }
		 	}
		



