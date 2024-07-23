package com.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "G:\\ketaki_selnium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name= 'pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//Button[@name='login']")).click();
		
	}
}
