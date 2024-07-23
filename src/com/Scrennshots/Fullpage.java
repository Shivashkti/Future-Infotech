//package com.Scrennshots;
//
//import java.io.File;
//import java.io.IOException;
//
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//
//
//public class Fullpage {
//public static void main(String[] args) throws IOException  {
//	
//	//WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", "G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("https://www.selenium.dev/downloads/");
//	
//	driver.manage().window().maximize();
//	
//	// TypeCasting
//	
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	
//
//	File src = ts.getScreenshotAs(OutputType.FILE);
//	
//	File target = new File("G:\\javaprogram\\Java_Selenium\\Screnshots\\home.png");
//	FileHandler.copy(src, target);
//	
//
//	
//	
//}
//}
