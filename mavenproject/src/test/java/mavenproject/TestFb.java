package mavenproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestFb {
		WebDriver driver;
		@Test
		public void testcase1(){
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("8328386774");
			driver.findElement(By.id("pass")).sendKeys("Justin3670");
			WebElement btn = driver.findElement(By.xpath("//*[@id='loginbutton']"));
			btn.click();
			
		}
		@BeforeMethod
		public void lauchapp() {
			System.setProperty("webdriver.chrome.driver", "F:\\APPU\\eclipse\\sampledemo1\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		@AfterMethod
		 public void closeapp() {
			 driver.close();
		 }

	}


