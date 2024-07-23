package com.selenim;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_windowHandels {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
	    
	    String parentwindow=driver.getWindowHandle();
	    System.out.println("this is parent window id:="+parentwindow);
	    driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
	    
	    Set<String> windows=driver.getWindowHandles();
	    for(String s:windows)
	    {
	    	System.out.println(s);
	    }
	    
	   driver.quit();
	}
}
