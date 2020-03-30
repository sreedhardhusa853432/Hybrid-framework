package mavenproject;
import java.io.File;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wrapperMethods {
		WebDriver driver;
		public void insertapp(String url) {
			System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
			driver =new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		public void enterbyname(String val, String name) {
			driver.findElement(By.name(val)).sendKeys(name);
		}
		public void clickbyid(String value) {
			driver.findElement(By.id(value)).click();
		}
		 /*public void screenshot(String snap) {
			 TakesScreenshot scrShot =((TakesScreenshot)driver);
			 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(SrcFile, new File((path)));
		 }*/
		public void closeapp() {
			driver.close();
		}

		
	}


