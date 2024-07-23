package com.selenim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");

  WebDriver driver=new ChromeDriver();
  driver.get("https://www.google.com");
}
}
