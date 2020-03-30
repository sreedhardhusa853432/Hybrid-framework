	package com.baseclass;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Library {
	 protected WebDriver driver;
	 
	 	public void launchApp(String browser, String url) {
	 		
	 		try {
	 			if(browser.equalsIgnoreCase("firefox")) {
	 				driver = new FirefoxDriver();
	 			}
	 			else if (browser.equals("chrome")) {
	 				System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
	 		 		driver = new ChromeDriver();
	 			}
	 			else if (browser.equals("firefox")) {
	 				System.setProperty("webdriver.gecko.driver", "C://Users//durga//Downloads//geckodriver-v0.26.0-win64//geckodriver.exe");
	 		 		driver = new ChromeDriver();
	 			}
	 			
	 		driver.manage().window().maximize();
	 		driver.manage().deleteAllCookies();
	 		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 		driver.get(url);
	 		//driver.get(prop.getProperty("url"));
	 		
	 	}catch(WebDriverException e) {
	 		System.out.println("browser couldnot be launched");
	 	}
	}
	 	public void quit() {
	 		driver.quit();
	 	}
	}



