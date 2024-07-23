package com.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
			"G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.findElement(By.xpath("//a[text()=\"Open New Tabbed Windows \"]")).click();
	    driver.findElement(By.xpath("//button[text()=\"    click   \"]")).click();
	     

String window=driver.getWindowHandle();
System.out.println("finding window id"+window);	    
	    String url=driver.getCurrentUrl();
	System.out.println("finding cutrent url"+url);
	}
	
	
	
}

