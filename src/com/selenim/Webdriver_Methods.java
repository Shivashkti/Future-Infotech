package com.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.manage().window().maximize();
		
        driver.get("https://www.selenium.dev/");
		driver.navigate().back(); 
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		
		String window= driver.getWindowHandle();
		System.out.println(window);
		
		//driver.switchTo().frame(0);
		
		
		
		driver.close();
	}

}
