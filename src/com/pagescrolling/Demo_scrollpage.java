package com.pagescrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_scrollpage {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	  Thread.sleep(3000); //run code : javascriptExcutor it is an interface
	  //typeCasting 
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  
	  jse.executeScript("window.scrollBy(0,500)");
	  
	  Thread.sleep(3000); jse.executeScript("window.scrollBy(0,-500)");
	  Thread.sleep(3000);
	 
	
	driver.close();
}
}
