package com.Mouseevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {
public static void main(String[] args) throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement textbox= driver.findElement(By.xpath("//input[@id=\"field1\"]"));
	textbox.clear();
	textbox.sendKeys("Welcome to the selenium");
	Thread.sleep(5000);
	
	WebElement button = driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
	
	Actions act = new Actions(driver);
	act.doubleClick(button).perform();
	
	Thread.sleep(5000);
	driver.close();
	
}
}
