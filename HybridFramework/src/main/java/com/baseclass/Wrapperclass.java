
	package com.baseclass;

	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Wrapperclass {
	public static  WebDriver driver;
	public static Properties prop;
		public void launchApp() throws IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\durga\\eclipse-workspace\\cucumberhybridproject\\src\\test\\resources\\configurationproperty\\config.property");
		prop=new Properties();
			prop.load(fis);
			String browser=prop.getProperty("browser");
			String url=prop.getProperty("url");
			
			System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
			 driver = new ChromeDriver();
		System.out.println("Chrome Browser is launched");
		  driver.get(url);
		//driver.get("https://opensource-demo.orangehrmlive.com");
		   driver.manage().window().maximize();
		   System.out.println("OrangeHrm is launched");
		
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
/* if (driver.getTitle().equals("OrangeHRM"))
		     {
		            System.out.println("Verification Successful - The correct title is displayed on the web page and it is displaying search box");
		     }
		     else
		     {
		            System.out.println("Verification Failed - An incorrect title is displayed on the web page and it's not displaying search box.");
		     }
		}
		
	*/
	}
	}