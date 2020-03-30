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
	 	     TakesScreenshot ts = (TakesScreenshot)driver;
	            File Source = ts.getScreenshotAs(OutputType.FILE);
	       
					FileUtils.copyFile(Source, new File(System.getProperty("user.dir")+"/Users/durga/eclipse-workspace/HybridFramework/src/test/resources/Screenshot.png"));
				
	
	 	}
	
}

