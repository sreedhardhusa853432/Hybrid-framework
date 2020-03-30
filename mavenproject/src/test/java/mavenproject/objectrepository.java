package mavenproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class objectrepository {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Properties obj=new Properties();
		FileInputStream objFile=new FileInputStream("C:\\Users\\durga\\eclipse-workspace\\mavenproject\\configurationproperty\\config.property");
		obj.load(objFile);
		
		driver.findElement(By.id(obj.getProperty("username"))).sendKeys("8328386774");
		driver.findElement(By.id(obj.getProperty("password"))).sendKeys("Justin3670");
		driver.findElement(By.xpath(obj.getProperty("submit"))).click();
	}

}
