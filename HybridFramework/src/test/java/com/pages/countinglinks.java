package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countinglinks {

   public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C://Users//durga//Downloads//chromedriver_win32//chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://amazon.com");
          
        List<WebElement> links = driver.findElements(By.xpath("//a"));  
          
          int linkCount = links.size();   
          
          System.out.println("Total Number of links:"  + linkCount);   
          
   List<WebElement> allElements = driver.findElements(By.xpath("//*"));    
          
          int elementsCount = allElements.size();    
          
          System.out.println("Total Number of Elements:"  + elementsCount);    
          
        // int count = 0; List<WebElement> link = driver.findElements(By.tagName("a")); System.out.println(link.size());
     //   int count1 = 0; List<WebElement> element = driver.findElements(By.tagName("@*")); System.out.println(element.size());
          
          
          
          
                   
    }

}
