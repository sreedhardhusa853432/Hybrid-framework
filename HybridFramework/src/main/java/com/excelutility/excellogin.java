
package com.excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Wrapperclass;

public class excellogin extends Wrapperclass
	{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	 
	    FileInputStream fil = new FileInputStream(new File("C:\\Users\\CHITTI\\Desktop\\Book2.xlsx"));
	 
	    XSSFWorkbook workbook = new XSSFWorkbook (fil);
	   
	  XSSFSheet sheet= workbook.getSheet("Sheet1");
	   
	   int count = sheet.getLastRowNum();
	 
	    System.out.println(count);
	   
	   for(int i=1; i<=count; i++)
	   {
	         
	     XSSFRow row= sheet.getRow(i);
	     
	     XSSFCell cell= row.getCell(0);
	     
	    String un =cell.getStringCellValue();
	     
	    XSSFCell cell1= row.getCell(1);
	     
	    String pwd = cell1.getStringCellValue();
	    
	    System.setProperty("webdriver.chrome.driver", "E://Selenium//chromedriver_win32//chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	     driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	   
	     driver.findElement(By.id("txtUsername")).sendKeys(un);
	   
	     driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	     
	     driver.findElement(By.id("btnLogin")).click();
	     
	     Thread.sleep(3000);
	   
	      driver.close();
	}

	}

}

